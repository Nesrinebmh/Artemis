/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 13:46:18 GMT 2018
 */

package org.gmod.schema.sequence;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.gmod.schema.cv.CvTerm;
import org.gmod.schema.sequence.FeatureRelationshipProp;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class FeatureRelationshipProp_ESTest extends FeatureRelationshipProp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FeatureRelationshipProp featureRelationshipProp0 = new FeatureRelationshipProp();
      CvTerm cvTerm0 = featureRelationshipProp0.getCvTerm();
      assertNull(cvTerm0);
  }
}
