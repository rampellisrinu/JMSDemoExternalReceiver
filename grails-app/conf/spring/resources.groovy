import org.apache.activemq.spring.ActiveMQConnectionFactory
import org.springframework.jms.connection.SingleConnectionFactory
beans = {
    jmsConnectionFactory(SingleConnectionFactory) {
        targetConnectionFactory = { ActiveMQConnectionFactory cf ->
            brokerURL = '${grails.jms.brokerUrl}'
        }
    }
}
