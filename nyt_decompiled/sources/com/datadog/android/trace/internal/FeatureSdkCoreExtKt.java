package com.datadog.android.trace.internal;

import defpackage.du8;
import defpackage.jb2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Map;
import kotlin.collections.t;

/* loaded from: classes2.dex */
public abstract class FeatureSdkCoreExtKt {
    public static final void a(jb2 jb2Var, final String str, final String str2) {
        zq3.h(jb2Var, "<this>");
        zq3.h(str, "traceId");
        zq3.h(str2, "spanId");
        final String c = c();
        jb2Var.e("tracing", new ss2() { // from class: com.datadog.android.trace.internal.FeatureSdkCoreExtKt$addActiveTraceToContext$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(Map map) {
                zq3.h(map, "it");
                map.put(c, t.m(du8.a("span_id", str2), du8.a("trace_id", str)));
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Map) obj);
                return ww8.a;
            }
        });
    }

    public static final void b(jb2 jb2Var) {
        zq3.h(jb2Var, "<this>");
        final String c = c();
        jb2Var.e("tracing", new ss2() { // from class: com.datadog.android.trace.internal.FeatureSdkCoreExtKt$removeActiveTraceFromContext$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(Map map) {
                zq3.h(map, "it");
                map.remove(c);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Map) obj);
                return ww8.a;
            }
        });
    }

    private static final String c() {
        return "context@" + Thread.currentThread().getName();
    }
}
