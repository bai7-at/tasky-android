package io.embrace.android.embracesdk.internal.spans;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import defpackage.by7;
import defpackage.dv;
import defpackage.gp8;
import defpackage.hv;
import defpackage.iv;
import defpackage.s84;
import defpackage.ux7;
import defpackage.zq3;
import io.embrace.android.embracesdk.Severity;
import io.embrace.android.embracesdk.arch.schema.EmbraceAttributeKey;
import io.embrace.android.embracesdk.arch.schema.FixedAttribute;
import io.embrace.android.embracesdk.arch.schema.TelemetryType;
import io.embrace.android.embracesdk.spans.EmbraceSpan;
import io.embrace.android.embracesdk.spans.EmbraceSpanEvent;
import io.embrace.android.embracesdk.spans.ErrorCode;
import io.opentelemetry.api.trace.StatusCode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes5.dex */
public final class EmbraceExtensionsKt {
    private static final String EMBRACE_ATTRIBUTE_NAME_PREFIX = "emb.";
    private static final String EMBRACE_OBJECT_NAME_PREFIX = "emb-";
    private static final String EMBRACE_PRIVATE_ATTRIBUTE_NAME_PREFIX = "emb.private.";
    private static final String EMBRACE_SESSION_PROPERTY_NAME_PREFIX = "emb.properties.";
    private static final String EMBRACE_USAGE_ATTRIBUTE_NAME_PREFIX = "emb.usage.";

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Severity.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Severity.INFO.ordinal()] = 1;
            iArr[Severity.WARNING.ordinal()] = 2;
            iArr[Severity.ERROR.ordinal()] = 3;
        }
    }

    public static final ux7 addEvents(ux7 ux7Var, List<EmbraceSpanEvent> list) {
        zq3.h(ux7Var, "$this$addEvents");
        zq3.h(list, "events");
        for (EmbraceSpanEvent embraceSpanEvent : list) {
            if (EmbraceSpanEvent.Companion.inputsValid$embrace_android_sdk_release(embraceSpanEvent.getName(), embraceSpanEvent.getAttributes())) {
                String name = embraceSpanEvent.getName();
                iv b = hv.b();
                zq3.g(b, "Attributes.builder()");
                ux7Var.g(name, fromMap(b, embraceSpanEvent.getAttributes()).build(), embraceSpanEvent.getTimestampNanos(), TimeUnit.NANOSECONDS);
            }
        }
        return ux7Var;
    }

    public static final EmbraceSpanBuilder embraceSpanBuilder(gp8 gp8Var, String str, TelemetryType telemetryType, boolean z, boolean z2, EmbraceSpan embraceSpan) {
        zq3.h(gp8Var, "$this$embraceSpanBuilder");
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(telemetryType, TransferTable.COLUMN_TYPE);
        return new EmbraceSpanBuilder(gp8Var, str, telemetryType, z, z2, embraceSpan);
    }

    public static /* synthetic */ EmbraceSpanBuilder embraceSpanBuilder$default(gp8 gp8Var, String str, TelemetryType telemetryType, boolean z, boolean z2, EmbraceSpan embraceSpan, int i, Object obj) {
        if ((i & 16) != 0) {
            embraceSpan = null;
        }
        return embraceSpanBuilder(gp8Var, str, telemetryType, z, z2, embraceSpan);
    }

    public static final ux7 endSpan(ux7 ux7Var, ErrorCode errorCode, Long l) {
        zq3.h(ux7Var, "$this$endSpan");
        if (errorCode == null) {
            ux7Var.k(StatusCode.OK);
        } else {
            ux7Var.k(StatusCode.ERROR);
            setFixedAttribute(ux7Var, errorCode.fromErrorCode$embrace_android_sdk_release());
        }
        if (l != null) {
            ux7Var.l(l.longValue(), TimeUnit.MILLISECONDS);
        } else {
            ux7Var.a();
        }
        return ux7Var;
    }

    public static /* synthetic */ ux7 endSpan$default(ux7 ux7Var, ErrorCode errorCode, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            errorCode = null;
        }
        if ((i & 2) != 0) {
            l = null;
        }
        return endSpan(ux7Var, errorCode, l);
    }

    public static final iv fromMap(iv ivVar, Map<String, String> map) {
        zq3.h(ivVar, "$this$fromMap");
        zq3.h(map, "attributes");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (EmbraceSpanImpl.Companion.attributeValid$embrace_android_sdk_release(entry.getKey(), entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            ivVar.put((String) entry2.getKey(), (String) entry2.getValue());
        }
        return ivVar;
    }

    public static final String getAttribute(Map<String, String> map, dv dvVar) {
        zq3.h(map, "$this$getAttribute");
        zq3.h(dvVar, TransferTable.COLUMN_KEY);
        return map.get(dvVar.getKey());
    }

    public static final String getSessionProperty(EmbraceSpanData embraceSpanData, String str) {
        zq3.h(embraceSpanData, "$this$getSessionProperty");
        zq3.h(str, TransferTable.COLUMN_KEY);
        return embraceSpanData.getAttributes().get(toSessionPropertyAttributeName(str));
    }

    public static final boolean hasFixedAttribute(by7 by7Var, FixedAttribute fixedAttribute) {
        zq3.h(by7Var, "$this$hasFixedAttribute");
        zq3.h(fixedAttribute, "fixedAttribute");
        return zq3.c(by7Var.a().c().get(fixedAttribute.getKey().getAttributeKey()), fixedAttribute.getValue());
    }

    public static final ux7 setEmbraceAttribute(ux7 ux7Var, EmbraceAttributeKey embraceAttributeKey, String str) {
        zq3.h(ux7Var, "$this$setEmbraceAttribute");
        zq3.h(embraceAttributeKey, TransferTable.COLUMN_KEY);
        zq3.h(str, "value");
        ux7Var.j(embraceAttributeKey.getName(), str);
        return ux7Var;
    }

    public static final ux7 setFixedAttribute(ux7 ux7Var, FixedAttribute fixedAttribute) {
        zq3.h(ux7Var, "$this$setFixedAttribute");
        zq3.h(fixedAttribute, "fixedAttribute");
        return setEmbraceAttribute(ux7Var, fixedAttribute.getKey(), fixedAttribute.getValue());
    }

    public static final String toEmbraceAttributeName(String str, boolean z) {
        zq3.h(str, "$this$toEmbraceAttributeName");
        return (z ? EMBRACE_PRIVATE_ATTRIBUTE_NAME_PREFIX : EMBRACE_ATTRIBUTE_NAME_PREFIX) + str;
    }

    public static /* synthetic */ String toEmbraceAttributeName$default(String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toEmbraceAttributeName(str, z);
    }

    public static final String toEmbraceObjectName(String str) {
        zq3.h(str, "$this$toEmbraceObjectName");
        return EMBRACE_OBJECT_NAME_PREFIX + str;
    }

    public static final String toEmbraceUsageAttributeName(String str) {
        zq3.h(str, "$this$toEmbraceUsageAttributeName");
        return EMBRACE_USAGE_ATTRIBUTE_NAME_PREFIX + str;
    }

    public static final io.opentelemetry.api.logs.Severity toOtelSeverity(Severity severity) {
        zq3.h(severity, "$this$toOtelSeverity");
        int i = WhenMappings.$EnumSwitchMapping$0[severity.ordinal()];
        if (i == 1) {
            return io.opentelemetry.api.logs.Severity.INFO;
        }
        if (i == 2) {
            return io.opentelemetry.api.logs.Severity.WARN;
        }
        if (i == 3) {
            return io.opentelemetry.api.logs.Severity.ERROR;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String toSessionPropertyAttributeName(String str) {
        zq3.h(str, "$this$toSessionPropertyAttributeName");
        return EMBRACE_SESSION_PROPERTY_NAME_PREFIX + str;
    }

    public static final String getAttribute(Map<String, String> map, EmbraceAttributeKey embraceAttributeKey) {
        zq3.h(map, "$this$getAttribute");
        zq3.h(embraceAttributeKey, TransferTable.COLUMN_KEY);
        return getAttribute(map, embraceAttributeKey.getAttributeKey());
    }

    public static final String getSessionProperty(Map<String, String> map, String str) {
        zq3.h(map, "$this$getSessionProperty");
        zq3.h(str, TransferTable.COLUMN_KEY);
        return map.get(toSessionPropertyAttributeName(str));
    }

    public static final boolean hasFixedAttribute(s84 s84Var, FixedAttribute fixedAttribute) {
        zq3.h(s84Var, "$this$hasFixedAttribute");
        zq3.h(fixedAttribute, "fixedAttribute");
        return zq3.c((String) s84Var.a().h(fixedAttribute.getKey().getAttributeKey()), fixedAttribute.getValue());
    }

    public static final Map<String, String> setFixedAttribute(Map<String, String> map, FixedAttribute fixedAttribute) {
        zq3.h(map, "$this$setFixedAttribute");
        zq3.h(fixedAttribute, "fixedAttribute");
        map.put(fixedAttribute.getKey().getName(), fixedAttribute.getValue());
        return map;
    }

    public static final boolean hasFixedAttribute(EmbraceSpanData embraceSpanData, FixedAttribute fixedAttribute) {
        zq3.h(embraceSpanData, "$this$hasFixedAttribute");
        zq3.h(fixedAttribute, "fixedAttribute");
        return zq3.c(fixedAttribute.getValue(), embraceSpanData.getAttributes().get(fixedAttribute.getKey().getName()));
    }

    public static final boolean hasFixedAttribute(EmbraceSpanEvent embraceSpanEvent, FixedAttribute fixedAttribute) {
        zq3.h(embraceSpanEvent, "$this$hasFixedAttribute");
        zq3.h(fixedAttribute, "fixedAttribute");
        return zq3.c(fixedAttribute.getValue(), embraceSpanEvent.getAttributes().get(fixedAttribute.getKey().getName()));
    }

    public static final boolean hasFixedAttribute(Map<String, String> map, FixedAttribute fixedAttribute) {
        zq3.h(map, "$this$hasFixedAttribute");
        zq3.h(fixedAttribute, "fixedAttribute");
        return zq3.c(map.get(fixedAttribute.getKey().getName()), fixedAttribute.getValue());
    }
}
