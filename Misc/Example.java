package Misc;

public class Example {
    // Static member: Shared by ALL objects. Allocated once when class is loaded.
    static int staticCount = 0; 
    
    // Instance member: Unique to EACH object. Allocated when 'new' is called.
    int instanceId = 0;

    public Example(int id) {
        this.instanceId = id;
        staticCount++; // Increment the shared counter every time a new object is created
    }

    public void display() {
        System.out.println("Instance ID: " + instanceId + " | Shared Static Count: " + staticCount);
    }

    public static void main(String[] args) {
        System.out.println("--- Program Started ---");
        
        // Creating 3 different objects
        Example obj1 = new Example(101);
        Example obj2 = new Example(102);
        Example obj3 = new Example(103);

        obj1.display();
        obj2.display();
        obj3.display();
    }
}
