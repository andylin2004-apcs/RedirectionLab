import java.io.*;
import java.util.*;

class MakeStars{
  public static void main(String[] args) throws FileNotFoundException{
    try{
      Scanner in = new Scanner(new File(args[0]));
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
    catch (Exception e){
      throw new Error("Please provide a valid file.");
    }
  }
}
