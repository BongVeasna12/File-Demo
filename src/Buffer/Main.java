package Buffer;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        String textFileLocation = "./mydata/myfile.txt";
        String message = """
                Good Morning!
                I would like to tell you something
                
                """;
        // for reading the data
        try(
                BufferedReader bufferedReader = new BufferedReader(
                        new FileReader(textFileLocation)
                )
        ){
            String data;
            while( (data = bufferedReader.readLine())!=null){
                System.out.println(data );
            }


        }catch (IOException ex){
            ex.printStackTrace();// to identify the error easily
        }


    }
}
