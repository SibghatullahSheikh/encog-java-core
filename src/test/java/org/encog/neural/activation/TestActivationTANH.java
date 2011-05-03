/*
 * Encog(tm) Core Unit Tests v3.0 - Java Version
 * http://www.heatonresearch.com/encog/
 * http://code.google.com/p/encog-java/
 
 * Copyright 2008-2011 Heaton Research, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *   
 * For more information on Heaton Research copyrights, licenses 
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */
package org.encog.neural.activation;

import junit.framework.TestCase;

import org.encog.engine.network.activation.ActivationTANH;
import org.junit.Assert;
import org.junit.Test;

public class TestActivationTANH extends TestCase {
	@Test
	public void testTANH() throws Throwable {
		ActivationTANH activation = new ActivationTANH();
		Assert.assertTrue(activation.hasDerivative());

		ActivationTANH clone = (ActivationTANH) activation.clone();
		Assert.assertNotNull(clone);

		double[] input = { 0.0  };

		activation.activationFunction(input,0,input.length);

		Assert.assertEquals(0.0, input[0], 0.1);		

		// test derivative, should throw an error
		input[0] = activation.derivativeFunction(input[0]);
		Assert.assertEquals(1.0, input[0], 0.1);


	}

}
