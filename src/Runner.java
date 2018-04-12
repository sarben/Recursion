public class Runner {
    public static void main(String args[]) {
    System.out.println(factorial(3));
    System.out.println(fibonacci(3));
    System.out.println(sumDigits(126));
    System.out.println(allStar("hello"));
    }

    public static int factorial(int n){
        if (n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int fibonacci(int n){
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int sumDigits(int n){
    if (Integer.valueOf(n).toString().length() == 1){
        return n;
    }
    return n%10 + sumDigits(n/10);
    }

    public static String allStar(String str){
        if(str.length() <= 1){
            return str;
        }
        return str.substring(0,1) + "*" + allStar(str.substring(1));
    }

    public static int count11(String str){
        if(str.length() <= 1){
            return 0;
        }
        return
    }


}

