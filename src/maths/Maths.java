package maths;

import java.awt.Point;

import javafx.geometry.Point2D;

public class Maths 
{
	public static int mPGCD(int pDividende, int pDiviseur)
	{
		int vDividende;
		int vDiviseur;	
		int vResult;
		int vReste;	
		
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
	
	public static int mPPCM(int pA, int pB)
	{
		return Math.abs(pA * pB) / Maths.mPGCD(pA, pB);
	}
	
	public static long mPPCM(long pA, long pB)
	{
		return Math.abs(pA * pB) / Maths.mPGCD(pA, pB);
	}
}
