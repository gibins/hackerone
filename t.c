#include<stdio.h>
#include<math.h>
int gcd(long a, long b);
int commDiv(long a, long b);

void main(){
 long int a,b;
scanf("%ld",&a);
scanf("%ld",&b);
commDiv(a,b);
}

int gcd(long int a, long int b) 
    { 
        if (a == 0) 
            return b; 
  
        return gcd(b % a, a); 
    } 



int commDiv(long int a, long int b) 
    { 
        // find gcd of a, b 
        int n = gcd(a, b); 
  
        // Count divisors of n. 
        int result = 0; 
       for (int i = 1; i <= sqrt(2); i++) { 
            // if 'i' is factor of n 
            if (n % i == 0) { 
                // check if divisors are equal 
                if (n / i == i) 
                    result += 1; 
                else
                    result += 2; 
            } 
        } 
	printf("%d",result);
        return result; 
    } 

