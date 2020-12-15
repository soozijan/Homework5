 Scanner scanner = new Scanner(System.in);
        //Targil 1 :
        System.out.println("Please Enter a number for a: ");
        int a = scanner.nextInt();
        System.out.println("Please Enter a number for b: ");
        int b = scanner.nextInt();
        if ( a > b)   {
              System.out.println(String.format("You Entered %d > %d" , a , b));
        }
        else if ( a < b)   {
               System.out.println(String.format("You Entered %d < %d" , a , b));

        }
        else  {
            System.out.println(String.format("You Entered %d = %d" , a , b));
        }

        //Targil 2:
        int x = 5;
        while (x <= 10) {
            System.out.println(x);
            x = x + 1;
        }

        //Targil 3 :
        System.out.println("Please Enter a number:");
        int number = scanner.nextInt();
        while (number <= 100)   {
            System.out.println("Please Enter a number: ");
             number = scanner.nextInt();
        }


        //Etgar 1:
        int index4 = 4;
        while (index4 <= 100)   {
            System.out.println(index4);
            index4 = index4 + 2 ;
        }


        //Etgar 2 :
        System.out.println("Enter two same numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        while (num1 != num2)   {
            System.out.println("Enter two same numbers: " );
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
        }

        System.out.println("Goodbye...");


