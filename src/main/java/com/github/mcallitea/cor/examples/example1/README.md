# Example 1
The first one is a very simple example. In this case the client only injects a _String_ to the chain. 
So every element checks if it is responsible for the injected string or not. If the element is responsible, the 
string will be printed to _STDOUT_. 

Every element will only print the given string and adds the class-name as prefix. So we can see which element of the 
chain is responsible.

# Notice
It is a good practice to implement the elements in a stateless way - so don't use any object variables. In this case 
the chain can be reused over and over again.