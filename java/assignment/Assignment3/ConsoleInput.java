package Calculator;


public class ConsoleInput {

    public static String getString() {
        try {
            byte inputarr[] = new byte[100]; //100 character array
            int length = System.in.read(inputarr);
            byte final_arr[] = new byte[length - 2]; //2 bytes
            System.arraycopy(inputarr, 0, final_arr, 0, length-2);
            String t = new String(final_arr);
            return t;
        }
        catch(Exception e) {
            System.out.println(e);
        }

        return "";
    }

    public static float getFloat() {
        return Float.parseFloat(getString());
    }
    public static int getInteger() {
        return Integer.parseInt(getString());
    }

}
