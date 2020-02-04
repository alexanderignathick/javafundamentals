package by.epam.ignathick.javafundamentals.by.epam.ignathick.task;

import by.epam.ignathick.utils.InputUtil;

public class UserWelcome {

    private String userName;

    public UserWelcome(String userName){
        this.userName = userName;
        System.out.println("Hello " + this.userName);
    }

    public UserWelcome() {
        System.out.println("What is your name?");
        this.userName = InputUtil.getStringFromKeyboard();
        System.out.println("Hello " + this.userName);
    }

}
