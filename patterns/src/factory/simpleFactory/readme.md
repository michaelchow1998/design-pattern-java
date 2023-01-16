# Simple Factory Design Pattern
***
## Why need it?
* The simple factory mode allows the creation of components without letting the client be responsible, and can even reduce or avoid the troublesome and complicated setting work required for component creation.

## What the Simple Factory pattern?
> Simple Factory is a very easy-to-use design pattern. When the program complexity is high, 
> you can use this pattern to cut complex judgment formulas, 
> separate business logic and construction formulas, make business logic simple, 
> and isolate complex construction formulas which effectively improving the readability of the code

## Key Words
* Product: Abstract or Interface product role - Cake
* ConcreteProduct: Specific product role - CheeseCake / CheeseCake
* Factory: Responsible for creating corresponding objects - SimpleCakeFactory

## Props
* The process of hiding object instantiation
* Different kinds can be obtained from the factory through the argument.

## Cons
* To write many factories will increase the complexity of the code.
* Factory classes cannot be inherited due to the use maybe static methods.

 