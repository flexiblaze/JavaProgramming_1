package day27_WrapperClasses;


public class WrapperClassMethods {


    public static void main(String[] args) {



        String str ="123";

       int  num  =  Integer.parseInt(str); //

        System.out.println(num+ 1); // 124
        System.out.println(str + 1); // 1231


        String str2  = "10.5";
        double num2 = Double.parseDouble(str2);

        System.out.println(num2 + 1 );


         int max =Integer.MAX_VALUE;
         int min = Integer.MIN_VALUE;


        System.out.println(max);
        System.out.println(min);

         long  l1 = Long.MAX_VALUE;
         long  l2 = Long.MIN_VALUE;


        System.out.println(l1);
        System.out.println(l2);


        String s1 = "maybe";

        boolean r1 =Boolean.parseBoolean(s1);


        System.out.println(r1);


        String s2 = "123";

        Integer x = Integer.valueOf(s2); // Integer

        int y = Integer.valueOf(s2); // Integer

        System.out.println(x);
        System.out.println(y);


        String s3 = "1,5";
        Double z = Double.valueOf(s3); //Double

        System.out.println(z);

     System.out.println("----------------------------------");


    // isDigit();


     char ch1 = '!';
//isdigit();
     boolean r2 = Character.isDigit(ch1);
//isLetter();
     boolean r3 = Character.isLetter(ch1);

     System.out.println(r2);
     System.out.println(r3);
// special char
     boolean r4 =  !Character.isLetterOrDigit(ch1);


     //upperCase

     boolean r5 =Character.isUpperCase(ch1);

     //lowerCase

     boolean r6 = Character.isLowerCase(ch1);

     System.out.println(r4);
     System.out.println(r6);


     System.out.println("-----------------------");

     String s = "ab1cde2efg3hi4";

     int sum =0;

     for ( char each : s.toCharArray()){

      if (Character.isDigit(each)){

       sum+=Integer.parseInt(each+"");
      }
      System.out.println(sum);















     }



















    }
}
