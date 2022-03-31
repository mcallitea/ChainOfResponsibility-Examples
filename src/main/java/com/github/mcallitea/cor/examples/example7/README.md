# Example 7
## Keyfacts
- Usage of _AnnotationCorBuilder.buildChainOfResponsibility(String packageName)_
- Configuration by package-info.java in combination with annotations

## Description
To understand this example you should also take a look at example 5 and 6.
In this example the complete configuration is also done by annotations, but in more central way by the 
_package-info.java_. The annotations used in the package-info differ from the annotation used for class-annotation.
With the package-info you define the classes that should be instantiated by the builder. To provide an order or a static
initializer method is optional an equivalent to the class-annotation of example 6.

# Notice
It is a good practice to implement the elements in a stateless way - so don't use any object variables. In this case
the chain can be reused over and over again.