# ---------- BUILD stage ----------
FROM maven:3.9.5-eclipse-temurin-17 AS builder
WORKDIR /workspace

# copy only maven descriptor first to leverage layer cache for dependencies
COPY pom.xml .
# if you have .mvn or mvnw, uncomment next two lines
# COPY .mvn .mvn
# COPY mvnw .

# Pre-download dependencies (use buildkit cache mount if supported)
RUN --mount=type=cache,target=/root/.m2 mvn -B dependency:go-offline

# copy sources and build (skip tests for faster iteration; remove -DskipTests for CI)
COPY src ./src
RUN --mount=type=cache,target=/root/.m2 mvn -B clean package -DskipTests

# ---------- RUNTIME stage ----------
FROM eclipse-temurin:17-jre-alpine
LABEL org.opencontainers.image.source="https://github.com/naveenprabakarank/sample"

# Create non-root user for better security
RUN addgroup -S appgroup && adduser -S appuser -G appgroup

WORKDIR /app

# Copy jar produced by maven build. Adjust pattern if your jar name is fixed.
COPY --from=builder /workspace/target/*.jar app.jar

# Ensure proper ownership
RUN chown appuser:appgroup /app/app.jar

# Switch to non-root user
USER appuser

# Tunable JVM options via env var
ENV JAVA_OPTS="-Xms256m -Xmx1024m -Djava.security.egd=file:/dev/./urandom"

EXPOSE 8080

# Healthcheck - change path if your app exposes a different endpoint
HEALTHCHECK --interval=30s --timeout=5s --start-period=20s \
  CMD wget -qO- --no-check-certificate http://localhost:8080/actuator/health || exit 1

ENTRYPOINT ["/bin/sh", "-c", "exec java $JAVA_OPTS -jar /app/app.jar"]
