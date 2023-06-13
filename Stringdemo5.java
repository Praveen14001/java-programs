package com.learning;



public class Stringdemo5 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
      Stringdemo5 sd = new Stringdemo5();
//      sd.rmv_space();//name.stripLeadig
//      sd.rmv_bkspace();//name.strip trailing//pending
    sd.check_count_of_character();  
  }

  private void check_count_of_character() {
    // TODO Auto-generated method stub
    
      String n = "sivasabaribala";
      int count = 1; 
      char ch = n.charAt(4);
      for(int i=5; i<n.length();i++)
      {
        if(ch == n.charAt(i))
        {
          count++; 
        }
      }
      System.out.println(ch + " appears for " + count + 
          " times");
      
    
  }

  private void rmv_bkspace() {
    // TODO Auto-generated method stub
    String name="amal raj  ";
    String name1="";
    
    
  }

  private void rmv_space() {
    // TODO Auto-generated method stub
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

