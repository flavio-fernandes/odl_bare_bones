
package org.opendaylight.controller.hello_world.internal;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest extends TestCase {

        @Test
        public void testHelloWorldCreation() {

                HelloWorld helloWorld = null;
                helloWorld = new HelloWorld();
                Assert.assertTrue(helloWorld != null);

        }

}
