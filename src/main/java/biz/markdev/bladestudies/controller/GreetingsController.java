package biz.markdev.bladestudies.controller;

import biz.markdev.bladestudies.service.GreetingStart;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@NoArgsConstructor
public class GreetingsController {

    @Autowired
    private GreetingStart greetingStart;

    public GreetingsController(GreetingStart greetingStart) {
        this.greetingStart = greetingStart;
    }

    public String getMessage(){
        return greetingStart.greetings();
    }
}
