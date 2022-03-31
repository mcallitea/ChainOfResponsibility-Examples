package com.github.mcallitea.cor.examples.example3;

import com.github.mcallitea.cor.builder.ClassCorBuilder;
import com.github.mcallitea.cor.builder.exception.ElementInstantiationException;
import com.github.mcallitea.cor.builder.reader.ClassesReader;
import com.github.mcallitea.cor.examples.example3.corelements.CustomInterface;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.List;

public class Example3 {

    CustomInterface firstElement = null;

    public static void main(String[] args) {
        Example3 example3 = new Example3();

        example3.executeChainOfResponsibility("Drax");
        example3.executeChainOfResponsibility("Groot");
    }

    public Example3() {
        this.initChainOfResponsibility();
    }

    private void initChainOfResponsibility() {
        try {
            List<Class<CustomInterface>> classList = ClassesReader.readClasses("com.github.mcallitea.cor.examples.example3.corelements", CustomInterface.class);

            // In this case we use a list of classes, found by ClassesReader, and use the same initializer lambda for
            // all instances of the chain.
            this.firstElement = ClassCorBuilder.buildChainOfResponsibility(classList, aClass -> {
                Constructor<?> constructor = aClass.getDeclaredConstructor(String.class);
                return (CustomInterface) constructor.newInstance("Same config-string for all instances");
            });
        } catch (ElementInstantiationException | ClassNotFoundException | IOException e) {
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
