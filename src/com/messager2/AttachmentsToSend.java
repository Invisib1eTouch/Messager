package com.messager2;

import java.util.Arrays;

public class AttachmentsToSend {
    Attachment[] attachment;

    public AttachmentsToSend(Attachment... attachment) {
        this.attachment = attachment;
    }

    @Override
    public String toString() {
        return Arrays.toString(attachment);
    }

    public String[] showAttachments() {

        String[] data = new String[attachment.length];
        for (int i = 0; i < attachment.length; i++) {
            data[i] = String.valueOf(attachment[i]);
        }
        return data;
    }
}
9999