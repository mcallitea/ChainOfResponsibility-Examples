package com.github.mcallitea.cor.examples.example1.corelements;

import com.github.mcallitea.cor.api.CommandEngine;

import java.util.Optional;

public final class Element1 extends CommandEngine<String, Optional<?>> {

    @Override
    protected Optional<Optional<?>> execute(String s) {
        System.out.println(this.getClass().getName() + " :: " + s);
        return Optional.empty();
    }

    @Override
    public boolean isResponsible(String s) {
        return s.equals("Gamora");
    }
}
