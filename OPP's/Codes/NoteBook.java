class NoteBook 
{
    String brand;
    int size;
    double price;
    int wt;
    String binding;
    String type;
    double height;
    double length;
    double width;
    String coverType;
    int gsm;

    public void noteBookDescription() 
	{
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + wt);
        System.out.println("Binding Type: " + binding);
        System.out.println("Type: " + type);
        System.out.println("Height: " + height);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Cover Type: " + coverType);
        System.out.println("GSM: " + gsm);
    }
}