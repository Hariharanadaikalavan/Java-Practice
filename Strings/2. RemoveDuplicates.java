import java.util.*;     
  
//Create RemoveDuplicatesExample4 class to remove duplicates from the string   
class RemoveDuplicates {   
        
    // Create removeDuplicates() method to remove duplicates using indexOf() method  
    public static void removeDuplicates(String str)   
    {   
        //Create an empty string   
        String newstr = new String();   
          
        //calculate length of the original string  
        int length = str.length();   
            
        // Traverse the string and check for the repeated characters   
        for (int i = 0; i < length; i++)    
        {   
            // store the character available at ith index in the string  
            char charAtPosition = str.charAt(i);   
                
            // check the index of the charAtPosition. If the indexOf() method returns true add it to the resuting string  
            if (newstr.indexOf(charAtPosition) < 0)   
            {   
                newstr += charAtPosition;   
            }   
        }   
        //Print string after removing duplicate characters   
        System.out.println(newstr);  
    }   
    
    // main() method start  
    public static void main(String[] args)   
    {   
        // Create a string variable with default value   
        String str = "JavaTpoint is the best learning website";   
        //call removeDuplicates() method for removing duplicate characters    
        removeDuplicates(str);   
    }   
}  
