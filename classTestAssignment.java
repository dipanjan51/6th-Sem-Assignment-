import java.util.Scanner;   

class classTestAssignment
{
//-----------------part 1---------------

static void capitalize(String str)
{
for(int i=0; i<str.length(); i++) 
{
	char temp =str.charAt(i);

	if(i%2==0)				//Even positions capitalized	
		System.out.print(Character.toLowerCase(temp));
	else 
		System.out.print(Character.toUpperCase(temp));

}
}
//---------------part1 ends---------------------


//-------------part2---------------------------

static void occurence(String str)
{
	int count[]=new int[256]; 
	//int flag=0;

	for(int i=0;i<str.length();i++)
	{
		count[str.charAt(i)]++;    //ount array
	}
	
	char temp[]= new char[str.length()];

	for(int i=0;i<str.length();i++)
	{
		temp[i]=str.charAt(i); 		// array of chars from string
		int flag=0;
			
		for(int j=0;j<=i;j++)
		{
			if(str.charAt(i)==temp[j])
			{
				flag=flag+1;
			}
		}
		if(flag==1)
		{
			System.out.println(str.charAt(i)+": "+ count[str.charAt(i)]);
		}
	}
}
	
	
	
	



public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	String str=sc.nextLine();


	//String str="aaabbbcccdddd"; //Declared a string
	System.out.println("Alternate characters capitalized:");
	capitalize(str);  // To capitalize Alternate charactwrs

	System.out.println();

	System.out.println("Occurences: ");
	occurence(str); // to check Occurence of characters 


	
}
}