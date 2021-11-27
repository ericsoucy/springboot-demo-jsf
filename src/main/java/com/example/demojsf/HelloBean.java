package com.example.demojsf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;

@Component
@ViewScoped
public class HelloBean {

    @Autowired
    private MsgService msgService;

    public String getMsg() {
        return msgService.getMsg();
    }
}
