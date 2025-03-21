package com.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

class Person {
    @SerializedName("name")
    private final String name;

    @SerializedName("lastName")
    private final String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Mark", "Chornovil");

        Gson gson = new GsonBuilder()
                .disableHtmlEscaping()
                .create();

        String json = gson.toJson(person);

        json = json.replace(":", ": ").replace(",", ", ");

        System.out.println(json);
    }
}
