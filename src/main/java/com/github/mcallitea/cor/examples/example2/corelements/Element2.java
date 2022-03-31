package com.github.mcallitea.cor.examples.example2.corelements;

import java.util.Optional;

public final class Element2 extends Element {

    @Override
    protected Optional<Integer> execute(String s) {
        this.doAnything();
        System.out.println(this.getClass().getName() + " :: " + s);
        return Optional.of(s.length());
    }

    @Override
    public boolean isResponsible(String s) {
        return s.equals("Groot");
    }
}
