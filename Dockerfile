# 使用 Java 17 作为构建基础镜像
FROM openjdk:17-jdk-slim

# 设置 jar 包名称（替换为你打出来的 jar 文件名）
ARG JAR_FILE=target/*.jar

# 拷贝 jar 到容器中
COPY ${JAR_FILE} app.jar

# 启动容器时运行的命令
ENTRYPOINT ["java", "-jar", "/app.jar"]