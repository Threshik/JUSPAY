/* There is an id code that is supposed to be given to all the aspirants of an exam. It is actually a substring of a given string. That means, the authority takes a string and then assigns all the unique substrings to all the students. Suppose there is a string “abcde”, so the ids of the students will be “a”, “ab”, ”abc”, ”abcd”, ”abcde”, ”b”, ”bc”, ”bcd”, ”bcde”, ”c”, ”cd”, ”cde”, ”d”, ”de”, ”e”.
The students are standing in a line according to the lexicographic order of their given ids. You have to find out the id of the last student for the given input string from which the ids are generated and then arranged in lexicographic order.
Sample Input:
abdc

Sample output:
dc
*/
import java.util.Scanner;
import java.util.TreeSet;

public class Last_students_ID {
    static String findlastsubstring(char[] ch)
    {
        TreeSet<String> set = new TreeSet<>();
        int n = ch.length;
        for(int i=0;i<n;i++)
        {
            String temp="";
            for(int j=i;j<n;j++)
            {
                temp+=ch[j];
                set.add(temp);
            }
        }
        return set.last();

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        char[] ch = str.toCharArray();
        System.out.println(findlastsubstring(ch));
    }
}
