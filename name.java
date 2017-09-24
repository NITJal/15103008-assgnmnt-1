import java.io.*;
class SortingNames
{
    public static void main(String[] args) throws IOException
    {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("\nEnter The number of Names :");
            int n = Integer.parseInt(br.readLine());
            String names[] = new String[n];
            System.out.println();
            for (int i = 1; i <= n; i++)
            {
                System.out.print("Enter Name " + i + ":");
                names[i-1] = br.readLine();
            }
            System.out.println("\nNames in Ascending Order");
            System.out.println();
            for (int j = 0; j < names.length; j++)
            {
                for (int i = j + 1; i < names.length; i++)
                {
                    if (names[i].compareToIgnoreCase(names[j]) < 0)
                    {
                        String temp = names[j];
                        names[j] = names[i];
                        names[i] = temp;
                    }
                }
                System.out.println(names[j]);
            }
    }
}
