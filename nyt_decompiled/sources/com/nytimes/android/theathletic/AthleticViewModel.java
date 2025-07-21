package com.nytimes.android.theathletic;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.compose.runtime.b0;
import androidx.lifecycle.q;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2CoroutineScope;
import com.nytimes.android.utils.AppPreferences;
import defpackage.bu1;
import defpackage.by0;
import defpackage.c78;
import defpackage.lk8;
import defpackage.nk6;
import defpackage.sy4;
import defpackage.we8;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class AthleticViewModel extends q {
    public static final a Companion = new a(null);
    public static final int h = 8;
    private static final float i = bu1.g(75);
    private final AppPreferences a;
    private final we8 b;
    private final Application c;
    private final sy4 d;
    private final sy4 e;
    private final boolean f;
    private final int g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return AthleticViewModel.i;
        }

        private a() {
        }
    }

    public AthleticViewModel(AppPreferences appPreferences, we8 we8Var, Application application, c78 c78Var) {
        zq3.h(appPreferences, "appPreferences");
        zq3.h(we8Var, "eventTracker");
        zq3.h(application, "application");
        zq3.h(c78Var, "subauthEntitlementClient");
        this.a = appPreferences;
        this.b = we8Var;
        this.c = application;
        this.d = b0.e(Boolean.FALSE, null, 2, null);
        this.e = b0.e(Boolean.valueOf(appPreferences.n("AthleticToolip.hasSeenEntitledTooltip", true) && c78Var.x()), null, 2, null);
        lk8 lk8Var = lk8.a;
        PackageManager packageManager = application.getPackageManager();
        zq3.g(packageManager, "getPackageManager(...)");
        boolean a2 = lk8Var.a(packageManager);
        this.f = a2;
        this.g = a2 ? nk6.the_athletic_charm_read : nk6.the_athletic_charm_download;
    }

    public final int f() {
        return this.g;
    }

    public final sy4 g() {
        return this.d;
    }

    public final sy4 i() {
        return this.e;
    }

    public final void j(Context context, String str) {
        zq3.h(context, "context");
        if (this.f) {
            this.b.e();
            lk8.a.b(context, str);
        } else {
            this.b.b();
            this.d.setValue(Boolean.TRUE);
        }
    }

    public final void k() {
        this.e.setValue(Boolean.FALSE);
    }

    public final void l() {
        this.b.d();
        this.d.setValue(Boolean.FALSE);
    }

    public final void m(Context context) {
        zq3.h(context, "context");
        this.b.a();
        lk8.a.c(context);
    }

    public final Object n(ET2CoroutineScope eT2CoroutineScope, by0 by0Var) {
        Object f = this.b.f(eT2CoroutineScope, by0Var);
        return f == kotlin.coroutines.intrinsics.a.h() ? f : ww8.a;
    }

    public final void o() {
        this.a.f("AthleticToolip.hasSeenEntitledTooltip", false);
    }
}
