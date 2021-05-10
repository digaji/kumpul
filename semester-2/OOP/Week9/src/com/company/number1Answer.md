## Change the method from static binding to dynamic binding  
  
```java
// From this
// Animal
public static void sleep()
{
    System.out.println("Sleep time...");
}

// Dog
public static void sleep()
{
    System.out.println("Bark and sleep time...");
}

// To this
// Animal
public void sleep()
{
System.out.println("Sleep time...");
}

// Dog
@Override
public void sleep()
{
System.out.println("Bark and sleep time...");
}
```