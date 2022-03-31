package com.github.mcallitea.cor.examples.example5.corelements;

import com.github.mcallitea.cor.api.annotation.CorElement;

import java.util.Optional;

@CorElement
public final class Element3 extends Element {

    public Element3() {
    }

    @Override
    protected Optional<Integer> execute(String s) {
        System.out.println(this.getClass().getName() + " :: " + s);
        return Optional.of(s.length());
    }

    @Override
    public boolean isResponsible(String s) {
        return s.equals("Drax");
    }
}
