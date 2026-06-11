public class day2 {
    public static void main(String[] args) {
        // boolean b = true;
        // int i = 50;

        // selection statements

        // if(i>5 && i<10){
        // System.out.println("i is equal to 5");
        // }else{
        // System.out.println("This will always be printed");
        // }

        //

        // int age = 18;

        // if(age < 18){
        // System.out.println("You are a minor");
        // }else if(age >= 18 && age < 65){
        // System.out.println("You are an adult");
        // }else{
        // System.out.println("You are a senior citizen");
        // }

        // switch statement

        // int i = 4;

        // switch (i) {
        //     case 1:
        //         System.out.println("i is 1");
        //         break;
        //     case 2:
        //         System.out.println("i is 2");
        //         break;
        //     case 3:
        //         System.out.println("i is 3");
        //         break;
        //     default:
        //         System.out.println("i is not 1, 2, or 3");
        //         break;
        // }



         //----------------------------loops------------------------------------\\

         //while loop

        //  int i = 0;

        //  while(i <= 5){
        //     System.out.println(i);
        //     --i;
        //  }

          



        // do-while loop
        // int i = 0;

        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i <=10);
            



        // for loop


        // for(int i=2; i<=20; i++){
        //     System.out.println(i);
        // }


     // patter 
     //triangle


        // for(int i=1; i<=10; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }




        // for (int i = 1; i <= 10; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("_->");
        //     }
        //     System.out.println();
        // }

       
        


        //jump statement

        // for(int i=1; i<=10; i++){
        //     System.out.println(i);

        //     if(i>5){
        //         break;
        //     }
        // }

        // A number is prime or not 
        // int p = 10;
        // int i;

        // for( i=2; i<p; i++){
        //     if(p % i == 0){
        //         System.out.println("Number is Not prime  ");
        //     }
        // }

        // if(i == p){
        //     System.out.println("Number is Prime");
        // }



        // for(int i=1; i<=10; i++){
        //     if(i % 2 == 0){
        //       System.out.println(i);
        //     }
        // }


        //break in the nested loops

        for(int i=1; i<=10; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");

                if(j>=5){
                    break;
                }
            }
            System.out.println();
        }
       

    }
}
