package org.example.homework_25_10.core.logging;

public class FileLogger implements Logger{

    @Override
    public void log(String data) {
        System.out.println("Dosyaya loglandı: " + data);

    }
}
