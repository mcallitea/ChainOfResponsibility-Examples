package com.github.mcallitea.cor.examples.example3.corelements;

import com.github.mcallitea.cor.api.Command;

public interface CustomInterface extends Command<String, Integer> {

    void printConfig(String config);

}
