package defpackage;

import android.os.SystemClock;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.performancetracker.lib.PerformanceTracker;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEvent;
import com.nytimes.android.performancetrackerclientphoenix.event.base.AppEventFactory;
import com.nytimes.android.performancetrackerclientphoenix.event.base.BasePerformanceTracker;
import com.nytimes.android.performancetrackerclientphoenix.utils.AppLaunchHomeConstants;
import defpackage.y41;
import io.embrace.android.embracesdk.Embrace;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.t;
import kotlinx.coroutines.CoroutineScope;
import org.threeten.bp.Duration;

/* loaded from: classes4.dex */
public final class lm extends BasePerformanceTracker {
    private long d;
    private PerformanceTracker.b e;
    private boolean f;
    private final Map g;
    private boolean h;
    private boolean i;
    private uy8 j;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AppLaunchHomeConstants.values().length];
            try {
                iArr[AppLaunchHomeConstants.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppLaunchHomeConstants.ONE_WEBVIEW_HOME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppLaunchHomeConstants.XPN_HOME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AppLaunchHomeConstants.ARTICLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public static final class b implements uy8 {
        b() {
        }

        @Override // defpackage.uy8
        public long a() {
            return SystemClock.uptimeMillis();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lm(cr5 cr5Var, AppEventFactory appEventFactory, CoroutineScope coroutineScope) {
        super(cr5Var, appEventFactory, coroutineScope);
        zq3.h(cr5Var, "performanceTracker");
        zq3.h(appEventFactory, "appEventFactory");
        zq3.h(coroutineScope, "scope");
        this.g = new LinkedHashMap();
        this.h = true;
        this.j = new b();
    }

    private final Duration m() {
        return Duration.ofMillis(this.j.a());
    }

    public final void l() {
        if (this.e != null) {
            NYTLogger.d("Clearing launch token without triggering end event", new Object[0]);
            this.f = true;
            this.e = null;
            this.g.clear();
            this.h = false;
        }
    }

    public final void n(String str) {
        zq3.h(str, "spanName");
        y41 y41Var = (y41) this.g.get(str);
        if (y41Var == null || !(y41Var instanceof y41.c)) {
            return;
        }
        Map map = this.g;
        Duration m = m();
        zq3.g(m, "currentTimestamp(...)");
        map.put(str, ((y41.c) y41Var).a(m));
        Embrace.getInstance().endMoment(str);
    }

    public final void o(String str) {
        zq3.h(str, "feedId");
        this.e = g(new AppEvent.AppLaunchPerformanceEvent.TimeToInteractive(str));
    }

    public final void p(AppLaunchHomeConstants appLaunchHomeConstants) {
        zq3.h(appLaunchHomeConstants, "constant");
        PerformanceTracker.b bVar = this.e;
        if (bVar != null) {
            Duration m = m();
            PerformanceTracker.b bVar2 = this.e;
            long millis = m.minus(Duration.ofMillis(bVar2 != null ? kotlin.time.b.s(bVar2.b()) : 0L)).toMillis();
            BasePerformanceTracker.j(this, bVar, null, 2, null);
            Map map = this.g;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() instanceof y41.b) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(t.e(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                zq3.f(value, "null cannot be cast to non-null type com.nytimes.android.performancetrackerclientphoenix.event.CustomSpan.Complete");
                linkedHashMap2.put(key, Long.valueOf(((y41.b) value).a()));
            }
            int i = a.a[appLaunchHomeConstants.ordinal()];
            if (i == 1) {
                k(new AppEvent.AppLaunchPerformanceEvent.ApplicationOnCreate(this.d + millis, this.h, this.i, linkedHashMap2));
            } else if (i == 2) {
                k(new AppEvent.AppLaunchOneWebviewPerformanceEvent.ApplicationOnCreate(this.d + millis, this.h, this.i, linkedHashMap2));
            } else if (i == 3) {
                k(new AppEvent.AppLaunchXpnPerformanceEvent.ApplicationOnCreate(this.d + millis, this.h, this.i, linkedHashMap2));
            } else if (i == 4) {
                k(new AppEvent.AppLaunchArticlePerformanceEvent.ApplicationOnCreate(this.d + millis, this.h, this.i, linkedHashMap2));
            }
        }
        this.f = false;
        this.e = null;
        this.h = false;
    }

    public final void q(boolean z) {
        this.i = z;
    }

    public final void r() {
        if (this.e == null && this.f) {
            NYTLogger.d("Recreating launch token", new Object[0]);
            this.e = g(new AppEvent.AppLaunchPerformanceEvent.TimeToInteractive("App Launch"));
            this.f = false;
        }
    }

    public final void s(String str) {
        zq3.h(str, "spanName");
        Map map = this.g;
        Duration m = m();
        zq3.g(m, "currentTimestamp(...)");
        map.put(str, new y41.c(m));
        Embrace.getInstance().startMoment(str);
    }

    public final void t(long j) {
        k(new AppEvent.DaggerPerformanceEvent.ApplicationOnCreate(j));
        Map map = this.g;
        Duration ofMillis = Duration.ofMillis(0L);
        zq3.g(ofMillis, "ofMillis(...)");
        Duration ofMillis2 = Duration.ofMillis(j);
        zq3.g(ofMillis2, "ofMillis(...)");
        map.put("daggerTime", new y41.b(ofMillis, ofMillis2));
        this.d = j;
    }
}
