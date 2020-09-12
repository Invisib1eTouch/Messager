package com.messager2;

public abstract class Attachment {
    public AttachmentsType attachmentsType;
    public String fileName;

    public Attachment(AttachmentsType attachmentsType, String fileName) {
        this.attachmentsType = attachmentsType;
        this.fileName = fileName;
    }

    public AttachmentsType getAttachmentsType() {
        return attachmentsType;
    }

    public String getFileName() {
        return fileName;
    }
}
