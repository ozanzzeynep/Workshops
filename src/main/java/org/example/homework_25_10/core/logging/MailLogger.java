package org.example.homework_25_10.core.logging;

public class MailLogger implements  Logger{
    @Override
    public void log(String data) {
        System.out.println("Mail gönderildi : " + data);

    }

}
