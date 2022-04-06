package com.kumar.kafka.controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/publish")
public class PublishController {
	
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public PublishController(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	
	@GetMapping("/{data}")
	public String publish(@PathVariable String data) {
		kafkaTemplate.send("balamkumarswamy",data);
		return "Data Sent";
	}
}
