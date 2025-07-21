package defpackage;

import android.app.Application;
import android.content.res.Resources;
import com.nytimes.android.utils.NetworkStatus;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class ex1 {
    private final Application a;
    private final my3 b;
    private final ly3 c;
    private final PublishSubject d;
    private final NetworkStatus e;
    private final cd f;
    private final BehaviorSubject g;
    private final z58 h;
    private final c05 i;
    private final Resources j;
    private final b04 k;
    private final f98 l;
    private final CoroutineDispatcher m;
    private final CoroutineScope n;

    public ex1(Application application, my3 my3Var, ly3 ly3Var, PublishSubject publishSubject, NetworkStatus networkStatus, cd cdVar, BehaviorSubject behaviorSubject, z58 z58Var, c05 c05Var, Resources resources, b04 b04Var, f98 f98Var, CoroutineDispatcher coroutineDispatcher, CoroutineScope coroutineScope) {
        zq3.h(application, "context");
        zq3.h(my3Var, "latestEcomm");
        zq3.h(ly3Var, "latestCampaignCodes");
        zq3.h(publishSubject, "snackbarSubject");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(cdVar, "analyticsLogger");
        zq3.h(behaviorSubject, "cachedSubauthUserAnalyticsHelperSubject");
        zq3.h(z58Var, "subauthClient");
        zq3.h(c05Var, "nytCookieProvider");
        zq3.h(resources, "resources");
        zq3.h(b04Var, "launchAccountBenefitsHelper");
        zq3.h(f98Var, "feedbackPageCallback");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        zq3.h(coroutineScope, "applicationScope");
        this.a = application;
        this.b = my3Var;
        this.c = ly3Var;
        this.d = publishSubject;
        this.e = networkStatus;
        this.f = cdVar;
        this.g = behaviorSubject;
        this.h = z58Var;
        this.i = c05Var;
        this.j = resources;
        this.k = b04Var;
        this.l = f98Var;
        this.m = coroutineDispatcher;
        this.n = coroutineScope;
    }

    public final cd a() {
        return this.f;
    }

    public final CoroutineScope b() {
        return this.n;
    }

    public final BehaviorSubject c() {
        return this.g;
    }

    public final Application d() {
        return this.a;
    }

    public final f98 e() {
        return this.l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex1)) {
            return false;
        }
        ex1 ex1Var = (ex1) obj;
        return zq3.c(this.a, ex1Var.a) && zq3.c(this.b, ex1Var.b) && zq3.c(this.c, ex1Var.c) && zq3.c(this.d, ex1Var.d) && zq3.c(this.e, ex1Var.e) && zq3.c(this.f, ex1Var.f) && zq3.c(this.g, ex1Var.g) && zq3.c(this.h, ex1Var.h) && zq3.c(this.i, ex1Var.i) && zq3.c(this.j, ex1Var.j) && zq3.c(this.k, ex1Var.k) && zq3.c(this.l, ex1Var.l) && zq3.c(this.m, ex1Var.m) && zq3.c(this.n, ex1Var.n);
    }

    public final CoroutineDispatcher f() {
        return this.m;
    }

    public final NetworkStatus g() {
        return this.e;
    }

    public final Resources h() {
        return this.j;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode();
    }

    public final PublishSubject i() {
        return this.d;
    }

    public final z58 j() {
        return this.h;
    }

    public String toString() {
        return "ECommClientParam(context=" + this.a + ", latestEcomm=" + this.b + ", latestCampaignCodes=" + this.c + ", snackbarSubject=" + this.d + ", networkStatus=" + this.e + ", analyticsLogger=" + this.f + ", cachedSubauthUserAnalyticsHelperSubject=" + this.g + ", subauthClient=" + this.h + ", nytCookieProvider=" + this.i + ", resources=" + this.j + ", launchAccountBenefitsHelper=" + this.k + ", feedbackPageCallback=" + this.l + ", ioDispatcher=" + this.m + ", applicationScope=" + this.n + ")";
    }
}
