import java.util.*;

class PigLatin{
  static char[] vovels = new char[]{'a','e','i','o','u'};
  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    if (Arrays.asList(vovels).contains(s.charAt(0))){
      s += "hay";
    }else{
      String first = s.substring(0,1);
      s = s.substring(1, s.length()) + first + "ay";
    }
    return s;
  }
}
