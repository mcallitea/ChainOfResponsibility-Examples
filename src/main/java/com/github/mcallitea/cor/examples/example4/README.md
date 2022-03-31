#Example 4
## Keyfacts
- Usage of _CorBuilder.buildChainOfResponsibility(Map<Class<T>, CorCommandInit<T>> classesAndInitializers)_
- Custom combination of _ClassesReader_ and _CorBuilder_
- Custom initializer for each element of the chain

## Description
In this example a _Map_ is used for the elements of the chain. The usage of the
_ClassCorBuilder.buildChainOfResponsibility(Map<Class<? extends CorCommand<?, ?>>, CorCommandInit> classesAndInitializers)_ 
method is only useful if a highly customized constructor call is needed. The example shows this by three different 
strings, one for each element of the chain. 
If you don't need a customized constructor call for each element, one of the other _ClassCorBuilder_ methods might be
more useful.

# Notice
It is a good practice to implement the elements in a stateless way - so don't use any object variables. In this case
the chain can be reused over and over again.