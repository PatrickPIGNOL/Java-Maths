package maths;

public class Maths 
{
	public static long mPGCD(long pDividende, long pDiviseur)
	{
		long vDividende;
		long vDiviseur;	
		long vResult;
		long vReste;	
		
		if(pDividende < pDiviseur)
		{
			vDividende = pDiviseur;
			vDiviseur = pDividende;
		}
		else
		{
			vDividende = pDividende;
			vDiviseur = pDiviseur;
		}
		
		do
		{	
			vResult = vDiviseur;
			vReste = vDividende % vDiviseur;
			vDividende = vDiviseur;
			vDiviseur = vReste;
		}while(vReste > 0);
		
		return vResult;
	}
	
	public static long mPPCM(long pA, long pB)
	{
		return Math.abs(pA * pB) / Maths.mPGCD(pA, pB);
	}
	
	public static double mSquare(double pValue)
	{
		return pValue * pValue;
	}
	
	public static double mHypothenuse(double pSideB, double pSideC, double pAngleA)
	{
		return Math.sqrt(Maths.mSquare(pSideB)+Maths.mSquare(pSideC) - 2 * pSideB * pSideC * Math.cos(Math.toRadians(pAngleA)));
	}
	public static double mHypothenuse(double pSideB, double pSideC)
	{
		return Math.sqrt(Maths.mSquare(pSideB) + Maths.mSquare(pSideC));
	}
}
