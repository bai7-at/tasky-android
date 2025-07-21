package defpackage;

import android.media.AudioTrack;
import com.google.android.gms.internal.ads.zzpx;

/* loaded from: classes3.dex */
final class duf {
    public final l6a a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final xnc i;
    public final boolean j = false;
    public final boolean k = false;
    public final boolean l = false;

    public duf(l6a l6aVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, xnc xncVar, boolean z, boolean z2, boolean z3) {
        this.a = l6aVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = xncVar;
    }

    public final AudioTrack a(waf wafVar, int i) {
        AudioTrack audioTrack;
        try {
            if (khe.a >= 29) {
                audioTrack = new AudioTrack.Builder().setAudioAttributes(wafVar.a().a).setAudioFormat(khe.K(this.e, this.f, this.g)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i).setOffloadedPlayback(this.c == 1).build();
            } else {
                audioTrack = new AudioTrack(wafVar.a().a, khe.K(this.e, this.f, this.g), this.h, 1, i);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zzpx(state, this.e, this.f, this.h, this.a, c(), null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new zzpx(0, this.e, this.f, this.h, this.a, c(), e);
        }
    }

    public final prf b() {
        boolean z = this.c == 1;
        return new prf(this.g, this.e, this.f, false, z, this.h);
    }

    public final boolean c() {
        return this.c == 1;
    }
}
