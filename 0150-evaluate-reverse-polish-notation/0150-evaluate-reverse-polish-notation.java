class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String t = tokens[i];

            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {

                int val1 = s.pop();
                int val2 = s.pop();

                if (t.equals("+")) {
                    s.push(val2 + val1);
                } 
                else if (t.equals("-")) {
                    s.push(val2 - val1);
                } 
                else if (t.equals("*")) {
                    s.push(val2 * val1);
                } 
                else if (t.equals("/")) {
                    s.push(val2 / val1);
                }

            } else {
                s.push(Integer.valueOf(t));
            }
        }

        return s.peek();
    }
}