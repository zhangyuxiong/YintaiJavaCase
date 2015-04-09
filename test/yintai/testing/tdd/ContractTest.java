package yintai.testing.tdd;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import yintai.ioc.domain.Contract;
import yintai.ioc.domain.Product;
import java.util.Date;

import static org.junit.Assert.*;

public class ContractTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testRecognizedRevenue() throws Exception {
        Product word=Product.newWordProcessor("Thinking Word");
        Product calc=Product.newSpreadsheet("Thinking Calc");
        Product db=Product.newDatabase("Thinking DB");
        Date signDate=new Date(2015,4,1);
        Date today=new Date(2015,4,9);
        Contract contract1=new Contract(word,100.0,signDate);
        Contract contract2=new Contract(calc,90,signDate);
        Contract contract3=new Contract(db,90,signDate);
        contract1.calculateRecognitions();
        contract2.calculateRecognitions();
        contract3.calculateRecognitions();
        double r1=contract1.recognizedRevenue(today);
        Assert.assertEquals(r1,100.0,0);
        double r2=contract2.recognizedRevenue(today);
        Assert.assertEquals(r2,30,0);
        double r3=contract3.recognizedRevenue(today);
        Assert.assertEquals(r3,30,0);
    }
}