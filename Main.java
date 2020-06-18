public class Main
{
  static String originalString="abcabc";
  
  private static int operationCount(String word, int input1,int input2){
        
      /*write your code here and return appropriate value*/
  	  int orgLen = word.length();
	  
	  String org = word;
	  int turn =0;
	  for(int i=0;i<orgLen;i++) {
		  
		  String s1= word.substring(orgLen-input1);
		  word = s1 + word.substring(0,orgLen-input1);
		 // System.out.println("First M:"+word);         
		  turn = turn+1;
		  
		  if(!org.equalsIgnoreCase(word)) {
			  
			  String s2=word.substring(orgLen-input2);
			  
			  word = s2 + word.substring(0,orgLen-input2);
			  
			  //System.out.println("second N:"+word);  
			  turn = turn+1;
              
		  }
		  
		  
		  if(org.equals(word)) {			  
			 break;			  
		  } 
	  }
   // return 0;
    return turn;
     
  }
  
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
     originalString=args[0];
    System.out.println(operationCount(args[0],Integer.parseInt(args[1]),Integer.parseInt(args[2])));
  }
}
