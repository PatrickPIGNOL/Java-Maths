package main;

import test.JavaMathsTestSuite;
import tests.runtime.RuntimeTest;

public class Main 
{
	public static void main(String[] pArguments)
	{
		RuntimeTest.mRuntimeTest(JavaMathsTestSuite.class);
	}
}
