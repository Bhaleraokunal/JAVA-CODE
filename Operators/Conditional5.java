class Conditional5
	{
    public static void main(String[] args) {
        int score = 90;
        
        String result = (score >= 90) ? "A" :
                      (score >= 65) ? "B" :
                      (score > 35)  ? "C" : "Fail";
                      
        System.out.println(result);  // Output: A
    }
}