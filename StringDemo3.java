package com.learning;

public class StringDemo3 {

	public static void main(String[] args) {
//		String name = "Amal Raj";
//	    for(int i=0; i<name.length(); i++)
//	    {
//	    char letter = name.charAt(i);
//	    if(letter>='a' && letter<='z')
//	      System.out.print((char)(letter-32));
//	    else
//	      System.out.print(letter);
//	    
//	    }
//	   
//	    String name = "amalRAJ 12345";
//	    for(int i=0; i<name.length(); i++)
//	    {
//	    char letter = name.charAt(i); //letter = A
//	//if the letter is present in between 'A' and 'Z':
//	    if(letter>='A' && letter<='Z')
//	      System.out.print((char)(letter+32));
//	    else
//	      System.out.print(letter);
//	    }
//		String name = "amalraj Vijayakumar";
//	    //AmAlRaJ
//	    //0123456
//	    //0  2 4 6 --> Index
//	    
//	    for(int i=0; i<name.length();i++)
//	    {
//	      char letter = name.charAt(i);
//	      if(letter>='a' && letter<='z')
//	      {
//	        if(i%2==0)
//	          {
//	          System.out.print((char)(letter-32));
//	          }
//	        else
//	        {
//	          System.out.print(letter);
//	        }
//	      }
//	      else
//	      {
//	        System.out.print(letter);
//	      }
//	    }
//	}}
//		String name = "   amalraj";
//	    String name2 = "";
//	    char[] ch = name.toCharArray();
//	    for(int i=0; i<ch.length;i++)
//	    {
//	      char letter = ch[i];
//	      if (letter==' ')
//	      {
//	        
//	      }
//	      else {
//	      //System.out.print(ch[i]);
//	      name2 = name2 + letter; 
//	      }
//	    }
//	    System.out.println(name2);
//	}
//}
		String name = "   amal raj";
	    String name2 = "";
	    boolean alphabet_came = false;
	    char[] ch = name.toCharArray();
	    for(int i=0; i<ch.length;i++)
	    {
	      char letter = ch[i];
	      if (letter==' ' && alphabet_came == false)
	      {
	  
	      }
	      else {
	        alphabet_came = true; 
	      //System.out.print(ch[i]);
	      name2 = name2 + letter; //amal
	      }
	    }
	    System.out.println(name2);
	}
}


