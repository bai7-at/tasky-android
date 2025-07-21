package com.nytimes.android.entitlements.di;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import androidx.preference.g;
import com.nytimes.android.entitlements.subauth.SubauthEntitlementClientImpl;
import com.nytimes.android.entitlements.subauth.SubauthPurchaseClientImpl;
import com.nytimes.android.entitlements.subauth.SubauthUserClientImpl;
import com.nytimes.android.secrets.Secrets;
import com.nytimes.android.subauth.core.api.setup.Subauth;
import com.nytimes.android.subauth.core.database.userdata.subscription.UserSubscriptionProduct;
import com.nytimes.android.subauth.credentialmanager.SubauthSSO;
import defpackage.a68;
import defpackage.b96;
import defpackage.c78;
import defpackage.d96;
import defpackage.f96;
import defpackage.h98;
import defpackage.hm6;
import defpackage.i77;
import defpackage.k78;
import defpackage.lk6;
import defpackage.n98;
import defpackage.qs2;
import defpackage.r35;
import defpackage.r98;
import defpackage.s98;
import defpackage.u98;
import defpackage.uj1;
import defpackage.z58;
import defpackage.z88;
import defpackage.zo3;
import defpackage.zq3;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.i;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class SubauthBridgeModule {
    public static final SubauthBridgeModule a = new SubauthBridgeModule();

    private SubauthBridgeModule() {
    }

    public final boolean a(f96 f96Var) {
        zq3.h(f96Var, "deps");
        return f96Var.a();
    }

    public final r35 b() {
        return new r35(null, null, null, null, 15, null);
    }

    public final MutableSharedFlow c() {
        return SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    public final Subauth d(Application application, r35 r35Var, final OkHttpClient okHttpClient, h98 h98Var, boolean z, Set set) {
        zq3.h(application, "app");
        zq3.h(r35Var, "networkConfig");
        zq3.h(okHttpClient, "okhttpClient");
        zq3.h(h98Var, "subauthSSO");
        zq3.h(set, "subauthListeners");
        Subauth.a h = new Subauth.a(null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, 0L, null, null, null, 2097151, null).b(application).n(r35Var).o(okHttpClient.interceptors()).g(Secrets.DATA_DOME_KEY.decode()).s(new qs2() { // from class: com.nytimes.android.entitlements.di.SubauthBridgeModule$provideSubauth$builder$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final OkHttpClient.Builder mo865invoke() {
                return zo3.b(new OkHttpClient.Builder(), (Interceptor[]) OkHttpClient.this.interceptors().toArray(new Interceptor[0]));
            }
        }).a(new SubauthBridgeModule$provideSubauth$builder$2(application, null)).f(new SubauthBridgeModule$provideSubauth$builder$3(application, null)).h(d96.Companion.a(application));
        String string = application.getString(lk6.lire_client_id);
        zq3.g(string, "getString(...)");
        Subauth.a d = h.k(string).j(h98Var).p(new b96(application, z)).q("mobile-newsreader-android").e(TimeUnit.SECONDS).d(UserSubscriptionProduct.e.INSTANCE);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            d = d.r((k78) it2.next());
        }
        return d.c();
    }

    public final z58 e(a68 a68Var) {
        zq3.h(a68Var, "subauthClientImpl");
        return a68Var;
    }

    public final c78 f(SubauthEntitlementClientImpl subauthEntitlementClientImpl) {
        zq3.h(subauthEntitlementClientImpl, "subauthEntitlements");
        return subauthEntitlementClientImpl;
    }

    public final SubauthSSO g() {
        return new SubauthSSO.Builder(null, null, null, 7, null).b(i.e(i77.b.b)).a();
    }

    public final z88 h(SubauthPurchaseClientImpl subauthPurchaseClientImpl) {
        zq3.h(subauthPurchaseClientImpl, "subauthPurchase");
        return subauthPurchaseClientImpl;
    }

    public final h98 i(SubauthSSO subauthSSO) {
        zq3.h(subauthSSO, "subauthSSO");
        return subauthSSO;
    }

    public final n98 j(SubauthUserClientImpl subauthUserClientImpl) {
        zq3.h(subauthUserClientImpl, "subauthUser");
        return subauthUserClientImpl;
    }

    public final n98.b k(SubauthUserClientImpl subauthUserClientImpl) {
        zq3.h(subauthUserClientImpl, "subauthUser");
        return subauthUserClientImpl;
    }

    public final r98 l(Subauth subauth, Application application) {
        zq3.h(subauth, "subauth");
        zq3.h(application, "application");
        Context applicationContext = application.getApplicationContext();
        r98.a b = new r98.a(null, null, null, null, null, null, null, null, null, null, 1023, null).b(subauth);
        Resources resources = application.getResources();
        zq3.g(resources, "getResources(...)");
        r98.a c = b.c(new uj1(resources, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, g.b(applicationContext).getBoolean(applicationContext.getString(hm6.subauth_smart_lock_save_key), true), null, true, null, null, false, null, null, null, 132907006, null).a());
        zq3.e(applicationContext);
        return c.a(applicationContext);
    }

    public final s98 m(u98 u98Var) {
        zq3.h(u98Var, "subauthUserUI");
        return u98Var;
    }
}
