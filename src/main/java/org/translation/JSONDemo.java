package org.translation;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Example working with JSON data. The data consists of an array with two objects in it.
 * Each object has two key-value pairs in it.
 */
public class JSONDemo {
    /**
     * A first example of working with JSON data.
     * @param args not used
     */
    public static void main(String[] args) {
        String jsonData = "[{\"key1\" : \"string1a\", \"key2\":21}, {\"key1\" : \"string1b\", \"key2\":22}]";
        JSONArray jsonArray = new JSONArray(jsonData);
        System.out.println(jsonArray);
        System.out.println(jsonArray.length());
        // note that we can use jsonArray.get, but its return type is just Object,
        // which isn't as useful as below.
        JSONObject jsonObject = jsonArray.getJSONObject(0);
        System.out.println(jsonObject);
        System.out.println(jsonObject.getString("key1"));
        System.out.println(jsonObject.getInt("key2"));
        System.out.println(getKeyOneOfSecond(jsonArray));
    }

    /**
     * Returns the value of key "key1" from the second object in the given jsonArray.
     * The code may assume that the key exists and that the jsonArray has at least two items in it.
     * @param jsonArray the jsonArray to get the value from
     * @return value of key "key1" from the second object in the given jsonArray
     */
    public static String getKeyOneOfSecond(JSONArray jsonArray) {
        // Get second JSONObject in JSONArray (index 1)
        JSONObject secondObject = jsonArray.getJSONObject(1);
        return secondObject.getString("key1");
    }

}