package org.andestech.learning.rfb18.g2;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class AppTest 
{
   private double a,b,res;

    public AppTest(double a, double b, double res) {
        this.a = a;
        this.b = b;
        this.res = res;
    }

//@Parameterized.Parameters
public static Collection<Object[]> getData()
{
    return Arrays.asList(

            new Object[][]{
                    {1,2,2},
                    {2,10,20},
                    {3,15,45},
                    {3,20,60}
            }
    );
       //..

}

    @Parameterized.Parameters
    public static Collection<Object[]> getData2()
    {
        ArrayList<Object[]> arrayList =
                new ArrayList<>();

        arrayList.add(new Object[]{1,2,2});
        arrayList.add(new Object[]{2,10,20});
        arrayList.add(new Object[]{3,15,45});
        arrayList.add(new Object[]{4,20,60});


        return arrayList;


    }

    @Test
    public void testMult()
    {
        System.out.println("a=" + a + ", b=" + b + ", expected=" + res);
        Assert.assertEquals(res, Utils.mult(a,b), 2-15);
    }
}
