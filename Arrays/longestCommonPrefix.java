//leetcode problem no.14
//approach: array of strings
public class longestCommonPrefix {
   public String longestCommon(String[] strs) {
        if(strs == null|| strs.length== 0)
        return "";
       String c= strs[0];
       for (int i=0; i< strs.length; i++){
        while(!strs[i].startsWith(c)){
      c= c.substring(0,c.length()-1);
        
      if (c.isEmpty())
      return "";
        }}
        
        return c;    
            
        }

    
}

