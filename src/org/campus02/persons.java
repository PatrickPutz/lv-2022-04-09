package org.campus02;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class persons {

    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Studium\\temp\\persons.txt"), StandardCharsets.UTF_16BE))){

            String stringHelper = "";

            while((stringHelper = br.readLine()) != null){
                System.out.println(stringHelper);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        File f = new File("C:\\Studium\\temp\\persons.txt");


        FileReader fl = new FileReader(f);
        BufferedReader br = new BufferedReader(fl);

        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }

        br.close();
*/
    }

}
