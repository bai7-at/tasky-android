package defpackage;

import android.app.Activity;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.player.PlaybackVolume;
import com.nytimes.android.media.player.o;

/* loaded from: classes4.dex */
public final class hb5 {
    private final Activity a;

    public hb5(Activity activity) {
        zq3.h(activity, "activity");
        this.a = activity;
    }

    private final MediaControllerCompat o() {
        return MediaControllerCompat.b(this.a);
    }

    public final void A() {
        MediaControllerCompat.e g;
        MediaControllerCompat o = o();
        if (o == null || (g = o.g()) == null) {
            return;
        }
        g.g();
    }

    public final void B(String str, NYTMediaItem.ActiveView activeView) {
        zq3.h(activeView, "activeView");
        if (l(str, null)) {
            NYTMediaItem d = d();
            if ((d != null ? d.r() : null) == activeView) {
                A();
            }
        }
    }

    public final void C() {
        if (a()) {
            return;
        }
        A();
    }

    public final void D() {
        z("VOLUME_ON");
    }

    public final boolean a() {
        return p() && q();
    }

    public final void b() {
        MediaControllerCompat.e g;
        MediaControllerCompat o = o();
        if (o == null || (g = o.g()) == null) {
            return;
        }
        g.f("DISMISS_AUDIO", null);
    }

    public final void c() {
        MediaControllerCompat.e g;
        MediaControllerCompat o = o();
        if (o == null || (g = o.g()) == null) {
            return;
        }
        g.a();
    }

    public final NYTMediaItem d() {
        MediaMetadataCompat e = e();
        if (e == null) {
            return null;
        }
        try {
            return o.a(e);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final MediaMetadataCompat e() {
        MediaControllerCompat o = o();
        if (o != null) {
            return o.c();
        }
        return null;
    }

    public final PlaybackStateCompat f() {
        MediaControllerCompat o = o();
        if (o != null) {
            return o.d();
        }
        return null;
    }

    public final Integer g() {
        PlaybackStateCompat d;
        MediaControllerCompat o = o();
        if (o == null || (d = o.d()) == null) {
            return null;
        }
        return Integer.valueOf(d.h());
    }

    public final boolean h(NYTMediaItem nYTMediaItem) {
        return k(nYTMediaItem) && p();
    }

    public final boolean i(String str, String str2) {
        return l(str, str2) && p();
    }

    public final boolean j(long j, String str) {
        return l(String.valueOf(j), str);
    }

    public final boolean k(NYTMediaItem nYTMediaItem) {
        return nYTMediaItem != null && l(nYTMediaItem.a(), nYTMediaItem.i0());
    }

    public final boolean l(String str, String str2) {
        NYTMediaItem d = d();
        return d != null && (str2 == null || zq3.c(d.i0(), str2)) && zq3.c(d.a(), str);
    }

    public final boolean m() {
        NYTMediaItem d = d();
        return d != null && d.O();
    }

    public final boolean n(String str, String str2) {
        return l(str, str2) && t();
    }

    public final boolean p() {
        PlaybackStateCompat f = f();
        return (f == null || f.h() == 1 || f.h() == 7 || f.h() == 0) ? false : true;
    }

    public final boolean q() {
        NYTMediaItem d = d();
        return (d != null ? d.i() : null) != null;
    }

    public final boolean r() {
        NYTMediaItem d = d();
        return d != null && d.Q();
    }

    public final boolean s() {
        NYTMediaItem d = d();
        return (d != null ? d.l0() : null) == PlaybackVolume.OFF;
    }

    public final boolean t() {
        PlaybackStateCompat f = f();
        return f != null && f.h() == 2;
    }

    public final void u() {
        z("VOLUME_OFF");
    }

    public final void v() {
        MediaControllerCompat.e g;
        MediaControllerCompat o = o();
        if (o == null || (g = o.g()) == null) {
            return;
        }
        g.b();
    }

    public final void w() {
        MediaControllerCompat.e g;
        MediaControllerCompat o = o();
        if (o == null || (g = o.g()) == null) {
            return;
        }
        g.c();
    }

    public final void x() {
        MediaControllerCompat.e g;
        MediaControllerCompat o = o();
        if (o == null || (g = o.g()) == null) {
            return;
        }
        g.d();
    }

    public final void y(long j) {
        MediaControllerCompat.e g;
        MediaControllerCompat o = o();
        if (o == null || (g = o.g()) == null) {
            return;
        }
        g.e(j);
    }

    public final void z(String str) {
        MediaControllerCompat.e g;
        zq3.h(str, "action");
        MediaControllerCompat o = o();
        if (o == null || (g = o.g()) == null) {
            return;
        }
        g.f(str, null);
    }
}
