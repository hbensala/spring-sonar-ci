Perquisites:
    sudo sysctl -w vm.max_map_count=262144
    sudo sysctl -w fs.file-max=65536
    sudo ulimit -n 65536
    sudo ulimit -u 4096

Run command:
    docker-compose up -d

This launches sonar at http://localhost:9000, default credentials are U:admin P:admin.
If sonar doesn't start then it is clashing with something else running on port 9000.

Documentation - https://hub.docker.com/_/sonarqube/

To push result to sonar with gradle run:

./gradlew sonarqube