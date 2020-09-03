package com.promotion.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.promotion.PromotionEngine;

import junit.framework.TestCase;
public class PromotionEngineTest {
	
	PromotionEngine pe = new PromotionEngine();
	
	@Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
	
	@Test
	public void testScenarioA() {
		   assertEquals(100,pe.promotionCost(1,1,1,0));
		  }
	
	@Test
	public void testScenarioB() {
		   assertEquals(370,pe.promotionCost(5,5,1,0));
		  }
	@Test
	public void testScenarioC() {
		   assertEquals(280,pe.promotionCost(3,5,1,1));
		  }

	

}
