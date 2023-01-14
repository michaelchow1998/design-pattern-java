# Decorator Design Pattern
***
## Why need it?
* We need to dynamically increase the behavior of the object while the program is running

## What the Decorator pattern?
> Add additional rights and responsibilities to objects dynamically, without deriving
> subcategories and flexible expansion functions.

## Example
    black(red(yellow(data)))
## Props
* Favor composition over inheritance
* Responsibilities that can dynamically augment or remove objects
* Use composition to make objects have different behaviors

## Cons
* Because it usually becomes Stacked decorators when used, it is more troublesome when one of the decorators needs to be removed
* Need follow the order
* hard to debug

## Daily Cases
* Coffee
* Food
* Hero Title




 