package com.datadog.android.core.internal.metrics;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.metrics.MethodCallSamplingRate;
import defpackage.ar5;
import defpackage.qs2;
import defpackage.zq3;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class MethodCalledTelemetry implements ar5 {
    public static final a e = new a(null);
    private final InternalLogger a;
    private final String b;
    private final String c;
    private final long d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public MethodCalledTelemetry(InternalLogger internalLogger, String str, String str2, long j) {
        zq3.h(internalLogger, "internalLogger");
        zq3.h(str, "operationName");
        zq3.h(str2, "callerClass");
        this.a = internalLogger;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    @Override // defpackage.ar5
    public void a(boolean z) {
        long nanoTime = System.nanoTime() - this.d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("execution_time", Long.valueOf(nanoTime));
        linkedHashMap.put("operation_name", this.b);
        linkedHashMap.put("caller_class", this.c);
        linkedHashMap.put("is_successful", Boolean.valueOf(z));
        linkedHashMap.put("metric_type", "method called");
        this.a.a(new qs2() { // from class: com.datadog.android.core.internal.metrics.MethodCalledTelemetry$stopAndSend$1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                return "[Mobile Metric] Method Called";
            }
        }, linkedHashMap, MethodCallSamplingRate.ALL.getRate());
    }

    public /* synthetic */ MethodCalledTelemetry(InternalLogger internalLogger, String str, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(internalLogger, str, str2, (i & 8) != 0 ? System.nanoTime() : j);
    }
}
