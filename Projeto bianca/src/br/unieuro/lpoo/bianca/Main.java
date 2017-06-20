package br.unieuro.lpoo.bianca;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int b;
		long a;
		BigInteger num;
		BigInteger n2[] = new BigInteger[5];
		BigInteger calcMod[] = new BigInteger[4];
		b = sc1.nextInt();
		String msg[] = new String[b];
		String temp;
		int cont = 0;
		boolean botao = false;
		
		while(b > cont && 200 >= b && b >= 1)	
		{				
			num = sc1.nextBigInteger();
			for(int i = 0; 1000000 > i; i++)
		    {
				temp = Integer.toString(i);
				n2[0] = new BigInteger("2");
				n2[1] = new BigInteger("5");
				n2[2] = new BigInteger(temp);
				calcMod[0] = num.mod(n2[0]);
				calcMod[1] = num.mod(n2[1]);				
				if(i == 0 || i == 1)
				{
					continue;
				}
				calcMod[2] = num.mod(n2[2]);
		        if(num.compareTo(BigInteger.valueOf(1)) == 0)
		        {
		        	msg[cont] = "Not Prime";		     
		            break;
		        }
		        else if(num.compareTo(BigInteger.valueOf(2)) == 0 || num.compareTo(BigInteger.valueOf(5)) == 0)
		        {
		        	msg[cont] = "Prime";
		            break;
		        }
		        else if(num.compareTo(BigInteger.valueOf(7)) == 0 || num.compareTo(BigInteger.valueOf(11)) == 0)
		        {
		        	msg[cont] = "Prime";
		            break;
		        } 
		        if(calcMod[0].compareTo(BigInteger.valueOf(0)) == 0 || calcMod[1].compareTo(BigInteger.valueOf(0)) == 0)
		        {
		        	msg[cont] = "Not Prime";
		            break;
		        }
		        else if(num.compareTo(BigInteger.valueOf(i * i)) == -1)
		        {
		        	msg[cont] = "Prime";
		            break;
		        }
		        else if(calcMod[2].compareTo(BigInteger.valueOf(0)) == 0)
		        {
		        	msg[cont] = "Not Prime";
		            break;
		        }
		    }
			cont++;
			botao = true;
		}	
		
		if (botao == true)
		{
			for(int i = 0; b > i; i++)
				System.out.println(msg[i]);
		}
			
	}
}
