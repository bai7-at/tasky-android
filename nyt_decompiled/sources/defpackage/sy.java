package defpackage;

import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.audio.AudioManager;
import com.nytimes.android.utils.AppPreferences;
import com.nytimes.android.view.mvp.BasePresenter;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;

/* loaded from: classes4.dex */
public class sy extends BasePresenter {
    private final AudioManager b;
    private final AppPreferences c;
    private final CompositeDisposable d = new CompositeDisposable();
    private int e;

    sy(AudioManager audioManager, AppPreferences appPreferences) {
        this.b = audioManager;
        this.c = appPreferences;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean b0(AudioManager.IndicatorViewState indicatorViewState) {
        return indicatorViewState == AudioManager.IndicatorViewState.ANIMATING || indicatorViewState == AudioManager.IndicatorViewState.VISIBLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0(AudioManager.IndicatorViewState indicatorViewState) {
        if (this.e >= 3 || this.b.e()) {
            return;
        }
        e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d0(Throwable th) {
        NYTLogger.i(th, "Error subscribing to indicator view state.", new Object[0]);
    }

    private void e0() {
        if (M() != null) {
            ((uy) M()).a();
        }
    }

    @Override // com.nytimes.android.view.mvp.BasePresenter
    public void L() {
        super.L();
        this.d.clear();
    }

    public void a0(uy uyVar) {
        super.q(uyVar);
        this.e = this.c.j("pref_has_seen_audio_onboarding_count", 0);
        this.d.add(this.b.t().filter(new Predicate() { // from class: py
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean b0;
                b0 = sy.b0((AudioManager.IndicatorViewState) obj);
                return b0;
            }
        }).subscribe(new Consumer() { // from class: qy
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                sy.this.c0((AudioManager.IndicatorViewState) obj);
            }
        }, new Consumer() { // from class: ry
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                sy.d0((Throwable) obj);
            }
        }));
    }

    public void l0() {
        int i = this.e + 1;
        this.e = i;
        this.c.b("pref_has_seen_audio_onboarding_count", i);
        this.b.s();
    }
}
