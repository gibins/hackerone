import java.util.Scanner;
class Test { 
    // method to calculate gcd of two numbers 
    static long gcd(long a, long b) 
    { 
        if (a == 0) 
            return b; 
  
        return gcd(b % a, a); 
    } 
    // method to calculate all common divisors 
    // of two given numbers 
    // a, b --> input integer numbers 
    static int commDiv(long a, long b) 
    { 
        // find gcd of a, b 
        long n = gcd(a, b); 
  
        // Count divisors of n. 
        int result = 0; 
        for (int i = 1; i <= Math.sqrt(n); i++) { 
            // if 'i' is factor of n 
            if (n % i == 0) { 
                // check if divisors are equal 
                if (n / i == i) 
                    result += 1; 
                else
                    result += 2; 
            } 
        } 
        return result; 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 

	  Scanner s = new Scanner(System.in);
      
      String[] ip = s.nextLine().split(" ");
        long a = Long.parseLong(ip[0]);
	long b = Long.parseLong(ip[1]);
        System.out.println(commDiv(a, b)); 
    } 
} 


