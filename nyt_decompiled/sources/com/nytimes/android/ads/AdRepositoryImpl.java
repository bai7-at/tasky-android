package com.nytimes.android.ads;

import com.nytimes.android.ads.network.response.AdError;
import com.nytimes.android.ads.persistence.LocalAdCache;
import defpackage.b8;
import defpackage.gt2;
import defpackage.h02;
import defpackage.m7;
import defpackage.o7;
import defpackage.s6;
import defpackage.ss2;
import defpackage.t6;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes2.dex */
public final class AdRepositoryImpl implements m7 {
    private final a a;
    private final t6 b;
    private final o7 c;
    private final MutableSharedFlow d;
    private final LocalAdCache e;
    private final CoroutineScope f;

    public AdRepositoryImpl(a aVar, t6 t6Var, o7 o7Var, MutableSharedFlow mutableSharedFlow, LocalAdCache localAdCache, CoroutineScope coroutineScope) {
        zq3.h(aVar, "adClient");
        zq3.h(t6Var, "adManagerFactory");
        zq3.h(o7Var, "adService");
        zq3.h(mutableSharedFlow, "adEventSharedFlow");
        zq3.h(localAdCache, "localAdCache");
        zq3.h(coroutineScope, "scope");
        this.a = aVar;
        this.b = t6Var;
        this.c = o7Var;
        this.d = mutableSharedFlow;
        this.e = localAdCache;
        this.f = coroutineScope;
    }

    private final void f(String str, AdConfig adConfig) {
        s6 a = this.b.a();
        final Map f = adConfig.f();
        BuildersKt__Builders_commonKt.launch$default(this.f, null, null, new AdRepositoryImpl$fetchAd$1(this, str, f, null), 3, null);
        this.c.a(str, adConfig, a, new gt2() { // from class: com.nytimes.android.ads.AdRepositoryImpl$fetchAd$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(String str2, s6 s6Var) {
                zq3.h(str2, "pos");
                zq3.h(s6Var, "adManagerAdView");
                AdRepositoryImpl.this.i(str2, s6Var, f);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((String) obj, (s6) obj2);
                return ww8.a;
            }
        }, new gt2() { // from class: com.nytimes.android.ads.AdRepositoryImpl$fetchAd$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(String str2, AdError adError) {
                zq3.h(str2, "pos");
                zq3.h(adError, "error");
                AdRepositoryImpl.this.g(str2, adError, f);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((String) obj, (AdError) obj2);
                return ww8.a;
            }
        }, new ss2() { // from class: com.nytimes.android.ads.AdRepositoryImpl$fetchAd$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return ww8.a;
            }

            public final void invoke(String str2) {
                zq3.h(str2, "pos");
                AdRepositoryImpl.this.h(str2, f);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(String str, AdError adError, Map map) {
        this.e.e(str, new h02());
        if (adError == AdError.NO_FILL_ERROR || adError == AdError.MEDIATION_NO_FILL) {
            BuildersKt__Builders_commonKt.launch$default(this.f, null, null, new AdRepositoryImpl$onAdFailedToLoad$1(this, str, map, null), 3, null);
        } else {
            BuildersKt__Builders_commonKt.launch$default(this.f, null, null, new AdRepositoryImpl$onAdFailedToLoad$2(this, str, map, adError, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(String str, Map map) {
        BuildersKt__Builders_commonKt.launch$default(this.f, null, null, new AdRepositoryImpl$onAdImpression$1(this, str, map, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(String str, s6 s6Var, Map map) {
        this.e.e(str, new b8(s6Var));
        BuildersKt__Builders_commonKt.launch$default(this.f, null, null, new AdRepositoryImpl$onAdLoaded$1(this, str, map, null), 3, null);
    }

    @Override // defpackage.m7
    public Flow a(String str, AdConfig adConfig) {
        Long a;
        zq3.h(str, "adPosition");
        zq3.h(adConfig, "adConfig");
        Map f = adConfig.f();
        if (!adConfig.n()) {
            this.e.e(str, new h02());
            BuildersKt__Builders_commonKt.launch$default(this.f, null, null, new AdRepositoryImpl$getAd$1(this, str, adConfig, f, null), 3, null);
            return this.e.d(str);
        }
        if (!this.e.c(str)) {
            f(str, adConfig);
        }
        if (this.a.a() && (a = this.e.a(str)) != null) {
            BuildersKt__Builders_commonKt.launch$default(this.f, null, null, new AdRepositoryImpl$getAd$2$1(this, str, f, a.longValue(), null), 3, null);
            f(str, adConfig);
        }
        return this.e.d(str);
    }

    public /* synthetic */ AdRepositoryImpl(a aVar, t6 t6Var, o7 o7Var, MutableSharedFlow mutableSharedFlow, LocalAdCache localAdCache, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, t6Var, o7Var, mutableSharedFlow, (i & 16) != 0 ? new LocalAdCache(aVar.d()) : localAdCache, (i & 32) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()) : coroutineScope);
    }
}
