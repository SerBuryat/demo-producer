package ru.dawgg.demo.kafkaproducer;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import ru.dawgg.demo.model.User;

@Component
@RequiredArgsConstructor
public class DemoKafkaProducer {

  private final KafkaTemplate<String, String> kafkaTemplate;

  private String topicName = "name";

  public void send() {
    kafkaTemplate.send(topicName, User.NAME);
  }
}
