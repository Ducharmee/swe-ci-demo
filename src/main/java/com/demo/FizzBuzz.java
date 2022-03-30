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
        if(nums.length == 1){
          return processNumber(nums[0]);
        } else if (nums.length == 0){
          return "";
        }
        int i;
        for(i = 0; nums.length > i; i++){
          if(i == nums.length - 1){
            if (nums[i] % 15 == 0){
              result = result + "Fizz Buzz";
            } else if(nums[i] % 3 == 0){
              result = result + "Fizz";
            } else if (nums[i] % 5 == 0){
              result = result + "Buzz";
            } else {
              result = result + Integer.toString(nums[i]) + ",";
            }
          } else { 
            if (nums[i] % 15 == 0){
                result = result + "Fizz Buzz,";
              } else if(nums[i] % 3 == 0){
                result = result + "Fizz,";
              } else if (nums[i] % 5 == 0){
                result = result + "Buzz,";
              } else {
                result = result + Integer.toString(nums[i]) + ",";
              }
          }
        }
        return result;
    }
    

}
