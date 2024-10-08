package Methods;

public class Methods {

    public static int square(int squareNubmer) {
        return squareNubmer * squareNubmer;
    }

    public static String printFullName(String name, String lastName) {
        return name + " " + lastName;

    }

    public static String[] cornerValuesArray(String[] lineLength) {
      if(lineLength.length == 0){
          return new String[]{null, null};
      }
      String[] cornerValues = new String[]{lineLength[0], lineLength[0]};
      
      for(String str : lineLength) {
          if(str.length() < lineLength[0].length()){
              cornerValues[0] = str;
              
          } else if (str.length() > cornerValues[1].length()) {
              cornerValues[1] = str;
              
          }
      }
      return cornerValues;
    }

}
