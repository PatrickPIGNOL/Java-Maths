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
	
	public static double mHypothenuse()
	//a2 = b2 + c2 -2bc * cos(A);
	//A/sin(A) = b/sin(B) = c/sin(C);
}
