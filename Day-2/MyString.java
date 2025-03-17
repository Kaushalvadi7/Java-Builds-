public class MyString {
    public static void main(String[] args) {
        //String is immutable(string can't be change)
    
        String str = "Java Programming";

        // 1. Length of a string
        System.out.println("Length: " + str.length());

        // 2. Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // 3. Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // 4. Substring extraction
        System.out.println("Substring (0-4): " + str.substring(0, 4));
        System.out.println("SubSequence(3-6):" +str.subSequence(3, 6));
        System.out.println("Beginindex(3)" + str.substring(3));


        // 5. Replace characters
        System.out.println("Replaced: " + str.replace("Java", "Python"));

        // 6. Check if contains a substring
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // 7. Trim extra spaces
        String str2 = "  Hello World  ";
        System.out.println("Trimmed: '" + str2.trim() + "'");

        // 8. String comparison
        String str3 = "java programming";
        System.out.println("Equals (case-sensitive): " + str.equals(str3));
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase(str3));

        // 9. Concatenation
        System.out.println("Concatenation: " + str.concat(" is fun"));

        // 10. Character at specific index
        System.out.println("Character at index 3: " + str.charAt(3));

        // 11. Repeat of String 
        System.out.println("Repeat String(3)"+ str.repeat(3));

        
        // 12. isEmpty() & isBlank()
        System.out.println("IsEmpty?"+str.isEmpty());  
        System.out.println("IsBlank?"+str.isBlank());  

        // multiple method in the once
        String result = str.trim().toUpperCase().
        replace("JAVA", "java");

        System.out.println(result); // Output: PYTHON IS FUN!
    }

}
