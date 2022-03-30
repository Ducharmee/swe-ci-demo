package com.demo;

public class FizzBuzz 
{
    String processNumber(int num)
	{	
            if (num % 15 == 0){
          return "Fizz Buzz";
        } else if(num % 3 == 0){
          return "Fizz";
        } else if (num % 5 == 0){
          return "Buzz";
        }
        return Integer.toString(num);
    }
	
	String processNumbers (int[] numList)
	{
         String result = "";
        if(numList.length == 1){
          return processNumber(numList[0]);
        } else if (numList.length == 0){
          return "";
        }
        int i;
        for(i = 0; numList.length > i; i++){
          if(i == numList.length - 1){
            if (numList[i] % 15 == 0){
              result = result + "Fizz Buzz";
            } else if(numList[i] % 3 == 0){
              result = result + "Fizz";
            } else if (numList[i] % 5 == 0){
              result = result + "Buzz";
            } else {
              result = result + Integer.toString(numList[i]) + ",";
            }
          } else { 
            if (numList[i] % 15 == 0){
                result = result + "Fizz Buzz,";
              } else if(numList[i] % 3 == 0){
                result = result + "Fizz,";
              } else if (numList[i] % 5 == 0){
                result = result + "Buzz,";
              } else {
                result = result + Integer.toString(numList[i]) + ",";
              }
          }
        }
        return result;
    }
    

}
