package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.nytimes.android.media.common.NYTMediaItem;

/* loaded from: classes4.dex */
public final class ro4 {
    private final NYTMediaItem a;
    private final PlaybackStateCompat b;

    public ro4(NYTMediaItem nYTMediaItem, PlaybackStateCompat playbackStateCompat) {
        zq3.h(nYTMediaItem, "item");
        zq3.h(playbackStateCompat, "playbackState");
        this.a = nYTMediaItem;
        this.b = playbackStateCompat;
    }

    public final NYTMediaItem a() {
        return this.a;
    }

    public final PlaybackStateCompat b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro4)) {
            return false;
        }
        ro4 ro4Var = (ro4) obj;
        return zq3.c(this.a, ro4Var.a) && zq3.c(this.b, ro4Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "MediaState(item=" + this.a + ", playbackState=" + this.b + ")";
    }
}
