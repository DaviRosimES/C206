package application;

import interfaces.Sharing;
import interfaces.VideoConference;

public class GooglePlus extends SocialMedia implements VideoConference, Sharing {
    @Override
    public void postPhoto() {
        System.out.println("Postou uma foto no GooglePlus!");
    }

    @Override
    public void postVideo() {
        System.out.println("Postou um vídeo no GooglePlus!");
    }

    @Override
    public void postComment() {
        System.out.println("Postou um comentário no GooglePlus!");
    }

    @Override
    public void share() {
        System.out.println("Compartilhou uma publicação no GooglePLus!");
    }

    @Override
    public void stream() {
        System.out.println("Realizou uma video conferencia no GooglePlus!");
    }
}
