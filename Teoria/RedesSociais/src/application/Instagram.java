package application;

import interfaces.Sharing;
import interfaces.VideoConference;

public class Instagram extends SocialMedia implements VideoConference, Sharing {
    @Override
    public void postPhoto() {
        System.out.println("Postou uma foto no Instagram!");
    }

    @Override
    public void postVideo() {
        System.out.println("Postou um vídeo no Instagram!");
    }

    @Override
    public void postComment() {
        System.out.println("Postou um comentário no Instagram!");
    }
    @Override
    public void share() {
        System.out.println("Compartilhou uma publicação no Instragram!");
    }

    @Override
    public void stream() {
        System.out.println("Realizou uma video conferencia no Instragram");
    }
}
