package com.nytimes.android.libs.analytics.appsflyerclient;

import android.app.Application;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.analytics.purr.PurrTrackerTypeWrapper;
import com.nytimes.android.logging.NYTLogger;
import defpackage.b04;
import defpackage.by0;
import defpackage.c04;
import defpackage.cb2;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.p86;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Map;
import kotlin.c;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class AppsFlyerClient {
    private final String a;
    private final Application b;
    private final cb2 c;
    private final CoroutineScope d;
    private final c04 e;
    private boolean f;

    @fc1(c = "com.nytimes.android.libs.analytics.appsflyerclient.AppsFlyerClient$1", f = "AppsFlyerClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.libs.analytics.appsflyerclient.AppsFlyerClient$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        public final Object b(boolean z, by0 by0Var) {
            return ((AnonymousClass1) create(Boolean.valueOf(z), by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = AppsFlyerClient.this.new AnonymousClass1(by0Var);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Boolean) obj).booleanValue(), (by0) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            boolean z = this.Z$0 && AppsFlyerClient.this.c.l();
            if (z && !AppsFlyerClient.this.g()) {
                AppsFlyerClient.this.f().start(AppsFlyerClient.this.b);
                AppsFlyerClient.this.f = true;
                NYTLogger.l("AppsFlyer on", new Object[0]);
            } else if (z || !AppsFlyerClient.this.g()) {
                NYTLogger.l("AppsFlyer do nothing, because isActive:" + AppsFlyerClient.this.g() + " && isAllowed:" + z, new Object[0]);
            } else {
                AppsFlyerClient.this.f().stop(true, AppsFlyerClient.this.b);
                AppsFlyerClient.this.f = false;
                NYTLogger.l("AppsFlyer off", new Object[0]);
            }
            return ww8.a;
        }
    }

    @fc1(c = "com.nytimes.android.libs.analytics.appsflyerclient.AppsFlyerClient$2", f = "AppsFlyerClient.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.libs.analytics.appsflyerclient.AppsFlyerClient$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements it2 {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(by0 by0Var) {
            super(3, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            NYTLogger.i((Throwable) this.L$0, "Something goes wrong", new Object[0]);
            return ww8.a;
        }

        @Override // defpackage.it2
        public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(by0Var);
            anonymousClass2.L$0 = th;
            return anonymousClass2.invokeSuspend(ww8.a);
        }
    }

    public AppsFlyerClient(final b04 b04Var, String str, Application application, cb2 cb2Var, final AppsFlyerConversionListener appsFlyerConversionListener, p86 p86Var, CoroutineDispatcher coroutineDispatcher) {
        CompletableJob Job$default;
        zq3.h(b04Var, "lazyAppsFlyerLib");
        zq3.h(str, "appsFlyerDevId");
        zq3.h(application, "application");
        zq3.h(cb2Var, "featureFlagUtil");
        zq3.h(appsFlyerConversionListener, "appsFlyerConversionListener");
        zq3.h(p86Var, "purrAnalyticsHelper");
        zq3.h(coroutineDispatcher, "defaultDispatcher");
        this.a = str;
        this.b = application;
        this.c = cb2Var;
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Job$default.plus(coroutineDispatcher));
        this.d = CoroutineScope;
        this.e = c.a(new qs2() { // from class: com.nytimes.android.libs.analytics.appsflyerclient.AppsFlyerClient$appsFlyer$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AppsFlyerLib mo865invoke() {
                String str2;
                Object obj = b04.this.get();
                AppsFlyerClient appsFlyerClient = this;
                AppsFlyerConversionListener appsFlyerConversionListener2 = appsFlyerConversionListener;
                AppsFlyerLib appsFlyerLib = (AppsFlyerLib) obj;
                str2 = appsFlyerClient.a;
                appsFlyerLib.init(str2, appsFlyerConversionListener2, appsFlyerClient.b);
                NYTLogger.l("AppsFlyer initialized", new Object[0]);
                return appsFlyerLib;
            }
        });
        FlowKt.launchIn(FlowKt.m911catch(FlowKt.onEach(p86.a.b(p86Var, PurrTrackerTypeWrapper.CONTROLLER, CoroutineScope, null, 4, null), new AnonymousClass1(null)), new AnonymousClass2(null)), CoroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppsFlyerLib f() {
        Object value = this.e.getValue();
        zq3.g(value, "getValue(...)");
        return (AppsFlyerLib) value;
    }

    public final boolean g() {
        return this.f;
    }

    public final void h(String str, Map map) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(map, "values");
        if (!this.f) {
            NYTLogger.g("AppsFlyer could not send " + str, new Object[0]);
            return;
        }
        f().logEvent(this.b, str, map);
        NYTLogger.l("AppsFlyer is sending event " + str, new Object[0]);
    }
}
