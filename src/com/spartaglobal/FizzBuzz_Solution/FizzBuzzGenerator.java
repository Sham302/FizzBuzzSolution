package com.spartaglobal.FizzBuzz_Solution;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzGenerator {

    private boolean divisibleBy(int FizzBuzzInt, int divisibleNum){
        return FizzBuzzInt % divisibleNum == 0;
    }

    private List <String> fizzBuzzGenerator(int fizzBuzzStartNum, int fizzBuzzEnd){
        List<String> fizzBuzzList = new ArrayList<>();

       for (int i=fizzBuzzStartNum; i< fizzBuzzEnd +1; i++){
          if (divisibleBy(i,15)){
              fizzBuzzList.add("FizzBuzz");
          } else if (divisibleBy(i, 5)){
              fizzBuzzList.add("Buzz");
          } else if (divisibleBy(i, 3)){
              fizzBuzzList.add("Fizz");
          } else {
              fizzBuzzList.add(String.valueOf(i));
          }
          }
        return fizzBuzzList;
       }
      public void printFizzBuzzList(int fizzBuzzStartNum, int fizzBuzzEndNum){
        List<String> fizzBuzzGenerator = fizzBuzzGenerator(fizzBuzzStartNum, fizzBuzzEndNum);
        for (int i = 0; i < fizzBuzzGenerator.size(); i++){
            System.out.println(fizzBuzzGenerator.get(i));
        }
      }
    }

