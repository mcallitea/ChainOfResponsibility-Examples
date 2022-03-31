# Example 3

## Keyfacts

- Usage of _CorBuilder.buildChainOfResponsibility(List<Class<T>> classesList, CorCommandInit<T> corCommandInit)_
- Custom combination of _ClassesReader_ and _CorBuilder_

## Description

This example also uses a custom interface and an abstraction _Element_ that extends the _CommandEngine_ and implements
the _CustomInterface_, like in example 2.

The difference to Example 2 is the way of initializing the elements of the chain. In this case the
_buildChainOfResponsibility(List<Class<T>> classesList, CorCommandInit corCommandInit)_ method of _ClassCorBuilder_ is
used. _CorCommandInit_ is a lambda function to initialize an object of a class that will be injected to the lambda,
provided by the list of classes _classesList_.

You can define the order of the elements by the order of the classes in the _classesList_. In this example the classes 
are automatically determined by _ClassesReader_, so the order may vary.

# Notice

It is a good practice to implement the elements in a stateless way - so don't use any object variables. In this case the
chain can be reused over and over again.