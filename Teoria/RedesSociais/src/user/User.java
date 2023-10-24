package user;

import application.SocialMedia;

import java.util.Scanner;

public class User {
    private String name;
    private String email;
    public SocialMedia[] socialMediasAccounts = new SocialMedia[4];

    public User(SocialMedia[] socialMedias, String name, String email){
        this.name = name;
        this.email = email;
        for (int i = 0; i < socialMedias.length; i++) {
            if(socialMedias[i] != null){
                socialMediasAccounts[i] = socialMedias[i];
            }
            continue;
        }
    }
}
