package org.example.Demo03;

import jdk.jshell.spi.ExecutionControl;

/*
On souhaite développer une application qui nous permet de connaître si une année est bissextile

Les critères pour une années sont :

- Une année divisible par 400.
- Une année divisible par 4 mais pas par 100.
- Une année n'est pas divisible par 4000.

Le développement doit se faire en TDD
*/
public class LeapTester {
    public boolean isLeap(int year) {
//        if(year % 4000 == 0){
//            return false;
//        }
//        else if (year % 400 == 0){
//            return true;
//        }
//        else if (year % 4 == 0 && year % 100 != 0) {
//            return true;
//        }
////        throw new ExecutionControl.NotImplementedException("");
//        return false;
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
                && year % 4000 != 0;
    }
}
