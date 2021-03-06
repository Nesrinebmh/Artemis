/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 13:00:17 GMT 2018
 */

package uk.ac.sanger.artemis.components.filetree;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.filetree.FileList;
import uk.ac.sanger.artemis.j2ssh.FTProgress;
import uk.ac.sanger.artemis.j2ssh.SshFileManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class FileList_ESTest extends FileList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileList fileList0 = new FileList((SshFileManager) null);
      // Undeclared exception!
      try { 
        fileList0.getZipEntryContents((String) null, "", (File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = FileList.isConnected();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileList fileList0 = null;
      try {
        fileList0 = new FileList();
      
      } catch(HeadlessException e) {
    	  	fail("Caught: HeadlessException");
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileList fileList0 = new FileList((SshFileManager) null);
      // Undeclared exception!
      try { 
        fileList0.stat("'vV^K");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileList fileList0 = new FileList((SshFileManager) null);
      FTProgress fTProgress0 = mock(FTProgress.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        fileList0.getFileContents("NP<7 ", fTProgress0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileList fileList0 = new FileList((SshFileManager) null);
      // Undeclared exception!
      try { 
        fileList0.rename(".gz", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileList fileList0 = new FileList((SshFileManager) null);
      // Undeclared exception!
      try { 
        fileList0.pwd();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileList", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileList fileList0 = new FileList((SshFileManager) null);
      FTProgress fTProgress0 = mock(FTProgress.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        fileList0.put("dQ(Gp)rmpTt(}H%", (File) null, fTProgress0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileList fileList0 = new FileList((SshFileManager) null);
      // Undeclared exception!
      try { 
        fileList0.delete("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileList fileList0 = new FileList((SshFileManager) null);
      // Undeclared exception!
      try { 
        fileList0.mkdir((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileList fileList0 = new FileList((SshFileManager) null);
      // Undeclared exception!
      try { 
        fileList0.getDirList("K68|^N/aO%:");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileList fileList0 = new FileList((SshFileManager) null);
      // Undeclared exception!
      try { 
        fileList0.isDirectory("HuuHps%2J?^n[QhLY");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.filetree.FileList", e);
      }
  }
}
