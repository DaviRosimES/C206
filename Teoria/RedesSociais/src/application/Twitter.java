package application;

import application.SocialMedia;
import interfaces.Sharing;
import interfaces.VideoConference;

public class Twitter extends SocialMedia implements VideoConference, Sharing {
    @Override
    public void postPhoto() {
        System.out.println("Postou uma foto no Twitter!");
    }

    @Override
    public void postVideo() {
        System.out.println("Postou um vídeo no Twitter!");
    }

    @Override
    public void postComment() {
        System.out.println("Postou um comentário no Twitter!");
    }

    @Override
    public void share() {
        System.out.println("Compartilhou uma publicação no Twitter!");
    }

    @Override
    public void stream() {
        System.out.println("Realizou uma video conferencia no Twitter!");
    }
}
