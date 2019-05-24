/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coding_Exercise_EE;

/**
 *
 * @author Erkan
 */
public class Search_Algorithm {

    public String result = "";
    
    public String SearchForSubstring(String Text, String subText) 
    {
        //changes text to lowercase before comparison
        subText = subText.toLowerCase();
        Text = Text.toLowerCase();
        
        //length of both variables
        int textLen = Text.length(); 
        int subTextLen = subText.length(); 
  
        //checks if the text is longer than the subtext
        if (subText.length() >= Text.length()){
        
            //iterates i while subtext length is shorter than the text length    
            for (int i = 0; i <= subTextLen - textLen; i++) { 
            
            int j; 
       
            //iterates j while it is shorter than the text length
            //when the initial character is found check each subsequent character to see if there is a match to the text.      
            for (j = 0; j < textLen; j++) 
                if (subText.charAt(i + j) != Text.charAt(j)){
                    break;
            } 
  
            //successful word recognition
            if (j == textLen) {
               result = result + Integer.toString(i + 1) + ", ";
            }   
        }    
    }
        //if the text is not longer than the subtext
        else {
            result = "not a valid comparison!";
        }
        
    return null;
        
    }

}