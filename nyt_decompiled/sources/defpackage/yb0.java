package defpackage;

import android.app.Activity;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.player.PlaybackVolume;
import com.nytimes.android.media.util.CaptionPrefManager;
import com.nytimes.android.utils.ShareOrigin;
import com.nytimes.android.view.mvp.BasePresenter;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* loaded from: classes4.dex */
public class yb0 extends BasePresenter {
    private final Activity b;
    private final zh4 c;
    private final hb5 d;
    private final ho4 e;
    private final CaptionPrefManager f;
    private final w89 g;
    private final jh4 h;
    private final CompositeDisposable i = new CompositeDisposable();
    private String j = null;

    public yb0(Activity activity, zh4 zh4Var, hb5 hb5Var, ho4 ho4Var, CaptionPrefManager captionPrefManager, w89 w89Var, jh4 jh4Var) {
        this.b = activity;
        this.c = zh4Var;
        this.d = hb5Var;
        this.e = ho4Var;
        this.f = captionPrefManager;
        this.g = w89Var;
        this.h = jh4Var;
    }

    private void B0(boolean z) {
        if (M() == null) {
            return;
        }
        if (z) {
            ((h69) M()).f0();
        } else {
            ((h69) M()).b0();
        }
    }

    private void C0(NYTMediaItem nYTMediaItem) {
        if (M() == null) {
            return;
        }
        if (!TextUtils.isEmpty(nYTMediaItem.g0())) {
            ((h69) M()).J();
            return;
        }
        ((h69) M()).G();
        NYTLogger.h(new Exception("Hiding share controls for Video. Id: " + nYTMediaItem.a() + " , Title: " + nYTMediaItem.p()));
    }

    private void D0(NYTMediaItem nYTMediaItem) {
        if (M() == null) {
            return;
        }
        if (PlaybackVolume.OFF == nYTMediaItem.l0()) {
            ((h69) M()).M0();
        } else {
            ((h69) M()).h0();
        }
    }

    private void e0(boolean z) {
        B0(z);
        if (z) {
            this.g.s(this.d.d());
        } else {
            this.g.p(this.d.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(Boolean bool) {
        if (M() == null) {
            return;
        }
        if (bool.booleanValue()) {
            ((h69) M()).Q();
        } else {
            ((h69) M()).x0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(NYTMediaItem nYTMediaItem) {
        if (!s0() || M() == null) {
            return;
        }
        boolean m = this.d.m();
        ((h69) M()).c0(m);
        if (!m) {
            C0(nYTMediaItem);
        }
        D0(nYTMediaItem);
        if (!this.d.r() || this.d.s()) {
            return;
        }
        this.f.clearOverridePref();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(PlaybackStateCompat playbackStateCompat) {
        if (!s0() || M() == null) {
            return;
        }
        int h = playbackStateCompat.h();
        if (this.d.s() && this.d.r()) {
            if (h == 3) {
                w0(true);
            } else if (h == 1) {
                w0(false);
            }
        }
    }

    private boolean s0() {
        String str = this.j;
        return str != null && this.d.l(str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t0(Throwable th) {
        NYTLogger.i(th, "Error listening to caption events", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u0(Throwable th) {
        NYTLogger.i(th, "Error listening to video metadata events", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v0(Throwable th) {
        NYTLogger.i(th, "Error listening to state change", new Object[0]);
    }

    public void A0() {
        NYTMediaItem d = this.d.d();
        if (M() == null || d == null) {
            return;
        }
        if (d.l0() == PlaybackVolume.ON) {
            this.d.u();
            this.g.i(this.d.d());
        } else {
            this.d.D();
            this.g.l(this.d.d());
        }
    }

    @Override // com.nytimes.android.view.mvp.BasePresenter
    public void L() {
        super.L();
        this.i.clear();
    }

    public void d0(h69 h69Var) {
        super.q(h69Var);
        B0(this.f.areCaptionsEnabled());
        this.i.add(this.c.o().subscribe(new Consumer() { // from class: sb0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                yb0.this.n0((Boolean) obj);
            }
        }, new Consumer() { // from class: tb0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                yb0.t0((Throwable) obj);
            }
        }));
        this.i.add(this.c.p().subscribe(new Consumer() { // from class: ub0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                yb0.this.q0((NYTMediaItem) obj);
            }
        }, new Consumer() { // from class: vb0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                yb0.u0((Throwable) obj);
            }
        }));
        this.i.add(this.c.q().subscribe(new Consumer() { // from class: wb0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                yb0.this.r0((PlaybackStateCompat) obj);
            }
        }, new Consumer() { // from class: xb0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                yb0.v0((Throwable) obj);
            }
        }));
    }

    public void l0() {
        NYTMediaItem d = this.d.d();
        if (d == null) {
            return;
        }
        try {
            long parseLong = Long.parseLong(d.a());
            String u = d.u();
            if (u == null) {
                u = Asset.Companion.generateUri(parseLong, d.P() ? AssetConstants.AUDIO_TYPE : AssetConstants.VIDEO_TYPE);
            }
            String str = u;
            PlaybackStateCompat f = this.d.f();
            int h = f != null ? f.h() : 3;
            Long Z = d.Z();
            if (Z != null && Z.longValue() != 0) {
                parseLong = Z.longValue();
            }
            this.b.startActivity(this.h.b(this.b, parseLong, str, h, d.e0()));
            this.g.o(this.d.d());
        } catch (NumberFormatException unused) {
        }
    }

    public void m0() {
        this.g.n(this.d.d());
        this.b.finish();
    }

    public void w0(boolean z) {
        if (z) {
            this.f.setOverridePref();
        } else {
            this.f.clearOverridePref();
        }
        e0(z);
    }

    public void x0(String str) {
        this.j = str;
    }

    public void y0() {
        NYTMediaItem d = this.d.d();
        if (d != null) {
            this.g.q(d);
            String g0 = d.g0();
            if (TextUtils.isEmpty(g0)) {
                return;
            }
            this.e.c(this.b, g0, d.p(), null, ShareOrigin.ARTICLE_FRONT);
            this.d.v();
        }
    }

    public void z0() {
        this.f.clearOverridePref();
        boolean z = !this.f.areCaptionsEnabled();
        this.f.updateCaptionEnabledPreference(z);
        e0(z);
    }
}
