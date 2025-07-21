package com.datadog.android.trace.internal.domain.event;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.constraints.DatadogDataConstraints;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import defpackage.cy7;
import defpackage.f91;
import defpackage.lx0;
import defpackage.qs2;
import defpackage.te4;
import defpackage.ua1;
import defpackage.zq3;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class SpanEventSerializer implements lx0 {
    public static final a c = new a(null);
    private final InternalLogger a;
    private final f91 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public SpanEventSerializer(InternalLogger internalLogger, f91 f91Var) {
        zq3.h(internalLogger, "internalLogger");
        zq3.h(f91Var, "dataConstraints");
        this.a = internalLogger;
        this.b = f91Var;
    }

    private final cy7 b(cy7 cy7Var) {
        cy7 a2;
        a2 = cy7Var.a((r30 & 1) != 0 ? cy7Var.a : null, (r30 & 2) != 0 ? cy7Var.b : null, (r30 & 4) != 0 ? cy7Var.c : null, (r30 & 8) != 0 ? cy7Var.d : null, (r30 & 16) != 0 ? cy7Var.e : null, (r30 & 32) != 0 ? cy7Var.f : null, (r30 & 64) != 0 ? cy7Var.g : 0L, (r30 & 128) != 0 ? cy7Var.h : 0L, (r30 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? cy7Var.i : 0L, (r30 & 512) != 0 ? cy7Var.j : c(cy7Var.d()), (r30 & 1024) != 0 ? cy7Var.k : cy7.e.b(cy7Var.c(), null, null, null, null, d(cy7Var.c().c()), null, null, ContentType.SHORT_FORM_ON_DEMAND, null));
        return a2;
    }

    private final cy7.f c(cy7.f fVar) {
        return cy7.f.b(fVar, null, f91.a.a(this.b, fVar.c(), "metrics", null, null, 12, null), 1, null);
    }

    private final cy7.l d(cy7.l lVar) {
        String str;
        Map a2 = f91.a.a(this.b, lVar.c(), "meta.usr", null, null, 12, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap(t.e(a2.size()));
        for (final Map.Entry entry : a2.entrySet()) {
            Object key = entry.getKey();
            try {
                str = f(entry.getValue());
            } catch (Exception e) {
                InternalLogger.b.b(this.a, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.trace.internal.domain.event.SpanEventSerializer$sanitizeUserAttributes$transformedAttributes$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final String mo865invoke() {
                        return "Error converting value for key " + ((Object) entry.getKey()) + " to meta string, it will be dropped.";
                    }
                }, e, false, null, 48, null);
                str = null;
            }
            linkedHashMap.put(key, str);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((String) entry2.getValue()) != null) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return cy7.l.b(lVar, null, null, null, t.x(linkedHashMap2), 7, null);
    }

    private final String f(Object obj) {
        if (zq3.c(obj, te4.a()) || obj == null) {
            return null;
        }
        return obj instanceof Date ? String.valueOf(((Date) obj).getTime()) : obj instanceof JsonPrimitive ? ((JsonPrimitive) obj).getAsString() : obj.toString();
    }

    @Override // defpackage.lx0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public String a(ua1 ua1Var, cy7 cy7Var) {
        zq3.h(ua1Var, "datadogContext");
        zq3.h(cy7Var, "model");
        JsonElement e = b(cy7Var).e();
        JsonArray jsonArray = new JsonArray(1);
        jsonArray.add(e);
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("spans", jsonArray);
        jsonObject.addProperty("env", ua1Var.d());
        String jsonElement = jsonObject.toString();
        zq3.g(jsonElement, "jsonObject.toString()");
        return jsonElement;
    }

    public /* synthetic */ SpanEventSerializer(InternalLogger internalLogger, f91 f91Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(internalLogger, (i & 2) != 0 ? new DatadogDataConstraints(internalLogger) : f91Var);
    }
}
