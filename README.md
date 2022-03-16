# java-example-services

The example is based on Docker container, you can easily start using included docker-compose.yml
Docker will start a container with java environment.

```
docker-compose up --scale spark-worker=3
```

Current directory will be accessible from docker container under path: /app_data.
Any application jar or data file will be visible there.

Execute command below in order to login to master container.
```
docker exec -it spark-dataprocessing_spark_1 /bin/bash
```
If you used another directory name for the project check correct name of the container:

```
docker container ps
```
