package com.example.springboot.common;

import javafx.application.Application;
import org.springframework.context.ApplicationEvent;

import java.time.Clock;

public class WatergateEvent extends ApplicationEvent {
    public WatergateEvent(Object source) {
        super(source);
    }

    public WatergateEvent(Object source, Clock clock) {
        super(source, clock);
    }
}
