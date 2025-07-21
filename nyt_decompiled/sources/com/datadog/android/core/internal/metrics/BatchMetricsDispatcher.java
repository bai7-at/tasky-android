package com.datadog.android.core.internal.metrics;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.persistence.file.FileExtKt;
import com.datadog.android.core.metrics.MethodCallSamplingRate;
import com.datadog.android.privacy.TrackingConsent;
import defpackage.bb2;
import defpackage.du8;
import defpackage.em8;
import defpackage.jw6;
import defpackage.ka1;
import defpackage.pe2;
import defpackage.qs2;
import defpackage.r36;
import defpackage.r60;
import defpackage.tt4;
import defpackage.zq3;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class BatchMetricsDispatcher implements tt4, r36.a {
    public static final a g = new a(null);
    private final ka1 a;
    private final pe2 b;
    private final InternalLogger c;
    private final em8 d;
    private final String e;
    private final AtomicBoolean f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public BatchMetricsDispatcher(String str, ka1 ka1Var, pe2 pe2Var, InternalLogger internalLogger, em8 em8Var) {
        zq3.h(str, "featureName");
        zq3.h(pe2Var, "filePersistenceConfig");
        zq3.h(internalLogger, "internalLogger");
        zq3.h(em8Var, "dateTimeProvider");
        this.a = ka1Var;
        this.b = pe2Var;
        this.c = internalLogger;
        this.d = em8Var;
        this.e = k(str);
        this.f = new AtomicBoolean(true);
    }

    private final Long g(final File file, InternalLogger internalLogger) {
        String name = file.getName();
        zq3.g(name, "this.name");
        Long n = h.n(name);
        if (n == null) {
            InternalLogger.b.a(internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new qs2() { // from class: com.datadog.android.core.internal.metrics.BatchMetricsDispatcher$nameAsTimestampSafe$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.ENGLISH, "Unable to parse the file name as a timestamp: %s", Arrays.copyOf(new Object[]{file.getName()}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, null, false, null, 56, null);
        }
        return n;
    }

    private final Map h(File file, r60 r60Var) {
        Long g2 = g(file, this.c);
        if (g2 == null) {
            return null;
        }
        long c = r60Var.c() - g2.longValue();
        if (c < 0) {
            return null;
        }
        return t.m(du8.a("track", this.e), du8.a("metric_type", "batch closed"), du8.a("batch_duration", Long.valueOf(c)), du8.a("uploader_window", Long.valueOf(this.b.i())), du8.a("batch_size", Long.valueOf(FileExtKt.f(file, this.c))), du8.a("batch_events_count", Long.valueOf(r60Var.a())), du8.a("forced_new", Boolean.valueOf(r60Var.b())), du8.a("consent", j(file)), du8.a("filename", file.getName()), du8.a("thread", Thread.currentThread().getName()));
    }

    private final Map i(File file, jw6 jw6Var) {
        Long g2 = g(file, this.c);
        if (g2 == null) {
            return null;
        }
        long b = this.d.b() - g2.longValue();
        if (b < 0) {
            return null;
        }
        Pair a2 = du8.a("track", this.e);
        Pair a3 = du8.a("metric_type", "batch deleted");
        Pair a4 = du8.a("batch_age", Long.valueOf(b));
        ka1 ka1Var = this.a;
        Pair a5 = du8.a("min", ka1Var != null ? Long.valueOf(ka1Var.d()) : null);
        ka1 ka1Var2 = this.a;
        return t.m(a2, a3, a4, du8.a("uploader_delay", t.m(a5, du8.a("max", ka1Var2 != null ? Long.valueOf(ka1Var2.c()) : null))), du8.a("uploader_window", Long.valueOf(this.b.i())), du8.a("batch_removal_reason", jw6Var.toString()), du8.a("in_background", Boolean.valueOf(this.f.get())), du8.a("consent", j(file)), du8.a("filename", file.getName()), du8.a("thread", Thread.currentThread().getName()));
    }

    private final String j(File file) {
        File parentFile = file.getParentFile();
        String name = parentFile != null ? parentFile.getName() : null;
        if (name == null) {
            return null;
        }
        bb2.a aVar = bb2.i;
        if (aVar.b().d(name)) {
            String obj = TrackingConsent.PENDING.toString();
            Locale locale = Locale.US;
            zq3.g(locale, "US");
            String lowerCase = obj.toLowerCase(locale);
            zq3.g(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
        if (!aVar.a().d(name)) {
            return null;
        }
        String obj2 = TrackingConsent.GRANTED.toString();
        Locale locale2 = Locale.US;
        zq3.g(locale2, "US");
        String lowerCase2 = obj2.toLowerCase(locale2);
        zq3.g(lowerCase2, "toLowerCase(...)");
        return lowerCase2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String k(java.lang.String r1) {
        /*
            r0 = this;
            int r0 = r1.hashCode()
            switch(r0) {
                case -1067396926: goto L32;
                case 113290: goto L29;
                case 3327407: goto L20;
                case 456014590: goto L14;
                case 2144122390: goto L8;
                default: goto L7;
            }
        L7:
            goto L3a
        L8:
            java.lang.String r0 = "session-replay-resources"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L11
            goto L3a
        L11:
            java.lang.String r0 = "sr-resources"
            goto L3e
        L14:
            java.lang.String r0 = "session-replay"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L1d
            goto L3a
        L1d:
            java.lang.String r0 = "sr"
            goto L3e
        L20:
            java.lang.String r0 = "logs"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L3e
            goto L3a
        L29:
            java.lang.String r0 = "rum"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L3e
            goto L3a
        L32:
            java.lang.String r0 = "tracing"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3c
        L3a:
            r0 = 0
            goto L3e
        L3c:
            java.lang.String r0 = "trace"
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.k(java.lang.String):java.lang.String");
    }

    @Override // defpackage.tt4
    public void a(File file, r60 r60Var) {
        Map h;
        zq3.h(file, "batchFile");
        zq3.h(r60Var, "batchMetadata");
        if (this.e == null || !FileExtKt.d(file, this.c) || (h = h(file, r60Var)) == null) {
            return;
        }
        this.c.a(new qs2() { // from class: com.datadog.android.core.internal.metrics.BatchMetricsDispatcher$sendBatchClosedMetric$1$1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                return "[Mobile Metric] Batch Closed";
            }
        }, h, MethodCallSamplingRate.LOW.getRate());
    }

    @Override // r36.a
    public void b() {
    }

    @Override // r36.a
    public void c() {
        this.f.set(false);
    }

    @Override // r36.a
    public void d() {
        this.f.set(true);
    }

    @Override // defpackage.tt4
    public void e(File file, jw6 jw6Var) {
        Map i;
        zq3.h(file, "batchFile");
        zq3.h(jw6Var, "removalReason");
        if (!jw6Var.a() || this.e == null || (i = i(file, jw6Var)) == null) {
            return;
        }
        this.c.a(new qs2() { // from class: com.datadog.android.core.internal.metrics.BatchMetricsDispatcher$sendBatchDeletedMetric$1$1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                return "[Mobile Metric] Batch Deleted";
            }
        }, i, MethodCallSamplingRate.LOW.getRate());
    }

    @Override // r36.a
    public void f() {
    }
}
