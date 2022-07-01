package com.tuanbe.mathutil.core;

import static com.tuanbe.mathutil.core.MathUtils.getFactorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Tranduc
 */
public class MathUtilsTest {
    //choi DDT, tach Data ra khoi cau lenh kiem thu, tham so hoa data nay
    //vao trong cau lenh kiem thu
    
    //chuan bi bo data 
    public static Object[][] initData(){
        return new Integer[][]{
            {1,1},
            {2,2},
            {5,120},
            {6,720}
        };
    }
    
    @ParameterizedTest
    @MethodSource(value = "initData")//ten ham cung cap data, ngam dinh thu tu cua phan tu cua mang, map vao tham so ham 
    public void testGetFactorialGivenRightArgReturnsWell(int input, long expected){
        assertEquals(expected, getFactorial(input));
    }
    
    //Bat ngoai le khi dua data ca chon
    @Test 
    public void testGetFactorialGivenWrongArgThrowExp(){
        //Bieu thuc lambda
        //ham nhan tham so thu 2 la 1 object implement cai functional interface ten la executable - co 1 ham duy nhat  - ten la executable 
//        Executable exObject=new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                getFactorial(-5);
//            
//            }
//        };
        assertThrows(IllegalArgumentException.class, ()-> getFactorial(-5));
    }
}
