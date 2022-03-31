package com.github.mcallitea.cor.examples.example5.corelements;

import com.github.mcallitea.cor.api.Command;

public interface CustomInterface extends Command<String, Integer> {

    void printConfig(String config);

}
