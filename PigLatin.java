import java.util.*;

class PigLatin{
  static char[] vovels = new char[]{'a','e','i','o','u'};
  static String[] dia = new String[]{"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
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
  public static String pigLatin(String s){
    s = s.toLowerCase();
    if (Arrays.asList(vovels).contains(s.charAt(0))){
      s += "hay";
    }else if (Arrays.asList(dia).contains(s.substring(0,2))){
      String first = s.substring(0,2);
      s = s.substring(2, s.length()) + first + "ay";
    }else{
      String first = s.substring(0,1);
      s = s.substring(1, s.length()) + first + "ay";
    }
    return s;
  }
  public static String pigLatinBest(String s){
    s = s.toLowerCase();
    if (Arrays.asList(vovels).contains(s.charAt(0))){
      if ((int)s.charAt(s.length()-1) < 97 || (int)s.charAt(s.length()-1) > 122){
        s = s.substring(0, s.length()-1) + "hay" + s.substring(s.length()-1, s.length());
      }else{
        s += "hay";
      }
    }else if (Arrays.asList(dia).contains(s.substring(0,2))){
      String first = s.substring(0,2);
      if ((int)s.charAt(s.length()-1) < 97 || (int)s.charAt(s.length()-1) > 122){
        s = s.substring(2, s.length()-1) + s.substring(0,2) + "ay" + s.substring(s.length()-1, s.length());
      }else{
        s = s.substring(2, s.length()) + s.substring(0,2) + "ay";
      }
    }else if ((int)s.charAt(0) >= 97 && (int)s.charAt(0) <= 122){
      if ((int)s.charAt(s.length()-1) < 97 || (int)s.charAt(s.length()-1) > 122){
        s = s.substring(1, s.length()-1) + s.substring(0,1) + "ay" + s.substring(s.length()-1, s.length());
      }else{
        s = s.substring(1, s.length()) + s.substring(0,1) + "ay";
      }
    }
    return s;
  }
}
