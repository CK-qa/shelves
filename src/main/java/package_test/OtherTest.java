package package_test;

import org.junit.Test;

public class OtherTest extends Base {

    @Test public void mytest() {
        run();
    }

    @Test
    public void testestOK() {
        positive_test(7 - 5);
    }

    @Test
    public void testestNotOK() {
        positive_test(5 - 5);
    }

    @Test
    public void testestAnotherNotOK() {
        positive_test(5 - 7);
    }

}