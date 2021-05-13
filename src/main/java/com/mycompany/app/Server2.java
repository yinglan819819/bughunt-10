package com.mycompany.app;

import javax.crypto.Cipher;
import java.lang.Exception;

/**
 * Hello world!
 *
 */
public class Server2
{
    public void bar()
    {
        System.out.println( "Hello World!" );
    }

    private void foo(String p) {
       String s = "aloha";
       System.out.println(String.format("This is a faulty message: %i", s));
       System.out.format("No %d",1);
       if ("1".equals("2")) {
            //dosomething
            // not fixing
            int a = 2;
       }
    }
  
    private void cipher(String s) throws Exception
    {
        Cipher c = Cipher.getInstance(s);
    }

}
