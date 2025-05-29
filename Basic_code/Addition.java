class Addition 
{
    public static void main(String[] args) 
    {
        int mathMarks = 76;
        int scienceMark = 75;
        int englishMark = 35;
        short totalSubject = 3;
        
        int average = (mathMarks + scienceMark + englishMark) / totalSubject;
        
        System.out.println(average); // Output: 62
    }
}