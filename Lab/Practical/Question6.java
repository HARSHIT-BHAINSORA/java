class Functions{
    public static void main (String agrs[])
    {
        String s = "Java";

        // concat

        System.out.println(s.concat("Welcome"));


        // charAt()
        System.out.println(s.charAt(1));


        // find index at first 'a'

        System.out.println(s.indexOf('a'));

        // find index at second 'a'

        System.out.println(s.lastIndexOf('a')) 

        // Compare 

        System.out.println(s.equals("JAVA"));

        // Compare ignoring case
        System.out.println(s.equalsIgnore("JAVA"));

        //index of first a from last
        System.out.println(s.lastIndexOf('a', 2));
    }
}