package com.messager2;

public class Document extends Attachment {

    public Document(String fileName) {
        super(AttachmentsType.DOCUMENT, fileName);
    }
}
