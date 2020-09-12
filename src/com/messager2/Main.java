package com.messager2;

public class Main {
    public static void main(String[] args) {

        /*---------------------------------------------------------------------------------------------------------------------*/
        Image image = new Image("name"); // Создание объекта картинки для attachment
        Document doc = new Document("doc1"); // Создание объекта документа для attachment

        AttachmentsToSend att1 = new AttachmentsToSend(image, doc); // Создание объекта вложений, которые будем отпарвлять
        /*---------------------------------------------------------------------------------------------------------------------*/

        /*---------------------------------------------------------------------------------------------------------------------*/
        SMS sms = new SMS("1231231312");

        ChannelsToSend ch1 = new ChannelsToSend(sms);
        /*---------------------------------------------------------------------------------------------------------------------*/

        Message m = new Message("ms1", "03.09.2020", "Success!", att1, ch1);

        m.sendMessage();

//        System.out.println(image.getAttachmentsType());
    }
}
