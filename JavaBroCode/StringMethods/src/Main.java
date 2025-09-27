            // 13. string methods

public class Main {
    public static void main(String[] args) {

        String name = "       pEdrO soUnd    ";

        int length = name.length();             // number of chars of the string
        char letter = name.charAt(0);           // returns the char in some position (starting with 0)
        int index = name.indexOf("e");          // returns the position the char is in (starting with 0)
        int lastIndex = name.lastIndexOf("o");  // returns the position of the last char is in

        name = name.toUpperCase();              // sets whole string to upper case
        name = name.toLowerCase();              // sets whole string to lower case
        name = name.trim();                     // removes all spaces before and after the string
        name = name.replace("dro", "a");        // replace some string (or char) with another

        System.out.println(name);

        if(name.isEmpty()){                         // makes a boolean, returns true if string is empty

        }
        if(name.contains("o")){                     // makes a boolean, returns true if the main string contains the same string (or char)

        }
        if(name.equals("pedro sound")){             // makes a boolean, returns true if the string is equal to another

        }
        if(name.equalsIgnoreCase("pEdRo Sound")){   // same as equals(), but ignores case

        }


    }
}
