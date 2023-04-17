package org.example.HW5.repository;

import org.example.HW5.model.User;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserRepo {
    public void addNewUser(User user) {
        try (FileWriter fileWriter = new FileWriter("userDB.txt", true)) {
            fileWriter.write(user.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<String> allUsers() throws FileNotFoundException {
        List<String> userList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("userDB.txt"));
        Iterator<String> iterator = reader.lines().iterator();
        while (iterator.hasNext()) {
            userList.add(iterator.next());
        }
        return userList;
    }

    public void deleteUser(int userID) throws FileNotFoundException {
        List<String> userList = allUsers();
        try (FileWriter fileWriter = new FileWriter("userDB.txt")) {
            fileWriter.write("");
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).contains("userID = " + userID)) {
                userList.remove(i);
                i--;
            } else {
                try (FileWriter fileWriter = new FileWriter("userDB.txt",true)) {
                    fileWriter.write(userList.get(i) + "\n");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void addBalanceToUser(int userID, double balance) throws FileNotFoundException {
        List<String> userList = allUsers();
        try (FileWriter fileWriter = new FileWriter("userDB.txt")) {
            fileWriter.write("");
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).contains("userID = " + userID)) {
                String[] str = userList.get(i).split(" ");
                for (int j = 0; j < str.length; j++) {
                    if (str[j].contains("balance")) {
                        double newBalance = Double.parseDouble(str[j + 2]) + balance;
                        str[j + 2] = String.valueOf(newBalance);
                        break;
                    }
                }
                userList.set(i, String.join(" ", str));
            }
            try (FileWriter fileWriter = new FileWriter("userDB.txt", true)) {
                fileWriter.write(userList.get(i) + "\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
