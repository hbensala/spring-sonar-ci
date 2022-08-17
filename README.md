# Spring-Boot-Sonar-Docker-Example
Sample project showing how to push analysis results to a Sonar docker container

Perquisites: None.

1. Download & open intellij idea
2. Click File -> Project from existing sources -> gradle
3. Open a terminal in ./sonar
4. run 'docker-compose up -d'
5. Open a terminal in the project root
6. Run the sonarqube task: './gradlew sonarqube'
7. View localhost:9000 in your browser

