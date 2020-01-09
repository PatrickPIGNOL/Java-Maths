package test;

public class LongTestMatch 
{
	long aA;
	long aB;
	long aResult;
	
	public LongTestMatch(long pA, long pB, long pResult)
	{
		this.aA = pA;
		this.aB = pB;
		this.aResult = pResult;
	}
	
	public long mA()
	{
		return this.aA;
	}
	
	public long mB()
	{
		return this.aB;
	}
	
	public long mResult()
	{
		return this.aResult;
	}
}
