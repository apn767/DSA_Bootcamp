public class KarpRabin {
    private static final int PRIME = 101;
    private long calculateHash(String str){
        long hash = 0;
        for(int i =0;i<str.length();i++){
            hash += str.charAt(i) * Math.pow(PRIME, i);
        }return hash;
    }
    private double updateHash(double prevHash, char oldchar, char newchar, int patternlength){
        double newHash = (prevHash- oldchar) / PRIME;
        newHash = newHash + newchar * Math.pow(PRIME, patternlength -1);
        return newHash;
    }
    public void search(String text, String pattern){
        int patternlength = pattern.length();
        long patternHash = calculateHash(pattern);
        double textHash  = calculateHash(text.substring(0, patternlength));
        for (int i = 0;i<= text.length() - patternlength;i++){
            if (textHash == patternHash){
              if (text.substring(i,i+patternlength).equals(pattern)) {
                  System.out.println("Pattern found at index: "+ i);
              }
            }
            if (i< text.length() - patternlength){
                textHash = updateHash(textHash, text.charAt(i),text.charAt(i+patternlength),patternlength);
            }
        }
    }
}
