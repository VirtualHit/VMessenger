package net.ibxnjadev.vmesseger.universal.message;

/**
 * Message send for messenger
 */

public class Message {

    private final String content;
    private final String subChannel;

    public Message(String subChannel, String content) {
        this.subChannel = subChannel;
        this.content = content;
    }

    /**
     * The content that will be serialized
     * @return the content
     */

    public String getContent() {
        return content;
    }

    /**
     * @return the sub channel
     */

    public String getSubChannel() {
        return subChannel;
    }

}
