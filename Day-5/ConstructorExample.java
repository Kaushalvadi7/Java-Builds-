public class ConstructorExample {
    int modelYear;
    String modelName;
  
    public ConstructorExample (int year, String name) {
      modelYear = year;
      modelName = name;
    }
  
    public static void main(String[] args) {
        ConstructorExample myCar = new ConstructorExample(1969, "Mustang");
      System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
  }