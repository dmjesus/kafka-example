package com.kafka.application.config

import com.fasterxml.jackson.databind.ser.std.ByteArraySerializer
import java.util.Collections.singletonMap
import org.apache.kafka.clients.producer.ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.kafka.core.ProducerFactory

@ConfigurationProperties
class KafkaConfig {

    @Bean
    fun stringTemplate(producerFactory: ProducerFactory<String, String>): KafkaTemplate<String, String> {
        return KafkaTemplate(producerFactory)
    }

    @Bean
    fun bytesTemplate(producerFactory: ProducerFactory<String, ByteArray>): KafkaTemplate<String, ByteArray> {
        return KafkaTemplate(
            producerFactory,
            singletonMap<String, Any>(
                VALUE_SERIALIZER_CLASS_CONFIG,
                ByteArraySerializer::class.java
            )
        )
    }
}