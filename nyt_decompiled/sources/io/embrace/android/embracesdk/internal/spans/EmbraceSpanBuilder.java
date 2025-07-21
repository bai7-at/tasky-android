package io.embrace.android.embracesdk.internal.spans;

import com.facebook.AuthenticationTokenClaims;
import defpackage.gp8;
import defpackage.hx0;
import defpackage.ux7;
import defpackage.vx7;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.schema.EmbType;
import io.embrace.android.embracesdk.arch.schema.FixedAttribute;
import io.embrace.android.embracesdk.arch.schema.KeySpan;
import io.embrace.android.embracesdk.arch.schema.PrivateSpan;
import io.embrace.android.embracesdk.arch.schema.TelemetryType;
import io.embrace.android.embracesdk.spans.EmbraceSpan;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class EmbraceSpanBuilder {
    private final List<FixedAttribute> fixedAttributes;
    private final vx7 otelSpanBuilder;
    private final EmbraceSpan parent;
    private final String spanName;

    public EmbraceSpanBuilder(gp8 gp8Var, String str, TelemetryType telemetryType, boolean z, boolean z2, EmbraceSpan embraceSpan) {
        ux7 wrappedSpan$embrace_android_sdk_release;
        zq3.h(gp8Var, "tracer");
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(telemetryType, "telemetryType");
        this.parent = embraceSpan;
        List<FixedAttribute> r = i.r(telemetryType);
        this.fixedAttributes = r;
        str = z ? EmbraceExtensionsKt.toEmbraceObjectName(str) : str;
        this.spanName = str;
        vx7 a = gp8Var.a(str);
        this.otelSpanBuilder = a;
        if (embraceSpan == null) {
            a.b();
            if (zq3.c(telemetryType, EmbType.Performance.Default.INSTANCE)) {
                r.add(KeySpan.INSTANCE);
            }
        } else if ((embraceSpan instanceof EmbraceSpanImpl) && (wrappedSpan$embrace_android_sdk_release = ((EmbraceSpanImpl) embraceSpan).wrappedSpan$embrace_android_sdk_release()) != null) {
            a.d(hx0.current().c(wrappedSpan$embrace_android_sdk_release));
        }
        if (z2) {
            r.add(PrivateSpan.INSTANCE);
        }
    }

    public final List<FixedAttribute> getFixedAttributes() {
        return this.fixedAttributes;
    }

    public final EmbraceSpan getParent() {
        return this.parent;
    }

    public final String getSpanName() {
        return this.spanName;
    }

    public final ux7 startSpan(long j) {
        ux7 a = this.otelSpanBuilder.c(j, TimeUnit.MILLISECONDS).a();
        for (FixedAttribute fixedAttribute : this.fixedAttributes) {
            zq3.g(a, "startedSpan");
            EmbraceExtensionsKt.setFixedAttribute(a, fixedAttribute);
        }
        zq3.g(a, "startedSpan");
        return a;
    }
}
