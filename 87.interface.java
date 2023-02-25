import java.io.*;
import java.util.*;
class map{
    public static void main(String args[]){
        // Adding Elements
Map<Integer, String> m1 = new HashMap<>();
m1.put(400, "Bad Request");
m1.put(304, "Not Modified");
m1.put(200, "OK");
m1.put(301, "Moved Permanently");
m1.put(500, "Internal Server Error");

        // Map before remove operations

        System.out.println(m1);

        m1.remove(200);

        m1.remove(500);

        // Map after remove operations

        System.out.println(m1);
if (m1.isEmpty()) {
	System.out.println("No Error");
} else {
	System.out.println("Have HTTP Errors");
}
m1.clear();

    }

}