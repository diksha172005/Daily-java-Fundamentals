public class StrBuilder {
        public static void main(String[] args) {
            // Create a StringBuilder object
            StringBuilder sb = new StringBuilder("Hello");
            
            // append() - adds text at the end
            sb.append(" World");
            System.out.println(sb); // Output: Hello World
            
            // insert() - inserts text at specified position
            sb.insert(5, " Java");
            System.out.println(sb); // Output: Hello Java World
            
            // replace() - replaces characters in range
            sb.replace(6, 10, "Python");
            System.out.println(sb); // Output: Hello Python World
            
            // delete() - removes characters in range
            sb.delete(6, 12);
            System.out.println(sb); // Output: Hello World
            
            // reverse() - reverses the string
            sb.reverse();
            System.out.println(sb); // Output: dlroW olleH
            
            // length() - returns length of string
            System.out.println("Length: " + sb.length());
            
            // toString() - converts to String
            String result = sb.toString();
            System.out.println(result);
        }
    }
    
