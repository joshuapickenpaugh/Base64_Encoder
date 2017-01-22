/*
January 20th, 2017
Joshua Pickenpaugh
Unit 2 Assignments: File Encryption Writer (Encoder).
 */

/*

  This class encodes the text to Base64 (as well as displays the encoded text 
  in the console window. 

*/

import java.util.Base64;

public class Encoder {    
    
    //Accepts str, encodes it to Base64:
    public String EncodeString(String str)
    {
        byte[] encodedBytes = Base64.getEncoder().encode(str.getBytes());
        System.out.println("encodedBytes " + new String(encodedBytes));
        
        str = new String(encodedBytes);
        
        return str;
    }

    private String String(byte[] encodedBytes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
