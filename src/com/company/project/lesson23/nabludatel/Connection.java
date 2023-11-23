package com.company.project.lesson23.nabludatel;

import java.util.ArrayList;
import java.util.List;

public class Connection {
    Status status;
    List<Listener> list = new ArrayList<>();

    public void addListener(Listener listener) {
        list.add(listener);
    }

    public void removeListener(Listener listener) {
        list.remove(listener);
    }

    public void changeStatus(Status status) {
        this.status = status;
        for (Listener listener : list) {
            listener.get();
        }
    }
}

enum Status {
    ACTIVE, CLOSE, CONNECTED, WAITING


}