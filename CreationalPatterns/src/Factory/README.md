# Factory Design Pattern

    Main purpose of Factory Design Pattern is providing a helper function that creates different types of objects under the same abstract class. This way, clients don't have to create constructors for each type of objects. Instead, they will just provide a name for that object.
    After creating object this way, clients will receive each object with the same parent type and they can use them together in a collection as they wish.
    In addition to this flexibility, factory design pattern lets you extend your factory by creating more child classes and adding them in factory class. Clients can include these new classes without any problem

    In this example, we have animal factory that can create Dog and Cat objects but returns them as Animal. Since every function declared in Animal class, we can call these functions without a problem. And childs can implement some of these functions if they require unique implementations.
