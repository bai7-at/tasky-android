package defpackage;

import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.audio.AudioManager;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.utils.ShareOrigin;
import com.nytimes.android.view.mvp.BasePresenter;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* loaded from: classes4.dex */
public class ww extends BasePresenter {
    private final AudioManager b;
    private final zh4 c;
    private final hb5 d;
    private final bo4 e;
    private final CompositeDisposable f = new CompositeDisposable();

    public ww(AudioManager audioManager, zh4 zh4Var, hb5 hb5Var, bo4 bo4Var) {
        this.b = audioManager;
        this.c = zh4Var;
        this.d = hb5Var;
        this.e = bo4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(NYTMediaItem nYTMediaItem) {
        e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c0(Throwable th) {
        NYTLogger.i(th, "Error listening to media metadata changes.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d0() {
        ro4 e = this.e.e();
        if (e != null) {
            l0(e.a());
        }
    }

    private void e0() {
        NYTMediaItem d = this.d.d();
        if (M() == null || d == null) {
            return;
        }
        if (d.U()) {
            this.e.d(new oz4() { // from class: vw
                @Override // defpackage.oz4
                public final void call() {
                    ww.this.d0();
                }
            });
        } else {
            l0(d);
        }
    }

    private void l0(NYTMediaItem nYTMediaItem) {
        ((xw) M()).P(new fy(nYTMediaItem.N(), nYTMediaItem.p(), null));
        ((xw) M()).I(new cx(ShareOrigin.AUDIO_CONTROLS, nYTMediaItem.p(), nYTMediaItem.g0(), null, nYTMediaItem.h0()));
    }

    @Override // com.nytimes.android.view.mvp.BasePresenter
    public void L() {
        super.L();
        this.f.clear();
    }

    public void a0(xw xwVar) {
        super.q(xwVar);
        this.f.add(this.c.p().subscribe(new Consumer() { // from class: tw
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ww.this.b0((NYTMediaItem) obj);
            }
        }, new Consumer() { // from class: uw
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ww.c0((Throwable) obj);
            }
        }));
    }
}
