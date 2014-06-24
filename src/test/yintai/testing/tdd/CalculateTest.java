package test.yintai.testing.tdd;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import test.yintai.testing.LogDummy;
import yintai.testing.tdd.Calculate;

import static org.junit.Assert.assertEquals;

/** 
* Calculate Tester. 
* 傀儡对象测试
* @author zhangyuxiong
* @since 2014-06-23
* @version 1.0 
*/ 
public class CalculateTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 



/** 
* 
* Method: Add(int a, int b) 
* 
*/ 
@Test
public void testAdd() throws Exception {
    Calculate calculate=new Calculate();
    calculate.setLogger(new LogDummy());
    double sum=calculate.Add(1,1);
    assertEquals(sum,2.0,0.0);

} 


} 
