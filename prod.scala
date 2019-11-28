import java.util.Properties
import java.util.Properties
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}

object prod extends App{
  //def main(args: Array[String]): Unit = {
  //  writeToKafka("scala-topic")
  //}

  //def writeToKafka(topic: String): Unit ={
    val topic = "scala-topic"
    val props = new Properties()
    print(topic)
    props.put("bootstrap.servers","localhost:9092")
    //props.put("key.serializer",":")
    //props.put("value.serializer",":")
    val producer = new KafkaProducer[String, String](props)
    val record = new ProducerRecord[String, String](topic,"scala messg 1")
    producer.send(record)
    producer.close()
    //print(record)
  //}

}
