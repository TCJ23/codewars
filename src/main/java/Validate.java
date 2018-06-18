public class Validate
{
    public static boolean validate(String n)
    {
        int sum = 0;
        boolean alternate = false;
        for (int i = n.length() - 1; i >= 0; i--)
        {
            int j = Integer.parseInt(n.substring(i, i + 1));
            //String reverse = new StringBuffer(n).reverse().toString();
            //int digit = Character.digit(reverse.charAt(i), 10);
            //int digit = n.charAt(i) - '0';
            if (alternate)
            {
                j *= 2;
                if (j > 9)
                {
                    j = (j % 10) + 1;
                }
            }
            sum += j;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }
}