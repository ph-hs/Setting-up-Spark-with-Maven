import spark.Filter;
import spark.Request;
import spark.Response;

import static spark.Spark.*;
public class Main {
	public static void main(String[] args) {
        staticFiles.location("/static");
        before("*", (request, response) -> {
            response.type("text/html");
        });
        get("/hello", (req, res) -> "Hello World");
    }
}
