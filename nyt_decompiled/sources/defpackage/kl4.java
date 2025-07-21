package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.common.seekbar.b;
import com.nytimes.android.utils.TimeDuration;
import com.nytimes.android.view.mvp.BasePresenter;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class kl4 extends BasePresenter {
    private final CompositeDisposable b = new CompositeDisposable();
    private final zh4 c;
    private final hb5 d;
    private final bo4 e;
    private boolean f;

    public kl4(zh4 zh4Var, hb5 hb5Var, bo4 bo4Var) {
        this.c = zh4Var;
        this.d = hb5Var;
        this.e = bo4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(NYTMediaItem nYTMediaItem) {
        if (M() == null) {
            return;
        }
        if (this.f && nYTMediaItem.i() == null) {
            this.e.d(new oz4() { // from class: jl4
                @Override // defpackage.oz4
                public final void call() {
                    kl4.this.m0();
                }
            });
        } else if (this.d.m() || nYTMediaItem.R()) {
            ((b) M()).c();
        } else {
            ((b) M()).a();
            t0(nYTMediaItem.q());
        }
    }

    private void l0() {
        if (this.d.f() == null || M() == null) {
            return;
        }
        ((b) M()).t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0() {
        ro4 e = this.e.e();
        if (e != null) {
            ((b) M()).a();
            t0(e.a().q());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(PlaybackStateCompat playbackStateCompat) {
        l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q0(Throwable th) {
        NYTLogger.i(th, "Error listening to exo events.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r0(Throwable th) {
        NYTLogger.i(th, "Error listening to metadata changes", new Object[0]);
    }

    private void s0() {
        this.b.add(this.c.q().subscribe(new Consumer() { // from class: fl4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                kl4.this.n0((PlaybackStateCompat) obj);
            }
        }, new Consumer() { // from class: gl4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                kl4.q0((Throwable) obj);
            }
        }));
        this.b.add(this.c.p().subscribe(new Consumer() { // from class: hl4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                kl4.this.d0((NYTMediaItem) obj);
            }
        }, new Consumer() { // from class: il4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                kl4.r0((Throwable) obj);
            }
        }));
    }

    private void t0(long j) {
        if (M() == null || j == 0) {
            return;
        }
        ((b) M()).setMaxSeekBarDuration(new TimeDuration(j, TimeUnit.MILLISECONDS));
    }

    @Override // com.nytimes.android.view.mvp.BasePresenter
    public void L() {
        super.L();
        this.b.clear();
    }

    public void c0(b bVar) {
        super.q(bVar);
        s0();
    }

    public void e0(boolean z) {
        this.f = z;
    }
}
