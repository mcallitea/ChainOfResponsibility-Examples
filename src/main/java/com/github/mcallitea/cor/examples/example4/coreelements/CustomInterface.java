package com.github.mcallitea.cor.examples.example4.coreelements;

import com.github.mcallitea.cor.api.Command;

public interface CustomInterface extends Command<String, Integer> {

    void printConfig(String config);

}
