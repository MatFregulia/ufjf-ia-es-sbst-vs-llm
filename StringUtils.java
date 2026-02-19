public class StringUtils {

    public static String reverseString(String str) {
        // Sem tratamento de nulo propositalmente para o EvoSuite encontrar
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
        return cleanStr.equals(reverseString(cleanStr));
    }

    public static int countVowels(String str) {
        // Falta tratamento de nulo aqui, falha que o LLM não cobriu no relatório
        int count = 0;
        String lowerStr = str.toLowerCase();
        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
