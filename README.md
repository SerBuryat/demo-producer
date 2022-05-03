# 2 microservice with kafka integration inside one docker-compose.

### Steps to deploy full project:

* Clone [demo-consumer](https://github.com/SerBuryat/demo-consumer) and [demo-producer](https://github.com/SerBuryat/demo-producer).
* Build [`Dockerfile`](https://github.com/SerBuryat/demo-producer/blob/master/Dockerfile) from demo-consumer 
* Build [`Dockerfile`](https://github.com/SerBuryat/demo-consumer/blob/master/Dockerfile) from demo-producer
* Run [`docker-compose.yml`](https://github.com/SerBuryat/demo-producer/blob/master/docker-compose.yml) from docker-producer
* In web browser go [to](http://localhost:8080/demo/send). <p> If everything is OK, you will see *Message has been sent*
on browser page. </p> <p> After that in `demo-consumer` console you will see *Hello Ivan*. </p>

*P.S. You can run both parts of project just from IDE. <p> You just need to delete
`demo-consumer-container` and `demo-producer-container` from `docker-compose.yml`. </p>
Then run `docker-compose.yml` and demo-producer/consumer both.*