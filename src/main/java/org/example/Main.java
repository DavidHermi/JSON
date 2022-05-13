package org.example;
import org.json.JSONArray;
import org.json.JSONObject;
public class Main {
    public static void main(String[] args) {


        String json = "{\n" +
                "    \"pageInfo\": {\n" +
                "            \"pageName\": \"Homepage\",\n" +
                "            \"logo\": \"https://www.example.com/logo.jpg\"\n" +
                "    },\n" +
                "    \"posts\": [\n" +
                "            {\n" +
                "                \"post_id\": \"0123456789\",\n" +
                "                \"actor_id\": \"1001\",\n" +
                "                \"author_name\": \"Jane Doe\",\n" +
                "                \"post_title\": \"How to parse JSON in Java\",\n" +
                "                \"comments\": [],\n" +
                "                \"time_of_post\": \"1234567890\"\n" +
                "            }," +
                "  {\\n\" +" +
                "                \"                \\\"post_id2\\\": \\\"0123456789\\\",\\n\" +\n" +
                "                \"                \\\"actor_id\\\": \\\"1001\\\",\\n\" +\n" +
                "                \"                \\\"author_name\\\": \\\"Jane Doe\\\",\\n\" +\n" +
                "                \"                \\\"post_title\\\": \\\"How to parse JSON in Java\\\",\\n\" +\n" +
                "                \"                \\\"comments\\\": [Muy bien hecho],\\n\" +\n" +
                "                \"                \\\"time_of_post\\\": \\\"1234567890\\\"\\n\" +\n" +
                "                \"            }\\n\"\n"
                +
                "    ]\n" +
                "}" ;
            JSONObject obj = new JSONObject(json);
            String pageName = obj.getJSONObject("pageInfo").getString("pageName");

            System.out.println(pageName);

            JSONArray arr = obj.getJSONArray("posts");
            for (int i = 0; i < arr.length(); i++) {
                String post_id = arr.getJSONObject(i).getString("post_id");
                System.out.println(post_id);
            }
        for (int i = 0; i < arr.length(); i++) {
            String post_id = arr.getJSONObject(i).getString("post_id2");
            System.out.println(post_id);
        }
        }
    }
