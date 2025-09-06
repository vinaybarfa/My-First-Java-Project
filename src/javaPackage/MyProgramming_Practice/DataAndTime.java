package javaPackage.MyProgramming_Practice;

import java.time.LocalDate;
import java.time.Period;

public class DataAndTime {

    public static void main(String[] args) {
    LocalDate dob = LocalDate.of(2007,9,13);
        System.out.println(Period.between(dob, LocalDate.now()).getDays());
    }
}
