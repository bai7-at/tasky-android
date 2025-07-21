package com.nytimes.android.video.presenter;

import android.support.v4.media.session.PlaybackStateCompat;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.player.PlaybackVolume;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import com.nytimes.android.video.presenter.InlineVideoPresenter;
import com.nytimes.android.video.views.InlineVideoState;
import com.nytimes.android.video.views.VideoControlView;
import com.nytimes.android.video.views.VideoMuteControl;
import com.nytimes.android.view.mvp.BasePresenter;
import defpackage.bo4;
import defpackage.ek3;
import defpackage.g69;
import defpackage.gk3;
import defpackage.hb5;
import defpackage.lm6;
import defpackage.oz4;
import defpackage.qo4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zh4;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* loaded from: classes4.dex */
public final class InlineVideoPresenter extends BasePresenter implements VideoMuteControl.a {
    private final zh4 b;
    private final SnackbarUtil c;
    private final NetworkStatus d;
    private final hb5 e;
    private final RecentlyViewedManager f;
    private final bo4 g;
    private final g69 h;
    private final ek3 i;
    private final CompositeDisposable j;
    private NYTMediaItem k;

    public InlineVideoPresenter(zh4 zh4Var, SnackbarUtil snackbarUtil, NetworkStatus networkStatus, hb5 hb5Var, RecentlyViewedManager recentlyViewedManager, bo4 bo4Var, g69 g69Var, ek3 ek3Var) {
        zq3.h(zh4Var, "mediaEvents");
        zq3.h(snackbarUtil, "snackbarUtil");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(hb5Var, "mediaControl");
        zq3.h(recentlyViewedManager, "recentlyViewedManager");
        zq3.h(bo4Var, "mediaServiceConnection");
        zq3.h(g69Var, "videoAutoplayTracker");
        zq3.h(ek3Var, "reporter");
        this.b = zh4Var;
        this.c = snackbarUtil;
        this.d = networkStatus;
        this.e = hb5Var;
        this.f = recentlyViewedManager;
        this.g = bo4Var;
        this.h = g69Var;
        this.i = ek3Var;
        this.j = new CompositeDisposable();
    }

    private final void B0() {
        if (this.d.g()) {
            SnackbarUtil.y(this.c, lm6.video_error_playback, 0, 2, null);
        } else {
            SnackbarUtil.y(this.c, lm6.video_error_connection_lost, 0, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(InlineVideoPresenter inlineVideoPresenter, NYTMediaItem nYTMediaItem, boolean z) {
        zq3.h(inlineVideoPresenter, "this$0");
        zq3.h(nYTMediaItem, "$mediaItem");
        gk3 gk3Var = (gk3) inlineVideoPresenter.M();
        if (gk3Var != null) {
            gk3Var.setState(InlineVideoState.LOADING);
            inlineVideoPresenter.g.h(NYTMediaItem.m(nYTMediaItem, null, null, null, null, 0L, z, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, false, false, null, null, null, null, -33, 1023, null).n(NYTMediaItem.ActiveView.INLINE), qo4.Companion.c(!z), gk3Var.j0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q0(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0() {
        gk3 gk3Var = (gk3) M();
        if (gk3Var == null || this.e.k(this.k)) {
            return;
        }
        NYTMediaItem nYTMediaItem = this.k;
        if (nYTMediaItem == null || !nYTMediaItem.Q()) {
            gk3Var.setState(InlineVideoState.START);
        } else {
            gk3Var.q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(PlaybackStateCompat playbackStateCompat) {
        if (this.e.k(this.k)) {
            NYTMediaItem d = this.e.d();
            zq3.e(d);
            gk3 gk3Var = (gk3) M();
            if (gk3Var != null) {
                int h = playbackStateCompat.h();
                if (h == 1) {
                    if (!w0()) {
                        gk3Var.setState(InlineVideoState.START);
                        return;
                    } else {
                        gk3Var.setState(InlineVideoState.END);
                        this.i.a();
                        return;
                    }
                }
                if (h == 2) {
                    gk3Var.setState(InlineVideoState.PLAYING);
                    this.i.c();
                    return;
                }
                if (h == 3) {
                    if (d.S()) {
                        gk3Var.q0();
                    }
                    gk3Var.setState(InlineVideoState.PLAYING);
                    this.i.b();
                    return;
                }
                if (h == 6) {
                    if (playbackStateCompat.g() <= 0) {
                        gk3Var.setState(InlineVideoState.LOADING);
                        return;
                    } else {
                        gk3Var.setState(InlineVideoState.BUFFERING);
                        return;
                    }
                }
                if (h != 7) {
                    return;
                }
                if (!d.Q()) {
                    B0();
                }
                gk3Var.setState(InlineVideoState.START);
            }
        }
    }

    public final void A0(VideoControlView.ControlInteractionCallback.Interaction interaction) {
        NYTMediaItem d;
        zq3.h(interaction, "interaction");
        gk3 gk3Var = (gk3) M();
        if (gk3Var != null && (d = this.e.d()) != null && d.Q()) {
            if (d.l0() == PlaybackVolume.OFF && !gk3Var.T()) {
                this.e.D();
            }
            Long x0 = x0();
            if (x0 != null) {
                this.h.c(x0.longValue());
            }
        }
        this.i.d(interaction);
    }

    public final void C0(final boolean z) {
        if (!this.d.g()) {
            SnackbarUtil.p(this.c, false, 1, null);
            return;
        }
        final NYTMediaItem nYTMediaItem = this.k;
        if (nYTMediaItem != null) {
            if (z && nYTMediaItem.T()) {
                return;
            }
            this.g.d(new oz4() { // from class: hk3
                @Override // defpackage.oz4
                public final void call() {
                    InlineVideoPresenter.D0(InlineVideoPresenter.this, nYTMediaItem, z);
                }
            });
        }
    }

    @Override // com.nytimes.android.view.mvp.BasePresenter
    public void L() {
        super.L();
        this.j.clear();
        hb5 hb5Var = this.e;
        NYTMediaItem nYTMediaItem = this.k;
        hb5Var.B(nYTMediaItem != null ? nYTMediaItem.a() : null, NYTMediaItem.ActiveView.INLINE);
        Long x0 = x0();
        if (x0 != null) {
            this.h.a(x0.longValue());
        }
    }

    @Override // com.nytimes.android.video.views.VideoMuteControl.a
    public void c() {
        NYTMediaItem d;
        if (M() == null || !this.e.k(this.k) || (d = this.e.d()) == null || !d.Q()) {
            return;
        }
        this.e.D();
    }

    public void e0(gk3 gk3Var) {
        super.q(gk3Var);
        CompositeDisposable compositeDisposable = this.j;
        Observable p = this.b.p();
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.video.presenter.InlineVideoPresenter$attachView$1
            {
                super(1);
            }

            public final void b(NYTMediaItem nYTMediaItem) {
                InlineVideoPresenter.this.u0();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((NYTMediaItem) obj);
                return ww8.a;
            }
        };
        Consumer consumer = new Consumer() { // from class: ik3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                InlineVideoPresenter.l0(ss2.this, obj);
            }
        };
        final InlineVideoPresenter$attachView$2 inlineVideoPresenter$attachView$2 = new ss2() { // from class: com.nytimes.android.video.presenter.InlineVideoPresenter$attachView$2
            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                zq3.e(th);
                NYTLogger.i(th, "Error listening to meta changes", new Object[0]);
            }
        };
        compositeDisposable.add(p.subscribe(consumer, new Consumer() { // from class: jk3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                InlineVideoPresenter.m0(ss2.this, obj);
            }
        }));
        CompositeDisposable compositeDisposable2 = this.j;
        Observable q = this.b.q();
        final ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.video.presenter.InlineVideoPresenter$attachView$3
            {
                super(1);
            }

            public final void b(PlaybackStateCompat playbackStateCompat) {
                InlineVideoPresenter inlineVideoPresenter = InlineVideoPresenter.this;
                zq3.e(playbackStateCompat);
                inlineVideoPresenter.v0(playbackStateCompat);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((PlaybackStateCompat) obj);
                return ww8.a;
            }
        };
        Consumer consumer2 = new Consumer() { // from class: kk3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                InlineVideoPresenter.n0(ss2.this, obj);
            }
        };
        final InlineVideoPresenter$attachView$4 inlineVideoPresenter$attachView$4 = new ss2() { // from class: com.nytimes.android.video.presenter.InlineVideoPresenter$attachView$4
            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                zq3.e(th);
                NYTLogger.i(th, "Error listening to playback changes", new Object[0]);
            }
        };
        compositeDisposable2.add(q.subscribe(consumer2, new Consumer() { // from class: lk3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                InlineVideoPresenter.q0(ss2.this, obj);
            }
        }));
    }

    public final void r0(NYTMediaItem nYTMediaItem) {
        this.k = nYTMediaItem;
    }

    public final NYTMediaItem s0() {
        return this.k;
    }

    public final void t0(NYTMediaItem nYTMediaItem) {
        zq3.h(nYTMediaItem, "mediaItem");
        this.i.e(nYTMediaItem);
    }

    public final boolean w0() {
        return x0() != null && this.f.u(z0());
    }

    public final Long x0() {
        NYTMediaItem nYTMediaItem = this.k;
        if (nYTMediaItem != null) {
            return nYTMediaItem.X();
        }
        return null;
    }

    public final String y0() {
        NYTMediaItem nYTMediaItem = this.k;
        if (nYTMediaItem != null) {
            return nYTMediaItem.i0();
        }
        return null;
    }

    public final String z0() {
        String u;
        NYTMediaItem nYTMediaItem = this.k;
        return (nYTMediaItem == null || (u = nYTMediaItem.u()) == null) ? "" : u;
    }
}
