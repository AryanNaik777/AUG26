public class HHello_world {
    public static void main (String[]args) {
        System.out.println("Hello World");
        float a = 20f;
        float b = 9f;
        float result = a % b;
        System.out.println(result);

        char d = 'A';
        System.out.println(d);

        boolean e = true;
        System.out.println(e);
        String f = "Aryan Naik";
        System.out.println(f);

        int num1 = 10;
        int num2 = 100;
        //int num = (num1==num2);
        if (num1 >= num2) {
            System.out.println("valid");
        } else {
            System.out.println("invalid"); // || - OR, && - AND , !- not logical operator
        }
        int v = 18;
        v -= 3;
        System.out.println(v);
        // if (condition){
        //statement
        //}
        //else{
        // statement
        //} control flow
        if (num1 >= num2){
            System.out.println("valid");
        } else if (num1 <= num2) {
            System.out.println("invalid");

        }
        else{
            System.out.println("false");
        }
        int Rows=5;
        for( int i=1; i<=Rows; i++) {
            //System.out.println(i);
            for(int j = 1; j<=i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int r =1;
        while(r<=5){
            System.out.println(r);
            r++;


        }
        int count =10;
        do{
            System.out.println(count);
            count++;
        }while(count<=3);
                int dayNumber = 6;
                String dayName;
                // The switch statement evaluates the variable
                switch (dayNumber) {
                    case 1:
                        dayName = "Monday";
                        break;
                    case 2:
                        dayName = "Tuesday";
                        break;
                    case 3:
                        dayName = "Wednesday";
                        break;
                    case 4:
                        dayName = "Thursday";
                        break;
                    case 5:
                        dayName = "Friday";
                        break;
                    case 6:
                        dayName = "Saturday";
                        break;
                    case 7:
                        dayName = "Sunday";
                        break;
                    default: // Runs if dayNumber doesn't match any case above
                        dayName = "Invalid day number";
                        break;
                }

                // Output the result
                System.out.println("The day is: " + dayName);
            }

    }






