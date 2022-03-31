package com.github.mcallitea.cor.examples.example5.corelements;

import com.github.mcallitea.cor.api.annotation.CorElement;

import java.util.Optional;

// This class does not implement the CorCommand interface. So the annotation is useless and this class won't be a part
// of the chain.
@CorElement
public class UndefinedElement {

    private final String config;

    public UndefinedElement(String config) {
        this.config = config;
    }

    protected Optional<Integer> execute(String s) {
        System.out.println(this.getClass().getName() + " :: " + s);
        return Optional.of(s.length());
    }

    public boolean isResponsible(String s) {
        return s.equals("The evil guy");
    }
}
