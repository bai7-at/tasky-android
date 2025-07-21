package com.datadog.android.core.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import com.datadog.android.DatadogSite;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.configuration.BatchProcessingLevel;
import com.datadog.android.core.configuration.BatchSize;
import com.datadog.android.core.configuration.Configuration;
import com.datadog.android.core.configuration.UploadFrequency;
import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.core.internal.data.upload.GzipRequestInterceptor;
import com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider;
import com.datadog.android.core.internal.net.info.NetworkInfoDeserializer;
import com.datadog.android.core.internal.persistence.JsonObjectDeserializer;
import com.datadog.android.core.internal.persistence.file.FileExtKt;
import com.datadog.android.core.internal.persistence.file.FileMover;
import com.datadog.android.core.internal.system.BroadcastReceiverSystemInfoProvider;
import com.datadog.android.core.internal.system.DefaultAndroidInfoProvider;
import com.datadog.android.core.internal.thread.LoggingScheduledThreadPoolExecutor;
import com.datadog.android.core.internal.time.DatadogNtpEndpoint;
import com.datadog.android.core.internal.time.LoggingSyncListener;
import com.datadog.android.core.internal.user.UserInfoDeserializer;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import com.datadog.android.ndk.internal.DatadogNdkCrashHandler;
import com.datadog.android.ndk.internal.NdkCrashHandler;
import com.datadog.android.ndk.internal.NdkCrashLogDeserializer;
import com.datadog.android.ndk.internal.b;
import com.datadog.android.ndk.internal.d;
import com.datadog.android.privacy.TrackingConsent;
import com.google.gson.JsonObject;
import defpackage.bb7;
import defpackage.bn;
import defpackage.bp6;
import defpackage.c04;
import defpackage.cy8;
import defpackage.db7;
import defpackage.em8;
import defpackage.gm0;
import defpackage.h75;
import defpackage.i30;
import defpackage.i75;
import defpackage.ir5;
import defpackage.j12;
import defpackage.j30;
import defpackage.jf;
import defpackage.k47;
import defpackage.lh1;
import defpackage.lq8;
import defpackage.mb1;
import defpackage.n65;
import defpackage.o65;
import defpackage.oe8;
import defpackage.ol2;
import defpackage.pe2;
import defpackage.q65;
import defpackage.q75;
import defpackage.qs2;
import defpackage.r65;
import defpackage.r75;
import defpackage.re2;
import defpackage.ri1;
import defpackage.su0;
import defpackage.tx0;
import defpackage.tx3;
import defpackage.u60;
import defpackage.uy4;
import defpackage.v35;
import defpackage.va1;
import defpackage.wx3;
import defpackage.x38;
import defpackage.y27;
import defpackage.yj0;
import defpackage.ym;
import defpackage.zd;
import defpackage.zj8;
import defpackage.zq3;
import io.embrace.android.embracesdk.storage.EmbraceStorageServiceKt;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.c;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import okhttp3.CipherSuite;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.TlsVersion;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes2.dex */
public final class CoreFeature {
    public static final a O = new a(null);
    private static final ol2.a P = new ol2.a() { // from class: zz0
        @Override // ol2.a
        public final ol2 a(InternalLogger internalLogger, String str, j30 j30Var) {
            ol2 c;
            c = CoreFeature.c(internalLogger, str, j30Var);
            return c;
        }
    };
    private static final bb7 Q = new bb7() { // from class: a01
    };
    private static final long R = TimeUnit.SECONDS.toMillis(45);
    private static final CipherSuite[] S = {CipherSuite.TLS_AES_128_GCM_SHA256, CipherSuite.TLS_AES_256_GCM_SHA384, CipherSuite.TLS_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384};
    private static boolean T;
    private BatchProcessingLevel A;
    private NdkCrashHandler B;
    private DatadogSite C;
    private String D;
    private cy8 E;
    public ScheduledThreadPoolExecutor F;
    public ol2 G;
    public j30 H;
    public File I;
    public jf J;
    private final Map K;
    private final c04 L;
    private final c04 M;
    private final c04 N;
    private final InternalLogger a;
    private final ym b;
    private final ol2.a c;
    private final bb7 d;
    private final AtomicBoolean e;
    private WeakReference f;
    private lh1 g;
    private v35 h;
    private oe8 i;
    private em8 j;
    private su0 k;
    private uy4 l;
    private tx0 m;
    public OkHttpClient n;
    private tx3 o;
    private String p;
    private String q;
    private bn r;
    private String s;
    private String t;
    private String u;
    private boolean v;
    private String w;
    private String x;
    private BatchSize y;
    private UploadFrequency z;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ol2.a a() {
            return CoreFeature.P;
        }

        public final bb7 b() {
            return CoreFeature.Q;
        }

        private a() {
        }
    }

    public CoreFeature(InternalLogger internalLogger, ym ymVar, ol2.a aVar, bb7 bb7Var) {
        zq3.h(internalLogger, "internalLogger");
        zq3.h(ymVar, "appStartTimeProvider");
        zq3.h(aVar, "executorServiceFactory");
        zq3.h(bb7Var, "scheduledExecutorServiceFactory");
        this.a = internalLogger;
        this.b = ymVar;
        this.c = aVar;
        this.d = bb7Var;
        this.e = new AtomicBoolean(false);
        this.f = new WeakReference(null);
        this.g = new lh1(t.i());
        this.h = new i75();
        this.i = new q75();
        this.j = new r75();
        this.k = new q65();
        this.l = new h75();
        this.m = new r65();
        this.p = "";
        this.q = "";
        this.r = new o65();
        this.s = "";
        this.t = "android";
        this.u = "2.15.1";
        this.v = true;
        this.w = "";
        this.x = "";
        this.y = BatchSize.MEDIUM;
        this.z = UploadFrequency.AVERAGE;
        this.A = BatchProcessingLevel.MEDIUM;
        this.B = new d();
        this.C = DatadogSite.US1;
        this.K = new ConcurrentHashMap();
        this.L = c.a(new qs2() { // from class: com.datadog.android.core.internal.CoreFeature$lastViewEvent$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final JsonObject mo865invoke() {
                JsonObject d0;
                d0 = CoreFeature.this.d0();
                if (d0 != null) {
                    CoreFeature.this.k();
                }
                return d0;
            }
        });
        this.M = c.a(new qs2() { // from class: com.datadog.android.core.internal.CoreFeature$lastViewEventFile$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final File mo865invoke() {
                return new File(CoreFeature.this.N(), "last_view_event");
            }
        });
        this.N = c.a(new qs2() { // from class: com.datadog.android.core.internal.CoreFeature$lastViewEventFileWriter$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final u60 mo865invoke() {
                InternalLogger internalLogger2;
                u60.a aVar2 = u60.a;
                internalLogger2 = CoreFeature.this.a;
                CoreFeature.this.A();
                return aVar2.a(internalLogger2, null);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.content.pm.PackageInfo] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    private final PackageInfo E(Context context) {
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (Build.VERSION.SDK_INT >= 33) {
                String str = this.q;
                of = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo(str, of);
                this = packageInfo;
            } else {
                this = packageManager.getPackageInfo(this.q, 0);
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            InternalLogger.b.a(this.a, InternalLogger.Level.ERROR, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.internal.CoreFeature$getPackageInfo$2
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Unable to read your application's version name";
                }
            }, e, false, null, 48, null);
            return null;
        }
    }

    private final Context I(Context context) {
        Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        return createDeviceProtectedStorageContext == null ? context : createDeviceProtectedStorageContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(CoreFeature coreFeature, Context context) {
        zq3.h(coreFeature, "this$0");
        zq3.h(context, "$appContext");
        coreFeature.X(context);
    }

    private final void X(Context context) {
        tx3 b;
        Context I = I(context);
        zd zdVar = zd.a;
        List o = i.o(DatadogNtpEndpoint.NTP_0, DatadogNtpEndpoint.NTP_1, DatadogNtpEndpoint.NTP_2, DatadogNtpEndpoint.NTP_3);
        ArrayList arrayList = new ArrayList(i.w(o, 10));
        Iterator it2 = o.iterator();
        while (it2.hasNext()) {
            arrayList.add(((DatadogNtpEndpoint) it2.next()).getHost());
        }
        TimeUnit timeUnit = TimeUnit.MINUTES;
        long millis = timeUnit.toMillis(30L);
        b = zd.b(I, (r21 & 2) != 0 ? null : new LoggingSyncListener(this.a), (r21 & 4) != 0 ? ri1.f.d() : arrayList, (r21 & 8) != 0 ? ri1.f.e() : 0L, (r21 & 16) != 0 ? ri1.f.c() : timeUnit.toMillis(5L), (r21 & 32) != 0 ? ri1.f.a() : millis, (r21 & 64) != 0 ? ri1.f.b() : 0L);
        if (!T) {
            try {
                b.a();
            } catch (IllegalStateException e) {
                InternalLogger.b.a(this.a, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.CoreFeature$initializeClockSync$2$1
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "Unable to launch a synchronize local time with an NTP server.";
                    }
                }, e, false, null, 48, null);
            }
        }
        this.j = new wx3(b);
        this.o = b;
    }

    private final void Z(String str) {
        if (this.v) {
            File N = N();
            ol2 G = G();
            NdkCrashLogDeserializer ndkCrashLogDeserializer = new NdkCrashLogDeserializer(this.a);
            NetworkInfoDeserializer networkInfoDeserializer = new NetworkInfoDeserializer(this.a);
            UserInfoDeserializer userInfoDeserializer = new UserInfoDeserializer(this.a);
            InternalLogger internalLogger = this.a;
            re2 a2 = re2.b.a(internalLogger, null);
            qs2 qs2Var = new qs2() { // from class: com.datadog.android.core.internal.CoreFeature$prepareNdkCrashData$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final JsonObject mo865invoke() {
                    return CoreFeature.this.y();
                }
            };
            if (str == null) {
                str = EmbraceStorageServiceKt.NATIVE_CRASH_FILE_FOLDER;
            }
            DatadogNdkCrashHandler datadogNdkCrashHandler = new DatadogNdkCrashHandler(N, G, ndkCrashLogDeserializer, networkInfoDeserializer, userInfoDeserializer, internalLogger, a2, qs2Var, str);
            this.B = datadogNdkCrashHandler;
            datadogNdkCrashHandler.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r2 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a0(android.content.Context r4, com.datadog.android.core.configuration.Configuration r5) {
        /*
            r3 = this;
            java.lang.String r0 = r4.getPackageName()
            java.lang.String r1 = "appContext.packageName"
            defpackage.zq3.g(r0, r1)
            r3.q = r0
            android.content.pm.PackageInfo r0 = r3.E(r4)
            if (r0 == 0) goto L1d
            java.lang.String r2 = r0.versionName
            if (r2 != 0) goto L1b
            int r0 = r0.versionCode
            java.lang.String r2 = java.lang.String.valueOf(r0)
        L1b:
            if (r2 != 0) goto L1f
        L1d:
            java.lang.String r2 = "?"
        L1f:
            fg1 r0 = new fg1
            r0.<init>(r2)
            r3.r = r0
            java.lang.String r0 = r5.e()
            r3.p = r0
            java.lang.String r0 = r5.i()
            if (r0 != 0) goto L39
            java.lang.String r0 = r4.getPackageName()
            defpackage.zq3.g(r0, r1)
        L39:
            r3.s = r0
            java.lang.String r0 = r5.h()
            r3.w = r0
            java.lang.String r5 = r5.j()
            r3.x = r5
            java.lang.String r5 = r3.b0(r4)
            r3.D = r5
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r4)
            r3.f = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.core.internal.CoreFeature.a0(android.content.Context, com.datadog.android.core.configuration.Configuration):void");
    }

    private final String b0(Context context) {
        try {
            InputStream open = context.getAssets().open("datadog.buildId");
            zq3.g(open, "open(BUILD_ID_FILE_NAME)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, yj0.b), 8192);
            try {
                String obj = h.c1(zj8.f(bufferedReader)).toString();
                gm0.a(bufferedReader, null);
                return obj;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    gm0.a(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (FileNotFoundException unused) {
            InternalLogger.b.a(this.a, InternalLogger.Level.INFO, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.internal.CoreFeature$readBuildId$1$2
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Build ID is not found in the application assets. If you are using obfuscation, please use Datadog Gradle Plugin 1.13.0 or above to be able to de-obfuscate stacktraces.";
                }
            }, null, false, null, 56, null);
            return null;
        } catch (Exception e) {
            InternalLogger.b.b(this.a, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.internal.CoreFeature$readBuildId$1$3
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Failed to read Build ID information, de-obfuscation may not work properly.";
                }
            }, e, false, null, 48, null);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ol2 c(InternalLogger internalLogger, String str, j30 j30Var) {
        zq3.h(internalLogger, "logger");
        zq3.h(str, "executorContext");
        zq3.h(j30Var, "backPressureStrategy");
        return new i30(internalLogger, str, j30Var);
    }

    private final void c0(Configuration.c cVar) {
        this.y = cVar.e();
        this.z = cVar.n();
        cVar.g();
        cVar.j();
        this.C = cVar.m();
        g0(cVar.c());
        this.E = cVar.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonObject d0() {
        File d;
        if (FileExtKt.d(z(), this.a)) {
            d = z();
        } else {
            d = DatadogNdkCrashHandler.p.d(N());
            if (!FileExtKt.d(d, this.a)) {
                d = null;
            }
        }
        if (d == null) {
            return null;
        }
        List a2 = u60.a.a(this.a, null).a(d);
        if (a2.isEmpty()) {
            return null;
        }
        return new JsonObjectDeserializer(this.a).a(new String(((bp6) i.w0(a2)).a(), yj0.b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void e0(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        int myPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = null;
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            Iterator<T> it2 = runningAppProcesses.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((ActivityManager.RunningAppProcessInfo) next).pid == myPid) {
                    runningAppProcessInfo = next;
                    break;
                }
            }
            runningAppProcessInfo = runningAppProcessInfo;
        }
        this.v = runningAppProcessInfo == null ? true : zq3.c(context.getPackageName(), runningAppProcessInfo.processName);
    }

    private final void i() {
        this.p = "";
        this.q = "";
        this.r = new o65();
        this.s = "";
        this.t = "android";
        this.u = "2.15.1";
        this.v = true;
        this.w = "";
        this.x = "";
    }

    private final void j() {
        this.g = new lh1(t.i());
        this.h = new i75();
        this.i = new q75();
        this.j = new r75();
        this.k = new q65();
        this.l = new h75();
        f0(new n65());
    }

    private final void n0() {
        m0(new LoggingScheduledThreadPoolExecutor(1, "upload", this.a, n()));
        i0(this.c.a(this.a, "storage", n()));
    }

    private final void o0(Context context, TrackingConsent trackingConsent) {
        this.k = new lq8(trackingConsent);
        BroadcastReceiverSystemInfoProvider broadcastReceiverSystemInfoProvider = new BroadcastReceiverSystemInfoProvider(this.a);
        this.i = broadcastReceiverSystemInfoProvider;
        broadcastReceiverSystemInfoProvider.a(context);
        p0(context);
        r0();
    }

    private final void p0(Context context) {
        CallbackNetworkInfoProvider callbackNetworkInfoProvider = new CallbackNetworkInfoProvider(new db7(new b(N(), this.k, G(), re2.b.a(this.a, null), new FileMover(this.a), this.a, h()), G(), this.a), null, this.a, 2, null);
        this.h = callbackNetworkInfoProvider;
        callbackNetworkInfoProvider.a(context);
    }

    private final void q0(Configuration.c cVar) {
        ConnectionSpec build;
        if (cVar.i()) {
            build = ConnectionSpec.CLEARTEXT;
        } else {
            ConnectionSpec.Builder tlsVersions = new ConnectionSpec.Builder(ConnectionSpec.RESTRICTED_TLS).tlsVersions(TlsVersion.TLS_1_2, TlsVersion.TLS_1_3);
            CipherSuite[] cipherSuiteArr = S;
            build = tlsVersions.cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length)).build();
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long j = R;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        builder.callTimeout(j, timeUnit).writeTimeout(j, timeUnit).protocols(i.o(Protocol.HTTP_2, Protocol.HTTP_1_1)).connectionSpecs(i.e(build));
        builder.addInterceptor(new GzipRequestInterceptor(this.a));
        if (cVar.k() != null) {
            builder.proxy(cVar.k());
            builder.proxyAuthenticator(cVar.l());
        }
        builder.dns(new y27(null, 0L, 3, null));
        h0(builder.build());
    }

    private final void r0() {
        this.l = new mb1(new db7(new com.datadog.android.ndk.internal.c(N(), this.k, G(), re2.b.a(this.a, null), new FileMover(this.a), this.a, h()), G(), this.a));
    }

    private final void s0() {
        R().shutdownNow();
        G().shutdownNow();
        try {
            try {
                ScheduledThreadPoolExecutor R2 = R();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                R2.awaitTermination(1L, timeUnit);
                G().awaitTermination(1L, timeUnit);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } catch (SecurityException e) {
            InternalLogger.b.a(this.a, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.CoreFeature$shutDownExecutors$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Thread was unable to set its own interrupted state";
                }
            }, e, false, null, 48, null);
        }
    }

    private final File z() {
        return (File) this.M.getValue();
    }

    public final j12 A() {
        return null;
    }

    public final NdkCrashHandler B() {
        return this.B;
    }

    public final v35 C() {
        return this.h;
    }

    public final OkHttpClient D() {
        OkHttpClient okHttpClient = this.n;
        if (okHttpClient != null) {
            return okHttpClient;
        }
        zq3.z("okHttpClient");
        return null;
    }

    public final bn F() {
        return this.r;
    }

    public final ol2 G() {
        ol2 ol2Var = this.G;
        if (ol2Var != null) {
            return ol2Var;
        }
        zq3.z("persistenceExecutorService");
        return null;
    }

    public final ir5.b H() {
        return null;
    }

    public final String J() {
        return this.u;
    }

    public final String K() {
        return this.s;
    }

    public final DatadogSite L() {
        return this.C;
    }

    public final String M() {
        return this.t;
    }

    public final File N() {
        File file = this.I;
        if (file != null) {
            return file;
        }
        zq3.z("storageDir");
        return null;
    }

    public final oe8 O() {
        return this.i;
    }

    public final em8 P() {
        return this.j;
    }

    public final su0 Q() {
        return this.k;
    }

    public final ScheduledThreadPoolExecutor R() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.F;
        if (scheduledThreadPoolExecutor != null) {
            return scheduledThreadPoolExecutor;
        }
        zq3.z("uploadExecutorService");
        return null;
    }

    public final UploadFrequency S() {
        return this.z;
    }

    public final uy4 T() {
        return this.l;
    }

    public final String U() {
        return this.x;
    }

    public final void V(final Context context, final String str, Configuration configuration, TrackingConsent trackingConsent) {
        zq3.h(context, "appContext");
        zq3.h(str, "sdkInstanceId");
        zq3.h(configuration, "configuration");
        zq3.h(trackingConsent, "consent");
        if (this.e.get()) {
            return;
        }
        c0(configuration.f());
        a0(context, configuration);
        e0(context);
        n0();
        ConcurrencyExtKt.c(G(), "NTP Sync initialization", k47.a(), new Runnable() { // from class: yz0
            @Override // java.lang.Runnable
            public final void run() {
                CoreFeature.W(CoreFeature.this, context);
            }
        });
        q0(configuration.f());
        this.g.d(configuration.f().h());
        f0(new DefaultAndroidInfoProvider(context));
        l0((File) x38.a(new qs2() { // from class: com.datadog.android.core.internal.CoreFeature$initialize$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final File mo865invoke() {
                File cacheDir = context.getCacheDir();
                String format = String.format(Locale.US, "datadog-%s", Arrays.copyOf(new Object[]{str}, 1));
                zq3.g(format, "format(...)");
                return new File(cacheDir, format);
            }
        }));
        Object obj = configuration.d().get("_dd.native_source_type");
        Z(obj instanceof String ? (String) obj : null);
        o0(context, trackingConsent);
        this.e.set(true);
        this.m = new va1(this);
    }

    public final boolean Y() {
        return this.v;
    }

    public final void f0(jf jfVar) {
        zq3.h(jfVar, "<set-?>");
        this.J = jfVar;
    }

    public final void g0(j30 j30Var) {
        zq3.h(j30Var, "<set-?>");
        this.H = j30Var;
    }

    public final pe2 h() {
        return new pe2(this.y.getWindowDurationMs$dd_sdk_android_core_release(), 0L, 0L, 0, 0L, 0L, 0L, WebSocketProtocol.PAYLOAD_SHORT, null);
    }

    public final void h0(OkHttpClient okHttpClient) {
        zq3.h(okHttpClient, "<set-?>");
        this.n = okHttpClient;
    }

    public final void i0(ol2 ol2Var) {
        zq3.h(ol2Var, "<set-?>");
        this.G = ol2Var;
    }

    public final void j0(String str) {
        zq3.h(str, "<set-?>");
        this.u = str;
    }

    public final void k() {
        if (FileExtKt.d(z(), this.a)) {
            FileExtKt.c(z(), this.a);
            return;
        }
        File d = DatadogNdkCrashHandler.p.d(N());
        if (FileExtKt.d(d, this.a)) {
            FileExtKt.c(d, this.a);
        }
    }

    public final void k0(String str) {
        zq3.h(str, "<set-?>");
        this.t = str;
    }

    public final jf l() {
        jf jfVar = this.J;
        if (jfVar != null) {
            return jfVar;
        }
        zq3.z("androidInfoProvider");
        return null;
    }

    public final void l0(File file) {
        zq3.h(file, "<set-?>");
        this.I = file;
    }

    public final String m() {
        return this.D;
    }

    public final void m0(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        zq3.h(scheduledThreadPoolExecutor, "<set-?>");
        this.F = scheduledThreadPoolExecutor;
    }

    public final j30 n() {
        j30 j30Var = this.H;
        if (j30Var != null) {
            return j30Var;
        }
        zq3.z("backpressureStrategy");
        return null;
    }

    public final BatchProcessingLevel o() {
        return this.A;
    }

    public final BatchSize p() {
        return this.y;
    }

    public final String q() {
        return this.p;
    }

    public final tx0 r() {
        return this.m;
    }

    public final WeakReference s() {
        return this.f;
    }

    public final cy8 t() {
        return this.E;
    }

    public final void t0() {
        if (this.e.get()) {
            Context context = (Context) this.f.get();
            if (context != null) {
                this.h.b(context);
                this.i.b(context);
            }
            this.f.clear();
            this.k.a();
            i();
            j();
            s0();
            try {
                tx3 tx3Var = this.o;
                if (tx3Var != null) {
                    tx3Var.shutdown();
                }
            } catch (IllegalStateException e) {
                InternalLogger.b.a(this.a, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.CoreFeature$stop$2
                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "Trying to shut down Kronos when it is already not running";
                    }
                }, e, false, null, 48, null);
            }
            this.K.clear();
            this.e.set(false);
            this.B = new d();
            this.k = new q65();
            this.m = new r65();
        }
    }

    public final String u() {
        return this.w;
    }

    public final Map v() {
        return this.K;
    }

    public final lh1 w() {
        return this.g;
    }

    public final AtomicBoolean x() {
        return this.e;
    }

    public final JsonObject y() {
        return (JsonObject) this.L.getValue();
    }
}
