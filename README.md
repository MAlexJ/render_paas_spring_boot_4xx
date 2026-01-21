### PaaS service

* Java 25
* Springboot 4.0.1
* Gradle 9.3.0
* Docker / DockerHub
* GitHub Action: CI/CD
* PaaS: Render

#### Running the Project

1. **Build the project:**
   ```
   ./gradlew build
   ```

2. **Run tests:**
   ```
   ./gradlew test
   ```

3. **Start the application:**
   ```
   ./gradlew bootRun
   ```

The application will start on `http://localhost:8080` and connect to MongoDB Atlas.


#### Management endpoints

Available endpoints:

```
| Endpoint | URL                | HTTP Method |
| -------- | ------------------ | ----------- |
| info     | /actuator/info     | GET         |
| health   | /actuator/health   | GET         |
| shutdown | /actuator/shutdown | POST        |
```

#### Gradle Versions Plugin

Displays a report of the project dependencies that are up-to-date, exceed the latest version found, have upgrades,
or failed to be resolved, info: https://github.com/ben-manes/gradle-versions-plugin

```
gradle dependencyUpdates
```

#### Gradle wrapper

Gradle Wrapper Reference:
https://docs.gradle.org/current/userguide/gradle_wrapper.html

How to Upgrade Gradle Wrapper:
https://dev.to/pfilaretov42/tiny-how-to-upgrade-gradle-wrapper-3obl

```
./gradlew wrapper --gradle-version latest
```
