package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.nytimes.android.analytics.event.audio.AudioReferralSource;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.audio.AudioManager;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.player.PlaybackCustomAction;
import com.nytimes.android.media.util.MediaDurationFormatter;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.TimeDuration;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import com.nytimes.android.view.mvp.BasePresenter;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class ao7 extends BasePresenter {
    private final zh4 c;
    private final AudioManager d;
    private final hb5 e;
    private final bo4 f;
    private final ax g;
    private final SnackbarUtil h;
    private final NetworkStatus i;
    private final MediaDurationFormatter j;
    private NYTMediaItem b = null;
    private final CompositeDisposable l = new CompositeDisposable();
    private boolean m = false;
    private final AudioReferralSource k = AudioReferralSource.SF_CARD;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AudioManager.IndicatorViewState.values().length];
            a = iArr;
            try {
                iArr[AudioManager.IndicatorViewState.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AudioManager.IndicatorViewState.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AudioManager.IndicatorViewState.ANIMATING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    ao7(zh4 zh4Var, AudioManager audioManager, hb5 hb5Var, bo4 bo4Var, ax axVar, SnackbarUtil snackbarUtil, MediaDurationFormatter mediaDurationFormatter, NetworkStatus networkStatus) {
        this.c = zh4Var;
        this.d = audioManager;
        this.e = hb5Var;
        this.f = bo4Var;
        this.g = axVar;
        this.h = snackbarUtil;
        this.j = mediaDurationFormatter;
        this.i = networkStatus;
    }

    private void A0() {
        co7 co7Var = (co7) M();
        if (co7Var == null) {
            return;
        }
        co7Var.y0(this.j.stringForTime(new TimeDuration(this.e.d().V().longValue(), TimeUnit.SECONDS)));
    }

    private void B0(int i) {
        if (this.d.a() == AudioManager.IndicatorViewState.HIDDEN) {
            C0(i);
        } else {
            z0(i);
        }
    }

    private void C0(int i) {
        if (M() == null) {
            return;
        }
        if (i == 3) {
            ((co7) M()).i();
        } else if (i == 2) {
            ((co7) M()).H0();
        } else if (i == 6) {
            ((co7) M()).k0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0(AudioManager.IndicatorViewState indicatorViewState) {
        if (M() != null && !this.m && (indicatorViewState == AudioManager.IndicatorViewState.IDLE || !this.e.h(this.b))) {
            ((co7) M()).B0();
            return;
        }
        Integer g = this.e.g();
        if (g != null) {
            int intValue = g.intValue();
            int i = a.a[indicatorViewState.ordinal()];
            if (i == 1) {
                C0(intValue);
            } else if (i == 2 || i == 3) {
                z0(intValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(NYTMediaItem nYTMediaItem) {
        if (M() == null || !this.e.h(this.b)) {
            return;
        }
        long q = nYTMediaItem.q();
        if (q != 0) {
            ((co7) M()).y0(this.j.stringForTime(new TimeDuration(q, TimeUnit.MILLISECONDS)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(PlaybackStateCompat playbackStateCompat) {
        int h = playbackStateCompat.h();
        if (h == 3 || h == 7) {
            this.m = false;
        }
        if (this.m || this.e.h(this.b)) {
            B0(h);
        } else {
            this.f.d(new oz4() { // from class: zn7
                @Override // defpackage.oz4
                public final void call() {
                    ao7.this.t0();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r0(Throwable th) {
        NYTLogger.i(th, "Error listening to media events", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s0(Throwable th) {
        NYTLogger.i(th, "Error listening to meta changes", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0() {
        ro4 e = this.f.e();
        if (e != null && q0(e.a())) {
            B0(2);
        } else if (M() != null) {
            ((co7) M()).B0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0() {
        NYTMediaItem d = this.e.d();
        ro4 e = this.f.e();
        if (d == null || !d.U() || e == null || !q0(e.a())) {
            x0();
        } else {
            this.e.z(PlaybackCustomAction.PLAY_AUDIO.name());
        }
    }

    private void x0() {
        if (!this.i.g()) {
            this.h.t(nl6.audio_error_offline);
            this.m = false;
            return;
        }
        NYTMediaItem nYTMediaItem = this.b;
        if (nYTMediaItem == null) {
            this.h.t(nl6.audio_error_playback);
            this.m = false;
        } else {
            this.f.h(nYTMediaItem, qo4.a(), null);
            this.d.m();
            this.g.a(this.b, this.k);
        }
    }

    private void y0() {
        Integer g = this.e.g();
        if (g != null) {
            if (g.intValue() == 3) {
                this.e.z(PlaybackCustomAction.PAUSE_AUDIO.name());
            } else {
                this.e.z(PlaybackCustomAction.PLAY_AUDIO.name());
            }
        }
    }

    private void z0(int i) {
        if (M() == null) {
            return;
        }
        if (i == 3) {
            ((co7) M()).u();
        } else if (i == 2) {
            ((co7) M()).h();
        }
    }

    @Override // com.nytimes.android.view.mvp.BasePresenter
    public void L() {
        super.L();
        this.d.g();
        this.l.clear();
    }

    public void e0(co7 co7Var) {
        super.q(co7Var);
        this.l.add(this.d.t().subscribe(new Consumer() { // from class: un7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ao7.this.D0((AudioManager.IndicatorViewState) obj);
            }
        }, new g05(ao7.class)));
        this.l.add(this.c.q().subscribe(new Consumer() { // from class: vn7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ao7.this.n0((PlaybackStateCompat) obj);
            }
        }, new Consumer() { // from class: wn7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ao7.r0((Throwable) obj);
            }
        }));
        this.l.add(this.c.p().subscribe(new Consumer() { // from class: xn7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ao7.this.m0((NYTMediaItem) obj);
            }
        }, new Consumer() { // from class: yn7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ao7.s0((Throwable) obj);
            }
        }));
    }

    public void l0(NYTMediaItem nYTMediaItem) {
        this.b = nYTMediaItem;
    }

    public boolean q0(NYTMediaItem nYTMediaItem) {
        NYTMediaItem nYTMediaItem2 = this.b;
        return nYTMediaItem2 != null && nYTMediaItem2.a().equals(nYTMediaItem.a());
    }

    public void v0() {
        if (this.e.h(this.b)) {
            y0();
            A0();
        } else {
            if (M() != null) {
                this.m = true;
                ((co7) M()).k0();
            }
            this.f.d(new oz4() { // from class: tn7
                @Override // defpackage.oz4
                public final void call() {
                    ao7.this.u0();
                }
            });
        }
    }

    public void w0() {
        this.d.g();
    }
}
