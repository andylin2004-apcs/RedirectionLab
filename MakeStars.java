import java.io.*;
import java.util.*;

class MakeStars{
  public static void main(String[] args) throws IOException{
    Scanner in = new Scanner(new InputStreamReader(System.in));
    while(in.hasNextLine()){
      Scanner line = new Scanner(in.nextLine());
      String toPrint = "";
      while(line.hasNext()){
        int wordLength = line.next().length();
        for (int i = 0; i<wordLength; i++){
          toPrint += "*";
        }
        toPrint += " ";
      }
      System.out.println(toPrint);
    }
  }
}
