# Singleton Pattern


## Intent

Ensure a class has only one instance and provide a global access to it.

## Motivation

Sometimes it is important to have only one instance for a class. For example, there should be only one file system and one window manager or in the desing of logger classes.

## Implementation

The implementation consists of a static memeber in the Singleton class, a private constructor and a static public method that returns a reference to the static member.
