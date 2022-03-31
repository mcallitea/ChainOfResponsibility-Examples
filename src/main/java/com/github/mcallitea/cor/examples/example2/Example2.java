package com.github.mcallitea.cor.examples.example2;

import com.github.mcallitea.cor.builder.ClassCorBuilder;
import com.github.mcallitea.cor.builder.exception.BuildException;
import com.github.mcallitea.cor.builder.exception.ElementInstantiationException;
import com.github.mcallitea.cor.examples.example2.corelements.CustomInterface;

public class Example2 {

    CustomInterface firstElement = null;

    public static void main(String[] args) {
        Example2 example2 = new Example2();

        example2.executeChainOfResponsibility("Drax");
        example2.executeChainOfResponsibility("Groot");
    }

    public Example2() {
        this.initChainOfResponsibility();
    }

    private void initChainOfResponsibility() {
        try {
            this.firstElement = ClassCorBuilder.buildChainOfResponsibility("com.github.mcallitea.cor.examples.example2.corelements", CustomInterface.class);
        } catch (ElementInstantiationException | BuildException e) {
            // In your case a logger should be used instead
            e.printStackTrace();
        }
    }

    public void executeChainOfResponsibility(String s) {
        // If an result is present, it will be printed to console in this example.
        this.firstElement.processCommand(s)
                .ifPresent(integer -> System.out.println("Result of '" + s + "' is '" + integer + "'"));
    }

}
