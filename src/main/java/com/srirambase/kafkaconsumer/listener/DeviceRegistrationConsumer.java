package com.srirambase.kafkaconsumer.listener;

import com.srirambase.kafkaconsumer.model.Device;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class DeviceRegistrationConsumer {
    public static Logger LOGGER = LoggerFactory.getLogger(DeviceRegistrationConsumer.class);
    @KafkaListener(topics = "Kafka_string",group = "group_id")
    public void consume(String message) {
        LOGGER.trace("Consumed message: " + message);
    }


    @KafkaListener(topics = "Kafka_device_example",group = "device_json",
            containerFactory = "deviceListenerFactory")
    public void consumeJson(Device device) {
        LOGGER.trace("Consumed JSON Message: " + device);
    }

}
