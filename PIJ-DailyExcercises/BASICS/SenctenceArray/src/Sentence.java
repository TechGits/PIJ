public class Sentence {
    public String splitSentence(String yourString) {
        String result = "";
        String[] wholeWords = yourString.split(",");
        for (int i = 0; i < wholeWords.length; i++) {
            String dd = "" + wholeWords[i];
            result += dd;
        }
        return result;
    }
}

