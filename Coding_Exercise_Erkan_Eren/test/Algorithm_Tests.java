/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Coding_Exercise_EE.Search_Algorithm;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


//ALL TESTS PERFORMED ARE THE SAME AS THE ACCEPTANCE CRITERIA SET OUT IN THE CODING EXERCISE SHEET.

/**
 *
 * @author Erkan
 */
public class Algorithm_Tests {
    
    private String Subtext = "";
    private String Text = "";
    private String Expected = "";
    private String Actual = "";
    
    @Test
    public void Algorithm_Test1(){
        
        Text = "How much wood would a Woodchuck chuck, if a Woodchuck could chuck wood?";
        Subtext = "How";
        Expected = "1, ";
        Search_Algorithm search = new Search_Algorithm();
        search.SearchForSubstring(Subtext, Text);
        Actual = search.result;
        assertEquals(Expected, Actual);
       
    }
    
    @Test
    public void Algorithm_Test2(){
        
        Text = "How much wood would a Woodchuck chuck, if a Woodchuck could chuck wood?";
        Subtext = "wood";
        Expected = "10, 23, 45, 67, ";
        Search_Algorithm search = new Search_Algorithm();
        search.SearchForSubstring(Subtext, Text);
        Actual = search.result;
        assertEquals(Expected, Actual);
       
    }
    
    @Test
    public void Algorithm_Test3(){
        
        Text = "How much wood would a Woodchuck chuck, if a Woodchuck could chuck wood?";
        Subtext = "Wood";
        Expected = "10, 23, 45, 67, ";
        Search_Algorithm search = new Search_Algorithm();
        search.SearchForSubstring(Subtext, Text);
        Actual = search.result;
        assertEquals(Expected, Actual);
       
    }
      
    @Test
    public void Algorithm_Test4(){
        
        Text = "How much wood would a Woodchuck chuck, if a Woodchuck could chuck wood?";
        Subtext = "oo";
        Expected = "11, 24, 46, 68, ";
        Search_Algorithm search = new Search_Algorithm();
        search.SearchForSubstring(Subtext, Text);
        Actual = search.result;
        assertEquals(Expected, Actual);
       
    }
      
    @Test
    public void Algorithm_Test5(){
        
        Text = "How much wood would a Woodchuck chuck, if a Woodchuck could chuck wood?";
        Subtext = "oO";
        Expected = "11, 24, 46, 68, ";
        Search_Algorithm search = new Search_Algorithm();
        search.SearchForSubstring(Subtext, Text);
        Actual = search.result;
        assertEquals(Expected, Actual);
       
    }
            
    @Test
    public void Algorithm_Test6(){
        
        Text = "How much wood would a Woodchuck chuck, if a Woodchuck could chuck wood?";
        Subtext = "wooden";
        Expected = "";
        Search_Algorithm search = new Search_Algorithm();
        search.SearchForSubstring(Subtext, Text);
        Actual = search.result;
        assertEquals(Expected, Actual);
       
    }
                
    @Test
    public void Algorithm_Test7(){
        
        Text = "How much wood would a Woodchuck chuck, if a Woodchuck could chuck wood?";
        Subtext = "?";
        Expected = "71, ";
        Search_Algorithm search = new Search_Algorithm();
        search.SearchForSubstring(Subtext, Text);
        Actual = search.result;
        assertEquals(Expected, Actual);
       
    }
                    
    @Test
    public void Algorithm_Test8(){
        
        Text = "How much wood would a Woodchuck chuck, if a Woodchuck could chuck wood?";
        Subtext = "x";
        Expected = "";
        Search_Algorithm search = new Search_Algorithm();
        search.SearchForSubstring(Subtext, Text);
        Actual = search.result;
        assertEquals(Expected, Actual);
       
    }
    
}
