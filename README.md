# Spring Cloud Stream 사용 샘플 

## 1. kafkaserver 시작

Spring Cloud Stream 의 동작을 확인 하기 위해 kafka server 를 docker-compose 로 먼저 띄워 놓아야 한다. 

```shell script
docker-compose -f ./docker/docker-compose.yml up -d
```

## 2. sender service 시작

message 전송을 확인하기 위한 sender service 를 시작한다.

## 3. receiver service 시작

message 수신을 확인하기 위한 receiver service 를 시작한다.


