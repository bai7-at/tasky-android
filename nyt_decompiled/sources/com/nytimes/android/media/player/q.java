package com.nytimes.android.media.player;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.analytics.AudioPlaybackEventTracker;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.player.p;
import defpackage.ci4;
import defpackage.ov5;
import defpackage.qo4;
import defpackage.ro4;
import defpackage.sb5;
import defpackage.w89;
import defpackage.zq3;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class q implements p.a {
    public static final a Companion = new a(null);
    private final b a;
    private final p b;
    private final w89 c;
    private final ci4 d;
    private final ov5 e;
    private final AudioPlaybackEventTracker f;
    private final String g;
    private NYTMediaItem h;
    private String i;
    private PlaybackStateCompat j;
    private ro4 k;
    private Boolean l;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public interface b {
        void a(boolean z);

        void b(MediaMetadataCompat mediaMetadataCompat);

        void c(PlaybackStateCompat playbackStateCompat);

        void d(MediaMetadataCompat mediaMetadataCompat);

        void e(MediaMetadataCompat mediaMetadataCompat);

        void f();
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PlaybackCustomAction.values().length];
            try {
                iArr[PlaybackCustomAction.VOLUME_ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlaybackCustomAction.VOLUME_OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlaybackCustomAction.DISMISS_AUDIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlaybackCustomAction.PAUSE_AUDIO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PlaybackCustomAction.PLAY_AUDIO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    public q(b bVar, p pVar, w89 w89Var, ci4 ci4Var, ov5 ov5Var, AudioPlaybackEventTracker audioPlaybackEventTracker, String str) {
        zq3.h(bVar, "playbackListener");
        zq3.h(pVar, "playback");
        zq3.h(w89Var, "videoEventReporter");
        zq3.h(ci4Var, "mediaHistoryWatcher");
        zq3.h(ov5Var, "playbackPositionManager");
        zq3.h(audioPlaybackEventTracker, "audioPlaybackEventTracker");
        zq3.h(str, "deviceType");
        this.a = bVar;
        this.b = pVar;
        this.c = w89Var;
        this.d = ci4Var;
        this.e = ov5Var;
        this.f = audioPlaybackEventTracker;
        this.g = str;
        String uuid = UUID.randomUUID().toString();
        zq3.g(uuid, "toString(...)");
        this.i = uuid;
        this.l = Boolean.FALSE;
        pVar.M(this);
    }

    private final void A(NYTMediaItem nYTMediaItem) {
        this.h = nYTMediaItem;
        String uuid = UUID.randomUUID().toString();
        zq3.g(uuid, "toString(...)");
        this.i = uuid;
    }

    private final void B() {
        NYTMediaItem nYTMediaItem = this.h;
        boolean z = this.b.V() == 3;
        boolean z2 = this.b.V() == 2;
        if (nYTMediaItem != null) {
            if (z || z2) {
                this.a.b(e(nYTMediaItem));
            }
        }
    }

    private final MediaMetadataCompat e(NYTMediaItem nYTMediaItem) {
        return o.a.b(z(nYTMediaItem));
    }

    private final long i() {
        return (this.b.l0() ? 2L : 4L) | 118392;
    }

    private final boolean u(NYTMediaItem nYTMediaItem) {
        String a2 = nYTMediaItem.a();
        NYTMediaItem nYTMediaItem2 = this.h;
        return zq3.c(a2, nYTMediaItem2 != null ? nYTMediaItem2.a() : null);
    }

    private final void w(NYTMediaItem nYTMediaItem) {
        this.e.f(nYTMediaItem, this.b);
    }

    private final void y(PlaybackStateCompat playbackStateCompat) {
        NYTMediaItem nYTMediaItem = this.h;
        if ((nYTMediaItem != null ? nYTMediaItem.i() : null) != null) {
            this.k = new ro4(z(nYTMediaItem), playbackStateCompat);
        }
    }

    private final NYTMediaItem z(NYTMediaItem nYTMediaItem) {
        w(nYTMediaItem);
        return NYTMediaItem.m(nYTMediaItem, null, null, null, null, this.b.O(), false, this.b.c(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.l, this.b.b0(), null, null, false, null, null, null, null, null, false, null, false, false, null, null, null, null, -50331729, 1023, null);
    }

    public final void C(String str) {
        int V = this.b.V();
        PlaybackStateCompat f = f(str, V);
        this.j = f;
        this.a.c(f);
        if (V == 3 || V == 2) {
            NYTMediaItem nYTMediaItem = this.h;
            if ((nYTMediaItem != null ? nYTMediaItem.i() : null) != null) {
                b bVar = this.a;
                NYTMediaItem nYTMediaItem2 = this.h;
                zq3.e(nYTMediaItem2);
                bVar.d(e(nYTMediaItem2));
            }
        }
    }

    @Override // com.nytimes.android.media.player.p.a
    public void a(boolean z) {
        this.l = Boolean.valueOf(z);
        B();
        this.a.a(z);
    }

    @Override // com.nytimes.android.media.player.p.a
    public void b() {
        B();
        C(null);
    }

    @Override // com.nytimes.android.media.player.p.a
    public void c(String str) {
        C(str);
        NYTMediaItem nYTMediaItem = this.h;
        if (nYTMediaItem != null) {
            this.f.e(nYTMediaItem, this.i, this.g);
        }
    }

    public final void d(sb5 sb5Var) {
        this.b.n0(sb5Var);
    }

    public final PlaybackStateCompat f(String str, int i) {
        long m0 = this.b.m0();
        PlaybackStateCompat.d dVar = new PlaybackStateCompat.d();
        dVar.b(i());
        if (str != null) {
            dVar.d(str);
            i = 7;
        }
        dVar.e(i, m0, 1.0f);
        dVar.c(this.b.c0());
        PlaybackStateCompat a2 = dVar.a();
        zq3.g(a2, "build(...)");
        return a2;
    }

    public final NYTMediaItem g() {
        NYTMediaItem nYTMediaItem = this.h;
        if (nYTMediaItem != null) {
            return z(nYTMediaItem);
        }
        return null;
    }

    public final long h() {
        return this.b.c0();
    }

    public final PlaybackStateCompat j() {
        return this.j;
    }

    public final NYTMediaItem k() {
        return this.h;
    }

    public final ro4 l() {
        return this.k;
    }

    public final String m() {
        return this.i;
    }

    public final void n(PlaybackCustomAction playbackCustomAction) {
        zq3.h(playbackCustomAction, "action");
        int i = c.a[playbackCustomAction.ordinal()];
        if (i == 1) {
            this.b.P(false);
        } else if (i == 2) {
            this.b.P(true);
        } else if (i == 3) {
            this.k = null;
        } else if (i != 4) {
            if (i == 5) {
                ro4 ro4Var = this.k;
                if (ro4Var == null || !v()) {
                    q();
                } else {
                    x(ro4Var.a(), qo4.Companion.b(), null);
                    this.b.e0(ro4Var.b().g());
                }
            }
        } else if (!v()) {
            p();
        }
        B();
    }

    public final void o() {
        this.b.d0();
        NYTMediaItem nYTMediaItem = this.h;
        if (nYTMediaItem != null) {
            this.f.m(nYTMediaItem, this.i, this.g);
        }
    }

    @Override // com.nytimes.android.media.player.p.a
    public void onCompleted() {
        NYTMediaItem nYTMediaItem = this.h;
        if (nYTMediaItem != null) {
            this.d.a(nYTMediaItem);
            this.f.d(nYTMediaItem, this.i, this.g);
            this.e.b(nYTMediaItem);
        }
        String uuid = UUID.randomUUID().toString();
        zq3.g(uuid, "toString(...)");
        this.i = uuid;
        t(null);
    }

    public final void p() {
        if (this.b.l0()) {
            NYTLogger.l("Exoplayer: pausing playback", new Object[0]);
            this.b.pause();
            this.a.f();
            NYTMediaItem nYTMediaItem = this.h;
            if (nYTMediaItem != null) {
                this.f.g(nYTMediaItem, this.i, this.g);
            }
        }
    }

    public final void q() {
        NYTLogger.l("Exoplayer: starting playback", new Object[0]);
        NYTMediaItem nYTMediaItem = this.h;
        if (nYTMediaItem == null) {
            this.b.L();
            return;
        }
        this.e.c(nYTMediaItem);
        if (this.b.V() == 1) {
            this.b.T(nYTMediaItem, qo4.Companion.b(), null);
            this.f.f(nYTMediaItem, this.i, this.g);
        } else {
            this.b.L();
            this.f.h(nYTMediaItem, this.i, this.g);
        }
        this.a.e(e(nYTMediaItem));
    }

    public final void r() {
        this.b.q();
        NYTMediaItem nYTMediaItem = this.h;
        if (nYTMediaItem != null) {
            this.f.l(nYTMediaItem, this.i, this.g);
        }
    }

    public final void s(long j) {
        NYTMediaItem nYTMediaItem = this.h;
        if (nYTMediaItem != null && j > this.b.m0()) {
            this.f.j(nYTMediaItem, this.i, this.g);
        } else if (nYTMediaItem != null && j < this.b.m0()) {
            this.f.i(nYTMediaItem, this.i, this.g);
        }
        this.b.e0(j);
    }

    public final void t(String str) {
        NYTLogger.l("Exoplayer: stopping playback", new Object[0]);
        NYTMediaItem nYTMediaItem = this.h;
        if (nYTMediaItem != null) {
            this.e.d(nYTMediaItem, this.b.m0());
        }
        this.b.stop();
        this.a.f();
        C(str);
    }

    public final boolean v() {
        NYTMediaItem nYTMediaItem = this.h;
        if (nYTMediaItem != null) {
            zq3.e(nYTMediaItem);
            if (nYTMediaItem.i() == null) {
                return true;
            }
        }
        return false;
    }

    public final void x(NYTMediaItem nYTMediaItem, qo4 qo4Var, sb5 sb5Var) {
        zq3.h(nYTMediaItem, "newItem");
        zq3.h(qo4Var, "startParams");
        if (nYTMediaItem.U()) {
            NYTMediaItem nYTMediaItem2 = this.h;
            if ((nYTMediaItem2 != null ? nYTMediaItem2.i() : null) != null) {
                y(f(null, 2));
                if (!u(nYTMediaItem) && nYTMediaItem.Q()) {
                    this.c.j(nYTMediaItem);
                }
                A(nYTMediaItem);
                this.a.a(false);
                this.l = null;
                this.b.a0(nYTMediaItem, sb5Var, qo4Var, v());
                MediaMetadataCompat e = e(nYTMediaItem);
                this.a.b(e);
                this.a.e(e);
                this.f.f(nYTMediaItem, this.i, this.g);
            }
        }
        this.k = null;
        if (!u(nYTMediaItem)) {
            this.c.j(nYTMediaItem);
        }
        A(nYTMediaItem);
        this.a.a(false);
        this.l = null;
        this.b.a0(nYTMediaItem, sb5Var, qo4Var, v());
        MediaMetadataCompat e2 = e(nYTMediaItem);
        this.a.b(e2);
        this.a.e(e2);
        this.f.f(nYTMediaItem, this.i, this.g);
    }
}
