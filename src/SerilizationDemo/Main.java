package SerilizationDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User user = null;
        FileInputStream fileIn = new FileInputStream(args[0]);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();
        System.out.println("name :" + user.Username );
        System.out.println("password :" + user.password );
        user.show();



    }
}