import java.io.*;
class Packman
{
	public static void  main(String agrs[])throws IOException
	{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		// i			
		 int i=0,j=0; int l=0,m=0,n=0,o=0,o1=0;
		 int a=44,b=25;
		 int p=0,q=0,r=0,s,h=0,t=0,w=0,x=0,y=8;
		 int z=0,z1=0,z2=0,z3=0,z4=0,z5=0,z6=0,z7=0;
		 int j1=0,j2=0,j3=0,j4=0,j5=0,j6=0,j7=0,j8=0,j9=0,j10=0;
		 int h1=0,h2=0,h3=0,h4=0,h5=0,h6=0,h7=0,h8=0,h9=0,h10=0;
		 int score=0;int d44=0,d45=0,d66=0;
		 System.out.println("++++++++++++++++++++THE PACKMAN+++++++++++++++++++");
		 System.out.println("++++++++++++++++++++Lets Start+++++++++++++++++++");
				for( i=1;i<=50;i++)
		{
			for(j=1;j<=50;j++)
			{
		if(i==1||j==1||i==50||j==50||
					j>=4&&i==4&&j<=18  || i>=4&&j==4&&i<=18 || j>=4&&i+j==22&&j<=18  ||
					j>=4&&i==46&&j<=18 || i>=32&&j==4&&i<=46 || j>=4&&i==j+28&&j<=18 ||
					j>=32&&i==4&&j<=46  || i>=4&&j==46&&i<=18 || j>=32&&i==j-28&&j<=46||
					j>=32&&i==46&&j<=46 || i>=32&&j==46&&i<=46 ||j>=32&&i+j==50+28&&j<=46 ||
					i>=22&&j==4&& i<=28 || i>=14&&j==12&& i<=35  ||  j>=4&&i+j==26&&j<=12 ||j>=4&&i==j+24&&j<=12 ||
					i>=22&&j==46&& i<=28 || i>=14&&j==38&& i<=35  ||  j>=38&&i+j==50+24&&j<=46 ||j>=38&&i==j-24&&j<=46 ||
					j>=22&&i==4&&j<=28   || j>=15&&i+j==26&&j<=21 ||  j>=28&&i==j-24&&j<=35 || i>=11&&j==15&&i<=15||  i>=11&&j==35&&i<=15||  j>=15&&i==15&&j<=35 ||
					j>=12&&i==18&&j<=21  || j>=29&&i==18&&j<=38   ||  j>=15&&i==21&&j<=35   || j>=12&&i==24&&j<=21  || j>=29&&i==24&&j<=38 ||  j>=15&&i==27&&j<=35 ||    
					j>=12&&i==30&&j<=21  || j>=29&&i==30&&j<=38   ||  j>=15&&i==33&&j<=35   || j>=12&&i==36&&j<=21  || j>=29&&i==36&&j<=38 ||  j>=18&&i==41&&j<=32 
					
					)
				{
				  System.out.print("*");
				
				}
			else if(i==44&&j==25)	
			{
				System.out.print((char)(2));
			}
			else
				System.out.print(" ");	
			}
		System.out.println();
		}

		i=0;j=0;			

		
		 
		 for(;;)
		 {
		 p=(int)(Math.random()*10);
		 q=(int)(Math.random()*10);
		 r=(int)(Math.random()*10);
		 s=(int)(Math.random()*10);
		 t=(int)(Math.random()*10);
		 w=(int)(Math.random()*10);
			System.out.print("                        ");
			 char kk=(char)br.read();
			System.out.println();	
		 if(kk=='w')
		 {
			a--;
		 }
		 else if(kk=='s')
		 {
			 a++;
		 }
		else if(kk=='a')
		 {
			 b--;
		 }
		else if(kk=='d')
		 {
			 b++;
		 }



		
		for( i=1;i<=50;i++)
		{
			for(j=1;j<=50;j++)
			{
				
				if(a==1||b==1||a==50||b==50||
					b>=4&&a==4&&b<=18  || a>=4&&b==4&&a<=18 || b>=4&&a+b==22&&b<=18  ||
					b>=4&&a==46&&b<=18 || a>=32&&b==4&&a<=46 || b>=4&&a==b+28&&b<=18 ||
					b>=32&&a==4&&b<=46  || a>=4&&b==46&&a<=18 || b>=32&&a==b-28&&b<=46||
					b>=32&&a==46&&b<=46 || a>=32&&b==46&&a<=46 ||b>=32&&a+b==50+28&&b<=46 ||
					a>=22&&b==4&& a<=28 || a>=14&&b==12&& a<=35  ||  b>=4&&a+b==26&&b<=12 ||b>=4&&a==b+24&&b<=12 ||
					a>=22&&b==46&& a<=28 || a>=14&&b==38&& a<=35  ||  b>=38&&a+b==50+24&&b<=46 ||b>=38&&a==b-24&&b<=46 ||
					b>=22&&a==4&&b<=28   || b>=15&&a+b==26&&b<=21 ||  b>=28&&a==b-24&&b<=35 || a>=11&&b==15&&a<=15||  a>=11&&b==35&&a<=15||  b>=15&&a==15&&b<=35 ||
					b>=12&&a==18&&b<=21  || b>=29&&a==18&&b<=38   ||  b>=15&&a==21&&b<=35   || b>=12&&a==24&&b<=21  || b>=29&&a==24&&b<=38 ||  b>=15&&a==27&&b<=35 ||    
					b>=12&&a==30&&b<=21  || b>=29&&a==30&&b<=38   ||  b>=15&&a==33&&b<=35   || b>=12&&a==36&&b<=21  || b>=29&&a==36&&b<=38 ||  b>=18&&a==41&&b<=32 
					
					)	
					{
					 a=h9;d45=1;
					 b=h10;	score--;
					}	
					//when j==2
			
				 
				 if(i>=10&&j==2&&i<=20&&i==r+10&&j==b)
					{	 
						 if(i==r+10&&j==2)
						 { 
							j1=i; 
							h1=j;
						System.out.print((char)(12));
						 }
					}
				 
				else if(i>=30&&j==2&&i<=40&&i==t+30&&j==b)
					{	 
						 if(i==t+30&&j==2)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}
				 
					//when j==3
				else  if(i>=2&&j==3&&i<=10&&i==p&&j==b )
					{	 
						 if(i==p&&j==3)
						 { 
							j1=i; 
							h1=j;
						 System.out.print((char)(12));
						 }
					}
			 
				else if(i>=20&&j==3&&i<=30&&i==q+20&&j==b)
					{	 
						 if(i==q+20&&j==3)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}
				 
				
				else if(i>=40&&j==3&&i<=50&&i==s+40&&j==b)
					{	 
						 if(i==s+40&&j==3)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}
				 
				 
				 // when j==47
				 else if(i>=2&&j==b&&i<=47&&i==q&&j==3 )
					{
						if(i==q&&j==47)
						 { 
							j1=i; 
							h1=j;
						 System.out.print((char)(12));
						 }
					}
					
					else if(i>=20&&j==47&&i<=30&&i==r+20&&j==b)
					{	 
						 if(i==r+20&&j==47)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}
				 
				else if(i>=40&&j==47&&i<=50&&i==s+40&&j==b)
					{	 
						 if(i==s+40&&j==47)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}
				 
				// when j==48
				else if(i>=10&&j==48&&i<=20&&i==q+10&&j==b)
					{	 
						 if(i==q+10&&j==48)
						 { 
							j1=i; 
							h1=j;
						System.out.print((char)(12));
						 }
					}
				 
				else if(i>=30&&j==48&&i<=40&&i==s+30&&j==b)
					{	 
						 if(i==s+30&&j==48)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}
					// when j==49
				
				else if(i>=2&&j==b&&i<=49&&i==p&&j==3 )
					{
						if(i==p&&j==49)
						 { 
							j1=i; 
							h1=j;
						 System.out.print((char)(12));
						 }
					}
					
					else if(i>=20&&j==49&&i<=30&&i==q+20&&j==b)
					{	 
						 if(i==q+20&&j==49)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}
				 
				else if(i>=40&&j==49&&i<=50&&i==s+40&&j==b)
					{	 
						 if(i==s+40&&j==49)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					} 
				//when i==2
				else if(b>=2&&i==2&&b<=10&&j==p&&i==a)
					{	 
						 if(j==p&&i==a)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}
				
				else if(b>=20&&i==2&&b<=30&&j==r+20&&i==a)
					{	 
						 if(j==r+20&&i==a)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}	
				
				else if(b>=40&&i==2&&b<=50&&j==t+40&&i==a)
					{	 
						 if(j==t+40&&i==a)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}	
				// when   i==3
				else if(b>=10&&i==3&&b<=20&&j==q+10&&i==a)
					{	 
						 if(j==q+10&&i==a)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}	
				
				else if(b>=30&&i==3&&b<=40&&j==s+30&&i==a)
					{	 
						 if(j==s+30&&i==a)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}	
				//when i==47
				else if(b>=2&&i==47&&b<=10&&j==p&&i==a)
					{	 
						 if(j==p&&i==47)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}
				
				else if(b>=20&&i==47&&b<=30&&j==r+20&&i==a)
					{	 
						 if(j==r+20&&i==47)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}	
				
				else if(b>=40&&i==47&&b<=50&&j==t+40&&i==a)
					{	 
						 if(j==t+40&&i==a)
						 { 
							z5=i; 
							z=j;
							System.out.print((char)(12));
						 }
					}	
				// when   i==47
				else if(b>=2&&i==47&&b<=10&&j==p&&i==a)
					{	 
						 if(j==p&&i==a)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}
				
				else if(b>=20&&i==47&&b<=30&&j==r+20&&i==a)
					{	 
						 if(j==r+20&&i==a)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}	
				
				else if(b>=40&&i==47&&b<=50&&j==t+40&&i==a)
					{	 
						 if(j==t+40&&i==a)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}
				//when i==48
				else if(b>=10&&i==48&&b<=20&&j==q+10&&i==a)
					{	 
						 if(j==q+10&&i==a)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}	
				else if(b>=30&&i==48&&b<=40&&j==s+30&&i==a)
					{	 
						 if(j==s+30&&i==a)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}
					
					//when i==49
				else if(b>=2&&i==49&&b<=10&&j==p&&i==a)
					{	 
						 if(j==p&&i==a)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}
				
				else if(b>=20&&i==49&&b<=30&&j==r+20&&i==a)
					{	 
						 if(j==r+20&&i==a)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}	
				
				else if(b>=40&&i==49&&b<=50&&j==t+40&&i==a)
					{	 
						 if(j==t+40&&i==a)
						 { 
							j1=i; 
							h1=j;;
							System.out.print((char)(12));
						 }
					}	
				// when i=43
					 
					else if(b>=18&&i==43&&b<=28&&j==t+18&&i==a)
					{
						 if(j==t+18&&i==a)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}
					else if(b>=28&&i==43&&b<=38&&j==t+28&&i==a)
					{	 
						 if(j==t+28&&i==a)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}
				// when i=39					
				else if(b>=18&&i==39&&b<=28&&j==t+18&&i==a)
					{
						 if(j==t+18&&i==a)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}
					else if(b>=28&&i==42&&b<=39&&j==t+28&&i==a)
					{	 
						 if(j==t+28&&i==a)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}
				// when i=36	
				else if(b>=22&&i==36&&b<=28&&j==w+22&&i==a)
					{	 
						 if(j==w+22&&i==a)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}	
				// when j==14
				else if(a>=30&&j==14&&i<=36&&i==s+30&&j==b)
					{	 
						 if(i==s+30&&j==b)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}	
				else if(a>=24&&j==36&&i<=29&&i==s+24&&j==b)
					{	 
						 if(i==s+24&&j==b)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}	
				// when i==30
				else if(b>=22&&i==30&&b<=28&&j==t+22&&i==a)
					{	 
						 if(j==t+22&&i==a)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}
					
				else if(a>=19&&j==14&&i<=23&&i==q+19&&j==b)
					{	 
						 if(i==q+19&&j==b)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}
				else if(a>=30&&j==36&&i<=36&&i==s+30&&j==b)
					{	 
						 if(i==s+30&&j==b)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}					
					//when i=24
				else if(b>=22&&i==24&&b<=28&&j==t+22&&i==a)
					{	 
						 if(j==t+22&&i==a)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}
				else if(b>=22&&i==18&&b<=28&&j==t+22&&i==a)
					{	 
						 if(j==t+22&&i==a)
						 { 
							j1=i; 
							h1=j;
							System.out.print((char)(12));
						 }
					}
				
				// For match co-ordinate verticle
				else if(a==l&&j==m||a==q&&j==m ||a==n&&j==m||a==o&&j==m|| a==o1&&j==m )	
					{
					  h++;
					 break;
					}
					// For match co-ordinate horizontal
				else if(a==z1&&b==z|| a==z2&&b==z|| a==z3&&b==z|| a==z4&&b==z|| a==z5&&b==z)
					{
					  h++;
					 break;
					}
					// For match co-ordinate horizontal
				else	if(a==j1&&b==h1|| a==j2&&b==h1|| a==j3&&b==h1|| a==j4&&b==h1|| a==j5&&b==h1)
				{
					  h++;
					 break;
				}
				/*	else if(i>=10&&i==a&&b==j&&i==q&&i<=20)	
					{
					  h++;
					   
					break;
				
					}*/
			 
				 else if(i==a&&j==b)
						{
						System.out.print((char)(2));
						}
					
				 
				 else if(i==1||j==1||i==50||j==50||
					j>=4&&i==4&&j<=18  || i>=4&&j==4&&i<=18 || j>=4&&i+j==22&&j<=18  ||
					j>=4&&i==46&&j<=18 || i>=32&&j==4&&i<=46 || j>=4&&i==j+28&&j<=18 ||
					j>=32&&i==4&&j<=46  || i>=4&&j==46&&i<=18 || j>=32&&i==j-28&&j<=46||
					j>=32&&i==46&&j<=46 || i>=32&&j==46&&i<=46 ||j>=32&&i+j==50+28&&j<=46 ||
					i>=22&&j==4&& i<=28 || i>=14&&j==12&& i<=35  ||  j>=4&&i+j==26&&j<=12 ||j>=4&&i==j+24&&j<=12 ||
					i>=22&&j==46&& i<=28 || i>=14&&j==38&& i<=35  ||  j>=38&&i+j==50+24&&j<=46 ||j>=38&&i==j-24&&j<=46 ||
					j>=22&&i==4&&j<=28   || j>=15&&i+j==26&&j<=21 ||  j>=28&&i==j-24&&j<=35 || i>=11&&j==15&&i<=15||  i>=11&&j==35&&i<=15||  j>=15&&i==15&&j<=35 ||
					j>=12&&i==18&&j<=21  || j>=29&&i==18&&j<=38   ||  j>=15&&i==21&&j<=35   || j>=12&&i==24&&j<=21  || j>=29&&i==24&&j<=38 ||  j>=15&&i==27&&j<=35 ||    
					j>=12&&i==30&&j<=21  || j>=29&&i==30&&j<=38   ||  j>=15&&i==33&&j<=35   || j>=12&&i==36&&j<=21  || j>=29&&i==36&&j<=38 ||  j>=18&&i==41&&j<=32 
					
					)
				{
				  System.out.print("*");
				
				}
				else
				System.out.print(" ");	
			}
			
			System.out.println();
			
					
			if(h==1)
			{
				break;
			} 	
			if(d45!=1)
			{
				d44++;d45=0;
			}
			h9=a;h10=b;
			
		 }
		 	score++;
		 if(h==1)
		 {
			System.out.println("-----------------------------You lose-----------------------------");
			System.out.println("Your score "+"'"+score+"'"); 
			System.out.println("                                                        -Sushant ");	
			break;
		 }
		}
		
	}
} 