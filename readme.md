# Design pattern with kotlin

This repo demonstrate how to implement design pattern with kotlin follow https://www.tutorialspoint.com/design_pattern

## Table of contents

* [Factory Pattern](#factory.pattern)
* [Abstract Factory Pattern](#abstract.factory.pattern)
* [Singleton Pattern](#singleton.pattern)
* [Builder Pattern](#builder.pattern)
* [Prototype Pattern](#prototype.pattern)


## <a name="factory.pattern"/> Factory Pattern

> Factory pattern is one of the most used design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
> 
>In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.
>
>**Source:** [tutorialspoint](https://www.tutorialspoint.com/design_pattern/factory_pattern.htm)

#### Implementation
![Preview](https://www.tutorialspoint.com/design_pattern/images/factory_pattern_uml_diagram.jpg)


## <a name="abstract.factory.pattern"/> Abstract Factory Pattern

>Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called as factory of factories. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
>
>In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.
>
>**Source:** [tutorialspoint](https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm)

#### Implementation
![Preview](https://www.tutorialspoint.com/design_pattern/images/abstractfactory_pattern_uml_diagram.jpg)


## <a name="singleton.pattern"/> Singleton Pattern

>Singleton pattern is one of the simplest design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
>
>This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.
>
>**Source:** [tutorialspoint](https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm)

#### Implementation
![Preview](https://www.tutorialspoint.com/design_pattern/images/singleton_pattern_uml_diagram.jpg)


## <a name="builder.pattern"/> Builder Pattern

>Builder pattern builds a complex object using simple objects and using a step by step approach. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
>
>A Builder class builds the final object step by step. This builder is independent of other objects.
>
>**Source:** [tutorialspoint](https://www.tutorialspoint.com/design_pattern/builder_pattern.htm)

#### Implementation
![Preview](https://www.tutorialspoint.com/design_pattern/images/builder_pattern_uml_diagram.jpg)


## <a name="prototype.pattern"/> Prototype Pattern

>Prototype pattern refers to creating duplicate object while keeping performance in mind. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
>
>This pattern involves implementing a prototype interface which tells to create a clone of the current object. This pattern is used when creation of object directly is costly. For example, an object is to be created after a costly database operation. We can cache the object, returns its clone on next request and update the database as and when needed thus reducing database calls.
>
>**Source:** [tutorialspoint](https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm)

#### Implementation
![Preview](https://www.tutorialspoint.com/design_pattern/images/prototype_pattern_uml_diagram.jpg)





