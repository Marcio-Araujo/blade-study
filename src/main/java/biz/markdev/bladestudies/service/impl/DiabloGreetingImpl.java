package biz.markdev.bladestudies.service.impl;

import biz.markdev.bladestudies.service.GreetingStart;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("diablo3")
public class DiabloGreetingImpl implements GreetingStart {

    @Override
    public String greetings() {
        return "Greetings, stranger. I'm not surprised to see your kind here.";
    }
}
