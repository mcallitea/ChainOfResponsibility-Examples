# Example 6
## Keyfacts
- Usage of _AnnotationCorBuilder.buildChainOfResponsibility(String packageName)
- Configuration by annotations

## Description
This example is mostly equivalent to Example5. The difference is in a higher customization to order the classes, which
instances will be part of the chain. Also, the optional possibility to implement a custom initialization by a static
method that returns a lambda.

# Notice
It is a good practice to implement the elements in a stateless way - so don't use any object variables. In this case
the chain can be reused over and over again.