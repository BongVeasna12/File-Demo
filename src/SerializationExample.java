import java.io.*;

public class SerializationExample {

    public static void main(String[] args) {
        // Create an object to serialize
        Person person = new Person("John Doe", 30, "password123");

        // Serialize the object to a file
        serializeObject(person, "person.ser");

        // Deserialize the object from the file
        Person deserializedPerson = (Person) deserializeObject("person.ser");

        // Print the deserialized object
        System.out.println("Deserialized Person:");
        System.out.println("Name: " + deserializedPerson.getName());
        System.out.println("Age: " + deserializedPerson.getAge());
        System.out.println("Password: " + deserializedPerson.getPassword());
    }

    // Serialize an object to a file
    private static void serializeObject(Object object, String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(object);
            objectOut.close();
            fileOut.close();
            System.out.println("Object serialized and saved to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserialize an object from a file
    private static Object deserializeObject(String fileName) {
        Object object = null;
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            object = objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("Object deserialized from " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }
}

class Person implements Serializable {
    private String name;
    private  transient int age;
    private transient String password;

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }
}