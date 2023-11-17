package placaDeCarro;

import java.io.*;
import java.nio.file.Paths;
import java_cup.runtime.*;

class Driver {
	 static public void main(String argv[])
	  {	
		 System.out.println("Entre com a formula:\n");  
		try 
		{
			AnalisadorSintatico  p = new AnalisadorSintatico(new Lexer(System.in));
			Object result = p.parse().value;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	  }
	}



