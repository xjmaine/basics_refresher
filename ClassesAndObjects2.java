package java_tutorials;

public class ClassesAndObjects2 {
    
    public static void main(String[] args) {
        
        // What is a java class?
        // A class is a template/blueprint which defines the properties and behaviors of objects.
        // it is required for creating objects

        //Objects: the instance/copy/clone of a class
        // An object is an instance of a class and has its own set of attributes (data)

        //creating an object
        // ClassName objectName = new ClassName();
        //new ClassesAndObjects2();

        // some variables
        int i = 0;

        //how many objects can be created?
        // as many as you want
        while (true) {
            System.out.println(i);
            new ClassesAndObjects2();
            i++;
        }
        // this loop will run forever and create objects until the program crashes

        //where does the  objects exist?
        // in the heap memory
        // java has the garbage collection (or heap in this case) which automatically deletes objects that are no longer in use
        // the reference variable is a variable that holds the memory address of the object
        
    }
}
