/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messagepassing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Abel
 */
public class MessagePassing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("server started......waiting for client");
        Socket s = ss.accept();
        System.out.println("Client connected");
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println("reading message from MOD2");
        char[] chars = new char[100];
        int message = br.read(chars);
        for(int i= 0; i <message ; i++){
            System.out.print(chars[i]);
        }
        System.out.println(" ");
        System.out.println("sending message to MOD2");
        String messageToSend = "message from MOD1";
        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
        os.write(messageToSend);
        os.flush();
        
                
        //System.out.println("client message : "  + message);
        
    }
    
}
