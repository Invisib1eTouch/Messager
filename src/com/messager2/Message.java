package com.messager2;

public class Message {
    private String name;
    private String date;
    private String text;
    private AttachmentsToSend attachmentsToSend;
    private ChannelsToSend channelsToSend;


    public Message(String name, String date, String text, AttachmentsToSend attachmentsToSends, ChannelsToSend channelsToSend) {
        this.name = name;
        this.date = date;
        this.text = text;
        this.attachmentsToSend = attachmentsToSends;
        this.channelsToSend = channelsToSend;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public AttachmentsToSend getAttachmentsToSend() {
        return attachmentsToSend;
    }

    public ChannelsToSend getChannelsToSend() {
        return channelsToSend;
    }

    public void sendMessage() {
        for (int i = 0; i < attachmentsToSend.showAttachments().length; i++) {
            System.out.println(attachmentsToSend.showAttachments()[i]);
        }
    }
}
