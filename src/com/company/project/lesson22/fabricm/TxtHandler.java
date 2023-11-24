package com.company.project.lesson22.fabricm;

public class TxtHandler extends AbstractHandler {

    public TxtHandler(String fileName) {
        super(fileName);
    }

    @Override
    public void write(String data) {
        System.out.println(data + "to TXT");
    }

}