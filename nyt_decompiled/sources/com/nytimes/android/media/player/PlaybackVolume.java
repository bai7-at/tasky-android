package com.nytimes.android.media.player;

/* loaded from: classes4.dex */
public enum PlaybackVolume {
    ON("com.nytimes.android.media.volume_on"),
    OFF("com.nytimes.android.media.volume_off");

    public final String id;

    PlaybackVolume(String str) {
        this.id = str;
    }

    static PlaybackVolume fromId(String str) {
        PlaybackVolume playbackVolume = ON;
        return playbackVolume.id.equals(str) ? playbackVolume : OFF;
    }
}
