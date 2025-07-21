package com.nytimes.android.gateway;

import android.content.Context;
import com.amazonaws.event.ProgressEvent;
import com.chartbeat.androidsdk.QueryKeys;
import com.nytimes.android.entitlements.b;
import com.nytimes.android.gateway.GatewayPresenterImpl;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.messaging.postloginregioffers.PostLoginRegiOfferManager;
import com.nytimes.android.meter.MeterServiceResponse;
import com.nytimes.android.recentlyviewed.RecentlyViewedManager;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.by0;
import defpackage.d05;
import defpackage.e05;
import defpackage.gt4;
import defpackage.jc;
import defpackage.jk;
import defpackage.qs2;
import defpackage.rw2;
import defpackage.ss2;
import defpackage.sw2;
import defpackage.uy3;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvertKt;

/* loaded from: classes4.dex */
public final class GatewayPresenterImpl implements sw2 {
    private final gt4 a;
    private final RecentlyViewedManager b;
    private final CompositeDisposable c;
    private final jc d;
    private final com.nytimes.android.entitlements.a e;
    private final uy3 f;
    private final Scheduler g;
    private final Scheduler h;
    private final NetworkStatus i;
    private final PostLoginRegiOfferManager j;
    public com.nytimes.android.gateway.a k;
    public a l;
    private Disposable m;
    private final boolean n;
    private CoroutineScope o;

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GatewayType.values().length];
            try {
                iArr[GatewayType.OFFLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GatewayType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GatewayType.BLOCKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GatewayType.METER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GatewayType.DISMISSIBLE_REGIWALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GatewayType.BLOCKED_GAMES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GatewayType.TRUNCATOR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    public static final class c extends e05 {
        final /* synthetic */ GatewayPresenterImpl b;
        final /* synthetic */ boolean c;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Class cls, GatewayPresenterImpl gatewayPresenterImpl, boolean z, GatewayPresenterImpl gatewayPresenterImpl2, boolean z2) {
            super(cls);
            this.b = gatewayPresenterImpl;
            this.c = z;
            this.d = z2;
        }

        @Override // defpackage.e05, io.reactivex.SingleObserver
        public void onError(Throwable th) {
            rw2 e;
            zq3.h(th, "error");
            super.onError(th);
            NYTLogger.i(th, "Error on meter call in registerArticleRead", new Object[0]);
            rw2 e2 = this.b.u().e();
            if (e2 != null) {
                e2.b(true);
            }
            if (!this.d || (e = this.b.u().e()) == null) {
                return;
            }
            e.a();
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            rw2 e;
            zq3.h(obj, QueryKeys.TOKEN);
            MeterServiceResponse meterServiceResponse = (MeterServiceResponse) obj;
            this.b.u().t(meterServiceResponse.viewsUsed());
            this.b.u().s(meterServiceResponse.getTotal());
            this.b.u().m(meterServiceResponse.getGranted());
            this.b.D();
            this.b.v().o0(meterServiceResponse);
            NYTLogger.l("finishPaywallFragment willView " + meterServiceResponse, new Object[0]);
            rw2 e2 = this.b.u().e();
            if (e2 != null) {
                e2.b(true);
            }
            if (!this.c || (e = this.b.u().e()) == null) {
                return;
            }
            e.a();
        }
    }

    public static final class d extends d05 {
        final /* synthetic */ GatewayPresenterImpl b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Class cls, GatewayPresenterImpl gatewayPresenterImpl) {
            super(cls);
            this.b = gatewayPresenterImpl;
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            zq3.h(obj, QueryKeys.TOKEN);
            Boolean bool = (Boolean) obj;
            this.b.u().n(!bool.booleanValue());
            if (!bool.booleanValue() || this.b.u().i() >= 1) {
                this.b.A();
                return;
            }
            CompositeDisposable r = this.b.r();
            Single observeOn = this.b.a.a(this.b.u().a(), this.b.u().k()).subscribeOn(this.b.g).observeOn(this.b.h);
            zq3.g(observeOn, "observeOn(...)");
            f fVar = (f) observeOn.subscribeWith(new f(Class.class, this.b));
            zq3.e(fVar);
            DisposableKt.plusAssign(r, fVar);
        }
    }

    public static final class e extends d05 {
        final /* synthetic */ GatewayPresenterImpl b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Class cls, GatewayPresenterImpl gatewayPresenterImpl) {
            super(cls);
            this.b = gatewayPresenterImpl;
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            zq3.h(obj, QueryKeys.TOKEN);
            if (this.b.s().a()) {
                GatewayPresenterImpl gatewayPresenterImpl = this.b;
                gatewayPresenterImpl.x(gatewayPresenterImpl.u().a());
            }
        }
    }

    public static final class f extends e05 {
        final /* synthetic */ GatewayPresenterImpl b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Class cls, GatewayPresenterImpl gatewayPresenterImpl) {
            super(cls);
            this.b = gatewayPresenterImpl;
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            zq3.h(obj, QueryKeys.TOKEN);
            MeterServiceResponse meterServiceResponse = (MeterServiceResponse) obj;
            this.b.v().o0(meterServiceResponse);
            this.b.z(meterServiceResponse);
        }
    }

    public GatewayPresenterImpl(gt4 gt4Var, RecentlyViewedManager recentlyViewedManager, CompositeDisposable compositeDisposable, jc jcVar, com.nytimes.android.entitlements.a aVar, uy3 uy3Var, Scheduler scheduler, Scheduler scheduler2, NetworkStatus networkStatus, PostLoginRegiOfferManager postLoginRegiOfferManager) {
        zq3.h(gt4Var, "meterServiceDAO");
        zq3.h(recentlyViewedManager, "recentlyViewedManager");
        zq3.h(compositeDisposable, "disposables");
        zq3.h(jcVar, "analyticsClient");
        zq3.h(aVar, "eCommClient");
        zq3.h(uy3Var, "launchProductLandingHelper");
        zq3.h(scheduler, "ioScheduler");
        zq3.h(scheduler2, "mainScheduler");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(postLoginRegiOfferManager, "postLoginRegiOfferManager");
        this.a = gt4Var;
        this.b = recentlyViewedManager;
        this.c = compositeDisposable;
        this.d = jcVar;
        this.e = aVar;
        this.f = uy3Var;
        this.g = scheduler;
        this.h = scheduler2;
        this.i = networkStatus;
        this.j = postLoginRegiOfferManager;
        this.n = (aVar.q() || aVar.a()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        if (u().c()) {
            v().C0();
            v().m0();
            v().q(u().a());
            return;
        }
        if (u().b() || u().d()) {
            v().P0();
            v().m0();
            v().z();
            return;
        }
        if (y() == 0 || !u().b()) {
            v().C0();
            G();
            v().z();
        } else if (!zq3.c(u().g(), "UNLOCKED_ARTICLE_CODE") || this.e.q()) {
            v().C0();
            v().m0();
            v().z();
        } else {
            v().r();
            v().m0();
            v().z();
            v().P0();
        }
    }

    private final void B(String str, boolean z) {
        Disposable disposable = this.m;
        if (disposable != null) {
            disposable.dispose();
        }
        CompositeDisposable compositeDisposable = this.c;
        Single observeOn = this.a.c(str, u().k()).subscribeOn(this.g).observeOn(this.h);
        zq3.g(observeOn, "observeOn(...)");
        c cVar = (c) observeOn.subscribeWith(new c(Class.class, this, z, this, z));
        zq3.e(cVar);
        DisposableKt.plusAssign(compositeDisposable, cVar);
    }

    static /* synthetic */ void C(GatewayPresenterImpl gatewayPresenterImpl, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        gatewayPresenterImpl.B(str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        if (this.e.q() && this.e.a()) {
            return;
        }
        this.d.u();
    }

    private final void G() {
        if (!zq3.c(u().f(), "REGIWALL")) {
            v().O(this.n, u().f());
            return;
        }
        if (!this.e.q()) {
            v().O(this.n, u().f());
        }
        Flow m911catch = FlowKt.m911catch(FlowKt.onEach(this.e.e(), new GatewayPresenterImpl$showGatewayCard$1(this, null)), new GatewayPresenterImpl$showGatewayCard$2(null));
        CoroutineScope coroutineScope = this.o;
        zq3.e(coroutineScope);
        FlowKt.launchIn(m911catch, coroutineScope);
    }

    private final void H() {
        Observable observeOn = this.a.b().observeOn(this.h);
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.gateway.GatewayPresenterImpl$subscribeToGatewayEvents$1
            {
                super(1);
            }

            public final void b(MeterServiceResponse meterServiceResponse) {
                GatewayPresenterImpl gatewayPresenterImpl = GatewayPresenterImpl.this;
                zq3.e(meterServiceResponse);
                gatewayPresenterImpl.z(meterServiceResponse);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((MeterServiceResponse) obj);
                return ww8.a;
            }
        };
        Consumer consumer = new Consumer() { // from class: tw2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GatewayPresenterImpl.I(ss2.this, obj);
            }
        };
        final GatewayPresenterImpl$subscribeToGatewayEvents$2 gatewayPresenterImpl$subscribeToGatewayEvents$2 = new ss2() { // from class: com.nytimes.android.gateway.GatewayPresenterImpl$subscribeToGatewayEvents$2
            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                zq3.e(th);
                NYTLogger.i(th, "error on gateway event", new Object[0]);
            }
        };
        Disposable subscribe = observeOn.subscribe(consumer, new Consumer() { // from class: uw2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GatewayPresenterImpl.J(ss2.this, obj);
            }
        });
        this.m = subscribe;
        if (subscribe != null) {
            this.c.add(subscribe);
        }
        CompositeDisposable compositeDisposable = this.c;
        Observable observeOn2 = this.i.m().skip(1L).subscribeOn(this.g).observeOn(this.h);
        zq3.g(observeOn2, "observeOn(...)");
        d dVar = (d) observeOn2.subscribeWith(new d(Class.class, this));
        zq3.e(dVar);
        DisposableKt.plusAssign(compositeDisposable, dVar);
        CompositeDisposable compositeDisposable2 = this.c;
        Observable observeOn3 = RxConvertKt.asObservable$default(this.e.c(), null, 1, null).subscribeOn(this.g).observeOn(this.h);
        zq3.g(observeOn3, "observeOn(...)");
        e eVar = (e) observeOn3.subscribeWith(new e(Class.class, this));
        zq3.e(eVar);
        DisposableKt.plusAssign(compositeDisposable2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    private final void q() {
        GatewayType t = t();
        rw2 e2 = u().e();
        if (e2 != null) {
            e2.c(t);
        }
        w(t, u().a());
    }

    private final GatewayType t() {
        return (!h.P(u().a(), "upshot/wordle-bot.html", false, 2, null) || u().b()) ? u().c() ? GatewayType.OFFLINE : (u().b() || u().l()) ? (!u().h() || y() <= 0) ? (!zq3.c(u().g(), "UNLOCKED_ARTICLE_CODE") || this.e.q()) ? u().l() ? GatewayType.TRUNCATOR : GatewayType.NONE : GatewayType.DISMISSIBLE_REGIWALL : GatewayType.METER : GatewayType.BLOCKED : GatewayType.BLOCKED_GAMES;
    }

    private final void w(GatewayType gatewayType, String str) {
        switch (b.a[gatewayType.ordinal()]) {
            case 1:
                v().q(u().a());
                break;
            case 2:
                x(str);
                break;
            case 3:
                G();
                break;
            case 4:
                C(this, str, false, 2, null);
                break;
            case 5:
                v().r();
                break;
            case 6:
                v().C(true);
                break;
            case 7:
                v().p();
                break;
        }
        v().X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(String str) {
        Disposable disposable = this.m;
        if (disposable != null) {
            disposable.dispose();
        }
        C(this, str, false, 2, null);
    }

    private final int y() {
        return MeterServiceResponse.Companion.a(u().d(), u().i(), u().j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(MeterServiceResponse meterServiceResponse) {
        u().t(meterServiceResponse.viewsUsed());
        u().s(meterServiceResponse.getTotal());
        u().n(meterServiceResponse.getDeviceOffline());
        u().o(meterServiceResponse.getDisabledByBetaSettings());
        u().m(meterServiceResponse.getGranted());
        u().q(meterServiceResponse.getGatewayType());
        u().r(meterServiceResponse.getGrantReason());
        A();
    }

    public final void E(a aVar) {
        zq3.h(aVar, "<set-?>");
        this.l = aVar;
    }

    public final void F(com.nytimes.android.gateway.a aVar) {
        zq3.h(aVar, "<set-?>");
        this.k = aVar;
    }

    @Override // defpackage.b26
    public void a() {
        this.c.clear();
        u().p(null);
    }

    @Override // defpackage.sw2
    public Object b(Context context, by0 by0Var) {
        Object s = this.e.s(context, RegiInterface.RegiMeter, "Article Card", by0Var);
        return s == kotlin.coroutines.intrinsics.a.h() ? s : ww8.a;
    }

    @Override // defpackage.sw2
    public Object d(boolean z, jk jkVar, by0 by0Var) {
        if (!z) {
            Object c2 = this.j.c(jkVar, RegiInterface.RegiGateway, by0Var);
            return c2 == kotlin.coroutines.intrinsics.a.h() ? c2 : ww8.a;
        }
        com.nytimes.android.entitlements.a aVar = this.e;
        Context applicationContext = jkVar.getApplicationContext();
        zq3.g(applicationContext, "getApplicationContext(...)");
        Object s = aVar.s(applicationContext, RegiInterface.RegiGateway, "Article Card", by0Var);
        return s == kotlin.coroutines.intrinsics.a.h() ? s : ww8.a;
    }

    @Override // defpackage.sw2
    public Object e(Context context, qs2 qs2Var, by0 by0Var) {
        Object b2 = b.a.b(this.e, context, null, qs2Var, by0Var, 2, null);
        return b2 == kotlin.coroutines.intrinsics.a.h() ? b2 : ww8.a;
    }

    @Override // defpackage.sw2
    public Object f(jk jkVar, by0 by0Var) {
        Object c2 = this.j.c(jkVar, RegiInterface.RegiGateway, by0Var);
        return c2 == kotlin.coroutines.intrinsics.a.h() ? c2 : ww8.a;
    }

    @Override // defpackage.b26
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void c(com.nytimes.android.gateway.a aVar) {
        zq3.h(aVar, "item");
        F(aVar);
        this.o = aVar.i0();
        E(v().N0());
        H();
        q();
    }

    public final CompositeDisposable r() {
        return this.c;
    }

    public final com.nytimes.android.entitlements.a s() {
        return this.e;
    }

    public final a u() {
        a aVar = this.l;
        if (aVar != null) {
            return aVar;
        }
        zq3.z("param");
        return null;
    }

    public final com.nytimes.android.gateway.a v() {
        com.nytimes.android.gateway.a aVar = this.k;
        if (aVar != null) {
            return aVar;
        }
        zq3.z("view");
        return null;
    }

    public static final class a {
        private final long a;
        private final String b;
        private final String c;
        private final String d;
        private rw2 e;
        private int f;
        private int g;
        private boolean h;
        private boolean i;
        private String j;
        private final String k;
        private boolean l;
        private boolean m;
        private boolean n;
        private String o;

        public a(long j, String str, String str2, String str3, rw2 rw2Var, int i, int i2, boolean z, boolean z2, String str4, String str5, boolean z3, boolean z4, boolean z5, String str6) {
            zq3.h(str, "assetUrl");
            zq3.h(str2, "assetUri");
            zq3.h(str3, "assetType");
            zq3.h(str4, "gatewayType");
            zq3.h(str5, "pageViewId");
            zq3.h(str6, "grantReason");
            this.a = j;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = rw2Var;
            this.f = i;
            this.g = i2;
            this.h = z;
            this.i = z2;
            this.j = str4;
            this.k = str5;
            this.l = z3;
            this.m = z4;
            this.n = z5;
            this.o = str6;
        }

        public final String a() {
            return this.b;
        }

        public final boolean b() {
            return this.h;
        }

        public final boolean c() {
            return this.l;
        }

        public final boolean d() {
            return this.n;
        }

        public final rw2 e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && zq3.c(this.b, aVar.b) && zq3.c(this.c, aVar.c) && zq3.c(this.d, aVar.d) && zq3.c(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && zq3.c(this.j, aVar.j) && zq3.c(this.k, aVar.k) && this.l == aVar.l && this.m == aVar.m && this.n == aVar.n && zq3.c(this.o, aVar.o);
        }

        public final String f() {
            return this.j;
        }

        public final String g() {
            return this.o;
        }

        public final boolean h() {
            return this.i;
        }

        public int hashCode() {
            int hashCode = ((((((Long.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
            rw2 rw2Var = this.e;
            return ((((((((((((((((((((hashCode + (rw2Var == null ? 0 : rw2Var.hashCode())) * 31) + Integer.hashCode(this.f)) * 31) + Integer.hashCode(this.g)) * 31) + Boolean.hashCode(this.h)) * 31) + Boolean.hashCode(this.i)) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + Boolean.hashCode(this.l)) * 31) + Boolean.hashCode(this.m)) * 31) + Boolean.hashCode(this.n)) * 31) + this.o.hashCode();
        }

        public final int i() {
            return this.f;
        }

        public final int j() {
            return this.g;
        }

        public final String k() {
            return this.k;
        }

        public final boolean l() {
            return this.m;
        }

        public final void m(boolean z) {
            this.h = z;
        }

        public final void n(boolean z) {
            this.l = z;
        }

        public final void o(boolean z) {
            this.n = z;
        }

        public final void p(rw2 rw2Var) {
            this.e = rw2Var;
        }

        public final void q(String str) {
            zq3.h(str, "<set-?>");
            this.j = str;
        }

        public final void r(String str) {
            zq3.h(str, "<set-?>");
            this.o = str;
        }

        public final void s(int i) {
            this.f = i;
        }

        public final void t(int i) {
            this.g = i;
        }

        public String toString() {
            return "Param(assetId=" + this.a + ", assetUrl=" + this.b + ", assetUri=" + this.c + ", assetType=" + this.d + ", gatewayFragmentListener=" + this.e + ", meterTotal=" + this.f + ", meterViews=" + this.g + ", canViewArticle=" + this.h + ", meterCounted=" + this.i + ", gatewayType=" + this.j + ", pageViewId=" + this.k + ", deviceOffline=" + this.l + ", truncatorActive=" + this.m + ", disabledByBetaSettings=" + this.n + ", grantReason=" + this.o + ")";
        }

        public /* synthetic */ a(long j, String str, String str2, String str3, rw2 rw2Var, int i, int i2, boolean z, boolean z2, String str4, String str5, boolean z3, boolean z4, boolean z5, String str6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, str, str2, str3, rw2Var, i, i2, z, z2, str4, str5, (i3 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? false : z3, (i3 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? false : z4, (i3 & 8192) != 0 ? false : z5, str6);
        }
    }
}
