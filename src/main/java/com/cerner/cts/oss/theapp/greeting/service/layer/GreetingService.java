package com.cerner.cts.oss.theapp.greeting.service.layer;

import com.cerner.cts.oss.theapp.hello.Greeting;

import java.util.Collection;

public interface GreetingService {
    Greeting save(Greeting greeting);

    Collection<Greeting> getGreetings();
}
