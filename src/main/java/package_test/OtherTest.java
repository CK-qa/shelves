package package_test;

import org.junit.Test;

public class OtherTest extends Base {

    @Test
    public void mytest() {
        run();
    }

    @Test
    public void testestOK() {
        test(7 - 5);
    }

    @Test
    public void testestNotOK() {
        test(5 - 5);
    }

    @Test
    public void testestAnotherNotOK() {
        test(5 - 7);
    }

}