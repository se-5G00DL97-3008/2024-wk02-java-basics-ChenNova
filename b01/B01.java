
class B01 {
    public static void main(String[] args) {
        int bottles = 99;

        while (bottles > 1) {
            System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
            System.out.println("Take one down and pass it around, " + (bottles - 1) + " bottles of beer on the wall.");
            bottles--;
            if (bottles == 2) {
                System.out.println(
                        "2 bottles of beer on the wall, 2 bottles of beer.");
                System.out.println("Take one down and pass it around, 1 more bottle of beer on the wall.");
                bottles--;
            }
            if (bottles == 1) {
                System.out.println(
                        "1 bottle of beer on the wall, 1 bottle of beer.");
                System.out.println(
                        "Take one down and pass it around, no more bottles of beer on the wall.");
            }
        }

        System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
        System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
    }
}