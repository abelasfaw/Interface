/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abel
 */
import java.rmi.Remote;
public interface calculatorInterface extends Remote {
       public int add(int x , int y) throws Exception;
    
}
