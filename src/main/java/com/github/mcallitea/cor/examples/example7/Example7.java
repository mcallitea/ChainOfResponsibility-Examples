package com.github.mcallitea.cor.examples.example7;

import com.github.mcallitea.cor.builder.AnnotationCorBuilder;
import com.github.mcallitea.cor.builder.exception.BuildException;
import com.github.mcallitea.cor.examples.example7.corelements.CustomInterface;

public class Example7 {

    CustomInterface firstElement = null;

    public static void main(String[] args) {
        Example7 example7 = new Example7();

        example7.executeChainOfResponsibility("Drax");
        example7.executeChainOfResponsibility("Groot");
    }

    public Example7() {
        this.initChainOfResponsibility();
    }

    private void initChainOfResponsibility() {

        try {
            // It looks the same as in the examples before, but the package-info.java for cor-elements changes the way,
            // the chain will be initialized.
            this.firstElement = AnnotationCorBuilder.buildChainOfResponsibility("com.github.mcallitea.cor.examples.example7.corelements");
        } catch (BuildException e) {
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
