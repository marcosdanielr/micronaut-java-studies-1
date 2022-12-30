package lifecycle;

import jakarta.inject.Singleton;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Singleton
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    @PostConstruct
    private void initialize() {
        System.out.println("This will be called after bean initialization");
        name = "Marcos";
    }

    @PreDestroy
    private void destroy() {
        System.out.println("THis will be called after before bean destruction");
    }
}
