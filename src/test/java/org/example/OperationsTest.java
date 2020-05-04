package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

    /**
     * Unit test for simple App.
     */
    public class OperationsTest {
        /**
         * Rigorous Test :-)
         */

        @Test
        public void myAdd()
        {
            int num1= 15;
            int num2= 13;


            Assert.assertEquals(Operations.myAdd(num1,num2),28);
        }
        @Test
        public void mySub()
        {
            int num1= 15;
          int num2= 13;


            Assert.assertEquals(Operations.mySub(num1,num2),2);
        }
        @Test
        public void myMultiple()
        {
            int num1= 5;
            int num2= 3;

            Assert.assertEquals(Operations.myMultiple(num1,num2),15);
        }
        @Test
        public void myDivided()
        {
            int num1= 15;
            int num2= 3;

            Assert.assertEquals(Operations.myDivided(num1,num2),5);
        }
    }




