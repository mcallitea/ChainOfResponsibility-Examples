package com.github.mcallitea.cor.examples.example7.corelements;

import com.github.mcallitea.cor.api.CorCommandInit;
import com.github.mcallitea.cor.api.annotation.CorElement;

import java.util.Optional;

public final class Element3 extends Element {

    private final String config;

    public Element3(String config) {
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
        return s.equals("Drax");
    }

    public static CorCommandInit init() {
        return aClass -> new Element3("Step3 config");
    }
}
