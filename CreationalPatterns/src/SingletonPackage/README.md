# Singleton Design Pattern

    Main purpose of Singleton Design Pattern is ensuring that there will only be a single instance of a specified class. This can be used if we need to avoid some conflicts. The most common example is database connection objects. If you multiple instances of a database connector, you might end up different database states.

    In SingleInstance class, you will notice 2 if checks. This is called double-checked locking. Double-checked locking ensures that even in multi threaded systems, there will be no race condition and our class will have a single instance always. For details, you can check it out [here](https://en.wikipedia.org/wiki/Double-checked_locking#Usage_in_Java)
