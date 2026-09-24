public class strings{
    public static void main(String[] args)
    {
        String str="Java Programming";
        String s1=" Java ";
        System.out.println("Original:"+str);
        System.out.println("Length:"+str.length());
        System.out.println("character at index:"+str.charAt(2));
        System.out.println("UpperCase:"+str.toUpperCase());
        System.out.println("LowerCase:"+str.toLowerCase());
        System.out.println("equals:"+str.equals(s1));
        System.out.println("equals ignore:"+str.equalsIgnoreCase(s1));
        System.out.println("contains:"+str.contains("J"));
        System.out.println("starts with letter:"+str.startsWith("J"));
        System.out.println("ends with leter:"+str.endsWith("R"));
        System.out.println("substring:"+str.substring(6));
        System.out.println("index of:"+str.indexOf("P"));
        System.out.println("last index of:"+str.lastIndexOf("r"));
        System.out.println("replace:"+str.replace("J","H"));
        System.out.println("trim:"+s1.trim());
        System.out.println("split:"+str.split(",")[0]);

    }
}