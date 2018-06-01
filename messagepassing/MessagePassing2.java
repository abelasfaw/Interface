/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messagepassing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Abel
 */
public class MessagePassing2 {
    public static void main(String[] args) throws Exception {
        String ip = "localhost";
        Socket s = new Socket(ip , 9999);
        System.out.println("sending message to MOD1");
        String messageToSend = "message from MOD2";
        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
        os.write(messageToSend);
        os.flush();
        
         BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println("reading message from MOD1");
        char[] chars = new char[100];
        int message = br.read(chars);
        for(int i= 0; i <message ; i++){
            System.out.print(chars[i]);
        }
        System.out.println(" ");
    
    }
    
}
