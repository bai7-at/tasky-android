package com.nytimes.android.firebase;

import android.app.Application;
import android.content.res.Resources;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.facebook.AccessToken;
import com.google.firebase.installations.c;
import com.nytimes.android.analytics.handler.FacebookChannelHandler;
import com.nytimes.android.analytics.handler.FirebaseChannelHandler;
import com.nytimes.android.firebase.compliance.FirebasePurrEventInterceptor;
import com.nytimes.android.firebase.device.FirebaseInstanceIdEventInterceptor;
import com.nytimes.android.internal.pushmessaging.model.a;
import defpackage.bl6;
import defpackage.cb2;
import defpackage.d85;
import defpackage.f82;
import defpackage.hc;
import defpackage.mn;
import defpackage.nn;
import defpackage.o82;
import defpackage.pi2;
import defpackage.pn;
import defpackage.qh2;
import defpackage.r82;
import defpackage.vp1;
import defpackage.wc6;
import defpackage.zq3;
import kotlin.collections.b0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class FirebaseModule {
    public final hc a(FacebookChannelHandler facebookChannelHandler, FirebaseChannelHandler firebaseChannelHandler, mn mnVar, cb2 cb2Var, qh2 qh2Var, FirebasePurrEventInterceptor firebasePurrEventInterceptor, pi2 pi2Var, FirebaseInstanceIdEventInterceptor firebaseInstanceIdEventInterceptor, pn pnVar) {
        zq3.h(facebookChannelHandler, AccessToken.DEFAULT_GRAPH_DOMAIN);
        zq3.h(firebaseChannelHandler, "firebase");
        zq3.h(mnVar, "appsFlyer");
        zq3.h(cb2Var, "flags");
        zq3.h(qh2Var, "abInterceptor");
        zq3.h(firebasePurrEventInterceptor, "purrInterceptor");
        zq3.h(pi2Var, "mobileAgentEventInterceptor");
        zq3.h(firebaseInstanceIdEventInterceptor, "firebaseInstanceIdEventInterceptor");
        zq3.h(pnVar, "appsFlyerInterceptor");
        firebaseChannelHandler.f(qh2Var);
        firebaseChannelHandler.f(firebasePurrEventInterceptor);
        firebaseChannelHandler.f(pi2Var);
        firebaseChannelHandler.f(firebaseInstanceIdEventInterceptor);
        if (cb2Var.l()) {
            mnVar.f(pnVar);
        }
        return new hc(b0.j(facebookChannelHandler, firebaseChannelHandler, mnVar));
    }

    public final AppsFlyerConversionListener b(Application application) {
        zq3.h(application, "context");
        return new nn(application);
    }

    public final AppsFlyerLib c() {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        zq3.g(appsFlyerLib, "getInstance(...)");
        return appsFlyerLib;
    }

    public final vp1 d(r82 r82Var) {
        zq3.h(r82Var, "fcmTokenProvider");
        return new FirebaseModule$provideEventTrackerUserToken$1(r82Var);
    }

    public final f82 e(Application application, Resources resources, boolean z) {
        zq3.h(application, "app");
        zq3.h(resources, "resources");
        boolean z2 = resources.getBoolean(wc6.default_firebase_app_is_production);
        f82.a aVar = new f82.a(application);
        if (z != z2) {
            String string = resources.getString(bl6.non_default_firebase_app_project_id);
            String string2 = resources.getString(bl6.non_default_firebase_app_application_id);
            zq3.g(string2, "getString(...)");
            String string3 = resources.getString(bl6.non_default_firebase_app_api_key);
            zq3.g(string3, "getString(...)");
            aVar.b(new d85(string, string2, string3, resources.getString(bl6.non_default_firebase_app_database_url), resources.getString(bl6.non_default_firebase_app_storage_bucket)));
            aVar.c(z2 ? b0.j(a.d.d, a.b.d) : b0.d(a.c.d));
        }
        return aVar.a();
    }

    public final o82 f(f82 f82Var) {
        zq3.h(f82Var, "fcmProvider");
        return f82Var.b();
    }

    public final r82 g(f82 f82Var) {
        zq3.h(f82Var, "fcmProvider");
        return f82Var.a();
    }

    public final c h() {
        c p = c.p();
        zq3.g(p, "getInstance(...)");
        return p;
    }

    public final Flow i(c cVar) {
        zq3.h(cVar, "firebaseInstallations");
        return FlowKt.flow(new FirebaseModule$provideFirebaseInstanceId$1(cVar, null));
    }

    public final Flow j() {
        return FlowKt.flow(new FirebaseModule$provideFirebaseToken$1(null));
    }
}
