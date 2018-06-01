/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abel
 */
import java.rmi.server.*;
public class CalculatorClass extends UnicastRemoteObject implements calculatorInterface {
   
    public CalculatorClass ()throws Exception
    {
    super();
    }
    public int add(int x , int y) {
    
        return x +y;
    }
    
}
