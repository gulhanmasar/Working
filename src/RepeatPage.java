public class RepeatPage {
    public static void main(String[] args){
        System.out.println("hello java");
        //Variables
        //Integer
        int age = 20;
        System.out.println(10*age);
      int x = 5;
      int y= 10;
        System.out.println(y/x);
         long myLong = 10;
        System.out.println(myLong);

        float myFloat = 10f;
        System.out.println(myFloat);

        //Double - Float
        double z = 5.0;
        double a = 11.0;
        System.out.println(a/z);

        double pi = 3.14;
        int r = 5;
        System.out.println(2*r*pi);

        //String
        String name = "Gulhan";
        System.out.println(name);
        String surname = "Masar";
        System.out.println(surname);
        String fullname = name + " " + surname;
        System.out.println(fullname);

        //boolean
        boolean isAlive = true;
        isAlive = false;
        System.out.println(isAlive);

        //Final
       final int myInteger = 5;
        System.out.println("myInteger: " + myInteger);

        /*  myInteger = 4;
           System.out.println("myInteger:" + myInteger); final koddan dolayi sabit oldu*/
    }
}
