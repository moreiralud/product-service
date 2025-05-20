FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

COPY . .

RUN ./mvnw dependency:go-offline -B

RUN ./mvnw clean package -DskipTests

EXPOSE 8081

CMD ["./mvnw", "spring-boot:run"]
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw .
COPY pom.xml .
RUN ./mvnw dependency:go-offline -B

COPY src ./src

RUN ./mvnw clean package -DskipTests

EXPOSE 8081

CMD ["./mvnw", "spring-boot:run"]

