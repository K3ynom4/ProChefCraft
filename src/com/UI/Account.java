
package com.UI;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Account {
    private String username;
    private String email;
    private String password;

    public Account(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(username + "," + email + "," + password);
            writer.newLine();
            System.out.println("Account saved successfully.");
        } catch (IOException ex) {
            System.out.println("Error saving account.");
        }
    }
}