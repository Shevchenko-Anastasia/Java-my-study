package net.study.basic.lesson6;

public class TestArrays {
    public static void main(String[] args) {
        String[] myShoppingList = new String[6];
        myShoppingList[0] = "chocolate";
        myShoppingList[1] = "grapes";
        myShoppingList[2] = "ice cream";
        myShoppingList[3] = "cake";
        myShoppingList[4] = "milk";
        myShoppingList[5] = "strawberry";

//        for (String next : myShoppingList) {
//            System.out.println(next);
//        }
        int index = 6;
       if (myShoppingList.length > index) {
           System.out.println(myShoppingList[index]);
       } else {
           System.out.println("Out of range");
       }


    }
}
