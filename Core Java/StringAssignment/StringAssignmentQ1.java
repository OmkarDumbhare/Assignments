package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class StringAssignmentQ1 {
    public static void main(String[] args) throws Exception {
        String line;
        List<String> str =new ArrayList<>();
        int count=0;
        FileReader file =new FileReader("C:\\Users\\omkar\\OneDrive\\Documents\\Downloads\\Java11Assignments_StudentList.txt");
        BufferedReader br =new BufferedReader(file);
        while ((line = br.readLine()) != null){
            if(line.isEmpty()){

            }
            else
                {
                    str.add(line);
                    count++;
                }
        }
        System.out.println(count);
        System.out.println(str);
        br.close();
    }
}
