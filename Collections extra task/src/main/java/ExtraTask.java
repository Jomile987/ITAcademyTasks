import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


public class ExtraTask {
    public static void main(String[] args) {

        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("src/main/resources/users.json")) {
            Object obj = jsonParser.parse(reader);
            JSONArray usersList = (JSONArray) obj;

            List<User> userListData = new ArrayList<>();

            for (Object user : usersList) {
                JSONObject json_user = (JSONObject) user;
                User userParsed = parseEmployeeObject(json_user);
                userListData.add(userParsed);
            }

            listToString(userListData);
            System.out.println("..............");

            Collections.sort(userListData, new AgeComparator());
            listToString(userListData);
            System.out.println("..............");

            List<User> userIdMoreThan10000 = userListData.stream().filter(
                    id -> {
                        if (id.getUserId() == null) {
                            return false;
                        }
                        return Integer.valueOf(id.getUserId()) > 10000;
                    }).collect(Collectors.toList());
            listToString(userIdMoreThan10000);
            System.out.println("..............");

            Optional<User> youngestPersonOfList = userListData.stream().min(Comparator.comparingInt(User::getAge));
            System.out.println(youngestPersonOfList);
            System.out.println("..............");

            Optional<User> oldestPersonOfList = userListData.stream().max(Comparator.comparingInt(User::getAge));
            System.out.println(oldestPersonOfList);
            System.out.println("..............");


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    private static User parseEmployeeObject(JSONObject user) {

        //Get employee object within list
        JSONObject employeeObject = (JSONObject) user.get("user");

        //Get user first name
        String firstName = (String) employeeObject.get("firstname");
        String lastName = (String) employeeObject.get("lastname");
        String city = (String) employeeObject.get("city");
        String country = (String) employeeObject.get("Country");
        String age = (String) employeeObject.get("age");
        CountryCode countryCode = CountryCode.valueOf((String) employeeObject.get("countryCode"));
        String email = (String) employeeObject.get("email");
        String userid = (String) employeeObject.get("userid");

        int ageParsed = Integer.valueOf(age);

        User userParsed = new User(firstName, lastName, city, country, ageParsed, countryCode, email, userid);
        return userParsed;


        //TODO: Make application working. There could be problems with gradle, refresh dependencies.
        //TODO: Create User class with parameters from user.json file.
        //TODO: Set User firstname, lastName... Use Enum for country code.
        //TODO: Create User list and add all Users.
        //TODO: Order list from youngest user to oldest (Use Custom Comparator).
        //TODO: Filter list by userId > 10000. If ID is not existent, remove those users. (Use Stream)
        //TODO: Find the Oldest and the Youngest user.
    }

    public static void listToString(List<User> users) {
        /*Foreach to go through array of users and print it.*/
        for (User userIndex : users) {
            System.out.println(userIndex.toString());
        }
    }
}
