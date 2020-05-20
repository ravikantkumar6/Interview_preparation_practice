import java.util.*; 
import java.io.*;

class Main {

  public static String FindIntersection(String[] strArr) {
    String [] str1 = strArr[0].split(", "); 
    String [] str2 = strArr[1].split(", "); 
    int i =0;
    int j = 0;
    StringBuilder stringBuilder = new StringBuilder();
    while(i<str1.length && j<str2.length){
      if(Integer.parseInt(str1[i].trim()) == Integer.parseInt(str2[j].trim())){
        stringBuilder.append(str1[i]+",");
        i++;
        j++;
      }else if(Integer.parseInt(str1[i]) > Integer.parseInt(str2[j])){
        j++;
      }else{
        i++;
      }
    }
    return stringBuilder.toString();
  }

  public static void main (String[] args) {  
    // keep this function call here     
	/*
	 * Scanner s = new Scanner(System.in); String [] string= new String[]
	 * {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
	 * System.out.print(FindIntersection(string));
	 */
	  List<String> list = new ArrayList<String>();
	  list.add("raj");
	  list.add("sonia");
	  Collections.sort(list);
  }

}