import java.util.Scanner ;
class NoteBookDriver 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		NoteBook n1 = new NoteBook () ;
		
		n1.brand = sc.nextLine();
        n1.size = sc.nextInt();
        n1.price = sc.nextDouble();
        n1.wt = sc.nextInt();
        n1.binding = sc.nextLine();
        n1.type = sc.nextLine();
        n1.height = sc.nextDouble();
        n1.length =sc.nextDouble();
        n1.width = sc.nextDouble();
        n1.coverType = sc.nextLine();
        n1.gsm =  sc.nextInt();
		
		n1.noteBookDescription();
	}
}
