package com.kumar.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
	
	@KafkaListener(
			topics = "balamkumarswamy",
			groupId = "groupId"
			)
	public void listener(String data) {
		System.out.println("listener Recieved : "+ data +" ( ͡❛ ͜ʖ ͡❛) ");
	}

}
