# Reproducer for https://bz.apache.org/bugzilla/show_bug.cgi?id=66388

## Build

```shell
mvn clean package
```

## See the application startup succeed with Tomcat 9.0.69

```shell
docker-compose up -f docker-compose.9_0_69.yml
```

## See the application startup fail with Tomcat 9.0.70

```shell
docker-compose up -f docker-compose.9_0_70.yml
```
