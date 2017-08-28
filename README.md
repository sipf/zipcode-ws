## Zipcode-ws

This project is used for proof of concept only. Of course, you can contribute, you just need to fork 
and PR your feature.

### Usage

Start the container :

```
docker run -p 8080:8080 sipf/zipcode-ws
```

You can then log to [http://127.0.0.1:8080](http://127.0.0.1:8080) to use the service.

### Default Configuration

```
spring:
  profiles:
    active: development

---
spring:
  profiles: production

---
spring:
  profiles: test
  jpa:
    hibernate:
      ddl-auto: create-drop
    show-sql: true
  datasource:
    platform: h2

---
spring:
  profiles: development
  h2:
    console:
      enabled: true
      path: /h2-console
  jpa:
    hibernate:
      ddl-auto: create-drop
    show-sql: true
  datasource:
    platform: h2

```

### Building the container

```
docker build -t sipf/zipcode-ws .
```

### License & Authors

* License : MIT
* Authors : Leonard TAVAE (leonard.tavae@informatique.gov.pf)
