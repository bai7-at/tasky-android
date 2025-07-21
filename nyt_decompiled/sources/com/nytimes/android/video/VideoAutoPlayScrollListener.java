package com.nytimes.android.video;

import android.app.Application;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.utils.DeviceUtils;
import com.nytimes.android.video.VideoAutoPlayScrollListener;
import com.nytimes.android.video.views.InlineVideoView;
import defpackage.cv;
import defpackage.g69;
import defpackage.h00;
import defpackage.hb5;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Timed;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class VideoAutoPlayScrollListener extends RecyclerView.t {
    public static final a Companion = new a(null);
    private final Application a;
    private final h00 b;
    private final hb5 c;
    private final RecentlyViewedManager d;
    private final g69 e;
    private final cv f;
    private boolean g;
    private final CompositeDisposable h;
    private boolean i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public VideoAutoPlayScrollListener(Application application, h00 h00Var, hb5 hb5Var, RecentlyViewedManager recentlyViewedManager, g69 g69Var, cv cvVar) {
        zq3.h(application, "application");
        zq3.h(h00Var, "autoPlayVideoWrapper");
        zq3.h(hb5Var, "mediaControl");
        zq3.h(recentlyViewedManager, "recentlyViewedManager");
        zq3.h(g69Var, "autoplayTracker");
        zq3.h(cvVar, "attachedInlineVideoViews");
        this.a = application;
        this.b = h00Var;
        this.c = hb5Var;
        this.d = recentlyViewedManager;
        this.e = g69Var;
        this.f = cvVar;
        this.g = DeviceUtils.A(application);
        this.h = new CompositeDisposable();
    }

    private final void h(boolean z) {
        Iterator it2 = this.f.c().iterator();
        while (it2.hasNext()) {
            i((InlineVideoView) it2.next(), z);
        }
    }

    private final void i(InlineVideoView inlineVideoView, boolean z) {
        NYTMediaItem O = inlineVideoView.O();
        NYTMediaItem d = this.c.d();
        boolean z2 = false;
        if ((d != null ? d.P() : false) && this.c.p()) {
            z2 = true;
        }
        if (!inlineVideoView.F() || O == null || !l(O) || z2 || this.e.b()) {
            j();
        } else if (k(inlineVideoView, z) < 0.5d || this.g) {
            m();
        } else {
            inlineVideoView.Z();
            j();
        }
    }

    private final double k(View view, boolean z) {
        Rect rect = new Rect();
        view.getLocalVisibleRect(rect);
        if (rect.top > 0 && z) {
            return 0.0d;
        }
        if (rect.bottom >= 0 || z) {
            return rect.height() / view.getMeasuredHeight();
        }
        return 0.0d;
    }

    private final boolean l(NYTMediaItem nYTMediaItem) {
        Long X = nYTMediaItem.X();
        if (X == null) {
            return false;
        }
        long longValue = X.longValue();
        if (this.i) {
            if (!nYTMediaItem.y()) {
                return false;
            }
            if (this.c.i(String.valueOf(longValue), nYTMediaItem.L())) {
                return this.c.n(String.valueOf(longValue), nYTMediaItem.L());
            }
        } else {
            if (this.c.i(String.valueOf(longValue), nYTMediaItem.L())) {
                return false;
            }
            if (nYTMediaItem.u() != null) {
                RecentlyViewedManager recentlyViewedManager = this.d;
                zq3.e(nYTMediaItem.u());
                return !recentlyViewedManager.u(r7);
            }
        }
        return true;
    }

    private final void m() {
        if (this.h.size() == 0) {
            CompositeDisposable compositeDisposable = this.h;
            Observable<Timed<Long>> timeInterval = Observable.interval(1500L, TimeUnit.MILLISECONDS).timeInterval();
            final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.video.VideoAutoPlayScrollListener$startMemoryListener$1
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(Timed timed) {
                    Application application;
                    zq3.h(timed, "it");
                    application = VideoAutoPlayScrollListener.this.a;
                    return Boolean.valueOf(DeviceUtils.A(application));
                }
            };
            Observable<R> map = timeInterval.map(new Function() { // from class: d69
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    Boolean n;
                    n = VideoAutoPlayScrollListener.n(ss2.this, obj);
                    return n;
                }
            });
            final ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.video.VideoAutoPlayScrollListener$startMemoryListener$2
                {
                    super(1);
                }

                public final void b(Boolean bool) {
                    VideoAutoPlayScrollListener videoAutoPlayScrollListener = VideoAutoPlayScrollListener.this;
                    zq3.e(bool);
                    videoAutoPlayScrollListener.g = bool.booleanValue();
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((Boolean) obj);
                    return ww8.a;
                }
            };
            Consumer consumer = new Consumer() { // from class: e69
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    VideoAutoPlayScrollListener.o(ss2.this, obj);
                }
            };
            final VideoAutoPlayScrollListener$startMemoryListener$3 videoAutoPlayScrollListener$startMemoryListener$3 = new ss2() { // from class: com.nytimes.android.video.VideoAutoPlayScrollListener$startMemoryListener$3
                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return ww8.a;
                }

                public final void invoke(Throwable th) {
                    zq3.e(th);
                    NYTLogger.h(th);
                }
            };
            compositeDisposable.add(map.subscribe(consumer, new Consumer() { // from class: f69
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    VideoAutoPlayScrollListener.p(ss2.this, obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean n(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (Boolean) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void b(RecyclerView recyclerView, int i, int i2) {
        zq3.h(recyclerView, "recyclerView");
        super.b(recyclerView, i, i2);
        if ((this.i || this.b.a()) && i2 != 0) {
            h(i2 > 0);
        }
    }

    public final void j() {
        if (this.h.size() != 0) {
            this.h.clear();
        }
    }
}
