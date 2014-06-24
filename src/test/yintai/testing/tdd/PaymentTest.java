package test.yintai.testing.tdd; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import yintai.testing.tdd.Account;
import yintai.testing.tdd.Payment;

import static org.junit.Assert.assertEquals;

/** 
* Payment Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 23, 2014</pre> 
* @version 1.0 
*/ 
public class PaymentTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getAccountMapper() 
* 
*/ 
@Test
public void testGetAccountMapper() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: setAccountMapper(IAccountMapper accountMapper) 
* 
*/ 
@Test
public void testSetAccountMapper() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: Pay(int paymentAccountId, int incomeAccountId, double amount) 
* 
*/ 
@Test
public void testPay() throws Exception {
    AccountMapperFake fake=new AccountMapperFake();
    Account user1=new Account();
    user1.setAmount(100);
    user1.setId(1);
    fake.save(user1);
    Account user2=new Account();
    user2.setAmount(1000);
    user2.setId(2);
    fake.save(user2);


    Payment pay=new Payment();
    pay.setAccountMapper(fake);
    pay.Pay(1,2,50);

    assertEquals(fake.find(1).getAmount(),50.0,0);
    assertEquals(fake.find(2).getAmount(),1050.0,0);

} 


} 
