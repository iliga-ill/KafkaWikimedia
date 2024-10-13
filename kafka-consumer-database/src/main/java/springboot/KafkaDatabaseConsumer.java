package springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaDatabaseConsumer {

    @KafkaListener(
            topics = "wikimedia_recentchange",
            groupId = "myGroup"
    )
    private void consume(String eventMessage){

        log.info(String.format("Event message received -> %s", eventMessage));

    }

}
