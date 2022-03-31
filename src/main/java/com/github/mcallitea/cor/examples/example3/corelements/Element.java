package com.github.mcallitea.cor.examples.example3.corelements;

import com.github.mcallitea.cor.api.CommandEngine;

public abstract class Element extends CommandEngine<String, Integer> implements CustomInterface {

    @Override
    public void printConfig(String config) {
        // Do anything relate to this step
        System.out.println("printConfig was called: " + config);
    }

}
