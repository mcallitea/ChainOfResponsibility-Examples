package com.github.mcallitea.cor.examples.example4;

import com.github.mcallitea.cor.api.CorCommand;
import com.github.mcallitea.cor.api.CorCommandInit;
import com.github.mcallitea.cor.builder.ClassCorBuilder;
import com.github.mcallitea.cor.builder.exception.ElementInstantiationException;
import com.github.mcallitea.cor.examples.example4.coreelements.CustomInterface;
import com.github.mcallitea.cor.examples.example4.coreelements.Element1;
import com.github.mcallitea.cor.examples.example4.coreelements.Element2;
import com.github.mcallitea.cor.examples.example4.coreelements.Element3;

import java.util.HashMap;
import java.util.Map;

public class Example4 {

    CustomInterface firstElement = null;

    public static void main(String[] args) {
        Example4 example4 = new Example4();

        example4.executeChainOfResponsibility("Drax");
        example4.executeChainOfResponsibility("Groot");
    }

    public Example4() {
        this.initChainOfResponsibility();
    }

    private void initChainOfResponsibility() {
        // Any type of map can be used for CorBuilder.buildChainOfResponsibility. So if you need a specific order, a
        // LinkedHashMap can be used.
        Map<Class<? extends CorCommand<?, ?>>, CorCommandInit> classCorCommandInitMap = new HashMap<>();
        classCorCommandInitMap.put(Element1.class, aClass -> new Element1("Step1 config"));
        classCorCommandInitMap.put(Element2.class, aClass -> new Element2("Step2 config"));
        classCorCommandInitMap.put(Element3.class, aClass -> new Element3("Step3 config"));

        try {
            this.firstElement = ClassCorBuilder.buildChainOfResponsibility(classCorCommandInitMap);
        } catch (ElementInstantiationException e) {
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
