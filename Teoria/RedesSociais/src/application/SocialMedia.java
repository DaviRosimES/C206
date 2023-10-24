package application;

import interfaces.Sharing;
import interfaces.VideoConference;

public abstract class SocialMedia implements Sharing, VideoConference {
    protected String password;
    protected int numFriends;

    public abstract void postPhoto();
    public abstract void postVideo();
    public abstract void postComment();
    public void likePost(){
        System.out.println("Curtiu uma publicação!");
    }
}
