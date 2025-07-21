package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.view.mvp.BasePresenter;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* loaded from: classes4.dex */
public class fw extends BasePresenter {
    private final zh4 b;
    private final hb5 c;
    private final CompositeDisposable d = new CompositeDisposable();

    public fw(zh4 zh4Var, hb5 hb5Var) {
        this.b = zh4Var;
        this.c = hb5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(PlaybackStateCompat playbackStateCompat) {
        NYTMediaItem d;
        if (M() == null || (d = this.c.d()) == null || d.i() == null) {
            return;
        }
        if (playbackStateCompat.h() == 3) {
            ((cw) M()).d();
        } else if (playbackStateCompat.h() == 2 || playbackStateCompat.h() == 1 || playbackStateCompat.h() == 0) {
            ((cw) M()).f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b0(Throwable th) {
        NYTLogger.g("Error listening to media events", new Object[0]);
    }

    private void c0() {
        this.d.add(this.b.q().subscribe(new Consumer() { // from class: dw
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                fw.this.a0((PlaybackStateCompat) obj);
            }
        }, new Consumer() { // from class: ew
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                fw.b0((Throwable) obj);
            }
        }));
    }

    private void d0() {
        NYTMediaItem d = this.c.d();
        if (M() == null || d == null) {
            return;
        }
        if (d.i() == null) {
            ((cw) M()).f();
            return;
        }
        PlaybackStateCompat f = this.c.f();
        if (f == null || f.h() != 3) {
            ((cw) M()).f();
        } else {
            ((cw) M()).d();
        }
    }

    @Override // com.nytimes.android.view.mvp.BasePresenter
    public void L() {
        super.L();
        this.d.clear();
    }

    public void V(cw cwVar) {
        super.q(cwVar);
        d0();
        c0();
    }
}
