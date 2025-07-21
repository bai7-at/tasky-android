package defpackage;

import android.app.Application;
import com.nytimes.android.VoiceOverDetector;
import com.nytimes.android.analytics.api.values.DeviceOrientation;
import com.nytimes.android.analytics.api.values.Edition;
import com.nytimes.android.analytics.api.values.SubscriptionLevel;
import com.nytimes.android.analytics.event.GatewayEvent;
import com.nytimes.android.analytics.event.messaging.DockMessageAttribute;
import com.nytimes.android.analytics.event.messaging.DockType;
import com.nytimes.android.analytics.event.values.EnabledOrDisabled;
import com.nytimes.android.analytics.event.values.RegiMethod;
import com.nytimes.android.utils.AppPreferences;
import com.nytimes.android.utils.NetworkStatus;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.BehaviorSubject;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public class jc {
    public static final b Companion = new b(null);
    private final Application a;
    private final wc b;
    private final NetworkStatus c;
    private final AppPreferences d;
    private final String e;
    private final String f;
    private final String g;
    private final VoiceOverDetector h;
    private final j65 i;
    private final b05 j;
    private final z58 k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private volatile Disposable q;
    private final AtomicReference r;
    private final AtomicReference s;

    public static final class a extends d05 {
        a(Class cls) {
            super(cls);
        }

        @Override // io.reactivex.Observer
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(m98 m98Var) {
            zq3.h(m98Var, "subauthUserAnalyticsHelper");
            jc.this.b.a(m98Var);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public jc(Application application, wc wcVar, NetworkStatus networkStatus, AppPreferences appPreferences, String str, String str2, String str3, VoiceOverDetector voiceOverDetector, BehaviorSubject behaviorSubject, j65 j65Var, b05 b05Var, z58 z58Var) {
        Disposable disposable;
        zq3.h(application, "context");
        zq3.h(wcVar, "eventManager");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(appPreferences, "appPreferences");
        zq3.h(str, "buildNumber");
        zq3.h(str2, "appVersion");
        zq3.h(str3, "etSourceAppName");
        zq3.h(voiceOverDetector, "voiceOverDetector");
        zq3.h(behaviorSubject, "cachedSubauthUserAnalyticsHelperSubject");
        zq3.h(j65Var, "nightModeProvider");
        zq3.h(b05Var, "clock");
        zq3.h(z58Var, "subauthClient");
        this.a = application;
        this.b = wcVar;
        this.c = networkStatus;
        this.d = appPreferences;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = voiceOverDetector;
        this.i = j65Var;
        this.j = b05Var;
        this.k = z58Var;
        this.o = true;
        this.r = new AtomicReference();
        this.s = new AtomicReference("Top Stories");
        if ("Google".length() > 0 && appPreferences.l("thirdparty.partner", null).length() == 0) {
            appPreferences.d("thirdparty.partner", "Google");
        }
        if ("Play Store".length() > 0 && appPreferences.l("thirdparty.offer", null).length() == 0) {
            appPreferences.d("thirdparty.offer", "Play Store");
        }
        Disposable disposable2 = this.q;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.q) != null) {
            disposable.dispose();
        }
        this.q = (Disposable) behaviorSubject.distinctUntilChanged().debounce(500L, TimeUnit.MILLISECONDS).subscribeWith(new a(jc.class));
    }

    public final void A(String str) {
        zq3.h(str, "section");
        this.s.getAndSet(str);
    }

    public final void B(int i) {
        this.p = i;
    }

    public final void b() {
        this.o = false;
    }

    public final String c(String str) {
        zq3.h(str, "url");
        return (String) this.r.getAndSet(str);
    }

    public final Edition d() {
        return Edition.US;
    }

    public final String e() {
        return (String) this.r.get();
    }

    public final String f() {
        Object obj = this.s.get();
        zq3.g(obj, "get(...)");
        return (String) obj;
    }

    public final DeviceOrientation g() {
        return this.a.getResources().getConfiguration().orientation == 2 ? DeviceOrientation.landscape : DeviceOrientation.portrait;
    }

    public final int h() {
        return this.p;
    }

    public final SubscriptionLevel i() {
        boolean F = this.k.F();
        boolean q = this.k.q();
        return (F && q) ? SubscriptionLevel.Subscribed : (!F || q) ? (F || !q) ? SubscriptionLevel.Anonymous : SubscriptionLevel.Registered : SubscriptionLevel.AnonymouslySubscribed;
    }

    public final boolean j() {
        return this.n;
    }

    public final boolean k() {
        return this.m;
    }

    public final boolean l() {
        return this.l;
    }

    public final void m(GatewayEvent.ActionTaken actionTaken, String str, String str2, Integer num) {
        zq3.h(actionTaken, "action");
        wc wcVar = this.b;
        Edition d = d();
        String e = this.c.e();
        wcVar.b(new GatewayEvent(actionTaken, str, str2, null, num, g(), this.e, this.f, e, i(), this.g, TimeUnit.MILLISECONDS.toSeconds(this.j.c()), d));
    }

    public final void n(String str, String str2, String str3, String str4, EnabledOrDisabled enabledOrDisabled, Integer num, String str5, String str6, String str7, String str8, String str9) {
        wc wcVar = this.b;
        DeviceOrientation g = g();
        Edition d = d();
        String e = this.c.e();
        wcVar.b(new iq(enabledOrDisabled, num, i(), e, this.i.b() ? "Turned On" : "Turned Off", str6, str4, str, str2, str3, d, str5, this.h.b() ? "yes" : "no", str7, str8, str9, g, this.e, this.f, this.g, TimeUnit.MILLISECONDS.toSeconds(this.j.c())));
    }

    public final void o(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        zq3.h(str, "referringSource");
        zq3.h(str2, "actionTaken");
        wc wcVar = this.b;
        String str8 = this.e;
        String str9 = this.f;
        String str10 = this.g;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.j.c());
        DeviceOrientation g = g();
        SubscriptionLevel i = i();
        wcVar.b(new h87(str2, str3, str4, "tap", 1, d(), str, str5, str6, str7, g, str8, str9, this.c.e(), i, str10, seconds));
    }

    public final void p(RegiMethod regiMethod, String str) {
        zq3.h(regiMethod, "method");
        wc wcVar = this.b;
        Edition d = d();
        wcVar.b(new av6(regiMethod, g(), i(), this.c.e(), d));
        this.b.b(new o3(d(), this.c.e(), str, i(), g(), this.e, this.f, this.g, TimeUnit.MILLISECONDS.toSeconds(this.j.c())));
    }

    public final void q(DockType dockType, int i, DockMessageAttribute dockMessageAttribute) {
        zq3.h(dockType, "dockType");
        zq3.h(dockMessageAttribute, "message");
        wc wcVar = this.b;
        SubscriptionLevel i2 = i();
        wcVar.b(new ct1(dockType, i, dockMessageAttribute, g(), this.e, this.f, this.c.e(), i2, this.g, TimeUnit.MILLISECONDS.toSeconds(this.j.c())));
    }

    public final void r(DockType dockType, int i) {
        zq3.h(dockType, "dockType");
        wc wcVar = this.b;
        SubscriptionLevel i2 = i();
        wcVar.b(new gt1(dockType, i, g(), this.e, this.f, this.c.e(), i2, this.g, TimeUnit.MILLISECONDS.toSeconds(this.j.c())));
    }

    public final void s(String str) {
        zq3.h(str, "referringSource");
        wc wcVar = this.b;
        Edition d = d();
        String e = this.c.e();
        DeviceOrientation g = g();
        wcVar.b(new ty3(d, e, str, i(), f(), g, this.e, this.f, this.g, TimeUnit.MILLISECONDS.toSeconds(this.j.c())));
    }

    public final void t(String str, boolean z, String str2) {
        zq3.h(str2, "loginMethod");
        wc wcVar = this.b;
        String str3 = this.e;
        String str4 = this.f;
        String str5 = this.g;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.j.c());
        DeviceOrientation g = g();
        SubscriptionLevel i = i();
        String e = this.c.e();
        wcVar.b(new ha4(str2, "tap", z ? 1 : 0, d(), str, g, str3, str4, e, i, str5, seconds));
    }

    public final void u() {
        this.b.b(new ot4(e(), f(), g(), i(), this.c.e(), d()));
    }

    public final void v(String str, String str2, x28 x28Var) {
        zq3.h(str2, "sku");
        zq3.h(x28Var, "response");
        this.b.b(new m86(str, e(), f(), str2, x28Var.h(), x28Var.a(), String.valueOf(x28Var.e()), x28Var.b(), g(), this.e, this.f, this.c.e(), i(), this.g, TimeUnit.MILLISECONDS.toSeconds(this.j.c()), d(), null, null, 196608, null));
    }

    public final String w(String str) {
        zq3.h(str, "url");
        return c(str);
    }

    public final void x() {
        this.n = true;
    }

    public final void y(boolean z) {
        this.m = z;
    }

    public final void z(boolean z) {
        this.l = z;
    }
}
