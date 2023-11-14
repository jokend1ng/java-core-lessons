package com.company.project.lesson18;

import java.util.function.Predicate;

public interface Notification {
     void send(String message);
    default Notification additionalSend(Notification notification, Predicate predicate){

            return (message)->{
                if(predicate.test(message)) notification.send(message);
                send(message);


       };
    }
}
