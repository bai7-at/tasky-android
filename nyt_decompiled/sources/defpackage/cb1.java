package defpackage;

import android.app.Application;
import androidx.preference.g;
import androidx.recyclerview.widget.RecyclerView;
import com.datadog.android.Datadog;
import com.datadog.android.core.configuration.Configuration;
import com.datadog.android.log.Logger;
import com.datadog.android.privacy.TrackingConsent;
import com.datadog.android.trace.AndroidTracer;
import com.datadog.android.trace.TracingHeaderType;
import com.nytimes.android.performancetrackerclientphoenix.tracing.TracingMetadataImpl;
import com.nytimes.android.performancetrackerclientphoenix.utils.PerformanceTrackerAnalyticsUtils;
import com.nytimes.android.secrets.Secrets;
import com.nytimes.android.utils.DeviceUtils;
import defpackage.sa4;
import defpackage.si1;
import defpackage.yo8;
import io.opentracing.util.GlobalTracer;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class cb1 {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements tb5 {
        final /* synthetic */ cb2 a;
        final /* synthetic */ pb5 b;

        b(cb2 cb2Var, pb5 pb5Var) {
            this.a = cb2Var;
            this.b = pb5Var;
        }

        @Override // defpackage.tb5
        public int a() {
            return RecyclerView.UNDEFINED_DURATION;
        }

        @Override // defpackage.tb5
        public List b() {
            return this.a.q() ? i.e(this.b) : i.l();
        }
    }

    private final boolean a(Application application) {
        if (!DeviceUtils.z(application)) {
            return false;
        }
        String string = application.getString(ck6.STAGING);
        zq3.g(string, "getString(...)");
        String string2 = application.getString(ck6.com_nytimes_android_phoenix_beta_DATADOG_ENVIRONMENT);
        zq3.g(string2, "getString(...)");
        return zq3.c(string, g.b(application).getString(string2, string));
    }

    private final void h(Logger logger, so1 so1Var, com.nytimes.android.entitlements.a aVar, Application application) {
        PerformanceTrackerAnalyticsUtils.a.c(logger, t.m(du8.a("app_version", so1Var.a()), du8.a("build_configuration", so1Var.b()), du8.a("os_version", so1Var.h())), t.m(du8.a("device", so1Var.d()), du8.a("device_identifier", so1Var.c()), du8.a("webview_package", so1Var.j())), aVar, DeviceUtils.v(application));
    }

    private final void i(so1 so1Var) {
        so8.b(new yo8.a().a(), null, 2, null);
        AndroidTracer.Builder f = new AndroidTracer.Builder(null, 1, null).a("app_version", so1Var.a()).a("build_configuration", so1Var.b()).a("os_version", so1Var.h()).a("device", so1Var.d()).a("device_identifier", so1Var.c()).g(b0.j(TracingHeaderType.TRACECONTEXT, TracingHeaderType.DATADOG, TracingHeaderType.B3)).f(25.0d);
        String j = so1Var.j();
        if (j != null) {
            f.a("webview_package", j);
        }
        GlobalTracer.b(f.b());
    }

    public final yk8 b(Logger logger) {
        zq3.h(logger, "dataDogLogger");
        return new ya1(logger);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Logger c(Application application, cb2 cb2Var, so1 so1Var, com.nytimes.android.entitlements.a aVar) {
        String decode;
        String decode2;
        String str;
        zq3.h(application, "application");
        zq3.h(cb2Var, "featureFlagUtil");
        zq3.h(so1Var, "deviceConfig");
        zq3.h(aVar, "eCommClient");
        int i = 1;
        vc7 vc7Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (!cb2Var.p()) {
            return new Logger.Builder(vc7Var, i, objArr3 == true ? 1 : 0).a();
        }
        if (a(application)) {
            decode = Secrets.DATADOG_STG.decode();
            decode2 = Secrets.DATADOG_STG_APPLICATION_ID.decode();
            str = "stg";
        } else {
            decode = Secrets.DATADOG_PROD.decode();
            decode2 = Secrets.DATADOG_PROD_APPLICATION_ID.decode();
            str = "prd";
        }
        Datadog.d(application, new Configuration.a(decode, str, decode2, "android-core").b(false).c(true).a(), TrackingConsent.GRANTED);
        if (!Datadog.g(null, 1, null)) {
            throw new IllegalStateException("Datadog not initialized");
        }
        boolean q = cb2Var.q();
        if (q) {
            i(so1Var);
        }
        Datadog.h(2);
        ra4.b(new sa4.a().a(), null, 2, null);
        Logger a2 = new Logger.Builder(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0).h("android-core").g(true).e(true).d(q).e(true).f("com.nytimes.NYTimes").a();
        h(a2, so1Var, aVar, application);
        return a2;
    }

    public final tb5 d(cb2 cb2Var, pb5 pb5Var) {
        zq3.h(cb2Var, "featureFlagUtil");
        zq3.h(pb5Var, "nytTracingInterceptor");
        return new b(cb2Var, pb5Var);
    }

    public final com.nytimes.android.coroutinesutils.b e(si1.a aVar) {
        zq3.h(aVar, "builder");
        return si1.a.b(aVar, "HomeContentLoadJourney", "HomeContentLoadJourney", null, 4, null);
    }

    public final com.nytimes.android.coroutinesutils.b f(si1.a aVar) {
        zq3.h(aVar, "builder");
        return si1.a.b(aVar, "HomeDataStore", null, null, 6, null);
    }

    public final com.nytimes.android.performancetrackerclientphoenix.tracing.a g() {
        return new TracingMetadataImpl();
    }
}
