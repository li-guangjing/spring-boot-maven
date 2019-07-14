import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Decription
 * @Authur Benjamin
 * @Date 2019/7/14 21:30
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@ContextConfiguration
public class TestCase {


    @Test
    public void test(){
        System.out.println("Hello test.");
    }

    @Before
    public void before(){
        System.out.println("Befor hello test.");
    }

    @After
    public void after(){
        System.out.println("After hello test.");
    }
}
