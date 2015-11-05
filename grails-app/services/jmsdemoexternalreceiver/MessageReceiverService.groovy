package jmsdemoexternalreceiver

class MessageReceiverService {

    static exposes = ["jms"]
    static destination = "notification"

    def onMessage(msg) {
        log.info "message received.." + msg
    }
}
