/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 22:24:40 GMT 2018
 */

package uk.ac.sanger.artemis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.datatransfer.Clipboard;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.FeatureSegment;
import uk.ac.sanger.artemis.FeatureSegmentVector;
import uk.ac.sanger.artemis.Selection;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class FeatureSegmentVector_ESTest extends FeatureSegmentVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      FeatureSegmentVector featureSegmentVector0 = selection0.getSelectedSegments();
      featureSegmentVector0.addElementAtEnd((FeatureSegment) null);
      featureSegmentVector0.setElementAt((FeatureSegment) null, 0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      FeatureSegmentVector featureSegmentVector0 = selection0.getSelectedSegments();
      featureSegmentVector0.addElementAtEnd((FeatureSegment) null);
      featureSegmentVector0.removeElementAt(0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      FeatureSegmentVector featureSegmentVector0 = selection0.getSelectedSegments();
      featureSegmentVector0.addElementAtEnd((FeatureSegment) null);
      int int0 = featureSegmentVector0.size();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FeatureSegmentVector featureSegmentVector0 = new FeatureSegmentVector();
      featureSegmentVector0.insertElementAt((FeatureSegment) null, 0);
      boolean boolean0 = featureSegmentVector0.removeElement((FeatureSegment) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      FeatureSegmentVector featureSegmentVector0 = selection0.getSelectedSegments();
      featureSegmentVector0.addElementAtEnd((FeatureSegment) null);
      FeatureSegment featureSegment0 = featureSegmentVector0.lastElement();
      assertNull(featureSegment0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      FeatureSegmentVector featureSegmentVector0 = selection0.getSelectedSegments();
      featureSegmentVector0.addElementAtEnd((FeatureSegment) null);
      int int0 = featureSegmentVector0.indexOf((FeatureSegment) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      FeatureSegmentVector featureSegmentVector0 = selection0.getSelectedSegments();
      featureSegmentVector0.addElementAtEnd((FeatureSegment) null);
      FeatureSegment featureSegment0 = featureSegmentVector0.elementAt(0);
      assertNull(featureSegment0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("L_pH2~z//<T~Am%K");
      Selection selection0 = new Selection(clipboard0);
      FeatureSegmentVector featureSegmentVector0 = selection0.getSelectedSegments();
      // Undeclared exception!
      try { 
        featureSegmentVector0.setElementAt((FeatureSegment) null, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FeatureSegmentVector featureSegmentVector0 = new FeatureSegmentVector();
      // Undeclared exception!
      try { 
        featureSegmentVector0.removeElementAt(2068);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2068, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FeatureSegmentVector featureSegmentVector0 = new FeatureSegmentVector();
      // Undeclared exception!
      try { 
        featureSegmentVector0.elementAt((-34));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      FeatureSegmentVector featureSegmentVector0 = selection0.getSelectedSegments();
      int int0 = featureSegmentVector0.indexOf((FeatureSegment) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FeatureSegmentVector featureSegmentVector0 = new FeatureSegmentVector();
      int int0 = featureSegmentVector0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FeatureSegmentVector featureSegmentVector0 = new FeatureSegmentVector();
      Object object0 = featureSegmentVector0.clone();
      assertNotSame(object0, featureSegmentVector0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FeatureSegmentVector featureSegmentVector0 = new FeatureSegmentVector();
      // Undeclared exception!
      try { 
        featureSegmentVector0.removeElementAt((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FeatureSegmentVector featureSegmentVector0 = new FeatureSegmentVector();
      featureSegmentVector0.removeAllElements();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Selection selection0 = new Selection((Clipboard) null);
      FeatureSegmentVector featureSegmentVector0 = selection0.getSelectedSegments();
      // Undeclared exception!
      try { 
        featureSegmentVector0.setElementAt((FeatureSegment) null, (-962));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -962
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      FeatureSegmentVector featureSegmentVector0 = selection0.getSelectedSegments();
      featureSegmentVector0.addElementAtEnd((FeatureSegment) null);
      boolean boolean0 = featureSegmentVector0.contains((FeatureSegment) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      FeatureSegmentVector featureSegmentVector0 = selection0.getSelectedSegments();
      boolean boolean0 = featureSegmentVector0.contains((FeatureSegment) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FeatureSegmentVector featureSegmentVector0 = new FeatureSegmentVector();
      // Undeclared exception!
      try { 
        featureSegmentVector0.lastElement();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      FeatureSegmentVector featureSegmentVector0 = selection0.getSelectedSegments();
      // Undeclared exception!
      try { 
        featureSegmentVector0.elementAt(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      FeatureSegmentVector featureSegmentVector0 = selection0.getSelectedSegments();
      boolean boolean0 = featureSegmentVector0.removeElement((FeatureSegment) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FeatureSegmentVector featureSegmentVector0 = new FeatureSegmentVector();
      // Undeclared exception!
      try { 
        featureSegmentVector0.add((FeatureSegment) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - adding a null object
         //
         verifyException("uk.ac.sanger.artemis.util.FastVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FeatureSegmentVector featureSegmentVector0 = new FeatureSegmentVector();
      // Undeclared exception!
      try { 
        featureSegmentVector0.insertElementAt((FeatureSegment) null, (-1336));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1336, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Clipboard clipboard0 = new Clipboard("");
      Selection selection0 = new Selection(clipboard0);
      FeatureSegmentVector featureSegmentVector0 = selection0.getSelectedSegments();
      // Undeclared exception!
      try { 
        featureSegmentVector0.addElement((FeatureSegment) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - adding a null object
         //
         verifyException("uk.ac.sanger.artemis.util.FastVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FeatureSegmentVector featureSegmentVector0 = new FeatureSegmentVector();
      featureSegmentVector0.sortByPosition();
  }
}
