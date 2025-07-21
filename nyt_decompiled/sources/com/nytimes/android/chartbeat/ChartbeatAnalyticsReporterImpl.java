package com.nytimes.android.chartbeat;

import android.app.Application;
import android.content.Intent;
import com.chartbeat.androidsdk.Tracker;
import com.nytimes.abtests.ChartbeatDomainVariants;
import com.nytimes.android.api.cms.Asset;
import defpackage.bk0;
import defpackage.by0;
import defpackage.c04;
import defpackage.ck0;
import defpackage.dk0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.om6;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes.dex */
public final class ChartbeatAnalyticsReporterImpl implements dk0 {
    public static final a Companion = new a(null);
    private final Application a;
    private final c04 b;

    @fc1(c = "com.nytimes.android.chartbeat.ChartbeatAnalyticsReporterImpl$1", f = "ChartbeatAnalyticsReporter.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.chartbeat.ChartbeatAnalyticsReporterImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return ChartbeatAnalyticsReporterImpl.this.new AnonymousClass1(by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            ChartbeatAnalyticsReporterImpl.this.m();
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ChartbeatAnalyticsReporterImpl(final String str, Application application, CoroutineScope coroutineScope) {
        zq3.h(str, "envName");
        zq3.h(application, "application");
        zq3.h(coroutineScope, "scope");
        this.a = application;
        this.b = c.a(new qs2() { // from class: com.nytimes.android.chartbeat.ChartbeatAnalyticsReporterImpl$initializeTracker$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m196invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m196invoke() {
                Application application2;
                String l;
                Application application3;
                application2 = ChartbeatAnalyticsReporterImpl.this.a;
                String string = application2.getString(om6.chartbeat_application_id);
                l = ChartbeatAnalyticsReporterImpl.this.l(str);
                application3 = ChartbeatAnalyticsReporterImpl.this.a;
                Tracker.setupTracker(string, l, application3);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String l(String str) {
        if (zq3.c(str, ChartbeatDomainVariants.STAGING.toString())) {
            String string = this.a.getString(om6.chartbeat_stage_env);
            zq3.g(string, "getString(...)");
            return string;
        }
        if (!zq3.c(str, ChartbeatDomainVariants.PRODUCTION.toString())) {
            return "";
        }
        String string2 = this.a.getString(om6.chartbeat_prod_env);
        zq3.g(string2, "getString(...)");
        return string2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ww8 m() {
        this.b.getValue();
        return ww8.a;
    }

    @Override // defpackage.dk0
    public void a() {
        m();
        Tracker.setUserAnonymous();
    }

    @Override // defpackage.dk0
    public void b(String str, String str2) {
        m();
        Application application = this.a;
        bk0 bk0Var = bk0.a;
        if (str == null) {
            str = "";
        }
        String str3 = "nytimes.com/" + bk0Var.d(str);
        if (str2 == null) {
            str2 = "";
        }
        Tracker.trackView(application, str3, ck0.a(str2));
    }

    @Override // defpackage.dk0
    public void c() {
        m();
        Tracker.userInteracted();
    }

    @Override // defpackage.dk0
    public void d(Intent intent) {
        zq3.h(intent, "intent");
        m();
        String stringExtra = intent.getStringExtra("et2_referring_source_alertId");
        if (stringExtra == null) {
            stringExtra = "";
        }
        Tracker.setPushReferrer(stringExtra);
    }

    @Override // defpackage.dk0
    public void e(Asset asset) {
        zq3.h(asset, "asset");
        m();
        Tracker.trackView(this.a, asset.getUrl(), asset.getTitle());
        bk0 bk0Var = bk0.a;
        Tracker.setSections(bk0Var.b(asset.getSectionContentName(), asset.getSubsectionDisplayName(), asset.getDesk()));
        String byline = asset.getByline();
        if (byline == null || byline.length() < 4) {
            return;
        }
        Tracker.setAuthors(bk0Var.a(byline.toString()));
    }

    @Override // defpackage.dk0
    public void f(String str) {
        zq3.h(str, "viewId");
        m();
        Tracker.userLeftView(str);
    }

    @Override // defpackage.dk0
    public void g() {
        m();
        Tracker.setUserPaid();
    }

    @Override // defpackage.dk0
    public void h() {
        m();
        Tracker.setUserLoggedIn();
    }
}
