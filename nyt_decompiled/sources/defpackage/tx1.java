package defpackage;

import com.nytimes.android.eventtracker.AppLifecycleObserver;
import com.nytimes.android.eventtracker.EventTracker;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import defpackage.e52;
import java.util.Map;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public final class tx1 implements ET2PageScope {
    private final PageContext a;
    private final AppLifecycleObserver b;
    private final q52 c;
    private final e32 d;
    private final String e;
    private final String f;
    private final wt6 g;
    private final na2 h;
    private final qs2 i;
    private boolean j;
    private boolean k;
    private boolean l;

    public tx1(PageContext pageContext, AppLifecycleObserver appLifecycleObserver, q52 q52Var, e32 e32Var, String str, String str2, wt6 wt6Var, na2 na2Var, qs2 qs2Var) {
        zq3.h(pageContext, "pageContext");
        zq3.h(appLifecycleObserver, "appLifecycle");
        zq3.h(q52Var, "eventTrackerUserGenerator");
        zq3.h(e32Var, "asset");
        zq3.h(qs2Var, "extraData");
        this.a = pageContext;
        this.b = appLifecycleObserver;
        this.c = q52Var;
        this.d = e32Var;
        this.e = str;
        this.f = str2;
        this.g = wt6Var;
        this.h = na2Var;
        this.i = qs2Var;
        this.j = true;
    }

    private final boolean k(e52 e52Var) {
        return zq3.c(e52Var.a(), "impression");
    }

    public static /* synthetic */ void n(tx1 tx1Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        tx1Var.m(z);
    }

    private final void q(e52 e52Var, Map map) {
        String str = "pageviewId: " + this.a.a() + " data: " + map;
        if (this.l) {
            throw new IllegalStateException(("ET2Page[sendRawEvent] " + this.d + " is destroyed - The event " + e52Var.a() + " could not be sent. " + str).toString());
        }
        if (this.k) {
            ul8.a.z("ET2").l("ET2Page[sendRawEvent] " + e52Var.a() + ": " + str, new Object[0]);
            EventTracker.a.h(this.a, e52Var, map);
            return;
        }
        ul8.a.d("ET2", "ET2Page[sendRawEvent] " + this.d + " is closed - The event " + e52Var.a() + " could not be sent. " + str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope
    public void a(e52 e52Var, ue4 ue4Var, ue4 ue4Var2, qs2 qs2Var) {
        zq3.h(e52Var, "eventSubject");
        zq3.h(qs2Var, "extraData");
        Map c = new t27(ue4Var, ue4Var2).c(qs2Var.mo865invoke());
        if (k(e52Var)) {
            Object[] objArr = 0 == true ? 1 : 0;
            c = t.p(c, new j50(null, objArr, new v15(this.c.a(), null, null, 6, null), null, 11, null).a());
        }
        q(e52Var, c);
    }

    @Override // com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope
    public void b() {
        if (this.k) {
            o();
            n(this, false, 1, null);
            return;
        }
        ul8.a.z("ET2").u("ET2Page[sendPageRefresh] " + this.d + " is closed - could not launch sendPageRefresh(). pageviewId: " + this.a.g(), new Object[0]);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx1)) {
            return false;
        }
        tx1 tx1Var = (tx1) obj;
        return zq3.c(this.a, tx1Var.a) && zq3.c(this.b, tx1Var.b) && zq3.c(this.c, tx1Var.c) && zq3.c(this.d, tx1Var.d) && zq3.c(this.e, tx1Var.e) && zq3.c(this.f, tx1Var.f) && zq3.c(this.g, tx1Var.g) && zq3.c(this.h, tx1Var.h) && zq3.c(this.i, tx1Var.i);
    }

    public final e32 h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        wt6 wt6Var = this.g;
        int hashCode4 = (hashCode3 + (wt6Var == null ? 0 : wt6Var.hashCode())) * 31;
        na2 na2Var = this.h;
        return ((hashCode4 + (na2Var != null ? na2Var.hashCode() : 0)) * 31) + this.i.hashCode();
    }

    public final PageContext i() {
        return this.a;
    }

    public final String j() {
        return this.e;
    }

    public final boolean l() {
        return this.k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(boolean z) {
        if (this.k) {
            return;
        }
        this.k = true;
        q((this.j || !z) ? new e52.g() : new e52.i(), new j50(this.e, this.f, new v15(this.c.a(), this.j ? this.g : this.b.b(), this.d), this.h).c(this.i.mo865invoke()));
        this.j = false;
    }

    public final void o() {
        if (this.k) {
            q(new e52.h(), t.i());
            this.k = false;
        }
    }

    public final void p() {
        o();
        this.l = true;
    }

    public String toString() {
        return "ET2Page(pageContext=" + this.a + ", appLifecycle=" + this.b + ", eventTrackerUserGenerator=" + this.c + ", asset=" + this.d + ", url=" + this.e + ", uri=" + this.f + ", referringSource=" + this.g + ", fastlyHeaders=" + this.h + ", extraData=" + this.i + ")";
    }
}
