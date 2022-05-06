 public class HelloWorld {
        public static void main(String[] args) {
            String s = ("Hello World ");
            String s1 = ("I'm James");
            System.out.println(s.toLowerCase() + s1.toUpperCase());
//replacing meatArray Println with a 'for loop'
            System.out.println("Sandwiches have these meats:");
            String meatArray[] = {"Ham", "Roast Beef", "Turkey"};
            for(int i = 0; i < meatArray.length; i++)
            System.out.println(meatArray[i]);
            //System.out.println(meatArray[1]);
            //System.out.println(meatArray[2]);


            System.out.println("We have these cheeses: ");
            String[] cheeseArray = {"Cheddar", "Brie", "Bleu","Swiss", "Parmesan"};
//this displays the first item in the array of cheeses
            System.out.println(cheeseArray[3]);
            // the first item in the cheeseArray is cheddar
            System.out.println(cheeseArray[0]);
            System.out.println(cheeseArray[1]);
            System.out.println(cheeseArray[2]);
            //here we add the meat Array and cheese Array together to have a sandwich
            System.out.println("My favorite sandwich is " + meatArray[1] +" & "+ cheeseArray[3]);


        }
    }

