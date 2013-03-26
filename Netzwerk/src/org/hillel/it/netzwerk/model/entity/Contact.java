package org.hillel.it.netzwerk.model.entity;

public class Contact{
    private boolean incoming;
    private boolean follower;

    public boolean isFollower() {
        return follower;
    }

    public void setFollower(boolean follower) {
        this.follower = follower;
    }

    public boolean isIncoming() {
        return incoming;
    }

    public void setFollowing(boolean following) {
        this.incoming = following;
    }


}

