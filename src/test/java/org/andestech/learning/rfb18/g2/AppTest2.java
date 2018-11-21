package org.andestech.learning.rfb18.g2;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Collection;
import java.util.List;

public class AppTest2 {
    private double a,b,res;

    private static Collection<Object[]> testList;

//    public AppTest2(double a, double b, double res) {
//        this.a = a;
//        this.b = b;
//        this.res = res;
//    }

    public AppTest2(){}

    @BeforeClass
    public static void classInit(){

      testList =  TestFileReader.getDatafromFile("src/test/resources/positiveTestData");
    }

    @Test
    public void testMult2()
    {
        System.out.println("a=" + a + ", b=" + b + ", expected=" + res);
        Assert.assertEquals(res, Utils.mult(a,b), 2-15);

    }


}
