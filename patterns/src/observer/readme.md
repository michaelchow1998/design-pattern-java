# Observer Design Pattern
***
## Why need it?
* When multiple Classes need to receive changes of the same data

## What the Observer pattern?
> Define a one-to-many dependency between objects so that when one object changes state,
all its dependents are notified and updated automatically.

## Key Words 
* Subject: Subscribed, tracked, and observed
* Observer: Interested in the topic and track

## Props
* Loose coupling
* Many class receive the same datasouces and it reactive
* Runtime add, remove, delete any Observer

## Cons
* Maintain consistency between objects

## Example
* Subscribe to Newspaper/Magazine  
* Subscribe to the blog

***
## Extra information 
Java API also provides the observer pattern support. Which is Observable and Observer,  
but it is a Class not Interface. If people need to apply it, need to design a Class to extends it 
which break the role - Use more composition, less inheritance.


 