package com.github.mcallitea.cor.examples.example2.corelements;

import com.github.mcallitea.cor.api.CommandEngine;

public abstract class Element extends CommandEngine<String, Integer> implements CustomInterface {

    @Override
    public void doAnything() {
        // Do anything relate to this step
        System.out.println("doAnything was called");
    }

}
