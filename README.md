# cities-api

## Tecnologias utilizadas
- Java
- Spring Boot
- Docker
- Lombok
- JPA
- Gradle
- Postgre

## criar banco de dados
```docker run --name cities-db -d -p 5433:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super123 -e POSTGRES_DB=cities postgres```



## Popular banco de dados
Clonar o seguinte repositório:

```https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL```


```
docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash

cd temp

psql -h localhost -p 5433 -U postgres_user_city cities -f /tmp/pais.sql
psql -h localhost -p 5433 -U postgres_user_city cities -f /tmp/estado.sql
psql -h localhost -p 5433 -U postgres_user_city cities -f /tmp/cidade.sql

psql -h localhost -U postgres_user_city cities

CREATE EXTENSION cube; 
CREATE EXTENSION earthdistance;
```

### Listar todos os paises
```http://localhost:8080/countries```

### Listar todos os estados
```http://localhost:8080/states```

### Listar todas as cidades
```http://localhost:8080/cities```

### Retorna distância em milhas
```http://localhost:8080/distances/by-points?from="id_origem"&to="id_destino"```

### Retorna distância em metros
```http://localhost:8080/distances/by-cube?from="id_origem"&to="id_destino"```
