package ru.dawgg.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dawgg.demo.kafkaproducer.DemoKafkaProducer;

@RestController
@RequestMapping("demo/send")
@RequiredArgsConstructor
public class DemoKafkaProducerController {

  private final DemoKafkaProducer kafkaProducer;

  @GetMapping
  public String sendMessage() {
    kafkaProducer.send();
    return "Message has been sent";
  }
}
