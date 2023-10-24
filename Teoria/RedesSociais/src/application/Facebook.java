package application;

import interfaces.Sharing;
import interfaces.VideoConference;

public class Facebook extends SocialMedia implements VideoConference, Sharing {
    @Override
    public void postPhoto() {
        System.out.println("Postou uma foto no Facebook!");
    }

    @Override
    public void postVideo() {
        System.out.println("Postou um vídeo no Facebook!");
    }

    @Override
    public void postComment() {
        System.out.println("Postou um comentário no Facebook!");
    }

    @Override
    public void share() {
        System.out.println("Compartilhou uma publicação no Facebook!");
    }

    @Override
    public void stream() {
        System.out.println("Realizou uma video conferencia no Facebook!");
    }
}
