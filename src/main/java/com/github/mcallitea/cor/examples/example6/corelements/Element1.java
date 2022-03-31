package com.github.mcallitea.cor.examples.example6.corelements;

import com.github.mcallitea.cor.api.CorCommandInit;
import com.github.mcallitea.cor.api.annotation.CorElement;

import java.util.Optional;

@CorElement(order = 1, staticInitializerMethod = "init")
public final class Element1 extends Element {

    private final String config;

    public Element1(String config) {
        this.config = config;
    }

    @Override
    protected Optional<Integer> execute(String s) {
        this.printConfig(this.config);
        System.out.println(this.getClass().getName() + " :: " + s);
        return Optional.of(s.length());
    }

    @Override
    public boolean isResponsible(String s) {
        return s.equals("Gamora");
    }

    public static CorCommandInit init() {
        return aClass -> {
            // As the interface states, CorCommandInit injects the class. Here we get this class of Step1.
            // You can check the class first, but it will always be true - so it is useless. Take a look at Step2 or Step3.
            if (aClass.isAssignableFrom(Element1.class)) {
                return new Element1("Step 1 config");
            }

            // Returning null will result in a NullPointer later. In this example case the condition above cannot fail.
            return null;
        };
    }
}
