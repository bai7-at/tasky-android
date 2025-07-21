package io.embrace.android.embracesdk.internal.payload;

import defpackage.dv;
import defpackage.hv;
import defpackage.s84;
import defpackage.xx7;
import defpackage.zq3;
import io.opentelemetry.api.logs.Severity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class LogMapperKt {
    public static final Log toNewPayload(s84 s84Var) {
        String str;
        String str2;
        zq3.h(s84Var, "$this$toNewPayload");
        xx7 b = s84Var.b();
        zq3.g(b, "spanContext");
        boolean c = b.c();
        if (c) {
            xx7 b2 = s84Var.b();
            zq3.g(b2, "spanContext");
            str = b2.getTraceId();
        } else {
            str = null;
        }
        if (c) {
            xx7 b3 = s84Var.b();
            zq3.g(b3, "spanContext");
            str2 = b3.getSpanId();
        } else {
            str2 = null;
        }
        Long valueOf = Long.valueOf(s84Var.e());
        Severity d = s84Var.d();
        zq3.g(d, "severity");
        Integer valueOf2 = Integer.valueOf(d.getSeverityNumber());
        String h = s84Var.h();
        String asString = s84Var.getBody().asString();
        hv a = s84Var.a();
        zq3.g(a, "attributes");
        return new Log(valueOf, valueOf2, h, asString, toNewPayload(a), str, str2);
    }

    public static final List<Attribute> toNewPayload(hv hvVar) {
        zq3.h(hvVar, "$this$toNewPayload");
        Set<Map.Entry> entrySet = hvVar.c().entrySet();
        ArrayList arrayList = new ArrayList(i.w(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            zq3.g(key, "it.key");
            arrayList.add(new Attribute(((dv) key).getKey(), entry.getValue().toString()));
        }
        return arrayList;
    }
}
