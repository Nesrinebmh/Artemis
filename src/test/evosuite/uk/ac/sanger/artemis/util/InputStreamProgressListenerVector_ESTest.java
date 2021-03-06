/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 19:34:25 GMT 2018
 */

package uk.ac.sanger.artemis.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.util.InputStreamProgressListener;
import uk.ac.sanger.artemis.util.InputStreamProgressListenerVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class InputStreamProgressListenerVector_ESTest extends InputStreamProgressListenerVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InputStreamProgressListenerVector inputStreamProgressListenerVector0 = new InputStreamProgressListenerVector();
      inputStreamProgressListenerVector0.add((InputStreamProgressListener) null);
      int int0 = inputStreamProgressListenerVector0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InputStreamProgressListenerVector inputStreamProgressListenerVector0 = new InputStreamProgressListenerVector();
      inputStreamProgressListenerVector0.add((InputStreamProgressListener) null);
      InputStreamProgressListener inputStreamProgressListener0 = inputStreamProgressListenerVector0.elementAt(0);
      assertNull(inputStreamProgressListener0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InputStreamProgressListenerVector inputStreamProgressListenerVector0 = new InputStreamProgressListenerVector();
      // Undeclared exception!
      try { 
        inputStreamProgressListenerVector0.elementAt(1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      InputStreamProgressListenerVector inputStreamProgressListenerVector0 = new InputStreamProgressListenerVector();
      int int0 = inputStreamProgressListenerVector0.size();
      assertEquals(0, int0);
  }
}
