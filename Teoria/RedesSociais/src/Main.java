import application.Facebook;
import application.GooglePlus;
import application.SocialMedia;
import application.Twitter;
import user.User;

public class Main {
    public static void main(String[] args) {
        SocialMedia facebook = new Facebook();
        SocialMedia googleplus = new GooglePlus();
        SocialMedia[] socialMedias = new SocialMedia[2];
        socialMedias[0] = facebook;
        socialMedias[1] = googleplus;
        User user1 = new User(socialMedias, "user", "user@gmail.com");

        user1.socialMediasAccounts[0].postComment();
        user1.socialMediasAccounts[0].postPhoto();
        user1.socialMediasAccounts[0].likePost();
        user1.socialMediasAccounts[1].postVideo();
        user1.socialMediasAccounts[1].share();
        user1.socialMediasAccounts[1].stream();
    }
}
