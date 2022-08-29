public class Statements {

    public static void main(String[] args){

        int x = 5;
        System.out.println(x);
        x=x+1;  // x++ da yazdirabiliriz
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);
        x = x*5;
        System.out.println(x);

        int y = 4;
        System.out.println(x>y);
         y =30;
        System.out.println(x>=y);
        System.out.println(x==y);
        System.out.println(x!=y);

        //AND  &&  VE  OR ||
         x = 30;
         y = 4;
         int z = 5;
        System.out.println(x<y && y<z); // her iki tarafinda dogru olmasi durumunda dogru verir en az biri yanlissa yanlistir.
        System.out.println(x<y || z<y);// iki taraftan biri dogru ise sonuc dogru.

        //if statements

        if(x<y){
            System.out.println("y is bigger");
        }else if (y<x) {
            System.out.println("x is bigger");//istedigimiz kadar else if tanimlayabiliriz
        }else{
            System.out.println("x = y");
        }

        //switch
        int day = 1;
        String dayString = "";
      /*  if(day==1){
            dayString="Monday";
        } else if (day==2) {
            dayString= "Tuesdady";
        } else if (day==3) {
            dayString = "wednesday";
        }else{
            dayString = "sunday";
        }*/

        switch(day){
            case 1 :
                dayString = "Monday";
                break;
            case 2:
                dayString ="tuesday";
                break;
            case 3:
                dayString = "wednesday";
            default:
                dayString = "sunday";
        }


        System.out.println(dayString);


    }
}
