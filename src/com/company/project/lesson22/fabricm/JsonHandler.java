package com.company.project.lesson22.fabricm;

public class JsonHandler extends AbstractHandler {

    public JsonHandler(String fileName) {
        super(fileName);
    }

    @Override
    public void write(String data) {
        System.out.println(data + "to JSON");
    }
}
