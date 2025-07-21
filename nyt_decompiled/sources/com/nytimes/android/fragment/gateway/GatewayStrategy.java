package com.nytimes.android.fragment.gateway;

import com.nytimes.android.ArticlePageEventSender;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.fragment.gateway.GatewayStrategy;
import com.nytimes.android.meter.MeterServiceResponse;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.du8;
import defpackage.gt2;
import defpackage.iv3;
import defpackage.iw2;
import defpackage.lp6;
import defpackage.lw2;
import defpackage.sc5;
import defpackage.ss2;
import defpackage.tl1;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zt6;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes4.dex */
public final class GatewayStrategy {
    static final /* synthetic */ iv3[] i = {zt6.f(new MutablePropertyReference1Impl(GatewayStrategy.class, "isMeterOverride", "isMeterOverride()Z", 0))};
    public static final int j = 8;
    private final com.nytimes.android.entitlements.a a;
    private final NetworkStatus b;
    private final lw2 c;
    private final iw2 d;
    private final ArticlePageEventSender e;
    private final Scheduler f;
    private final Scheduler g;
    private final lp6 h;

    public static final class a extends sc5 {
        final /* synthetic */ GatewayStrategy b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, GatewayStrategy gatewayStrategy) {
            super(obj);
            this.b = gatewayStrategy;
        }

        @Override // defpackage.sc5
        protected void b(iv3 iv3Var, Object obj, Object obj2) {
            zq3.h(iv3Var, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            ((Boolean) obj).booleanValue();
            this.b.c.a(booleanValue);
        }
    }

    public GatewayStrategy(com.nytimes.android.entitlements.a aVar, NetworkStatus networkStatus, lw2 lw2Var, iw2 iw2Var, ArticlePageEventSender articlePageEventSender, Scheduler scheduler, Scheduler scheduler2) {
        zq3.h(aVar, "eCommClient");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(lw2Var, "dependencies");
        zq3.h(iw2Var, "callbacks");
        zq3.h(articlePageEventSender, "articlePageEventSender");
        zq3.h(scheduler, "ioScheduler");
        zq3.h(scheduler2, "mainScheduler");
        this.a = aVar;
        this.b = networkStatus;
        this.c = lw2Var;
        this.d = iw2Var;
        this.e = articlePageEventSender;
        this.f = scheduler;
        this.g = scheduler2;
        tl1 tl1Var = tl1.a;
        this.h = new a(Boolean.FALSE, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair j(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        zq3.h(obj, "p0");
        return (Pair) ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    private final Observable l(Asset asset, String str) {
        Observable d = this.c.d();
        lw2 lw2Var = this.c;
        String a2 = this.e.a();
        if (a2 == null) {
            a2 = "";
        }
        Observable b = lw2Var.b(asset, a2, str);
        final GatewayStrategy$checkIfPaywallApplicable$1 gatewayStrategy$checkIfPaywallApplicable$1 = new gt2() { // from class: com.nytimes.android.fragment.gateway.GatewayStrategy$checkIfPaywallApplicable$1
            @Override // defpackage.gt2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Boolean bool, Boolean bool2) {
                zq3.h(bool, "showTruncator");
                zq3.h(bool2, "showMeter");
                return Boolean.valueOf(bool.booleanValue() || bool2.booleanValue());
            }
        };
        Observable observeOn = Observable.zip(d, b, new BiFunction() { // from class: zw2
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Boolean m;
                m = GatewayStrategy.m(gt2.this, obj, obj2);
                return m;
            }
        }).subscribeOn(this.f).observeOn(this.g);
        zq3.g(observeOn, "observeOn(...)");
        return observeOn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean m(gt2 gt2Var, Object obj, Object obj2) {
        zq3.h(gt2Var, "$tmp0");
        zq3.h(obj, "p0");
        zq3.h(obj2, "p1");
        return (Boolean) gt2Var.invoke(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n() {
        MeterServiceResponse c = this.c.c();
        if (c == null) {
            return false;
        }
        this.e.c(c);
        this.e.b(c);
        return c.getGranted() || c.remaining() > 0;
    }

    public final Completable h(final Asset asset, final String str) {
        Observable l = l(asset, str);
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.fragment.gateway.GatewayStrategy$applyPaywallOn$1
            {
                super(1);
            }

            public final void b(Boolean bool) {
                iw2 iw2Var;
                iw2Var = GatewayStrategy.this.d;
                zq3.e(bool);
                iw2Var.b(bool.booleanValue());
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Boolean) obj);
                return ww8.a;
            }
        };
        Observable doOnNext = l.doOnNext(new Consumer() { // from class: ax2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GatewayStrategy.i(ss2.this, obj);
            }
        });
        final ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.fragment.gateway.GatewayStrategy$applyPaywallOn$2
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Pair invoke(Boolean bool) {
                boolean n;
                zq3.h(bool, "it");
                n = GatewayStrategy.this.n();
                return du8.a(bool, Boolean.valueOf(n));
            }
        };
        Observable map = doOnNext.map(new Function() { // from class: bx2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                Pair j2;
                j2 = GatewayStrategy.j(ss2.this, obj);
                return j2;
            }
        });
        final ss2 ss2Var3 = new ss2() { // from class: com.nytimes.android.fragment.gateway.GatewayStrategy$applyPaywallOn$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Pair) obj);
                return ww8.a;
            }

            public final void invoke(Pair pair) {
                iw2 iw2Var;
                iw2 iw2Var2;
                Boolean bool = (Boolean) pair.a();
                boolean booleanValue = ((Boolean) pair.b()).booleanValue();
                if (!bool.booleanValue() || booleanValue) {
                    iw2Var = GatewayStrategy.this.d;
                    iw2Var.c(asset);
                }
                zq3.e(bool);
                if (bool.booleanValue()) {
                    iw2Var2 = GatewayStrategy.this.d;
                    iw2Var2.a(asset, str);
                }
            }
        };
        Completable ignoreElements = map.doOnNext(new Consumer() { // from class: cx2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                GatewayStrategy.k(ss2.this, obj);
            }
        }).ignoreElements();
        zq3.g(ignoreElements, "ignoreElements(...)");
        return ignoreElements;
    }

    public final void o(boolean z) {
        this.h.a(this, i[0], Boolean.valueOf(z));
    }
}
