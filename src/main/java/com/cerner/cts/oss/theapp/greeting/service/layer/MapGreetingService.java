package com.cerner.cts.oss.theapp.greeting.service.layer;

import com.cerner.cts.oss.theapp.hello.Greeting;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class MapGreetingService implements GreetingService {
    private Map<String, Greeting> greetingMap = new HashMap<>();

    @Override
    public Greeting save(Greeting greeting) {
        if(!greetingMap.containsKey(greeting.getContent()) && greeting.getId()==null) {
            String id = UUID.randomUUID().toString();
            greeting.setId(id);
            greetingMap.put(greeting.getContent(), greeting);
        }
        return greetingMap.get(greeting.getContent());
    }

    @Override
    public Collection<Greeting> getGreetings() {
        return greetingMap.values();
    }
}
