package net.study.basic.lesson7;

public class PractiseWhiles {

    public static void main(String[] args) throws InterruptedException {
//        int y = 1;
//        while (y <= 10){
//            System.out.println(y);
//            y++;
//        }

        int[] numbers = {2, 5, 4, 3, 8, 99, 9, 2, 11, 37, 111, 54, 41, 43, 1, 252};

//        for(int i=0;i < numbers.length; i++){
//            if(numbers[i] %2 !=0){
//                System.out.println(numbers[i]);
//            }
//        }

//        int i=0;
//        while(i < numbers.length){
//            if(numbers[i] %2 !=0) {
//                System.out.println(numbers[i]);
//            };
//            i++;
//        }

        int i=0;
        do{
            if(numbers[i] %2 !=0) {
                System.out.println(numbers[i]);
                Thread.sleep(1000);
          } i++;
        } while(i < numbers.length);

    }
}
