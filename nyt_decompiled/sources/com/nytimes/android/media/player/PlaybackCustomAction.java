package com.nytimes.android.media.player;

/* loaded from: classes4.dex */
public enum PlaybackCustomAction {
    VOLUME_ON,
    VOLUME_OFF,
    DISMISS_AUDIO,
    PAUSE_AUDIO,
    PLAY_AUDIO;

    static PlaybackCustomAction fromName(String str) {
        try {
            return valueOf(str);
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
