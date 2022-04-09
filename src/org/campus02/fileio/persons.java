package org.campus02.fileio;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class persons {

    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Studium\\temp\\persons.txt"), StandardCharsets.UTF_16BE))){

            String stringHelper = "";

            while((stringHelper = br.readLine()) != null){
                String[] columns = stringHelper.split(";");
                System.out.println("columns.length = " + columns.length);
                System.out.println("columns[0] = " + columns[0]);
                System.out.println("columns[1] = " + columns[1]);
                System.out.println("columns[2] = " + columns[2]);

                //System.out.println(stringHelper);
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
