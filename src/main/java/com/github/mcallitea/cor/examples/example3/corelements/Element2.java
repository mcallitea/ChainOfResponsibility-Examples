package com.github.mcallitea.cor.examples.example3.corelements;

import java.util.Optional;

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
}
