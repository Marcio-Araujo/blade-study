package biz.markdev.bladestudies.service.impl;

import biz.markdev.bladestudies.service.GreetingStart;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("zelda")
public class ZeldaGreetingImpl implements GreetingStart {

    @Override
    public String greetings() {
        return "It's dangerous to go alone take this";
    }
}
