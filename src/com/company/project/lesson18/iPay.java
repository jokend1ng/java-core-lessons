package com.company.project.lesson18;

import java.util.function.Predicate;

public interface iPay {
    boolean pay(String amount);
    default iPay additionalpay(iPay another){
        return (amount)-> {
            if (!pay(amount))
                return another.pay(amount);


            return false;
        };

    }
}

