package com.patterns;

import org.testng.annotations.Test;

public class MockPattern 
{
	
//	* 
//	* * 
//	* * * 
//	* * * * 
//	      * * 
//	      * * * 
//	      * * * * 
//	            * * 
//	            * * * 
//	            * * * * 

		@Test
		public void p1()
		{
			int n=4;
			for (int i = 1; i <=n; i++)
			{
				for (int j = 0; j < i; j++) 
				{
					System.out.print("* ");
				}
				System.out.println();
				
			}
			for (int k = 6; k <=8 ; k++) {
				for (int j = 0; j <6; j++) {
					System.out.print(" ");
				}
				for (int j = 4; j < k; j++) 
				{
					System.out.print("* ");
				}
				System.out.println();

			}
			for (int k = 10; k <=12 ; k++) {
				for (int j = 0; j <12; j++) {
					System.out.print(" ");
				}
				for (int j = 8; j < k; j++) 
				{
					System.out.print("* ");
				}
				System.out.println();

			}

		}
		
		
//		* * * * * 
//		*       * 
//		*       * 
//		*       * 
//		* * * * * 
		
		@Test
		public void p2()
		{
			int n=5;
//			char c='a';
			for(int i=1;i<=n;i++)
			{
				for (int j = 1; j <= n ; j++)
				{
					if( i==1 || j==1 || j==n||i==n)
					
					System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
		}
		
//		a a a a a 
//		b b b b b 
//		c c c c c 
//		d d d d d 
//		e e e e e 
		
		@Test
		public void p3()
		{
			int n=5;
			for (int i = 0; i <n; i++)
			{
				
				for (int j = 0; j <n; j++)
				{
					System.out.print((char)(97+i)+" ");
				}
				System.out.println();
			}
		}
		
//		* * * * * * * 
//		*     *     * 
//		*     *     * 
//		* * * * * * * 
//		*     *     * 
//		*     *     * 
//		* * * * * * *
		
		@Test
		public void p4()
		{
			int n=7;
			for (int i=1;i<=n ;i++ )
			{
				for (int j=1;j<=n ;j++ )
				{
					if(i==1||i==n||j==1||j==n||i==n/2+1||j==n/2+1)
						System.out.print("* "); 
						else
						System.out.print("  ");
				}
				System.out.println();
			}

		}
		
//		* * * * * 
//		* *   * * 
//		*   *   * 
//		* *   * * 
//		* * * * *
		
		@Test
		public void p5()
		{
			int n=5;
			for (int i=1;i<=n ;i++ )
			{
				for (int j=1;j<=n ;j++ )
				{
					if(i==1||i==n||j==1||j==n||i==j||j==(n-i+1))
						System.out.print("* ");
						else
						System.out.print("  ");
				}
				System.out.println();
			}
		}
		
//		* * * * * 
//		*       * 
//		*   *   * 
//		*       * 
//		* * * * * 
		
		@Test
		public void p6()
		{
			int n=5;
			for (int i = 1; i <= n; i++) 
			{
				for (int j = 1; j <=n; j++) {
					if(i==1||i==n||j==1||j==n||(i==3 && j==3))
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			
		}
		
//		    *
//		   * *
//		  *   *
//		 *     *
//		  *   *
//		   * *
//		    *
		
		@Test
		public void p7()
		{
			
			int n=7;
			int st=1,sp=n/2;
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=sp;j++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=st;j++)
				{
					if(j==1||j==st)
						System.out.print("*");
						else
						System.out.print(" ");
				}
				if(i<=n/2)
				{
					st=st+2;
					sp--;
				}
				else
				{
					st=st-2;
					sp++;
				}
				System.out.println();
			}

		}
		
//		   1
//		  1*2
//		 1*2*3
//		  1*2
//		   1
		
		@Test
		public void p8()
		{
			int n=5;
			int st=1,sp=n/2;
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=sp;j++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=st;j++)
				{
						System.out.print(j+"");
							if(j<st)
						System.out.print("*");
						
				}
				if(i<=n/2)
				{
					st++;
					sp--;
				}
				else
				{
					st--;
					sp++;
				}
				System.out.println();
			}

		}
		
//		   1
//		  1*2
//		 1*2*3
//		  1*2
//		   1
		
		@Test
		public void p9()
		{
			int n=5;
			int st=1,sp=n/2;
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=sp;j++)
				{
					System.out.print(" ");
				}
				int x=1;
				for(int j=1;j<=st;j++)
				{
					if(j%2==0)
					{
						System.out.print("*");
						x++;
					}
						else
					{
						System.out.print(x+"");
					}
						
				}
				if(i<=n/2)
				{
					st=st+2;
					sp--;
				}
				else
				{
					st=st-2;
					sp++;
				}
				System.out.println();
			}

		}
		

//		  1
//		 212
//		32123
//		 212
//		  1
		
		@Test
		public void p10()
		{
			int n=5;
			int st=1,sp=n/2;
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=sp;j++)
				{
					System.out.print(" ");
				}
				int x=st/2+1;
				for(int j=1;j<=st;j++)
				{
					System.out.print(x+"");
					if(j<=st/2)
						x--;
					else
						x++;
				}
				if(i<=n/2)
				{
					st=st+2;
					sp--;
				}
				else
				{
					st=st-2;
					sp++;
				}
				System.out.println();
			}

		}
		
		
//		   1
//		  121
//		 12321
//		  121
//		   1
		
		@Test
		public void p11()
		{
			int n=5;
			int st=1,sp=n/2;
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=sp;j++)
				{
					System.out.print(" ");
				}
				int x=1;
				for(int j=1;j<=st;j++)
				{
					System.out.print(x+"");
					if(j<=st/2)
						x++;
					else
						x--;
				}
				if(i<=n/2)
				{
					st=st+2;
					sp--;
				}
				else
				{
					st=st-2;
					sp++;
				}
				System.out.println();
			}

		}
		
}
