public class Main{
    public static void main(String[] args) {
//        task1(30,40);
//        task2(88888888,22);
//        task3
//        int[] a = new int[30];
//        task3(a,32);
//        task4
//        Insert/greater
        int[] arIn = {88,20,32,45};
        int[] arSor = {23,90,-9,4};
        print(arIn);
        task4insert(arIn);
        print(arIn);
        sortCheck(arIn);
//        Sort/lesser
        print(arSor);
        task4select(arSor);
        print(arSor);
        sortCheck(arSor);

    }
    public static void task1(int num1,int num2){
        while(num2 != 0){
            int largestDealer = num2;
            num2 = num1 % num2;
            num1 = largestDealer;
        }
        System.out.println(num1);
    }
    public static void task2(int num,int userNum){
        int sum = 0;
        int tempnum = num;
        while(tempnum != 0){
            sum += tempnum%10;
            tempnum /= 10;
        }
        if (sum==userNum){
            System.out.println(sum+" is equal to "+userNum);
        }else{
            System.out.println(sum+" is not equal to "+userNum);
        }
    }
    public static void task3(int[] a,int beginNum){
        a[0] = beginNum;
        a[1] = beginNum;
        outerloop:
        for (int i = 2; i < a.length; i++) {
            a[i] = a[i-1] + a[i-2];
            int sum = a[i];
            for (int j = 2; j < sum; j++) {
                boolean hardNum = false;
                if(i%j==0){
                    System.out.println(sum+" is hard number");
                    break;
                }
                if(!hardNum) {
                    System.out.println(sum + " is simple number");
                    break outerloop;//уберите outerloop чтобы цыкл не заканчивался на первом простом
                }
            }
        }
    }
    public static void task4insert(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                if (ar[i]>ar[j]) {
                    int tmp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = tmp;
                }
            }
        }
    }
    public static void task4select(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            int min=i;
            for (int j = 0; j < ar.length; j++) {
                if(ar[j]<ar[min]){
                    min = j;
                    int tmp = ar[i];
                    ar[i] = ar[min];
                    ar[min] = tmp;
                }
            }

        }
    }
    public static void print(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+ " ");
        }
        System.out.println();
    }
    public static void sortCheck(int[] ar){
        if (ar[0]>ar[1]){
            System.out.println("that cycle goes lesser");
        }else {
            System.out.println("that cycle goes greater");
        }
        System.out.println("-----");
    }



//    public static void isSimple(int num){
//        boolean hardn = false;
//        for (int i = 2; i < num; i++) {
//            if(num%i==0){
//                System.out.println("num "+num+ " is hard");
//                hardn=true;
//                break;
//            }
//        }
//        if(!hardn==true)
//            System.out.println("num "+num+" is easy");
//    }
//    public static void SearchPolindrom(int num) {
//        int originalNum = num;
//        int digit = 0;
//        while (num > 0) {
//            digit += num % 10;
//            if (num > 9)
//                digit *= 10;
//            num /= 10 ;
//        }
//        if (originalNum == digit)
//            System.out.println("Polindrom");
//        else
//            System.out.println("Not Polindrom");
//    }
}