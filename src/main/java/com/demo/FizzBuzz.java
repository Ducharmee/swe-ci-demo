package com.demo;

public class FizzBuzz 
{
    String processNumber(int num) {
      if ( (num % 15 == 0) ) {
          return "FizzBuzz";
        } else if (num % 3 == 0) {
          return "Fizz";
        } else if (num % 5 == 0) {
          return "Buzz";
        } else {
          return num + "";
        }

    }
    
    String processNumbers (int[] numList) {
        
        int len = numList.length, i;
        String finalRes = "";
        for (i = 0; i < len-1; i++){
          finalRes += processNumber(numList[i]) + ", ";
        }
        return finalRes + processNumber(numList[len-1]);
    }

}
	   
