package com.github.mcallitea.cor.examples.example6.corelements;

import com.github.mcallitea.cor.api.CorCommandInit;
import com.github.mcallitea.cor.api.annotation.CorElement;

import java.util.Optional;

@CorElement(order = 2, staticInitializerMethod = "init")
public final class Element2 extends Element {

    private final String config;

    public Element2(String config) {
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
        return s.equals("Groot");
    }

    public static CorCommandInit init() {
        return aClass -> new Element2("Step 2 config");
    }
}
