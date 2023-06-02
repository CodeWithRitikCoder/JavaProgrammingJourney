package _4_com.RitikCoder;

public class StringMethodsInJavaWithRitikCoder {
    public static void main(String [] arguments){
        System.out.print("\t\t\t Welcome to Addition of three Numbers's Program in java With RitikCoder..\n");
        System.out.println("\t\t\t +-------------+--------------+-------------+-------------+-------------+");

        //String Methods is here ...
        System.out.println("\n\t\t\t\tString Methods is here ...\n");

        //(1)- To find length of String using (String.length()) Method of String..
        String name= "RitikCoder";
        System.out.println("\t\t\t\t\t"+ name);
        int length= name.length();//This is the find length Method of string..
        System.out.println("\t\t\t\t\t(1). This is the length of your String is = "+ length);

        //(2)- To change your string in to lower case using (String.toLowerCase()) Method of String...
        System.out.println("\t\t\t\t\t(2). This is the Lower case of your String is = "+ name.toLowerCase());

        //(3)- To change your string in to Upper Case using (String.toUpperCase()) Method of String..
        System.out.println("\t\t\t\t\t(3). This is the Upper Case of your String is = "+ name.toUpperCase());

        //(4)- To Trim your String using (String.trim()) Method of String..
        String nonTrimedString= "           RitikCoder          ";
        System.out.println("\t\t\t\t\t(4-i). This is your NonTrimed String is = "+ nonTrimedString);
        String TrimedString= "         RitiCoder     is Back    ";
        System.out.println("\t\t\t\t\t(4-ii). This is your Trimed String is = "+ TrimedString.trim());
        //System.out.println("\t\t\t\t\tThis is your Trimed String is = "+ nonTrimedString.trim());//We can also user other string here..

        //(5)- To get new string of your old string starts from of your string using (string.substring(valueOfStartForm)) Method of String..
        System.out.println("\t\t\t\t\t(5). This is your SubString Starts from of your string is = "+ name.substring(3));

        //(6)- To get new string of your old string starts and end at of your string using (string.substring(ValueOfStartFromAndEndFrom)) Method of String..
        System.out.println("\t\t\t\t\t(6). This is your String Starts form and ends at of your string is = "+ name.substring(3,8));

        //(7)- To replace something in your string using (string.replace('OdlValue', 'replaceValue')) Method of string..
        System.out.println("\t\t\t\t\t(7). This is your replaced string of your old string is = "+ name.replace('i', 'k'));

        //(8)- To replace something more of your old String using (string.replace("oldValue", "replacedValue")) Method of String...
        System.out.println("\t\t\t\t\t(8). This is your replace something more String of your old string is = "+ name.replace("itik", "ohit"));

        //(9)- To check is there your string is startsWith is or not to string using (string.startsWith("startsWithValue")) Methods of String..
        System.out.println("\t\t\t\t\t(9). This is your String startsWith (Ri) is = "+ name.startsWith("Ri"));
        System.out.println("\t\t\t\t\t(9-i). This is your String startsWith (R) is = "+ name.startsWith("R"));
        System.out.println("\t\t\t\t\t(9-ii). This is your String not startsWith (Vi) is = "+ name.startsWith("Vi"));

        //(10)- To check is there your String is endsWith is or not to String using (string.endsWith(endsWithValue)) Methods of String..
        System.out.println("\t\t\t\t\t(10-i). This is your String endsWith (r) is = "+ name.endsWith("r"));
        System.out.println("\t\t\t\t\t(10-ii). This is your String endsWith (er) is = "+ name.endsWith("er"));
        System.out.println("\t\t\t\t\t(10-iii). This is your String not endsWith (ha) is = "+ name.endsWith("ha"));

        //(11)- To get any value of your String by String indexing using (string.charAt()) Method of String..
            //String indexing Start from (0) in java.....
        System.out.println("\t\t\t\t\t(11-i). This is Character at indexing (3) in your String is = "+ name.charAt(2));
        System.out.println("\t\t\t\t\t(11-ii). This is Character at indexing (3) in your String is = "+ name.charAt(5));
        String charAtString= "ApnaWalaCode";//We can also initialize a new String then use ....
        System.out.println("\t\t\t\t\t(11-iii). This is Character at after indexing (3) in your String is = "+ charAtString.charAt(4));

        //(12)- To find out on which index your char value is Occurrence in your string using (string.indedof("findOutCharValue")) Method of String...
        System.out.println("\t\t\t\t\t(12-i). (C) is present at indexing in your string is = "+ name.indexOf("C"));
        System.out.println("\t\t\t\t\t(12-ii). (R) is present at indexing in your string is = "+ name.indexOf("R"));
        System.out.println("\t\t\t\t\t(12-iii). (k) is present at indexing in your string is = "+ name.indexOf("k"));
        System.out.println("\t\t\t\t\t(10-iv). (ode) is present at indexing in your string is = "+ name.indexOf("ode"));
        //This will give you first that char value those present at first indexing if two or more charValue is same in your String.
        System.out.println("\t\t\t\t\t(10-v). (i) is present at indexing in your string is = "+ name.indexOf("i"));
        //if there is no char value is present in your string this will return (-1) in output..
        System.out.println("\t\t\t\t\t(10-vi). (I) is present at indexing in your string is = "+ name.indexOf("I"));

        //(13)- To find out on which index you char value is Occurrence in your String but here your assign find out Starts form in your string
        //  using (string.indexOf("findOutCharValue", startfromIndex)) Method of String...
        System.out.println("\t\t\t\t\t(13-i). (i) is present at indexing in your String but findOutStartFrom (2) is = "+ name.indexOf("i", 2));
        System.out.println("\t\t\t\t\t(13-ii). (a) is present at indexing in your String but findOutStartFrom (3) is = "+ charAtString.indexOf("a", 4));
        //if there is no char value is present startform in your string this will return (-1) in output..
        System.out.println("\t\t\t\t\t(13-iii). (W) is present at indexing in your string but findOutStartForm is = "+ charAtString.indexOf("W", 5));

        //(14)- To find out on which index your char value is Occurrence in your string from the last of your string using (string.lastIndexOf("findOutCharValue")
        //  Method of String...
        System.out.println("\t\t\t\t\t(14-i). (r) is present at indexing in your String from the last of your string is = "+ name.lastIndexOf("r"));
        String name2= "TermaMeraTeraMeraTerauuMerauu";
        System.out.println("\t\t\t\t\t(14-ii). (ra) is present at indexing in your String from the last of your string is = "+ name2.lastIndexOf("ra"));

        //(15)- To find out on which index your char value is Occurrence in your string from the last of your string but StartFrom in your string
        //  using (string.lasIndexOf("findOutCharValue",StartFromIndex)) Method of String..
        System.out.println("\t\t\t\t\t(15-i). (er) is present at indexing in your string form the last of your String by findOutStartFrom (17) is = "+ name2.lastIndexOf("e", 17));
        System.out.println("\t\t\t\t\t(15-ii). (er) is present at indexing in your string form the last of your String by findOutStartFrom (17) is = "+ name2.lastIndexOf("er", 17));
        //if there is no char value is matched in your string the this will return your (-1);
        System.out.println("\t\t\t\t\t(15-iii). (uu) is not present at any indexing in your String from the last of your String by findOutStarFrom (20) is = "+ name2.lastIndexOf("uu", 20));

        //(16)- To check is there your string is equals to some Strings or Not equals to using (string.equals("charValue") Method of String..
        System.out.println("\t\t\t\t\t(16-i). This is your String is equals to (RitikCoder) is = "+ name.equals("RitikCoder"));
        System.out.println("\t\t\t\t\t(16-ii). This is your String is not equals to (ApniCoding) is = "+ name.equals("ApaniCoding"));
        System.out.println("\t\t\t\t\t(16-iii). This is your String is not equals to (ritikcoder) is = "+ name.equals("ritikcoder"));

        //(17)- To check is there your string is equals to some strings or Not equals to but this will not match case sencitivitity of
        // your string using (string.equalIgnorCase("checkCharValue") Method of string.
        System.out.println("\t\t\t\t\t(17-i). This is your Sting is equals to (RitikCoder) with matching case sencitivity of your string is = "+ name.equalsIgnoreCase("ritIkcoDEr"));


        //That's all about some important Methods of String. in Java With RitikCoder....
    }
}