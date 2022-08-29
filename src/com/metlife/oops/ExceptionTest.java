package com.metlife.oops;

public class ExceptionTest {

    public static void main(String[] args) {

        try {
            int a=0;
            int b=10;
            System.out.println(b/a);

            int[] numbers=new int[3];
            System.out.println(numbers[10]); //new ArrayIndexOutOfBoundsException().


        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
         //   e.printStackTrace();
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("code done");
        }
        }



}
