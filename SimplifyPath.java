import java.util.*;

public class SimplifyPath {
    public static String simplify(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");
        // here foe-each loop is used:
        for (String part : parts) { // for each element of parts is stored in part
            if (part.equals("") || part.equals(".")) {
                continue; // it means skip curr iteration and move to next.
            } else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(part);
            }
        }
        // build result:
        String result = "";
        for (String dir : stack) {// for each element of stack is stored in dir.
            result += "/" + dir;
        }
        // ternary operator: if length is 0 then return "/" otherwise return result.
        return result.length() == 0 ? "/" : result;
    }

    public static void main(String args[]) {
        String path = "/a/./b/../../c/";
        System.out.println(simplify(path));
    }
}
