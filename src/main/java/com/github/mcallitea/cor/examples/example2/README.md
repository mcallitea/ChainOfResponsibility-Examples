# Example 2

## Keyfacts
- Usage of _public static <T> T buildChainOfResponsibility(String packageName, Class<T> interfaceToImplement)_
- Paramter-less constructor call by CorBuilder

## Description
This is a more complex example. In this case a custom interface and an abstraction is used. 

The interface _CustomInterface_ extends the _Command_ interface of _com.github.mcallitea.cor.api.Command_. In this 
case, _String_ is used as injection datatype and _Integer_ as return type for _Optional_.

The abstraction _Element_ implements the _CustomInterface_, so Element1, Element2 and Element3 extends _Element_ and so all are 
implementations of _CorCommand_, _Command_ and _CustomInterface_. _CustomInterface_ is part of this example.

The chain elements itself will be instantiated by _CorBuilder_ by a parameter-less constructor call.  

# Notice
It is a good practice to implement the elements in a stateless way - so don't use any object variables. In this case
the chain can be reused over and over again.