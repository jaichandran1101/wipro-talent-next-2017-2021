import java.util.*;
import java.lang.*;
import java.io.*;
class Patient
{
    String name;
    double height,weight;
    Patient(double w,double h)
    {
        weight=w;
        height=h;
    }
    double CobHealth()
    {          
        return ((weight/(height*height))*703);
    }   
}
class Patients
{
    public static void main (String[] args)
    {
        Patient p=new Patient(75,156);
        System.out.println("The BMI:"+p.CobHealth());
    }
}