package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        FileOutputStream fout = null;
        FileInputStream fin = null;

        try {
          /*fout = new FileOutputStream("/home/java1/Asztal/test.txt");
           String s = "Hello World";
           fout.write(s.getBytes());*/
            fout = new FileOutputStream("/home/java1/Asztal/vers.txt");
            fin = new FileInputStream("/home/java1/Asztal/kosztolanyi_dezso_hajnali_reszegseg.txt");
            int i;
            while ((i = fin.read()) != -1) {
                fout.write((char) i);

            }

        } catch (FileNotFoundException e) {

            System.err.println(e.getMessage());

        } catch (Exception e) {

            System.err.println(e.getMessage());

        } finally {
            if (fin != null) {

                try {
                    fin.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



       try (BufferedReader br = new BufferedReader(new FileReader("/home/java1/Asztal/matrix.txt"))){
            String line;
            String [][] matrix = new String[3][3];
            while ((line = br.readLine())!=null){
                for (int i = 0; i < 3 ; ++i) {
                   matrix[i] = line.split(" ");

                }

            }


       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }

    }
}
