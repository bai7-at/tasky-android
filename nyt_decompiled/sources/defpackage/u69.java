package defpackage;

import android.app.Activity;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.player.VideoAdEvents;
import com.nytimes.android.video.FullscreenToolsController;
import com.nytimes.android.view.mvp.BasePresenter;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* loaded from: classes4.dex */
public class u69 extends BasePresenter {
    private final Activity b;
    private final zh4 c;
    private final VideoAdEvents d;
    private final hb5 e;
    private final FullscreenToolsController f;
    private final CompositeDisposable g = new CompositeDisposable();

    public u69(Activity activity, zh4 zh4Var, VideoAdEvents videoAdEvents, hb5 hb5Var, FullscreenToolsController fullscreenToolsController) {
        this.b = activity;
        this.c = zh4Var;
        this.d = videoAdEvents;
        this.e = hb5Var;
        this.f = fullscreenToolsController;
    }

    private void B0() {
        this.g.add(this.d.b().subscribe(new Consumer() { // from class: m69
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                u69.this.v0((VideoAdEvents.TappedEvent) obj);
            }
        }, new Consumer() { // from class: n69
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                u69.w0((Throwable) obj);
            }
        }));
    }

    private void C0() {
        this.g.add(this.c.q().subscribe(new Consumer() { // from class: q69
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                u69.this.r0((PlaybackStateCompat) obj);
            }
        }, new Consumer() { // from class: r69
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                u69.x0((Throwable) obj);
            }
        }));
        this.g.add(this.c.p().subscribe(new Consumer() { // from class: s69
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                u69.this.q0((NYTMediaItem) obj);
            }
        }, new Consumer() { // from class: t69
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                u69.y0((Throwable) obj);
            }
        }));
    }

    private void D0() {
        if (M() == null) {
            return;
        }
        ((k69) M()).setPlayPauseAction(new oz4() { // from class: l69
            @Override // defpackage.oz4
            public final void call() {
                u69.this.z0();
            }
        });
    }

    private void E0() {
        if (M() == null) {
            return;
        }
        PlaybackStateCompat f = this.e.f();
        if (f == null || f.h() != 3) {
            ((k69) M()).f();
        } else {
            ((k69) M()).d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(NYTMediaItem nYTMediaItem) {
        if (M() == null) {
            return;
        }
        if (nYTMediaItem.R()) {
            ((k69) M()).E();
        } else {
            ((k69) M()).A0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(PlaybackStateCompat playbackStateCompat) {
        if (M() == null) {
            return;
        }
        if (playbackStateCompat.h() == 3) {
            ((k69) M()).d();
            ((k69) M()).g();
            return;
        }
        if (playbackStateCompat.h() == 2 || playbackStateCompat.h() == 1 || playbackStateCompat.h() == 0) {
            ((k69) M()).f();
            ((k69) M()).g();
        } else if (playbackStateCompat.h() == 6) {
            ((k69) M()).e();
        } else if (playbackStateCompat.h() == 7) {
            ((k69) M()).g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(FullscreenToolsController.SyncAction syncAction) {
        if (M() != null) {
            if (syncAction == FullscreenToolsController.SyncAction.SHOW) {
                ((k69) M()).w();
            } else {
                ((k69) M()).e0();
            }
        }
    }

    private void t0() {
        this.f.a(FullscreenToolsController.SyncAction.SHOW);
        if (M() == null) {
            return;
        }
        ((k69) M()).x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u0(Throwable th) {
        NYTLogger.i(th, "Error listening to fullscreen events.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(VideoAdEvents.TappedEvent tappedEvent) {
        t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w0(Throwable th) {
        NYTLogger.i(th, "Error listening to video ad tap events", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x0(Throwable th) {
        NYTLogger.i(th, "Error listening to exo events: ", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y0(Throwable th) {
        NYTLogger.i(th, "Error listening to meta change events: ", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0() {
        MediaControllerCompat b;
        if (((k69) M()).M() || (b = MediaControllerCompat.b(this.b)) == null) {
            return;
        }
        if (b.d().h() == 3) {
            ((k69) M()).f();
            b.g().b();
        } else {
            ((k69) M()).d();
            b.g().c();
        }
    }

    public void A0() {
        this.g.add(this.f.c().subscribe(new Consumer() { // from class: o69
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                u69.this.s0((FullscreenToolsController.SyncAction) obj);
            }
        }, new Consumer() { // from class: p69
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                u69.u0((Throwable) obj);
            }
        }));
    }

    @Override // com.nytimes.android.view.mvp.BasePresenter
    public void L() {
        super.L();
        this.g.clear();
    }

    public void m0(k69 k69Var) {
        super.q(k69Var);
        E0();
        C0();
        D0();
        B0();
    }

    public void n0() {
        this.f.a(FullscreenToolsController.SyncAction.HIDE);
    }
}
