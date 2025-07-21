package com.datadog.android.core.internal;

import android.app.Application;
import android.content.Context;
import com.datadog.android.Datadog;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.configuration.BatchSize;
import com.datadog.android.core.configuration.Configuration;
import com.datadog.android.core.configuration.UploadFrequency;
import com.datadog.android.core.internal.DatadogCore;
import com.datadog.android.core.internal.logger.SdkInternalLogger;
import com.datadog.android.core.internal.time.DefaultAppStartTimeProvider;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import com.datadog.android.ndk.internal.NdkCrashHandler;
import com.datadog.android.privacy.TrackingConsent;
import com.facebook.AuthenticationTokenClaims;
import defpackage.b11;
import defpackage.be0;
import defpackage.ib2;
import defpackage.jb2;
import defpackage.mj2;
import defpackage.ol2;
import defpackage.q36;
import defpackage.qs2;
import defpackage.r36;
import defpackage.rq3;
import defpackage.ss2;
import defpackage.tx0;
import defpackage.ua1;
import defpackage.uq3;
import defpackage.ww8;
import defpackage.ya2;
import defpackage.za2;
import defpackage.zq3;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import kotlin.text.h;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes2.dex */
public final class DatadogCore implements rq3 {
    public static final a l = new a(null);
    private static final long m = TimeUnit.SECONDS.toMillis(5);
    private static final long n = System.nanoTime();
    private final String a;
    private final String b;
    private final ol2.a c;
    private final be0 d;
    public CoreFeature e;
    private Thread f;
    private final Map g;
    private final Context h;
    private r36 i;
    private final InternalLogger j;
    private boolean k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return DatadogCore.n;
        }

        private a() {
        }
    }

    public DatadogCore(Context context, String str, String str2, ss2 ss2Var, ol2.a aVar, be0 be0Var) {
        zq3.h(context, "context");
        zq3.h(str, "instanceId");
        zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(ss2Var, "internalLoggerProvider");
        zq3.h(be0Var, "buildSdkVersionProvider");
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = be0Var;
        this.g = new ConcurrentHashMap();
        Context applicationContext = context.getApplicationContext();
        zq3.g(applicationContext, "context.applicationContext");
        this.h = applicationContext;
        this.j = (InternalLogger) ss2Var.invoke(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(DatadogCore datadogCore, Configuration configuration) {
        zq3.h(datadogCore, "this$0");
        zq3.h(configuration, "$configuration");
        ib2 d = datadogCore.d("rum");
        if (d == null) {
            return;
        }
        boolean g = configuration.g();
        long windowDurationMs$dd_sdk_android_core_release = configuration.f().e().getWindowDurationMs$dd_sdk_android_core_release();
        boolean z = configuration.f().k() != null;
        configuration.f().g();
        d.a(new uq3.a(g, windowDurationMs$dd_sdk_android_core_release, configuration.f().n().getBaseStepMs$dd_sdk_android_core_release(), z, false, configuration.f().d().getMaxBatchesPerUploadJob()));
    }

    private final void E(Context context) {
        if (context instanceof Application) {
            r36 r36Var = new r36(new q36(context, getName(), f()));
            ((Application) context).registerActivityLifecycleCallbacks(r36Var);
            this.i = r36Var;
        }
    }

    private final void F() {
        try {
            this.f = new Thread(new Runnable() { // from class: xa1
                @Override // java.lang.Runnable
                public final void run() {
                    DatadogCore.G(DatadogCore.this);
                }
            }, "datadog_shutdown");
            Runtime runtime = Runtime.getRuntime();
            Thread thread = this.f;
            if (thread == null) {
                zq3.z("shutdownHook");
                thread = null;
            }
            runtime.addShutdownHook(thread);
        } catch (IllegalArgumentException e) {
            InternalLogger.b.a(f(), InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.DatadogCore$setupShutdownHook$2
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Shutdown hook was rejected";
                }
            }, e, false, null, 48, null);
        } catch (IllegalStateException e2) {
            InternalLogger.b.a(f(), InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.DatadogCore$setupShutdownHook$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Unable to add shutdown hook, Runtime is already shutting down";
                }
            }, e2, false, null, 48, null);
            H();
        } catch (SecurityException e3) {
            InternalLogger.b.a(f(), InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.DatadogCore$setupShutdownHook$3
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Security Manager denied adding shutdown hook ";
                }
            }, e3, false, null, 48, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(DatadogCore datadogCore) {
        zq3.h(datadogCore, "this$0");
        datadogCore.H();
    }

    private final void p(Map map) {
        Object obj = map.get("_dd.source");
        if (obj != null && (obj instanceof String) && !h.d0((CharSequence) obj)) {
            r().k0((String) obj);
        }
        Object obj2 = map.get("_dd.sdk_version");
        if (obj2 != null && (obj2 instanceof String) && !h.d0((CharSequence) obj2)) {
            r().j0((String) obj2);
        }
        Object obj3 = map.get("_dd.version");
        if (obj3 == null || !(obj3 instanceof String) || h.d0((CharSequence) obj3)) {
            return;
        }
        r().F().a((String) obj3);
    }

    private final void t() {
        j(new b11(this));
    }

    private final boolean v(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    private final boolean w(String str) {
        return new Regex("[a-zA-Z0-9_:./-]{0,195}[a-zA-Z0-9_./-]").d(str);
    }

    private final Configuration x(Configuration configuration) {
        return Configuration.c(configuration, Configuration.c.b(configuration.f(), false, false, null, BatchSize.SMALL, UploadFrequency.FREQUENT, null, null, null, null, null, null, null, null, 8167, null), null, null, null, null, false, null, WebSocketProtocol.PAYLOAD_SHORT, null);
    }

    private final void y() {
        if (this.f != null) {
            try {
                Runtime runtime = Runtime.getRuntime();
                Thread thread = this.f;
                if (thread == null) {
                    zq3.z("shutdownHook");
                    thread = null;
                }
                runtime.removeShutdownHook(thread);
            } catch (IllegalStateException e) {
                InternalLogger.b.a(f(), InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.DatadogCore$removeShutdownHook$1
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "Unable to remove shutdown hook, Runtime is already shutting down";
                    }
                }, e, false, null, 48, null);
            } catch (SecurityException e2) {
                InternalLogger.b.a(f(), InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.DatadogCore$removeShutdownHook$2
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "Security Manager denied removing shutdown hook ";
                    }
                }, e2, false, null, 48, null);
            }
        }
    }

    private final void z(final Configuration configuration) {
        ConcurrencyExtKt.b(r().R(), "Configuration telemetry", m, TimeUnit.MILLISECONDS, f(), new Runnable() { // from class: wa1
            @Override // java.lang.Runnable
            public final void run() {
                DatadogCore.A(DatadogCore.this, configuration);
            }
        });
    }

    public final void B(CoreFeature coreFeature) {
        zq3.h(coreFeature, "<set-?>");
        this.e = coreFeature;
    }

    public void C(boolean z) {
        this.k = z;
    }

    public void D(TrackingConsent trackingConsent) {
        zq3.h(trackingConsent, "consent");
        r().Q().d(trackingConsent);
    }

    public final void H() {
        r36 r36Var;
        Iterator it2 = this.g.entrySet().iterator();
        while (it2.hasNext()) {
            ((SdkFeature) ((Map.Entry) it2.next()).getValue()).r();
        }
        this.g.clear();
        Context context = this.h;
        if ((context instanceof Application) && (r36Var = this.i) != null) {
            ((Application) context).unregisterActivityLifecycleCallbacks(r36Var);
        }
        r().t0();
        C(false);
        y();
    }

    @Override // defpackage.jb2
    public Map a(String str) {
        Map a2;
        zq3.h(str, "featureName");
        tx0 q = q();
        return (q == null || (a2 = q.a(str)) == null) ? t.i() : a2;
    }

    @Override // defpackage.rq3
    public List b() {
        return i.X0(this.g.values());
    }

    @Override // defpackage.vc7
    public String c() {
        return r().K();
    }

    @Override // defpackage.jb2
    public ib2 d(String str) {
        zq3.h(str, "featureName");
        return (ib2) this.g.get(str);
    }

    @Override // defpackage.jb2
    public void e(String str, ss2 ss2Var) {
        tx0 q;
        zq3.h(str, "featureName");
        zq3.h(ss2Var, "updateCallback");
        SdkFeature sdkFeature = (SdkFeature) this.g.get(str);
        if (sdkFeature == null || (q = q()) == null) {
            return;
        }
        synchronized (sdkFeature) {
            try {
                Map x = t.x(q.a(str));
                ss2Var.invoke(x);
                q.b(str, x);
                Map map = this.g;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (!zq3.c(entry.getKey(), str)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    ((SdkFeature) ((Map.Entry) it2.next()).getValue()).l(str, t.v(x));
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.jb2
    public InternalLogger f() {
        return this.j;
    }

    @Override // defpackage.rq3
    public mj2 g() {
        return r().w();
    }

    @Override // defpackage.vc7
    public String getName() {
        return this.b;
    }

    @Override // defpackage.jb2
    public void h(final String str, za2 za2Var) {
        zq3.h(str, "featureName");
        zq3.h(za2Var, "receiver");
        SdkFeature sdkFeature = (SdkFeature) this.g.get(str);
        if (sdkFeature == null) {
            InternalLogger.b.a(f(), InternalLogger.Level.WARN, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.internal.DatadogCore$setEventReceiver$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.US, "Cannot add event receiver for feature \"%s\", it is not registered.", Arrays.copyOf(new Object[]{str}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, null, false, null, 56, null);
            return;
        }
        if (sdkFeature.g().get() != null) {
            InternalLogger.b.a(f(), InternalLogger.Level.WARN, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.internal.DatadogCore$setEventReceiver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.US, "Feature \"%s\" already has event receiver registered, overwriting it.", Arrays.copyOf(new Object[]{str}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, null, false, null, 56, null);
        }
        sdkFeature.g().set(za2Var);
    }

    @Override // defpackage.jb2
    public void i(String str) {
        AtomicReference g;
        zq3.h(str, "featureName");
        SdkFeature sdkFeature = (SdkFeature) this.g.get(str);
        if (sdkFeature == null || (g = sdkFeature.g()) == null) {
            return;
        }
        g.set(null);
    }

    @Override // defpackage.jb2
    public void j(ya2 ya2Var) {
        zq3.h(ya2Var, "feature");
        SdkFeature sdkFeature = new SdkFeature(r(), ya2Var, f());
        this.g.put(ya2Var.getName(), sdkFeature);
        sdkFeature.k(this.h, this.a);
        String name = ya2Var.getName();
        if (zq3.c(name, "logs")) {
            r().B().b(this, NdkCrashHandler.ReportTarget.LOGS);
        } else if (zq3.c(name, "rum")) {
            r().B().b(this, NdkCrashHandler.ReportTarget.RUM);
        }
    }

    @Override // defpackage.rq3
    public ExecutorService k() {
        return r().G();
    }

    @Override // defpackage.rq3
    public ua1 l() {
        tx0 q = q();
        if (q != null) {
            return q.getContext();
        }
        return null;
    }

    public final tx0 q() {
        if (r().x().get()) {
            return r().r();
        }
        return null;
    }

    public final CoreFeature r() {
        CoreFeature coreFeature = this.e;
        if (coreFeature != null) {
            return coreFeature;
        }
        zq3.z("coreFeature");
        return null;
    }

    public final void s(Configuration configuration) {
        Configuration configuration2;
        zq3.h(configuration, "configuration");
        if (!w(configuration.h())) {
            throw new IllegalArgumentException("The environment name should contain maximum 196 of the following allowed characters [a-zA-Z0-9_:./-] and should never finish with a semicolon.In this case the Datadog SDK will not be initialised.");
        }
        if (v(this.h) && configuration.f().f()) {
            configuration2 = x(configuration);
            C(true);
            Datadog.h(2);
        } else {
            configuration2 = configuration;
        }
        ol2.a aVar = this.c;
        if (aVar == null) {
            aVar = CoreFeature.O.a();
        }
        B(new CoreFeature(f(), new DefaultAppStartTimeProvider(null, 1, null), aVar, CoreFeature.O.b()));
        r().V(this.h, this.a, configuration2, TrackingConsent.PENDING);
        p(configuration2.d());
        if (configuration2.g()) {
            t();
        }
        E(this.h);
        F();
        z(configuration);
    }

    public final boolean u() {
        return r().x().get();
    }

    public /* synthetic */ DatadogCore(Context context, String str, String str2, ss2 ss2Var, ol2.a aVar, be0 be0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, (i & 8) != 0 ? new ss2() { // from class: com.datadog.android.core.internal.DatadogCore.1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SdkInternalLogger invoke(jb2 jb2Var) {
                zq3.h(jb2Var, "it");
                return new SdkInternalLogger(jb2Var, null, null, 6, null);
            }
        } : ss2Var, (i & 16) != 0 ? null : aVar, (i & 32) != 0 ? be0.a.a() : be0Var);
    }
}
