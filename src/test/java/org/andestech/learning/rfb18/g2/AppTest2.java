package org.andestech.learning.rfb18.g2;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;

@RunWith(Parameterized.class)
public class AppTest2 {
    private double a,b,res;

    //private static Collection<Object[]> testList = null;

    public AppTest2(double a, double b, double res) {
        this.a = a;
        this.b = b;
        this.res = res;
    }

   // public AppTest2(){}

//    @BeforeClass
//    public static void classInit(){
//
//      testList =  TestFileReader.getDatafromFile("src/test/resources/positiveTestData");
//    }


    @Parameterized.Parameters
    public static Collection<Object[]> getData()
    {
        return TestFileReader.getDatafromFile("src/test/resources/positiveTestData");
    }

    @Test
    public void testMult2()
    {
        System.out.println("a=" + a + ", b=" + b + ", expected=" + res);
        Assert.assertEquals(res, Utils.mult(a,b), 2-15);

    }


}
