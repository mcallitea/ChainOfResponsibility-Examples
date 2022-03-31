package com.github.mcallitea.cor.examples.example1;

import com.github.mcallitea.cor.api.Command;
import com.github.mcallitea.cor.builder.ClassCorBuilder;
import com.github.mcallitea.cor.builder.exception.BuildException;
import com.github.mcallitea.cor.builder.exception.ElementInstantiationException;

import java.util.Optional;

public class Example1 {

    Command<String, Optional<?>> firstElement;

    public static void main(String[] args) {
        Example1 example1 = new Example1();

        example1.executeChainOfResponsibility("Drax");
        example1.executeChainOfResponsibility("Groot");
    }

    public Example1() {
        this.initChainOfResponsibility();
    }

    private void initChainOfResponsibility() {
        try {
            // In this case this is type unchecked, because Command interface is used as raw.
            this.firstElement = ClassCorBuilder.buildChainOfResponsibility("com.github.mcallitea.cor.examples.example1.corelements", Command.class);
        } catch (ElementInstantiationException | BuildException e) {
            // In your case a logger should be used instead
            e.printStackTrace();
        }
    }

    public void executeChainOfResponsibility(String s) {
        // In this example every element of the chain return an empty optional. This means, that we can ignore the
        // returned value.
        this.firstElement.processCommand(s);
    }

}
