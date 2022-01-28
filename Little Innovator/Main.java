import java.util.*;
public class Main {

	public static void main(String args[])
	{
		System.out.println("Enter the String: ");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String op=st;
		st=st.replaceAll(" ","");
		boolean d=st.matches("[a-zA-Z]+");
		if(!d)
		{
		    System.out.println("Invalid Slogan");
		}
		else
		{
			char a[]=st.toCharArray();
			char b[]=new char[100];
			b[0]='0';
			int same=0,i=a.length,j=0,l=0;
			while(j<i)
            {
                int count=0;
                for(int k=0;k<i;k++)
                {
                    if(a[j]==a[k])
                    {
                        count++;
                    }
                }
                if(count==1)
                {
                    l++;
                    b[l]=a[j];
                    j++;
                }
                else
                {
                    j++;
                }
            }	
			if(l==(i-l))
				System.out.println("All the guidelines are satisfied for "+op);
			else
				System.out.println(op+" does not satisfy the guideline");
		}
	}
}
