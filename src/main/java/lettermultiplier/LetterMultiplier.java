package lettermultiplier;

public class LetterMultiplier {

    public String multiply(String text, int number) {
        ensureParamsAreValid(text,number);
        StringBuilder sb = new StringBuilder();
        multiplyLettersInText(number, text, sb);
        return sb.toString();
    }

    private void multiplyLettersInText(int number, String text, StringBuilder sb) {
        String[] letters = text.split("");
        for (String actual : letters) {
            sb.append(actual.repeat(number));
        }
    }

    private void ensureParamsAreValid(String text, int number) {
        if (text == null || text.isBlank() || number < 0) {
            throw new IllegalArgumentException("Text is null or number is negative!");
        }
    }
}
