package com.github.mcallitea.cor.examples.example6;

import com.github.mcallitea.cor.builder.AnnotationCorBuilder;
import com.github.mcallitea.cor.builder.exception.BuildException;
import com.github.mcallitea.cor.examples.example6.corelements.CustomInterface;

public class Example6 {

    CustomInterface firstElement = null;

    public static void main(String[] args) {
        Example6 example6 = new Example6();

        example6.executeChainOfResponsibility("Drax");
        example6.executeChainOfResponsibility("Groot");
    }

    public Example6() {
        this.initChainOfResponsibility();
    }

    private void initChainOfResponsibility() {

        try {
            this.firstElement = AnnotationCorBuilder.buildChainOfResponsibility("com.github.mcallitea.cor.examples.example6.corelements");
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
