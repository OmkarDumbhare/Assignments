package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
public class StringAssignmentQ3 {
    public static void main(String[] args) throws IOException {
        try{
            URL url= new URL("https://httpbin.org/get");
            HttpURLConnection http= (HttpURLConnection)url.openConnection();
            URLConnection urlcon = url.openConnection();
            Map<String , List<String>>header = urlcon.getHeaderFields();

            for(Map.Entry<String , List<String>> mp:header.entrySet())
            {
                System.out.println(mp.getKey() + ":");
                System.out.println(mp.getValue().toString());
            }
            System.out.println("Get response header by key ...");
            List<String> contentLength=header.get("Content-Length");
            if(contentLength==null){
                System.out.println("Content-Length doesn't present in header");
            }
            else{
                for(String header1: contentLength){
                    System.out.println("Content=Length" + header1);
                }
            }
            int statuscode = http.getResponseCode();
            System.out.println("Status Code"+statuscode);
            System.out.println();
            System.out.println("complete source code of the URL is: ");

            BufferedReader br= new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
            String i;
            while((i= br.readLine()) != null){
                System.out.println(i);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
    }

