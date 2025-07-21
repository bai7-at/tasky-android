package defpackage;

import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes4.dex */
public abstract class el4 {
    public static long a(PlaybackStateCompat playbackStateCompat) {
        if (playbackStateCompat == null) {
            return -111L;
        }
        return playbackStateCompat.g() + ((SystemClock.elapsedRealtime() - playbackStateCompat.d()) * ((long) playbackStateCompat.e()));
    }
}
