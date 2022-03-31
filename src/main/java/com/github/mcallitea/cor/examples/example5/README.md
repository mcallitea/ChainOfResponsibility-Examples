# Example 5
## Keyfacts
- Usage of _AnnotationCorBuilder.buildChainOfResponsibility(String packageName)
- Configuration by annotations

## Description
The AnnotationCorBuilder only has two public methods: first, the initialization of the chain by a string providing the 
package-name or second the initialization by an instance of _Package_. The complete configuration is done by 
annotations.
In this example you have to look at the _Element1, Element2, Element3_ and the _UndefinedElement_ classes. All classes are 
annotated as _@CorElement_. So these classes are candidates for the chain. But only if a class implements the
_CorCommand_ interface it will be used as an element of the chain. In this example the classes _Element1, Element2 and 
Element3_ extends the abstract class _Element_. The abstract class _Element_ implements the _CustomInterface_ interface, 
which extends the _Command_ interface of the cor-api. The _UndefinedElement_ class does not implement the needed 
interface, so it will be skipped by the builder.

# Notice
It is a good practice to implement the elements in a stateless way - so don't use any object variables. In this case
the chain can be reused over and over again.