package com.datadog.android.ndk.internal;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.core.internal.persistence.file.FileExtKt;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import com.datadog.android.ndk.internal.DatadogNdkCrashHandler;
import com.datadog.android.ndk.internal.NdkCrashHandler;
import com.google.gson.JsonObject;
import defpackage.an1;
import defpackage.du8;
import defpackage.ib2;
import defpackage.j09;
import defpackage.jb2;
import defpackage.lf2;
import defpackage.qe2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.yj0;
import defpackage.zq3;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Triple;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class DatadogNdkCrashHandler implements NdkCrashHandler {
    public static final a p = new a(null);
    private final ExecutorService a;
    private final an1 b;
    private final an1 c;
    private final an1 d;
    private final InternalLogger e;
    private final qe2 f;
    private final qs2 g;
    private final String h;
    private final File i;
    private JsonObject j;
    private j09 k;
    private NetworkInfo l;
    private com.datadog.android.ndk.internal.a m;
    private boolean n;
    private boolean o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final File e(File file) {
            return new File(file, "ndk_crash_reports_v2");
        }

        private final File f(File file) {
            return new File(file, "ndk_crash_reports_intermediary_v2");
        }

        public final File b(File file) {
            zq3.h(file, "storageDir");
            return new File(e(file), "network_information");
        }

        public final File c(File file) {
            zq3.h(file, "storageDir");
            return new File(e(file), "user_information");
        }

        public final File d(File file) {
            zq3.h(file, "storageDir");
            return new File(e(file), "last_view_event");
        }

        public final File g(File file) {
            zq3.h(file, "storageDir");
            return new File(f(file), "network_information");
        }

        public final File h(File file) {
            zq3.h(file, "storageDir");
            return new File(f(file), "user_information");
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[NdkCrashHandler.ReportTarget.values().length];
            try {
                iArr[NdkCrashHandler.ReportTarget.RUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NdkCrashHandler.ReportTarget.LOGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public DatadogNdkCrashHandler(File file, ExecutorService executorService, an1 an1Var, an1 an1Var2, an1 an1Var3, InternalLogger internalLogger, qe2 qe2Var, qs2 qs2Var, String str) {
        zq3.h(file, "storageDir");
        zq3.h(executorService, "dataPersistenceExecutorService");
        zq3.h(an1Var, "ndkCrashLogDeserializer");
        zq3.h(an1Var2, "networkInfoDeserializer");
        zq3.h(an1Var3, "userInfoDeserializer");
        zq3.h(internalLogger, "internalLogger");
        zq3.h(qe2Var, "envFileReader");
        zq3.h(qs2Var, "lastRumViewEventProvider");
        zq3.h(str, "nativeCrashSourceType");
        this.a = executorService;
        this.b = an1Var;
        this.c = an1Var2;
        this.d = an1Var3;
        this.e = internalLogger;
        this.f = qe2Var;
        this.g = qs2Var;
        this.h = str;
        this.i = p.e(file);
    }

    private final void e(jb2 jb2Var, NdkCrashHandler.ReportTarget reportTarget) {
        com.datadog.android.ndk.internal.a aVar = this.m;
        if (aVar != null) {
            k(jb2Var, aVar, this.j, this.k, this.l, reportTarget);
        }
        int i = b.a[reportTarget.ordinal()];
        if (i == 1) {
            this.o = true;
        } else if (i == 2) {
            this.n = true;
        }
        if (this.o && this.n) {
            f();
        }
    }

    private final void f() {
        this.j = null;
        this.l = null;
        this.k = null;
        this.m = null;
    }

    private final void g() {
        if (FileExtKt.d(this.i, this.e)) {
            try {
                File[] g = FileExtKt.g(this.i, this.e);
                if (g != null) {
                    for (File file : g) {
                        lf2.m(file);
                    }
                }
            } catch (Throwable th) {
                InternalLogger.b.b(this.e, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.ndk.internal.DatadogNdkCrashHandler$clearCrashLog$2
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "Unable to clear the NDK crash report file: " + DatadogNdkCrashHandler.this.i().getAbsolutePath();
                    }
                }, th, false, null, 48, null);
            }
        }
    }

    private final Map h(final JsonObject jsonObject, com.datadog.android.ndk.internal.a aVar) {
        Triple triple;
        if (jsonObject == null) {
            return t.m(du8.a("error.stack", aVar.b()), du8.a("error.source_type", this.h));
        }
        try {
            ss2 ss2Var = new ss2() { // from class: com.datadog.android.ndk.internal.DatadogNdkCrashHandler$generateLogAttributes$logAttributes$extractId$1
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke(String str) {
                    zq3.h(str, "property");
                    return JsonObject.this.getAsJsonObject(str).getAsJsonPrimitive("id").getAsString();
                }
            };
            triple = new Triple((String) ss2Var.invoke("application"), (String) ss2Var.invoke("session"), (String) ss2Var.invoke("view"));
        } catch (Exception e) {
            InternalLogger.b.a(this.e, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.ndk.internal.DatadogNdkCrashHandler$generateLogAttributes$logAttributes$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Cannot read application, session, view IDs data from view event.";
                }
            }, e, false, null, 48, null);
            triple = new Triple(null, null, null);
        }
        String str = (String) triple.a();
        String str2 = (String) triple.b();
        String str3 = (String) triple.c();
        return (str == null || str2 == null || str3 == null) ? t.m(du8.a("error.stack", aVar.b()), du8.a("error.source_type", this.h)) : t.m(du8.a("session_id", str2), du8.a("application_id", str), du8.a("view.id", str3), du8.a("error.stack", aVar.b()), du8.a("error.source_type", this.h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(DatadogNdkCrashHandler datadogNdkCrashHandler, jb2 jb2Var, NdkCrashHandler.ReportTarget reportTarget) {
        zq3.h(datadogNdkCrashHandler, "this$0");
        zq3.h(jb2Var, "$sdkCore");
        zq3.h(reportTarget, "$reportTarget");
        datadogNdkCrashHandler.e(jb2Var, reportTarget);
    }

    private final void k(jb2 jb2Var, com.datadog.android.ndk.internal.a aVar, JsonObject jsonObject, j09 j09Var, NetworkInfo networkInfo, NdkCrashHandler.ReportTarget reportTarget) {
        if (aVar == null) {
            return;
        }
        String format = String.format(Locale.US, "NDK crash detected with signal: %s", Arrays.copyOf(new Object[]{aVar.a()}, 1));
        zq3.g(format, "format(...)");
        int i = b.a[reportTarget.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            o(jb2Var, format, h(jsonObject, aVar), aVar, networkInfo, j09Var);
        } else if (jsonObject != null) {
            p(jb2Var, format, aVar, jsonObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(DatadogNdkCrashHandler datadogNdkCrashHandler) {
        zq3.h(datadogNdkCrashHandler, "this$0");
        datadogNdkCrashHandler.m();
    }

    private final void m() {
        try {
            if (FileExtKt.d(this.i, this.e)) {
                try {
                    this.j = (JsonObject) this.g.mo865invoke();
                    File[] g = FileExtKt.g(this.i, this.e);
                    if (g != null) {
                        for (File file : g) {
                            String name = file.getName();
                            if (name != null) {
                                int hashCode = name.hashCode();
                                if (hashCode != -528983909) {
                                    if (hashCode != 408381112) {
                                        if (hashCode == 1847397036 && name.equals("crash_log")) {
                                            String k = FileExtKt.k(file, null, this.e, 1, null);
                                            this.m = k != null ? (com.datadog.android.ndk.internal.a) this.b.a(k) : null;
                                        }
                                    } else if (name.equals("user_information")) {
                                        String n = n(file, this.f);
                                        this.k = n != null ? (j09) this.d.a(n) : null;
                                    }
                                } else if (name.equals("network_information")) {
                                    String n2 = n(file, this.f);
                                    this.l = n2 != null ? (NetworkInfo) this.c.a(n2) : null;
                                }
                            }
                        }
                    }
                } catch (SecurityException e) {
                    InternalLogger.b.b(this.e, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.ndk.internal.DatadogNdkCrashHandler$readCrashData$2
                        @Override // defpackage.qs2
                        /* renamed from: invoke */
                        public final String mo865invoke() {
                            return "Error while trying to read the NDK crash directory";
                        }
                    }, e, false, null, 48, null);
                }
                g();
            }
        } catch (Throwable th) {
            g();
            throw th;
        }
    }

    private final String n(final File file, qe2 qe2Var) {
        final byte[] bArr = (byte[]) qe2Var.a(file);
        if (bArr.length == 0) {
            return null;
        }
        final String str = new String(bArr, yj0.b);
        if (h.P(str, "\\u0000", false, 2, null) || h.P(str, "\u0000", false, 2, null)) {
            InternalLogger.b.a(this.e, InternalLogger.Level.ERROR, InternalLogger.Target.TELEMETRY, new qs2() { // from class: com.datadog.android.ndk.internal.DatadogNdkCrashHandler$readFileContent$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Decoded file (" + file.getName() + ") content contains NULL character, file content={" + str + "}, raw_bytes=" + kotlin.collections.d.q0(bArr, ",", null, null, 0, null, null, 62, null);
                }
            }, null, false, null, 56, null);
        }
        return str;
    }

    private final void o(jb2 jb2Var, String str, Map map, com.datadog.android.ndk.internal.a aVar, NetworkInfo networkInfo, j09 j09Var) {
        ib2 d = jb2Var.d("logs");
        if (d != null) {
            d.a(t.m(du8.a("loggerName", "ndk_crash"), du8.a(TransferTable.COLUMN_TYPE, "ndk_crash"), du8.a("message", str), du8.a("attributes", map), du8.a("timestamp", Long.valueOf(aVar.d())), du8.a("networkInfo", networkInfo), du8.a("userInfo", j09Var)));
        } else {
            InternalLogger.b.a(this.e, InternalLogger.Level.INFO, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.ndk.internal.DatadogNdkCrashHandler$sendCrashLogEvent$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Logs feature is not registered, won't report NDK crash info as log.";
                }
            }, null, false, null, 56, null);
        }
    }

    private final void p(jb2 jb2Var, String str, com.datadog.android.ndk.internal.a aVar, JsonObject jsonObject) {
        ib2 d = jb2Var.d("rum");
        if (d != null) {
            d.a(t.m(du8.a(TransferTable.COLUMN_TYPE, "ndk_crash"), du8.a("sourceType", this.h), du8.a("timestamp", Long.valueOf(aVar.d())), du8.a("timeSinceAppStartMs", aVar.c()), du8.a("signalName", aVar.a()), du8.a("stacktrace", aVar.b()), du8.a("message", str), du8.a("lastViewEvent", jsonObject)));
        } else {
            InternalLogger.b.a(this.e, InternalLogger.Level.INFO, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.ndk.internal.DatadogNdkCrashHandler$sendCrashRumEvent$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "RUM feature is not registered, won't report NDK crash info as RUM error.";
                }
            }, null, false, null, 56, null);
        }
    }

    @Override // com.datadog.android.ndk.internal.NdkCrashHandler
    public void a() {
        ConcurrencyExtKt.c(this.a, "NDK crash check", this.e, new Runnable() { // from class: kb1
            @Override // java.lang.Runnable
            public final void run() {
                DatadogNdkCrashHandler.l(DatadogNdkCrashHandler.this);
            }
        });
    }

    @Override // com.datadog.android.ndk.internal.NdkCrashHandler
    public void b(final jb2 jb2Var, final NdkCrashHandler.ReportTarget reportTarget) {
        zq3.h(jb2Var, "sdkCore");
        zq3.h(reportTarget, "reportTarget");
        ConcurrencyExtKt.c(this.a, "NDK crash report ", this.e, new Runnable() { // from class: jb1
            @Override // java.lang.Runnable
            public final void run() {
                DatadogNdkCrashHandler.j(DatadogNdkCrashHandler.this, jb2Var, reportTarget);
            }
        });
    }

    public final File i() {
        return this.i;
    }
}
