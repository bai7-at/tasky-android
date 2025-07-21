package com.nytimes.android.media.audio.presenter;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.fragment.app.FragmentManager;
import com.nytimes.android.analytics.event.audio.AudioReferralSource;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.audio.AudioManager;
import com.nytimes.android.media.audio.presenter.AudioIndicatorPresenter;
import com.nytimes.android.media.audio.views.AudioDrawerDialogFragment;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import com.nytimes.android.view.mvp.BasePresenter;
import defpackage.bo4;
import defpackage.dy;
import defpackage.gj3;
import defpackage.hb5;
import defpackage.nl6;
import defpackage.oz4;
import defpackage.ro4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zh4;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.BehaviorSubject;

/* loaded from: classes4.dex */
public final class AudioIndicatorPresenter extends BasePresenter {
    private final FragmentManager b;
    private final zh4 c;
    private final AudioManager d;
    private final hb5 e;
    private final bo4 f;
    private final SnackbarUtil g;
    private final NetworkStatus h;
    private final CompositeDisposable i;
    private BehaviorSubject j;
    private NYTMediaItem k;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AudioManager.IndicatorViewState.values().length];
            try {
                iArr[AudioManager.IndicatorViewState.ANIMATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioManager.IndicatorViewState.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public AudioIndicatorPresenter(FragmentManager fragmentManager, zh4 zh4Var, AudioManager audioManager, hb5 hb5Var, bo4 bo4Var, SnackbarUtil snackbarUtil, NetworkStatus networkStatus) {
        zq3.h(zh4Var, "mediaEvents");
        zq3.h(audioManager, "audioManager");
        zq3.h(hb5Var, "mediaController");
        zq3.h(bo4Var, "mediaServiceConnection");
        zq3.h(snackbarUtil, "snackbarUtil");
        zq3.h(networkStatus, "networkStatus");
        this.b = fragmentManager;
        this.c = zh4Var;
        this.d = audioManager;
        this.e = hb5Var;
        this.f = bo4Var;
        this.g = snackbarUtil;
        this.h = networkStatus;
        this.i = new CompositeDisposable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F0(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H0(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I0(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J0(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return ((Boolean) ss2Var.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K0(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L0(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M0(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0(gj3 gj3Var) {
        if (!gj3Var.b()) {
            dy dyVar = (dy) M();
            if (dyVar != null) {
                dyVar.O0();
                return;
            }
            return;
        }
        dy dyVar2 = (dy) M();
        if (dyVar2 != null) {
            String a2 = gj3Var.a();
            if (a2 == null) {
                a2 = "";
            }
            dyVar2.V(a2);
        }
    }

    private final boolean P0(int i) {
        return i == 2 || i == 1 || i == 7 || i == 0;
    }

    private final void U0() {
        if (this.h.g()) {
            SnackbarUtil.y(this.g, nl6.audio_error_playback, 0, 2, null);
        } else {
            SnackbarUtil.y(this.g, nl6.audio_error_connection_lost, 0, 2, null);
        }
    }

    private final void V0(int i) {
        dy dyVar;
        if (i == 3) {
            dy dyVar2 = (dy) M();
            if (dyVar2 != null) {
                dyVar2.H();
            }
            dy dyVar3 = (dy) M();
            if (dyVar3 != null) {
                dyVar3.L(this.d.d());
            }
        } else if (P0(i)) {
            dy dyVar4 = (dy) M();
            if (dyVar4 != null) {
                dyVar4.D();
            }
            dy dyVar5 = (dy) M();
            if (dyVar5 != null) {
                dyVar5.L(this.d.d());
            }
        }
        if (this.d.c() != AudioManager.DrawerState.CLOSED || (dyVar = (dy) M()) == null) {
            return;
        }
        dyVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W0() {
        if (M() != null) {
            BehaviorSubject behaviorSubject = this.j;
            BehaviorSubject behaviorSubject2 = null;
            if (behaviorSubject == null) {
                zq3.z("drawerExpandedSubject");
                behaviorSubject = null;
            }
            if (behaviorSubject.hasValue()) {
                BehaviorSubject behaviorSubject3 = this.j;
                if (behaviorSubject3 == null) {
                    zq3.z("drawerExpandedSubject");
                } else {
                    behaviorSubject2 = behaviorSubject3;
                }
                behaviorSubject2.onNext(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X0(PlaybackStateCompat playbackStateCompat) {
        if (!this.e.q()) {
            dy dyVar = (dy) M();
            if (dyVar != null) {
                dyVar.D();
                return;
            }
            return;
        }
        if (playbackStateCompat.h() == 7) {
            U0();
            return;
        }
        if (this.d.a() == AudioManager.IndicatorViewState.HIDDEN) {
            dy dyVar2 = (dy) M();
            if (dyVar2 != null) {
                dyVar2.c();
                return;
            }
            return;
        }
        if (this.d.a() == AudioManager.IndicatorViewState.ANIMATING) {
            y0(playbackStateCompat.h());
        } else if (this.d.a() == AudioManager.IndicatorViewState.VISIBLE) {
            V0(playbackStateCompat.h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y0(final AudioManager.IndicatorViewState indicatorViewState) {
        if (indicatorViewState == AudioManager.IndicatorViewState.IDLE) {
            dy dyVar = (dy) M();
            if (dyVar != null) {
                dyVar.D();
            }
            dy dyVar2 = (dy) M();
            if (dyVar2 != null) {
                dyVar2.c();
                return;
            }
            return;
        }
        if (indicatorViewState == AudioManager.IndicatorViewState.HIDDEN) {
            dy dyVar3 = (dy) M();
            if (dyVar3 != null) {
                dyVar3.c();
                return;
            }
            return;
        }
        Integer g = this.e.g();
        if (g == null) {
            this.f.d(new oz4() { // from class: sx
                @Override // defpackage.oz4
                public final void call() {
                    AudioIndicatorPresenter.a1(AudioIndicatorPresenter.this, indicatorViewState);
                }
            });
        } else {
            Z0(indicatorViewState, g.intValue());
        }
    }

    private final void Z0(AudioManager.IndicatorViewState indicatorViewState, int i) {
        int i2 = a.a[indicatorViewState.ordinal()];
        if (i2 == 1) {
            y0(i);
        } else {
            if (i2 != 2) {
                return;
            }
            V0(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a1(AudioIndicatorPresenter audioIndicatorPresenter, AudioManager.IndicatorViewState indicatorViewState) {
        zq3.h(audioIndicatorPresenter, "this$0");
        zq3.h(indicatorViewState, "$audioState");
        ro4 e = audioIndicatorPresenter.f.e();
        if (e != null) {
            audioIndicatorPresenter.Z0(indicatorViewState, e.b().h());
        }
    }

    private final void y0(int i) {
        if (i == 3) {
            dy dyVar = (dy) M();
            if (dyVar != null) {
                dyVar.H();
            }
            dy dyVar2 = (dy) M();
            if (dyVar2 != null) {
                dyVar2.a0();
            }
            dy dyVar3 = (dy) M();
            if (dyVar3 != null) {
                dyVar3.L(0L);
                return;
            }
            return;
        }
        if (P0(i)) {
            dy dyVar4 = (dy) M();
            if (dyVar4 != null) {
                dyVar4.D();
            }
            dy dyVar5 = (dy) M();
            if (dyVar5 != null) {
                dyVar5.a0();
            }
            dy dyVar6 = (dy) M();
            if (dyVar6 != null) {
                dyVar6.L(0L);
            }
        }
    }

    @Override // com.nytimes.android.view.mvp.BasePresenter
    public void L() {
        super.L();
        BehaviorSubject behaviorSubject = this.j;
        if (behaviorSubject == null) {
            zq3.z("drawerExpandedSubject");
            behaviorSubject = null;
        }
        behaviorSubject.onComplete();
        this.i.clear();
    }

    public final Observable O0() {
        BehaviorSubject behaviorSubject = this.j;
        if (behaviorSubject == null) {
            zq3.z("drawerExpandedSubject");
            behaviorSubject = null;
        }
        Observable<T> hide = behaviorSubject.hide();
        zq3.g(hide, "hide(...)");
        return hide;
    }

    public final void Q0(long j) {
        this.d.k(j);
    }

    public final void R0() {
        if (M() != null) {
            this.d.k(0L);
            BehaviorSubject behaviorSubject = this.j;
            if (behaviorSubject == null) {
                zq3.z("drawerExpandedSubject");
                behaviorSubject = null;
            }
            behaviorSubject.onNext(Boolean.TRUE);
        }
    }

    public final void S0() {
        FragmentManager fragmentManager = this.b;
        if (fragmentManager != null) {
            AudioDrawerDialogFragment.x1(fragmentManager, AudioReferralSource.INDICATOR);
            this.d.i();
        }
    }

    public final void T0() {
        this.d.j();
        this.d.k(0L);
        this.e.b();
        this.f.i();
    }

    public void z0(dy dyVar) {
        super.q(dyVar);
        FragmentManager fragmentManager = this.b;
        BehaviorSubject createDefault = BehaviorSubject.createDefault(Boolean.valueOf((fragmentManager != null ? fragmentManager.k0("AUDIO_DRAWER") : null) != null));
        zq3.g(createDefault, "createDefault(...)");
        this.j = createDefault;
        this.k = this.e.d();
        CompositeDisposable compositeDisposable = this.i;
        Observable q = this.c.q();
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.media.audio.presenter.AudioIndicatorPresenter$attachView$1
            {
                super(1);
            }

            public final void b(PlaybackStateCompat playbackStateCompat) {
                AudioManager audioManager;
                audioManager = AudioIndicatorPresenter.this.d;
                audioManager.o(playbackStateCompat);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((PlaybackStateCompat) obj);
                return ww8.a;
            }
        };
        Consumer consumer = new Consumer() { // from class: ox
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AudioIndicatorPresenter.A0(ss2.this, obj);
            }
        };
        final AudioIndicatorPresenter$attachView$2 audioIndicatorPresenter$attachView$2 = new ss2() { // from class: com.nytimes.android.media.audio.presenter.AudioIndicatorPresenter$attachView$2
            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                zq3.e(th);
                NYTLogger.i(th, "Error listening to media events", new Object[0]);
            }
        };
        compositeDisposable.add(q.subscribe(consumer, new Consumer() { // from class: wx
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AudioIndicatorPresenter.B0(ss2.this, obj);
            }
        }));
        CompositeDisposable compositeDisposable2 = this.i;
        Observable p = this.c.p();
        final ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.media.audio.presenter.AudioIndicatorPresenter$attachView$3
            {
                super(1);
            }

            public final void b(NYTMediaItem nYTMediaItem) {
                AudioManager audioManager;
                audioManager = AudioIndicatorPresenter.this.d;
                audioManager.n(nYTMediaItem);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((NYTMediaItem) obj);
                return ww8.a;
            }
        };
        Consumer consumer2 = new Consumer() { // from class: xx
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AudioIndicatorPresenter.F0(ss2.this, obj);
            }
        };
        final AudioIndicatorPresenter$attachView$4 audioIndicatorPresenter$attachView$4 = new ss2() { // from class: com.nytimes.android.media.audio.presenter.AudioIndicatorPresenter$attachView$4
            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                zq3.e(th);
                NYTLogger.i(th, "Error listening to metadata changed events", new Object[0]);
            }
        };
        compositeDisposable2.add(p.subscribe(consumer2, new Consumer() { // from class: yx
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AudioIndicatorPresenter.G0(ss2.this, obj);
            }
        }));
        CompositeDisposable compositeDisposable3 = this.i;
        Observable distinctUntilChanged = this.d.f().distinctUntilChanged();
        final ss2 ss2Var3 = new ss2() { // from class: com.nytimes.android.media.audio.presenter.AudioIndicatorPresenter$attachView$5
            {
                super(1);
            }

            public final void b(gj3 gj3Var) {
                zq3.h(gj3Var, "imageUrl");
                AudioIndicatorPresenter.this.N0(gj3Var);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((gj3) obj);
                return ww8.a;
            }
        };
        Consumer consumer3 = new Consumer() { // from class: zx
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AudioIndicatorPresenter.H0(ss2.this, obj);
            }
        };
        final AudioIndicatorPresenter$attachView$6 audioIndicatorPresenter$attachView$6 = new ss2() { // from class: com.nytimes.android.media.audio.presenter.AudioIndicatorPresenter$attachView$6
            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                zq3.e(th);
                NYTLogger.i(th, "Error binding image.", new Object[0]);
            }
        };
        compositeDisposable3.add(distinctUntilChanged.subscribe(consumer3, new Consumer() { // from class: ay
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AudioIndicatorPresenter.I0(ss2.this, obj);
            }
        }));
        CompositeDisposable compositeDisposable4 = this.i;
        Observable distinctUntilChanged2 = this.d.b().distinctUntilChanged();
        final AudioIndicatorPresenter$attachView$7 audioIndicatorPresenter$attachView$7 = new ss2() { // from class: com.nytimes.android.media.audio.presenter.AudioIndicatorPresenter$attachView$7
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(AudioManager.DrawerState drawerState) {
                zq3.h(drawerState, "drawerState");
                return Boolean.valueOf(drawerState == AudioManager.DrawerState.CLOSED);
            }
        };
        Observable filter = distinctUntilChanged2.filter(new Predicate() { // from class: cy
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                boolean J0;
                J0 = AudioIndicatorPresenter.J0(ss2.this, obj);
                return J0;
            }
        });
        final ss2 ss2Var4 = new ss2() { // from class: com.nytimes.android.media.audio.presenter.AudioIndicatorPresenter$attachView$8
            {
                super(1);
            }

            public final void b(AudioManager.DrawerState drawerState) {
                AudioIndicatorPresenter.this.W0();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((AudioManager.DrawerState) obj);
                return ww8.a;
            }
        };
        Consumer consumer4 = new Consumer() { // from class: px
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AudioIndicatorPresenter.K0(ss2.this, obj);
            }
        };
        final AudioIndicatorPresenter$attachView$9 audioIndicatorPresenter$attachView$9 = new ss2() { // from class: com.nytimes.android.media.audio.presenter.AudioIndicatorPresenter$attachView$9
            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                zq3.e(th);
                NYTLogger.i(th, "Error updating drawer state.", new Object[0]);
            }
        };
        compositeDisposable4.add(filter.subscribe(consumer4, new Consumer() { // from class: qx
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AudioIndicatorPresenter.L0(ss2.this, obj);
            }
        }));
        CompositeDisposable compositeDisposable5 = this.i;
        Observable t = this.d.t();
        final ss2 ss2Var5 = new ss2() { // from class: com.nytimes.android.media.audio.presenter.AudioIndicatorPresenter$attachView$10
            {
                super(1);
            }

            public final void b(AudioManager.IndicatorViewState indicatorViewState) {
                zq3.h(indicatorViewState, "audioState");
                AudioIndicatorPresenter.this.Y0(indicatorViewState);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((AudioManager.IndicatorViewState) obj);
                return ww8.a;
            }
        };
        Consumer consumer5 = new Consumer() { // from class: rx
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AudioIndicatorPresenter.M0(ss2.this, obj);
            }
        };
        final AudioIndicatorPresenter$attachView$11 audioIndicatorPresenter$attachView$11 = new ss2() { // from class: com.nytimes.android.media.audio.presenter.AudioIndicatorPresenter$attachView$11
            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                zq3.e(th);
                NYTLogger.i(th, "Error updating view state.", new Object[0]);
            }
        };
        compositeDisposable5.add(t.subscribe(consumer5, new Consumer() { // from class: tx
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AudioIndicatorPresenter.C0(ss2.this, obj);
            }
        }));
        CompositeDisposable compositeDisposable6 = this.i;
        Observable p2 = this.d.p();
        final ss2 ss2Var6 = new ss2() { // from class: com.nytimes.android.media.audio.presenter.AudioIndicatorPresenter$attachView$12
            {
                super(1);
            }

            public final void b(PlaybackStateCompat playbackStateCompat) {
                zq3.h(playbackStateCompat, "playbackState");
                AudioIndicatorPresenter.this.X0(playbackStateCompat);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((PlaybackStateCompat) obj);
                return ww8.a;
            }
        };
        Consumer consumer6 = new Consumer() { // from class: ux
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AudioIndicatorPresenter.D0(ss2.this, obj);
            }
        };
        final AudioIndicatorPresenter$attachView$13 audioIndicatorPresenter$attachView$13 = new ss2() { // from class: com.nytimes.android.media.audio.presenter.AudioIndicatorPresenter$attachView$13
            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                zq3.e(th);
                NYTLogger.i(th, "Error updating playback state.", new Object[0]);
            }
        };
        compositeDisposable6.add(p2.subscribe(consumer6, new Consumer() { // from class: vx
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AudioIndicatorPresenter.E0(ss2.this, obj);
            }
        }));
    }
}
