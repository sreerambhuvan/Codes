// date:23-6-22-------------------------------------------------find factoraial of a number
/*public class codes{
	public static void main(String []args){
		int n=5;
		int fact=1;
		for(int i=n;i>=1;--i){
			fact=fact*i;
		}
		System.out.println("fact is "+fact);
	}
}*/
//--------------------------------------------jnjhn------find sum of digits in number
/*public class codes{
	public static void main(String []args){
		int n=1234;
		int sum=0;
		for(int i=n;i>0;i=i/10){
			sum=sum+(i%10);
		}
		System.out.println(sum);
	}
}*/
//-----------------------------------------------------reverse a number *do not print just create the number
/*public class codes{
	public static void main(String []args){
		int n=1234;
		int rev=0;
		for(int i=n;i>0;i=i/10){
			rev=(rev*10)+i%10;
		}
		System.out.println(rev);
	}
}*/
//-------------------------------------------------------amstrong number check do not store digits in array
/*public class codes{
	public static void main(String []args){
		int n=1221;
		int rev=0;
		for(int i=n;i>0;i=i/10){
			rev=(rev*10)+i%10;
		}
		if(rev==n){
			System.out.println("yes");
	}
	}
}*/
//--------------------------------------------------------find lcm of two numbers
/*public class codes{
	public static void main(String []args){
		int m=4;
		int n=6;
		int lcm=(m>n)?m:n;
		while(true){
			if(lcm%m==0&&lcm%n==0){
				System.out.print(lcm);
				break;
			}
			lcm=lcm+1;
		}
	}
}*/
//-----------------------------------------------------------prime number
/*public class codes{
	public static void main(String []args){
		int i,m=0,flag=0;
		int n=23;
		m=n/2;
		if(n==0||n==1){
			System.out.println("not a prime");
		}else{
			for(i=2;i<=m;++i){
				if(n%i==0){
					System.out.println("not a prime");
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println("yes");
			}
		}
	}
}*/
//--------------------------------------------------------------array sorting ascending,descending,largest,smallest
/*import java.util.Scanner;
public class codes{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int temp;
		for(int i=0;i<5;++i){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<5;++i){
			for(int j=0;j<5;++j){
				if(arr[i]<arr[j]){
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int i=0;i<5;++i){
			System.out.print(arr[i]+" ");
		}
		}
}*/
//--------------------------------------------------------------matrix multiplication
/*import java.util.Scanner;
public class codes{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		int array[][]=new int[3][3];
		int suma[][]=new int[3][3];
		for(int i=0;i<3;++i){
		for(int j=0;j<3;++j){
			arr[i][j]=sc.nextInt();
		}
		}
		System.out.println("another array details");
		for(int i=0;i<3;++i){
		for(int j=0;j<3;++j){
			array[i][j]=sc.nextInt();
		}
		}
		int l=0;
		for(int i=0;i<3;++i){
			int sum=0;
			for(int y=0;y<3;++y){
			for(int j=0;j<3;++j){
				sum=sum+(arr[i][j]*array[j][i]);
			}
			suma[i][y]=sum;
			}
		}
		for(int i=0;i<3;++i){
		for(int j=0;j<3;++j){
			System.out.print(suma[i][j]+" ");
		}
		System.out.println();
		}
	}
}*/
		
			
//doctors problem vpropel 
/*Sabarish, A doctor forms a grid where each cell represents the condition of a patient. 

The cell can take any of the three values as follows:

              1-The person is virus free

              2-The person is infected with the virus

               3-Empty cell

It takes one day for the virus to spread from one person to another. 

Every day any virus free person who is adjacent (4-directionally) to the infected person catches the disease.

Given the initial grid help the doctor to find the minimum number of days that must elapse until 

everyone has been infected. If this impossible return -1.

Example:-

Suppose the input grid is                   2 1 1 

                                            1 1 3

                                            3 1 1

After day 1 the grid will be                      2 2 1

                                                  2 1 3

                                                  3 1 1

After day 2 the grid  will be                    2 2 2

                                                 2 2 3

                                                 3 1 1

 

After day 3 the grid will be                   2 2 2

                                               2 2 3

                                               3 2 1

After day 4 the grid will be                   2 2 2

                                               2 2 3

                                               3 2 2

So, the minimum number of days is 4*/
/*

import java.util.Scanner;
public class Man{
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	int arr[][]=new int[3][3];
	for(int i=0;i<3;++i){
		for(int j=0;j<3;++j){
			arr[i][j]=sc.nextInt();
		}
	}
	int co=0;
	int a=0;
	int b=0;
	int c=0;
	int d=0;
	for(int h=0;h<3;h++){
	for(int i=0;i<3;++i){
		for(int j=0;j<3;++j){
			a=0;
			b=0;
			c=0;
			d=0;
			if(arr[i][j]==2){
				if((j-1)>=0){
				if(arr[i][j-1]==1){
					arr[i][j-1]=2;
					a=1;
					
				}}
				if((j+1)<3){
				if(arr[i][j+1]==1){
					arr[i][j+1]=2;
					b=1;
				
					
				}}
				if((i-1)>=0){
				if(arr[i-1][j]==1){
					arr[i-1][j]=2;
					c=1;
					
				}}
				if((i+1)<3){
				if(arr[i+1][j]==1){
					arr[i+1][j]=2;
					d=1;
					
				}}
		if(a==1||b==1||c==1||d==1){
			co=co+1;
		}
			}
	}}
}
	for(int i=0;i<3;++i){
		for(int j=0;j<3;++j){
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("Num"+"="+co);
}
}*/
/*
A farmer does drip irrigation in his field and every plant in his field would consume 1ml of water every alternate day. On a fine day, he plants ‘p’ plants and sows ‘s’ seeds in the field. The seeds are so special that they grow into plants two days. The farmer sows ‘s’ seed every alternate day. Given the number of plants he planted on the first day, the number of seeds he sows every alternate day and the value of ‘n’, write a C/ C++ program to find the number of plants that would be in his field on nth day and the total amount of water consumed by his plants. For example, if he plants four plants, sows five seeds every alternate day then on the third day, there will be totally 9 plants in his field and the total water consumed will be 13 ml and on the seventh day there will be 19 plants and total water consumed will be 46 ml.

Input Format

First line contains the number of plants he planted, p

Next line contains the number of seeds he sow every alternate day, s

Next line contains the value of ‘n’

Output Format

First line should contain the total number of plants in his field on nth day

Next line should contain the total quantity of water consumed by the plants in his field
*/
/*
import java.util.Scanner;
public class Man{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int p;
		int s;
		int n;
		int count=4;
		int f=0;
		p=sc.nextInt();
		s=sc.nextInt();
		n=sc.nextInt();
		int coun=p;
		for(int i=1;i<=n;i=i+2){
			count=count+s;
			f=f+s*((i-1)/2);
		}
		System.out.println(count-s);
		System.out.println(p*((n+1)/2)+f);
		
}}
*/
/*
Given a number N,  check if it is reverse length divisible. A number is said to be reverse length divisible if the first i digits of the number is divisible by (l-i-1) where l is the number of digits in N and 0 < i <= l. 

For example, 52267 is reverse length divisible because:

5 is divisible by 5

52 is divisible by 4

522 is divisible by 3

5226 is divisible by 2

52267 is divisible by 1.

43268 is not reverse length divisible. Print Yes if the number is reverse length divisible and no otherwise.
*/
/*
import java.util.Scanner;
public class Man{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int c=0;
	for(int i=n;i>0;i=i/10){
		c++;
	}
	
	int k=0;
	for(int i=n,j=1;i>0;i=i/10,j++){
		if(i%j==0){
			k++;
		}
		else{
			System.out.println("no");
			break;
		}
	}
	if(k==c){
		System.out.println("yes");
	}
	}
}*/
/*
Given a four digit number ‘n’, find the largest factor among the left rotated numbers. Here left rotated numbers of a number ‘n’ is formed by rotating ‘n’ left 1 to 3 times. For example, if n is 2456, then when it is rotated once we get 4562, when it is rotated twice we get 5624 and when it is rotated thrice we get 6245. Factors of these numbers are

2456 - 1, 2, 4, 8, 307, 614, 1228

4562 - 1, 2, 2281

5624 - 1, 2, 4, 8, 19, 37, 38, 74, 76, 148, 152, 296, 703, 1406, 2812

6245 - 1, 5, 1249

The largest factor is 2812 and left rotated number with this factor is 5624.
*/
/*
import java.util.Scanner;
public class Man{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r;
		int co=1;
		int s=0;
		int m=0;
		for(int i=n;i>0;){
			if(co==5){
			break;}
			
			if(i%2==0){
				s=i/2;
				if(s>m){
					m=s;
				}
			}
			else if(i%3==0){
		        s=i/3;
				if(s>m){
					m=s;
				}
			}
			else if(i%5==0){
				s=i/5;
				if(s>m){
					m=s;
				}
			}
			else if(i%9==0){
				s=i/9;
				if(s>m){
					m=s;
				}
			}
			else{
				s=i/1;
				if(s>m){
					m=s;
				}
			}
			r=i%10;
			i=i/10;
			i=r*1000+i;
			co++;
		}
		int h=0;
		System.out.println(m);
		for(int i=n;i>0;){
			if(i%m==0){
				System.out.println(i);
			break;}
			else{
				h=i%10;
				i=i/10;
				i=h*1000+i;
			}
		}
		
	}
}*/


/*
Ramu and cakes
After joining pipes, Ramu is facing another trouble and this time he has no one to help except you. You are the only friend of Ramu who knows how to make birthday cakes! The cake has to be decorated with stars. You are given the value of N,  the maximum number of stars in a single segment of the pattern. You have to print the final pattern after decorating the cake with the stars. For more clarity, see below:

For  N = 5:


***** *****
****   ****
***     ***
**       **
*         *
**       **
***     ***
****   ****
***** *****
Another example:

For N = 4:


**** ****
***   ***
**     **
*       *
**     **
***   ***
**** ****
*/
/*
public class star{
	public static void main(String[]args){
		int m=5;
		
		for(int i=m;i>0;--i){
			for(int j=0;j<2*m+1;++j)
			{
				
				if(j>=i&&j<(2*m)-(i)+1){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
					
			}
			System.out.println();
			
		}
		for(int i=2;i<=m;++i){
			for(int j=0;j<2*m+1;++j)
			{
				
				if(j>=i&&j<(2*m)-(i)+1){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
					
			}
			System.out.println();
			
		}
	}
}*/
/*fibanocci series 


public class p{
	public static void main(String[]args){
		int sum1=0;
		int sum2=1;
		int temp=0;
		System.out.print(sum1);
		System.out.print(sum2);
		for(;temp<10;){
			
			temp=sum1+sum2;
			System.out.print(temp);
			sum1=sum2;
			sum2=temp;
		}
}}*/
/*
A collection of rectangles are said to be unique dimension rectangles (UDRs) if they have distict dimensions. Dimension of a rectangle is a pair of length and breadth represented as (length, breadth). That is a collection of five rectangles with integer dimensions (10, 20), (34, 56), (12, 13), (19,10), (16, 18) are UDRs and whereas the five rectangles with the dimension (10, 20), (34, 56), (12, 13), (19,10), (20, 10) cannot be UDRs since (10, 20) and (20,10) are duplicated except change in order. Given an integer 'n' write a code to findout the number of UDRs that can be formed with area as 'n' and also print the dimensions.

For example if 168 is given then there are eight UDRs with dimensions as follows (1,168), (2, 84), (3, 56), (4,42), (6, 28), (7, 24), (8,21), (12,14).
*/
/*
import java.util.Scanner;
public class p{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<n;++i){
			if(n%i==0){
				if(i<n/i){
				System.out.print("("+i+","+n/i+")"+",");
				count++;
				}
				else{
					break;
				}
			}
		}
		System.out.println(count);
	}
}*/
/* kth max in array
*/
/*import java.util.Scanner;
public class jump{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;++i){
			arr[i]=sc.nextInt();
		}
		int high;
		int count=0;                            
		f:									
		for(int i=0;i<n;++i){                  
			high=arr[i];
			count=0;
		for(int j=0;j<n;++j){
			if(high>=arr[j]){
				count++;
			}
		}
		if(n-count+1==k){
			System.out.print(high);
			break f;
		}
	}
}
}
*/
/*
union of the array 
*/
/*
import java.util.Scanner;
public class jump{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[m];
		int fin[]=new int[m+n];
		int ans[]=new int[m+n];
		for(int i=0;i<n;++i){
			arr[i]=sc.nextInt();
			fin[i]=arr[i];
		}
		for(int i=0;i<m;++i){
			arr1[i]=sc.nextInt();
			fin[n+i]=arr1[i];
		}
		int count=0;
		int h=1;
		ans[0]=fin[0];
		for(int i=1;i<m+n;++i){
			count=0;
			for(int j=i-1;j>=0;--j){
				if(fin[i]==ans[j]){
					count++;
				}
			}
			if(count==0){
				ans[h]=fin[i];
				++h;
			}
			else{
				i++;
			}
		}
		for(int i=0;i<h;++i){
			System.out.print(ans[i]+" ");
		}
		
	}
}
*/
/*
 grand father telephone
import java.util.Scanner;
public class jump{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n;
		char arr[]=new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','*'};
		for(int i=0;i<s.length();++i){
			f:
			for(int j=0;j<27;++j){
				n=0;
				if(s.charAt(i)==arr[j]){
					n=j/3;
					System.out.print(n+1+"-"+(j%3+1)+" ");
					break f;
				}
			}
		}
	}
}
*/
/*
checking string present in main string
public class Main
{
    public static void main(String[] args) {
        String s="yasw anth";
        int n=s.length();
        String t="wanth";
        int h=t.length();
        char arr[]=new char[n];
        for(int i=0;i<n;++i){
            arr[i]=s.charAt(i);
        }
        int count=0;
        int j;
        f:
        for(int i=0;i<h;++i){
            
            for(j=0;j<n;++j){
                
                if(t.charAt(i)==arr[j]){
                    i++;
                    count++;
                    
                    if(j==n-1||i==h){
                        break f;
                    }
                    else{
                    if(t.charAt(i)!=arr[j+1]){
                        count--;
                        i=0;
                    }}
                    
                }
                if(j==n-1){
                    break f;
                }
            }
        }
        if(count==h){
            System.out.print("yes");
        }
        else{
            System.out.print("No");
        }
    }
}
*/
/*
reverse evry word in a sentence 

import java.util.Scanner;
public class jump{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String arr[]=s.split(" ");
		int n=arr.length;
		
		for(int i=0;i<n;++i){
			for(int h=arr[i].length()-1;h>=0;--h){
				System.out.print(arr[i].charAt(h));
			}
			System.out.print(" ");
		}
	}
}
*/
/*
dont print the duplicate consecutive chars in a string
import java.util.Scanner;
public class jump{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();++i){
			if(i==s.length()-1){
				
				System.out.print(s.charAt(i));
				break;
			}
			else{
			
			if(s.charAt(i)==s.charAt(i+1)){
				continue;
			}
			else{
				System.out.print(s.charAt(i));
			}
			}
		}
	}
}
*/



//Hackerrank problem solving intermediate problem
/*
bigger is greater
*/
/*
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.next();
        }
        int ar[]=new int[arr[3].length()];
        for(int i=0;i<arr[3].length();++i){
            ar[i]=arr[3].charAt(i)-'a'+1;
            System.out.print(ar[i]+" ");
        }
    }
}*/