
import java.rmi.Naming;

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
public class Client {
    public static void main(String[] args) throws Exception{

        calculatorInterface ci = (calculatorInterface)Naming.lookup("cal");
        
        int result = ci.add(100,100);
        System.out.println("sum is>>>>>> " + result);
    }
}
