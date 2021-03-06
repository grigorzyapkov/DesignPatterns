# Factory Method Pattern

## Intent

**Factory Method** is a creational design pattern that defines an interface for creating objects, but lets subclasses decide which class to instantiate. 

## Motivation

Creating an object ofter requires complex processes. The object's creation may lead to a significant duplication of code, may require information not accessible to the composing object, or may not be part of the composing object's responsibilities.

## Implementation

1. Make all product classes implement the same interface. This interface should declare methods that make sense in every product.
2. Create an abstract class that have an abstract factory method. The return type of the method should be the product interface.
3. Create set of creator subclasses and for each override the factory method.
