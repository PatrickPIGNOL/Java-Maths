package test;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
//import org.junit.jupiter.api.Nested;

import maths.Maths;

@RunWith(JUnitPlatform.class)
public class MathsTestPGCD 
{
	private List<IntTestMatch> aIntTestsMatchs;
	private List<LongTestMatch> aLongTestsMatchs;
		
	@BeforeAll
	public static void mSetUp() 
	{
		
	}

	@AfterAll
	public static void mTearDown()
	{
		
	}

	@BeforeEach
	public void mBeforeTest()
	{
		this.aIntTestsMatchs = new ArrayList<IntTestMatch>();
		this.aLongTestsMatchs = new ArrayList<LongTestMatch>();
		this.aIntTestsMatchs.add(new IntTestMatch(75, 100, 25));
		this.aIntTestsMatchs.add(new IntTestMatch(100, 75, 25));
		this.aIntTestsMatchs.add(new IntTestMatch(19, 17, 1));
		this.aLongTestsMatchs.add(new LongTestMatch(75, 100, 25));
		this.aLongTestsMatchs.add(new LongTestMatch(100, 75, 25));
		this.aLongTestsMatchs.add(new LongTestMatch(19, 17, 1));
	}
	
	@AfterEach
	public void mAfterTest()
	{
		this.aIntTestsMatchs.clear();
		this.aLongTestsMatchs.clear();
	}
	
	@Test
	@DisplayName("PGCD (int)")
	public void mTestIntPGCD()
	{
		for(IntTestMatch vIntTestMatch : this.aIntTestsMatchs)
		{
			Assertions.assertEquals(vIntTestMatch.aResult, Maths.mPGCD(vIntTestMatch.aA, vIntTestMatch.aB));
		}
    }
	
	@Test
	@DisplayName("PGCD (Long)")
	public void mTestLongPGCD()
	{
		for(LongTestMatch vLongTestMatch : this.aLongTestsMatchs)
		{
			Assertions.assertEquals(vLongTestMatch.aResult, Maths.mPGCD(vLongTestMatch.aA, vLongTestMatch.aB));
		}
    }
}
