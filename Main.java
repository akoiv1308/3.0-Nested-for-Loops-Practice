class Main {
  public static void main(String[] args) {
    problemA();
    System.out.println();
    problemB();
  }
  public static void problemA() {
    int numberOfdashes = 5;
    for(int number = 1; number <= 9; number+=2) {
      for(int dashBefore = 1; dashBefore <= numberOfdashes; dashBefore++){
        System.out.print("-");
      }
        for(int rows = 1; rows <= number; rows++) {
          System.out.print(number);
        }
        for(int dashAfter = 1; dashAfter <= numberOfdashes; dashAfter++) {
          System.out.print("-");
        }
      System.out.println();
      numberOfdashes--;
      }
    }
    public static void problemB() {
      int numberOfslashes = 0;
      int exPoint = 22;
      for(int rows = 1; rows <= 6; rows++) {
        for(int backSlash = 0; backSlash < numberOfslashes; backSlash+=2) {
          System.out.print("\\");
          System.out.print("\\");
        }
        for(int ex = 0; ex < exPoint; ex++) {
          System.out.print("!");
        }
        for(int forSlash = 0; forSlash < numberOfslashes; forSlash+=2) {
          System.out.print("//");
        }
        System.out.println();
        numberOfslashes+=2;
        exPoint-=4;
      }
    }
  }