public class StringDemo 
{
    public static void main(String[] args) 
    {
        String s1 = "Hello";
        String s2 = new String("Hello");
        s1 = s1.concat("World");
        System.out.println(s1);
        System.out.println(s2.length());

        System.out.println(s1.charAt(0));

        System.out.println(s1.substring(0, 3));
        
        System.out.println(s1.equals(s2));

        s1.toLowerCase();
        s2.toUpperCase();
        s1.trim();
        s1.split(" ");
        s1.contains("ll");

        // string buffer vs string builder?
        // string builder is faster but not thread safe, while string buffer is the oposite

        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");
        sb.insert(2, "abcd");
        sb.replace(0,0,s1);
    }    
}
