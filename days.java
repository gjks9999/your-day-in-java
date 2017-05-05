import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
class days
{
	public static void main(String args[])
	{
		int day,mon,year,D=0,ll=0,p=0;
		 Date today = new Date();
   		 Calendar cal = Calendar.getInstance();
		 cal.setTime(today); // don't forget this if date is arbitrary
		Scanner s=new Scanner(System.in);
		System.out.println("-------------enter the your birth day and know your age in days--------------\n\n\n");
		System.out.println("\t\tEnter your birth day's DAY=");
		day=s.nextInt();
		System.out.println("\t\tEnter your birth day's MONTH=");
		mon=s.nextInt();
		System.out.println("\t\tEnter your birth day's YEAR=");
		year=s.nextInt();
		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
       		int thisyear = cal.get(Calendar.YEAR);
		System.out.println("\t\ttoday's date : " + today);
		for(int y=year;y<thisyear;y++,D++)
		{
			for(int m=1;m<13;m++)
			{
				if(ll==0)
					{      m=mon;     }
				if(((m%2==0)&&(m!=10)&&(m!=12))||((m==9)||(m==11)))
				{
						if(ll==0)
						{       p=day;     }
						else 
						{     p=0;          }
						if((m==2)&&(y%4==0))
						{      D=D+(29-p);     ll++;   }
						 else if((m==2))
						{     D=D+(28-p);     ll++;   }
						else 
		 				{ D=D+(30-p);         ll++;   }
				}
				else
				{
					if(ll==0)
					{       p=day;     }
					else 
					{     p=0;     }
					 D=D+(31-p);
					ll++;
				}
			} 
		}
		/*for(int m=1,y=2017;m<5;m++)
		{	
			if(((m%2==0)&&(m!=10) && (m!=12))||((m==9) ||( m==11)))
			{
				if((m==2) && (y%4==0))
				{      D=D+29;     }
				 else  if((m==2))
				{     D=D+(28);  }
				else 
		 		 D=D+(30);
				
			}
			else
			D=D+31;
		}
		D=D+4;*/
		D=D+dayOfYear;
		System.out.println("\t\tyour result is ready to display");
		System.out.println("\n\n\n\t\tyour spended days from  born to up to now--------> "+D+"days");
		D=0;
	}
}

			