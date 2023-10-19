package net.study.basic.lesson8;

public class SwitchCase {
    public static void main(String[] args) {
    Employee tester2 = new Employee("Dasha", 1020);

    tester2.run();
        Employee.greetings();




        for (int i = 0; i < 10; i++){
            if (i == 5)
                break;
            System.out.println(i);
        }
       // int n = 10;
       // for(int i=5, j = n - 1 ; i < j; i++, j--){
        //    System.out.println(i * j);
      //  }
   }

    public static String resolveStatus(int requestStatus) {
        String status;
        switch (requestStatus) {
            case 1:
                status = "accepted";
                break;
            case 2:
                status = "rejected";
                break;
            case 3:
                status = "pending accepted";
                break;
            case 4:
            case 5:
                status = "processing";
                break;
            default:
                status = "unknown";

        }

        return status;
    }
}
