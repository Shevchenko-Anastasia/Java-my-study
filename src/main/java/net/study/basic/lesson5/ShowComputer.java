package net.study.basic.lesson5;


public class ShowComputer {
    public static void main(String[] args){
        System.out.println(Computer.counter);
        Computer Computer1 = new Computer(16, 100, 64, 195);
        System.out.println(Computer1);
        Computer Computer2 = new Computer(16, 100, 64, 195);
        System.out.println(Computer2);
        Computer Computer3 = new Computer(32, 180, 95, 215);
        System.out.println(Computer3);
        System.out.println(Computer.counter);

        System.out.println("Computer" + " #" + "1" + " equals " + "Computer" + " #" + "2" + ": " + Computer1.equals(Computer2));
        System.out.println("Computer" + " #" + "1" + " equals " + "Computer" + " #" + "3" + ": " + Computer1.equals(Computer3));
        System.out.println("Computer" + " #" + "2" + " equals " + "Computer" + " #" + "3" + ": " + Computer2.equals(Computer3));
    }


}
