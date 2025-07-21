package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* loaded from: classes3.dex */
final class tsf {
    private final AudioTrack a;
    private final AudioTimestamp b = new AudioTimestamp();
    private long c;
    private long d;
    private long e;

    public tsf(AudioTrack audioTrack) {
        this.a = audioTrack;
    }

    public final long a() {
        return this.e;
    }

    public final long b() {
        return this.b.nanoTime / 1000;
    }

    public final boolean c() {
        boolean timestamp = this.a.getTimestamp(this.b);
        if (timestamp) {
            long j = this.b.framePosition;
            if (this.d > j) {
                this.c++;
            }
            this.d = j;
            this.e = j + (this.c << 32);
        }
        return timestamp;
    }
}
