/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abel
 */
import java.rmi.*;
public class Server {
    public static void main(String[] args) throws Exception{
        CalculatorClass cc = new CalculatorClass(); 
        Naming.rebind("cal", (calculatorInterface)cc);
        System.out.println("server started.......");
    }
    
}
