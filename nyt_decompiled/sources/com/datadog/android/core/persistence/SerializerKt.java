package com.datadog.android.core.persistence;

import com.datadog.android.api.InternalLogger;
import defpackage.pk7;
import defpackage.qs2;
import defpackage.yj0;
import defpackage.zq3;
import java.util.Arrays;
import java.util.Locale;
import kotlin.collections.i;

/* loaded from: classes2.dex */
public abstract class SerializerKt {
    public static final byte[] a(pk7 pk7Var, final Object obj, InternalLogger internalLogger) {
        zq3.h(pk7Var, "<this>");
        zq3.h(obj, "model");
        zq3.h(internalLogger, "internalLogger");
        try {
            String serialize = pk7Var.serialize(obj);
            if (serialize == null) {
                return null;
            }
            byte[] bytes = serialize.getBytes(yj0.b);
            zq3.g(bytes, "getBytes(...)");
            return bytes;
        } catch (Throwable th) {
            InternalLogger.b.b(internalLogger, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.core.persistence.SerializerKt$serializeToByteArray$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.US, "Error serializing %s model", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, th, false, null, 48, null);
            return null;
        }
    }
}
