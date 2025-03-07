public class StringManipulation {
    public static void main(String[] args) {
        char arrSample[] = {'R', 'O', 'S', 'E'};
        String strSample1 = new String(arrSample);
        System.out.print(strSample1 + "\t");
        System.out.println("Length of " + strSample1 + " is: " + strSample1.length());

        byte ascii[] = {65, 66, 67, 68, 69, 70};
        String strSample2 = new String(ascii);
        System.out.print(strSample2 + "\t");
        String strSample3 = strSample1.concat(strSample2);
        System.out.print(strSample3 + "\t");
        String strSample4 = strSample1 + strSample2;
        System.out.print(strSample4 + "\t");
        System.out.println("3rd Char of " + strSample4 + " is: " + strSample4.charAt(2));

        char buf[] = new char[3];
        strSample4.getChars(2, 5, buf, 0);
        System.out.println("Extracted Chars: " + strSample4 + "" + new String(buf));

        String strSample = "RockStar";
        System.out.print(strSample.compareTo("ROCKSTAR") + "\t");
        System.out.print(strSample.compareToIgnoreCase("ROCKSTAR") + "\t");
        System.out.print(strSample.equals("ROCKSTAR") + "\t");
        System.out.println(strSample.equalsIgnoreCase("ROCKSTAR") + "\t");

        System.out.println("RockStar starts with 'Ro' : " + strSample.startsWith("Ro"));
        System.out.println("RockStar ends with 'Star' : " + strSample.endsWith("Star"));
        System.out.println("RockStar contains 'tar' : " +