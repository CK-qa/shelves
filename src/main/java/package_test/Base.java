package package_test;

import static org.junit.Assert.*;
import org.junit.internal.AssumptionViolatedException;

class Base {

    protected void run() {
        double r = Math.random();
        if (r < 0.1) {
            fail("oops");
        } else if (r < 0.2) {
            throw new AssumptionViolatedException("skipping");
        }
    }

    void test(int n) {
        if (n < 0) {
            fail("less than 0");
        } if (n == 0) {
            fail("its zero");
        }
    }

    //test

    //test apply selected changes

    //this should appear after apply

}