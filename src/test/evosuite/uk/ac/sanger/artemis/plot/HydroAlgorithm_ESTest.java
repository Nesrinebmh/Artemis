/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 22:06:38 GMT 2018
 */

package uk.ac.sanger.artemis.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.Feature;
import uk.ac.sanger.artemis.plot.HydrophilicityAlgorithm;
import uk.ac.sanger.artemis.plot.HydrophobicityAlgorithm;
import uk.ac.sanger.artemis.sequence.AminoAcidSequence;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class HydroAlgorithm_ESTest extends HydroAlgorithm_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AminoAcidSequence aminoAcidSequence0 = new AminoAcidSequence(" and symbol list ");
      assertEquals(6, AminoAcidSequence.UNKNOWN_AA);
      assertEquals(3, AminoAcidSequence.HYDROPHOBIC_AA);
      assertEquals(1, AminoAcidSequence.POSITIVELY_CHARGED_AA);
      assertEquals(2, AminoAcidSequence.NEGATIVELY_CHARGED_AA);
      assertEquals(5, AminoAcidSequence.STOP_AA);
      assertEquals(25, AminoAcidSequence.symbol_count);
      assertEquals(7, AminoAcidSequence.ILLEGAL_AA);
      assertEquals(4, AminoAcidSequence.SPECIAL_AA);
      assertEquals(0, AminoAcidSequence.POLAR_UNCHARGED_AA);
      assertFalse(aminoAcidSequence0.containsStopCodon());
      assertEquals(17, aminoAcidSequence0.length());
      assertEquals(" and symbol list ", aminoAcidSequence0.toString());
      assertNotNull(aminoAcidSequence0);
      
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      doReturn(aminoAcidSequence0).when(feature0).getTranslation();
      HydrophilicityAlgorithm hydrophilicityAlgorithm0 = new HydrophilicityAlgorithm(feature0);
      assertEquals(6, AminoAcidSequence.UNKNOWN_AA);
      assertEquals(3, AminoAcidSequence.HYDROPHOBIC_AA);
      assertEquals(1, AminoAcidSequence.POSITIVELY_CHARGED_AA);
      assertEquals(2, AminoAcidSequence.NEGATIVELY_CHARGED_AA);
      assertEquals(5, AminoAcidSequence.STOP_AA);
      assertEquals(25, AminoAcidSequence.symbol_count);
      assertEquals(7, AminoAcidSequence.ILLEGAL_AA);
      assertEquals(4, AminoAcidSequence.SPECIAL_AA);
      assertEquals(0, AminoAcidSequence.POLAR_UNCHARGED_AA);
      assertFalse(aminoAcidSequence0.containsStopCodon());
      assertEquals(17, aminoAcidSequence0.length());
      assertEquals(" and symbol list ", aminoAcidSequence0.toString());
      assertFalse(hydrophilicityAlgorithm0.scalingFlag());
      assertEquals("Hopp-Woods Hydrophilicity", hydrophilicityAlgorithm0.getAlgorithmName());
      assertEquals("hydrophilicity", hydrophilicityAlgorithm0.getAlgorithmShortName());
      assertEquals(1, hydrophilicityAlgorithm0.getValueCount());
      assertEquals(3.4028235E38F, hydrophilicityAlgorithm0.getUserMax(), 0.01F);
      assertFalse(hydrophilicityAlgorithm0.isUserMaxMin());
      assertEquals(1.4E-45F, hydrophilicityAlgorithm0.getUserMin(), 0.01F);
      assertNotNull(hydrophilicityAlgorithm0);
      
      float[] floatArray0 = new float[7];
      // Undeclared exception!
      try { 
        hydrophilicityAlgorithm0.getValues(1, 100, floatArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      doReturn((AminoAcidSequence) null).when(feature0).getTranslation();
      HydrophilicityAlgorithm hydrophilicityAlgorithm0 = new HydrophilicityAlgorithm(feature0);
      assertEquals(3.4028235E38F, hydrophilicityAlgorithm0.getUserMax(), 0.01F);
      assertFalse(hydrophilicityAlgorithm0.scalingFlag());
      assertEquals(1.4E-45F, hydrophilicityAlgorithm0.getUserMin(), 0.01F);
      assertEquals("hydrophilicity", hydrophilicityAlgorithm0.getAlgorithmShortName());
      assertEquals("Hopp-Woods Hydrophilicity", hydrophilicityAlgorithm0.getAlgorithmName());
      assertFalse(hydrophilicityAlgorithm0.isUserMaxMin());
      assertEquals(1, hydrophilicityAlgorithm0.getValueCount());
      assertNotNull(hydrophilicityAlgorithm0);
      
      // Undeclared exception!
      try { 
        hydrophilicityAlgorithm0.getValues(100, 842, (float[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.plot.HydroAlgorithm", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AminoAcidSequence aminoAcidSequence0 = new AminoAcidSequence("i|I.2qVk");
      assertEquals(2, AminoAcidSequence.NEGATIVELY_CHARGED_AA);
      assertEquals(0, AminoAcidSequence.POLAR_UNCHARGED_AA);
      assertEquals(5, AminoAcidSequence.STOP_AA);
      assertEquals(4, AminoAcidSequence.SPECIAL_AA);
      assertEquals(7, AminoAcidSequence.ILLEGAL_AA);
      assertEquals(25, AminoAcidSequence.symbol_count);
      assertEquals(6, AminoAcidSequence.UNKNOWN_AA);
      assertEquals(3, AminoAcidSequence.HYDROPHOBIC_AA);
      assertEquals(1, AminoAcidSequence.POSITIVELY_CHARGED_AA);
      assertEquals("i|I.2qVk", aminoAcidSequence0.toString());
      assertFalse(aminoAcidSequence0.containsStopCodon());
      assertEquals(8, aminoAcidSequence0.length());
      assertNotNull(aminoAcidSequence0);
      
      AminoAcidSequence aminoAcidSequence1 = AminoAcidSequence.getSpacedTranslation("i|I.2qVk", true);
      assertFalse(aminoAcidSequence1.equals((Object)aminoAcidSequence0));
      assertNotSame(aminoAcidSequence1, aminoAcidSequence0);
      assertEquals(6, AminoAcidSequence.UNKNOWN_AA);
      assertEquals(4, AminoAcidSequence.SPECIAL_AA);
      assertEquals(25, AminoAcidSequence.symbol_count);
      assertEquals(7, AminoAcidSequence.ILLEGAL_AA);
      assertEquals(0, AminoAcidSequence.POLAR_UNCHARGED_AA);
      assertEquals(2, AminoAcidSequence.NEGATIVELY_CHARGED_AA);
      assertEquals(5, AminoAcidSequence.STOP_AA);
      assertEquals(3, AminoAcidSequence.HYDROPHOBIC_AA);
      assertEquals(1, AminoAcidSequence.POSITIVELY_CHARGED_AA);
      assertFalse(aminoAcidSequence1.containsStopCodon());
      assertEquals("x  x  ", aminoAcidSequence1.toString());
      assertEquals(6, aminoAcidSequence1.length());
      assertNotNull(aminoAcidSequence1);
      
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      doReturn(aminoAcidSequence0, aminoAcidSequence0, aminoAcidSequence1).when(feature0).getTranslation();
      HydrophilicityAlgorithm hydrophilicityAlgorithm0 = new HydrophilicityAlgorithm(feature0);
      assertFalse(aminoAcidSequence0.equals((Object)aminoAcidSequence1));
      assertFalse(aminoAcidSequence1.equals((Object)aminoAcidSequence0));
      assertEquals(2, AminoAcidSequence.NEGATIVELY_CHARGED_AA);
      assertEquals(0, AminoAcidSequence.POLAR_UNCHARGED_AA);
      assertEquals(5, AminoAcidSequence.STOP_AA);
      assertEquals(4, AminoAcidSequence.SPECIAL_AA);
      assertEquals(7, AminoAcidSequence.ILLEGAL_AA);
      assertEquals(25, AminoAcidSequence.symbol_count);
      assertEquals(6, AminoAcidSequence.UNKNOWN_AA);
      assertEquals(3, AminoAcidSequence.HYDROPHOBIC_AA);
      assertEquals(1, AminoAcidSequence.POSITIVELY_CHARGED_AA);
      assertEquals(6, AminoAcidSequence.UNKNOWN_AA);
      assertEquals(4, AminoAcidSequence.SPECIAL_AA);
      assertEquals(25, AminoAcidSequence.symbol_count);
      assertEquals(7, AminoAcidSequence.ILLEGAL_AA);
      assertEquals(0, AminoAcidSequence.POLAR_UNCHARGED_AA);
      assertEquals(2, AminoAcidSequence.NEGATIVELY_CHARGED_AA);
      assertEquals(5, AminoAcidSequence.STOP_AA);
      assertEquals(3, AminoAcidSequence.HYDROPHOBIC_AA);
      assertEquals(1, AminoAcidSequence.POSITIVELY_CHARGED_AA);
      assertEquals("i|I.2qVk", aminoAcidSequence0.toString());
      assertFalse(aminoAcidSequence0.containsStopCodon());
      assertEquals(8, aminoAcidSequence0.length());
      assertFalse(aminoAcidSequence1.containsStopCodon());
      assertEquals("x  x  ", aminoAcidSequence1.toString());
      assertEquals(6, aminoAcidSequence1.length());
      assertEquals(1, hydrophilicityAlgorithm0.getValueCount());
      assertEquals(1.4E-45F, hydrophilicityAlgorithm0.getUserMin(), 0.01F);
      assertEquals("Hopp-Woods Hydrophilicity", hydrophilicityAlgorithm0.getAlgorithmName());
      assertFalse(hydrophilicityAlgorithm0.isUserMaxMin());
      assertFalse(hydrophilicityAlgorithm0.scalingFlag());
      assertEquals("hydrophilicity", hydrophilicityAlgorithm0.getAlgorithmShortName());
      assertEquals(3.4028235E38F, hydrophilicityAlgorithm0.getUserMax(), 0.01F);
      assertNotNull(hydrophilicityAlgorithm0);
      
      float[] floatArray0 = new float[3];
      hydrophilicityAlgorithm0.getValues(0, 0, floatArray0);
      assertEquals(3, floatArray0.length);
      assertFalse(aminoAcidSequence0.equals((Object)aminoAcidSequence1));
      assertFalse(aminoAcidSequence1.equals((Object)aminoAcidSequence0));
      assertArrayEquals(new float[] {Float.NaN, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertNotSame(aminoAcidSequence0, aminoAcidSequence1);
      assertNotSame(aminoAcidSequence1, aminoAcidSequence0);
      assertEquals(2, AminoAcidSequence.NEGATIVELY_CHARGED_AA);
      assertEquals(0, AminoAcidSequence.POLAR_UNCHARGED_AA);
      assertEquals(5, AminoAcidSequence.STOP_AA);
      assertEquals(4, AminoAcidSequence.SPECIAL_AA);
      assertEquals(7, AminoAcidSequence.ILLEGAL_AA);
      assertEquals(25, AminoAcidSequence.symbol_count);
      assertEquals(6, AminoAcidSequence.UNKNOWN_AA);
      assertEquals(3, AminoAcidSequence.HYDROPHOBIC_AA);
      assertEquals(1, AminoAcidSequence.POSITIVELY_CHARGED_AA);
      assertEquals(6, AminoAcidSequence.UNKNOWN_AA);
      assertEquals(4, AminoAcidSequence.SPECIAL_AA);
      assertEquals(25, AminoAcidSequence.symbol_count);
      assertEquals(7, AminoAcidSequence.ILLEGAL_AA);
      assertEquals(0, AminoAcidSequence.POLAR_UNCHARGED_AA);
      assertEquals(2, AminoAcidSequence.NEGATIVELY_CHARGED_AA);
      assertEquals(5, AminoAcidSequence.STOP_AA);
      assertEquals(3, AminoAcidSequence.HYDROPHOBIC_AA);
      assertEquals(1, AminoAcidSequence.POSITIVELY_CHARGED_AA);
      assertEquals("i|I.2qVk", aminoAcidSequence0.toString());
      assertFalse(aminoAcidSequence0.containsStopCodon());
      assertEquals(8, aminoAcidSequence0.length());
      assertFalse(aminoAcidSequence1.containsStopCodon());
      assertEquals("x  x  ", aminoAcidSequence1.toString());
      assertEquals(6, aminoAcidSequence1.length());
      assertEquals(1, hydrophilicityAlgorithm0.getValueCount());
      assertEquals(1.4E-45F, hydrophilicityAlgorithm0.getUserMin(), 0.01F);
      assertEquals("Hopp-Woods Hydrophilicity", hydrophilicityAlgorithm0.getAlgorithmName());
      assertFalse(hydrophilicityAlgorithm0.isUserMaxMin());
      assertFalse(hydrophilicityAlgorithm0.scalingFlag());
      assertEquals("hydrophilicity", hydrophilicityAlgorithm0.getAlgorithmShortName());
      assertEquals(3.4028235E38F, hydrophilicityAlgorithm0.getUserMax(), 0.01F);
      
      hydrophilicityAlgorithm0.getValues(6, 6, floatArray0);
      assertEquals(3, floatArray0.length);
      assertFalse(aminoAcidSequence0.equals((Object)aminoAcidSequence1));
      assertFalse(aminoAcidSequence1.equals((Object)aminoAcidSequence0));
      assertArrayEquals(new float[] {Float.NaN, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertNotSame(aminoAcidSequence0, aminoAcidSequence1);
      assertNotSame(aminoAcidSequence1, aminoAcidSequence0);
      assertEquals(2, AminoAcidSequence.NEGATIVELY_CHARGED_AA);
      assertEquals(0, AminoAcidSequence.POLAR_UNCHARGED_AA);
      assertEquals(5, AminoAcidSequence.STOP_AA);
      assertEquals(4, AminoAcidSequence.SPECIAL_AA);
      assertEquals(7, AminoAcidSequence.ILLEGAL_AA);
      assertEquals(25, AminoAcidSequence.symbol_count);
      assertEquals(6, AminoAcidSequence.UNKNOWN_AA);
      assertEquals(3, AminoAcidSequence.HYDROPHOBIC_AA);
      assertEquals(1, AminoAcidSequence.POSITIVELY_CHARGED_AA);
      assertEquals(6, AminoAcidSequence.UNKNOWN_AA);
      assertEquals(4, AminoAcidSequence.SPECIAL_AA);
      assertEquals(25, AminoAcidSequence.symbol_count);
      assertEquals(7, AminoAcidSequence.ILLEGAL_AA);
      assertEquals(0, AminoAcidSequence.POLAR_UNCHARGED_AA);
      assertEquals(2, AminoAcidSequence.NEGATIVELY_CHARGED_AA);
      assertEquals(5, AminoAcidSequence.STOP_AA);
      assertEquals(3, AminoAcidSequence.HYDROPHOBIC_AA);
      assertEquals(1, AminoAcidSequence.POSITIVELY_CHARGED_AA);
      assertEquals("i|I.2qVk", aminoAcidSequence0.toString());
      assertFalse(aminoAcidSequence0.containsStopCodon());
      assertEquals(8, aminoAcidSequence0.length());
      assertFalse(aminoAcidSequence1.containsStopCodon());
      assertEquals("x  x  ", aminoAcidSequence1.toString());
      assertEquals(6, aminoAcidSequence1.length());
      assertEquals(1, hydrophilicityAlgorithm0.getValueCount());
      assertEquals(1.4E-45F, hydrophilicityAlgorithm0.getUserMin(), 0.01F);
      assertEquals("Hopp-Woods Hydrophilicity", hydrophilicityAlgorithm0.getAlgorithmName());
      assertFalse(hydrophilicityAlgorithm0.isUserMaxMin());
      assertFalse(hydrophilicityAlgorithm0.scalingFlag());
      assertEquals("hydrophilicity", hydrophilicityAlgorithm0.getAlgorithmShortName());
      assertEquals(3.4028235E38F, hydrophilicityAlgorithm0.getUserMax(), 0.01F);
      
      hydrophilicityAlgorithm0.getValues(0, 1, floatArray0);
      assertEquals(3, floatArray0.length);
      assertFalse(aminoAcidSequence0.equals((Object)aminoAcidSequence1));
      assertFalse(aminoAcidSequence1.equals((Object)aminoAcidSequence0));
      assertArrayEquals(new float[] {0.0F, 0.0F, 0.0F}, floatArray0, 0.01F);
      assertNotSame(aminoAcidSequence0, aminoAcidSequence1);
      assertNotSame(aminoAcidSequence1, aminoAcidSequence0);
      assertEquals(2, AminoAcidSequence.NEGATIVELY_CHARGED_AA);
      assertEquals(0, AminoAcidSequence.POLAR_UNCHARGED_AA);
      assertEquals(5, AminoAcidSequence.STOP_AA);
      assertEquals(4, AminoAcidSequence.SPECIAL_AA);
      assertEquals(7, AminoAcidSequence.ILLEGAL_AA);
      assertEquals(25, AminoAcidSequence.symbol_count);
      assertEquals(6, AminoAcidSequence.UNKNOWN_AA);
      assertEquals(3, AminoAcidSequence.HYDROPHOBIC_AA);
      assertEquals(1, AminoAcidSequence.POSITIVELY_CHARGED_AA);
      assertEquals(6, AminoAcidSequence.UNKNOWN_AA);
      assertEquals(4, AminoAcidSequence.SPECIAL_AA);
      assertEquals(25, AminoAcidSequence.symbol_count);
      assertEquals(7, AminoAcidSequence.ILLEGAL_AA);
      assertEquals(0, AminoAcidSequence.POLAR_UNCHARGED_AA);
      assertEquals(2, AminoAcidSequence.NEGATIVELY_CHARGED_AA);
      assertEquals(5, AminoAcidSequence.STOP_AA);
      assertEquals(3, AminoAcidSequence.HYDROPHOBIC_AA);
      assertEquals(1, AminoAcidSequence.POSITIVELY_CHARGED_AA);
      assertEquals("i|I.2qVk", aminoAcidSequence0.toString());
      assertFalse(aminoAcidSequence0.containsStopCodon());
      assertEquals(8, aminoAcidSequence0.length());
      assertFalse(aminoAcidSequence1.containsStopCodon());
      assertEquals("x  x  ", aminoAcidSequence1.toString());
      assertEquals(6, aminoAcidSequence1.length());
      assertEquals(1, hydrophilicityAlgorithm0.getValueCount());
      assertEquals(1.4E-45F, hydrophilicityAlgorithm0.getUserMin(), 0.01F);
      assertEquals("Hopp-Woods Hydrophilicity", hydrophilicityAlgorithm0.getAlgorithmName());
      assertFalse(hydrophilicityAlgorithm0.isUserMaxMin());
      assertFalse(hydrophilicityAlgorithm0.scalingFlag());
      assertEquals("hydrophilicity", hydrophilicityAlgorithm0.getAlgorithmShortName());
      assertEquals(3.4028235E38F, hydrophilicityAlgorithm0.getUserMax(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      HydrophobicityAlgorithm hydrophobicityAlgorithm0 = new HydrophobicityAlgorithm(feature0);
      assertEquals(3.4028235E38F, hydrophobicityAlgorithm0.getUserMax(), 0.01F);
      assertFalse(hydrophobicityAlgorithm0.isUserMaxMin());
      assertEquals(1.4E-45F, hydrophobicityAlgorithm0.getUserMin(), 0.01F);
      assertEquals("Kyte-Doolittle Hydrophobicity", hydrophobicityAlgorithm0.getAlgorithmName());
      assertEquals(1, hydrophobicityAlgorithm0.getValueCount());
      assertEquals("hydrophobicity", hydrophobicityAlgorithm0.getAlgorithmShortName());
      assertFalse(hydrophobicityAlgorithm0.scalingFlag());
      assertNotNull(hydrophobicityAlgorithm0);
      
      Integer integer0 = hydrophobicityAlgorithm0.getDefaultMinWindowSize();
      assertEquals(3.4028235E38F, hydrophobicityAlgorithm0.getUserMax(), 0.01F);
      assertFalse(hydrophobicityAlgorithm0.isUserMaxMin());
      assertEquals(1.4E-45F, hydrophobicityAlgorithm0.getUserMin(), 0.01F);
      assertEquals("Kyte-Doolittle Hydrophobicity", hydrophobicityAlgorithm0.getAlgorithmName());
      assertEquals(1, hydrophobicityAlgorithm0.getValueCount());
      assertEquals("hydrophobicity", hydrophobicityAlgorithm0.getAlgorithmShortName());
      assertFalse(hydrophobicityAlgorithm0.scalingFlag());
      assertEquals(7, (int)integer0);
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      HydrophobicityAlgorithm hydrophobicityAlgorithm0 = new HydrophobicityAlgorithm(feature0);
      assertEquals("Kyte-Doolittle Hydrophobicity", hydrophobicityAlgorithm0.getAlgorithmName());
      assertFalse(hydrophobicityAlgorithm0.scalingFlag());
      assertEquals(3.4028235E38F, hydrophobicityAlgorithm0.getUserMax(), 0.01F);
      assertEquals(1.4E-45F, hydrophobicityAlgorithm0.getUserMin(), 0.01F);
      assertEquals("hydrophobicity", hydrophobicityAlgorithm0.getAlgorithmShortName());
      assertEquals(1, hydrophobicityAlgorithm0.getValueCount());
      assertFalse(hydrophobicityAlgorithm0.isUserMaxMin());
      assertNotNull(hydrophobicityAlgorithm0);
      
      Integer integer0 = hydrophobicityAlgorithm0.getDefaultMaxWindowSize();
      assertEquals("Kyte-Doolittle Hydrophobicity", hydrophobicityAlgorithm0.getAlgorithmName());
      assertFalse(hydrophobicityAlgorithm0.scalingFlag());
      assertEquals(3.4028235E38F, hydrophobicityAlgorithm0.getUserMax(), 0.01F);
      assertEquals(1.4E-45F, hydrophobicityAlgorithm0.getUserMin(), 0.01F);
      assertEquals("hydrophobicity", hydrophobicityAlgorithm0.getAlgorithmShortName());
      assertEquals(1, hydrophobicityAlgorithm0.getValueCount());
      assertFalse(hydrophobicityAlgorithm0.isUserMaxMin());
      assertEquals(100, (int)integer0);
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      HydrophilicityAlgorithm hydrophilicityAlgorithm0 = new HydrophilicityAlgorithm(feature0);
      assertEquals("Hopp-Woods Hydrophilicity", hydrophilicityAlgorithm0.getAlgorithmName());
      assertEquals(1.4E-45F, hydrophilicityAlgorithm0.getUserMin(), 0.01F);
      assertEquals(1, hydrophilicityAlgorithm0.getValueCount());
      assertFalse(hydrophilicityAlgorithm0.scalingFlag());
      assertEquals(3.4028235E38F, hydrophilicityAlgorithm0.getUserMax(), 0.01F);
      assertEquals("hydrophilicity", hydrophilicityAlgorithm0.getAlgorithmShortName());
      assertFalse(hydrophilicityAlgorithm0.isUserMaxMin());
      assertNotNull(hydrophilicityAlgorithm0);
      
      Integer integer0 = hydrophilicityAlgorithm0.getDefaultWindowSize();
      assertEquals("Hopp-Woods Hydrophilicity", hydrophilicityAlgorithm0.getAlgorithmName());
      assertEquals(1.4E-45F, hydrophilicityAlgorithm0.getUserMin(), 0.01F);
      assertEquals(1, hydrophilicityAlgorithm0.getValueCount());
      assertFalse(hydrophilicityAlgorithm0.scalingFlag());
      assertEquals(3.4028235E38F, hydrophilicityAlgorithm0.getUserMax(), 0.01F);
      assertEquals("hydrophilicity", hydrophilicityAlgorithm0.getAlgorithmShortName());
      assertFalse(hydrophilicityAlgorithm0.isUserMaxMin());
      assertEquals(7, (int)integer0);
      assertNotNull(integer0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      AminoAcidSequence aminoAcidSequence0 = new AminoAcidSequence("i|I.2qVk");
      assertEquals(1, AminoAcidSequence.POSITIVELY_CHARGED_AA);
      assertEquals(5, AminoAcidSequence.STOP_AA);
      assertEquals(0, AminoAcidSequence.POLAR_UNCHARGED_AA);
      assertEquals(7, AminoAcidSequence.ILLEGAL_AA);
      assertEquals(4, AminoAcidSequence.SPECIAL_AA);
      assertEquals(3, AminoAcidSequence.HYDROPHOBIC_AA);
      assertEquals(25, AminoAcidSequence.symbol_count);
      assertEquals(2, AminoAcidSequence.NEGATIVELY_CHARGED_AA);
      assertEquals(6, AminoAcidSequence.UNKNOWN_AA);
      assertEquals(8, aminoAcidSequence0.length());
      assertEquals("i|I.2qVk", aminoAcidSequence0.toString());
      assertFalse(aminoAcidSequence0.containsStopCodon());
      assertNotNull(aminoAcidSequence0);
      
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      doReturn(aminoAcidSequence0).when(feature0).getTranslation();
      HydrophilicityAlgorithm hydrophilicityAlgorithm0 = new HydrophilicityAlgorithm(feature0);
      assertEquals(1, AminoAcidSequence.POSITIVELY_CHARGED_AA);
      assertEquals(5, AminoAcidSequence.STOP_AA);
      assertEquals(0, AminoAcidSequence.POLAR_UNCHARGED_AA);
      assertEquals(7, AminoAcidSequence.ILLEGAL_AA);
      assertEquals(4, AminoAcidSequence.SPECIAL_AA);
      assertEquals(3, AminoAcidSequence.HYDROPHOBIC_AA);
      assertEquals(25, AminoAcidSequence.symbol_count);
      assertEquals(2, AminoAcidSequence.NEGATIVELY_CHARGED_AA);
      assertEquals(6, AminoAcidSequence.UNKNOWN_AA);
      assertEquals(8, aminoAcidSequence0.length());
      assertEquals("i|I.2qVk", aminoAcidSequence0.toString());
      assertFalse(aminoAcidSequence0.containsStopCodon());
      assertEquals("Hopp-Woods Hydrophilicity", hydrophilicityAlgorithm0.getAlgorithmName());
      assertEquals(1, hydrophilicityAlgorithm0.getValueCount());
      assertEquals(1.4E-45F, hydrophilicityAlgorithm0.getUserMin(), 0.01F);
      assertFalse(hydrophilicityAlgorithm0.scalingFlag());
      assertEquals("hydrophilicity", hydrophilicityAlgorithm0.getAlgorithmShortName());
      assertEquals(3.4028235E38F, hydrophilicityAlgorithm0.getUserMax(), 0.01F);
      assertFalse(hydrophilicityAlgorithm0.isUserMaxMin());
      assertNotNull(hydrophilicityAlgorithm0);
      
      float[] floatArray0 = new float[3];
      hydrophilicityAlgorithm0.getValues(0, 1, floatArray0);
      assertEquals(3, floatArray0.length);
      assertArrayEquals(new float[] {(-1.8F), 0.0F, 0.0F}, floatArray0, 0.01F);
      assertEquals(1, AminoAcidSequence.POSITIVELY_CHARGED_AA);
      assertEquals(5, AminoAcidSequence.STOP_AA);
      assertEquals(0, AminoAcidSequence.POLAR_UNCHARGED_AA);
      assertEquals(7, AminoAcidSequence.ILLEGAL_AA);
      assertEquals(4, AminoAcidSequence.SPECIAL_AA);
      assertEquals(3, AminoAcidSequence.HYDROPHOBIC_AA);
      assertEquals(25, AminoAcidSequence.symbol_count);
      assertEquals(2, AminoAcidSequence.NEGATIVELY_CHARGED_AA);
      assertEquals(6, AminoAcidSequence.UNKNOWN_AA);
      assertEquals(8, aminoAcidSequence0.length());
      assertEquals("i|I.2qVk", aminoAcidSequence0.toString());
      assertFalse(aminoAcidSequence0.containsStopCodon());
      assertEquals("Hopp-Woods Hydrophilicity", hydrophilicityAlgorithm0.getAlgorithmName());
      assertEquals(1, hydrophilicityAlgorithm0.getValueCount());
      assertEquals(1.4E-45F, hydrophilicityAlgorithm0.getUserMin(), 0.01F);
      assertFalse(hydrophilicityAlgorithm0.scalingFlag());
      assertEquals("hydrophilicity", hydrophilicityAlgorithm0.getAlgorithmShortName());
      assertEquals(3.4028235E38F, hydrophilicityAlgorithm0.getUserMax(), 0.01F);
      assertFalse(hydrophilicityAlgorithm0.isUserMaxMin());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      HydrophilicityAlgorithm hydrophilicityAlgorithm0 = new HydrophilicityAlgorithm(feature0);
      assertFalse(hydrophilicityAlgorithm0.scalingFlag());
      assertEquals("hydrophilicity", hydrophilicityAlgorithm0.getAlgorithmShortName());
      assertEquals(3.4028235E38F, hydrophilicityAlgorithm0.getUserMax(), 0.01F);
      assertEquals("Hopp-Woods Hydrophilicity", hydrophilicityAlgorithm0.getAlgorithmName());
      assertEquals(1, hydrophilicityAlgorithm0.getValueCount());
      assertEquals(1.4E-45F, hydrophilicityAlgorithm0.getUserMin(), 0.01F);
      assertFalse(hydrophilicityAlgorithm0.isUserMaxMin());
      assertNotNull(hydrophilicityAlgorithm0);
      
      Float float0 = hydrophilicityAlgorithm0.getAverage();
      assertFalse(hydrophilicityAlgorithm0.scalingFlag());
      assertEquals("hydrophilicity", hydrophilicityAlgorithm0.getAlgorithmShortName());
      assertEquals(3.4028235E38F, hydrophilicityAlgorithm0.getUserMax(), 0.01F);
      assertEquals("Hopp-Woods Hydrophilicity", hydrophilicityAlgorithm0.getAlgorithmName());
      assertEquals(1, hydrophilicityAlgorithm0.getValueCount());
      assertEquals(1.4E-45F, hydrophilicityAlgorithm0.getUserMin(), 0.01F);
      assertFalse(hydrophilicityAlgorithm0.isUserMaxMin());
      assertEquals(0.0F, (float)float0, 0.01F);
      assertNotNull(float0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Feature feature0 = mock(Feature.class, new ViolatedAssumptionAnswer());
      HydrophilicityAlgorithm hydrophilicityAlgorithm0 = new HydrophilicityAlgorithm(feature0);
      hydrophilicityAlgorithm0.getDefaultStepSize(0);
  }
}
