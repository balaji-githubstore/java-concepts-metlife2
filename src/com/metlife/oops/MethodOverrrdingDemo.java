package com.metlife.oops;

class Doctor
{
    public int docId;
    public String docName;

//    public Doctor(int a)
//    {
//
//    }

    public void displayDoctorDetails()
    {
        System.out.println("Doc Id: "+docId);
        System.out.println("Doc Name: "+docName);
    }

    public void treatPatient()
    {
        System.out.println("treatment for fever!!");
    }
}

class Dentist extends Doctor{
    public void treatPatient()
    {
        System.out.println("treatment for dental related issues");
    }
}
class Vetenarian extends Doctor
{
    public void treatPatient()
    {
        System.out.println("treatment for animal");
    }
}

class Dentist2 extends Dentist
{
    public void treatPatient()
    {
        System.out.println("treatment for dental2");
    }
}


public class MethodOverrrdingDemo {

    public static void main(String[] args) {

        Dentist den=new Dentist();
        den.docId=101;
        den.docName="John";
        den.displayDoctorDetails();
        den.treatPatient();

        Vetenarian v=new Vetenarian();
        v.docId=102;
        v.docName="Peter";

        v.displayDoctorDetails();
        v.treatPatient();

        System.out.println("------------------------------------");
        Dentist2 d2=new Dentist2();
        d2.docId=103;
        d2.docName="paul";
        d2.displayDoctorDetails();
        d2.treatPatient();

    }
}
