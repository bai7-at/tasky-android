package com.datadog.android.ndk.internal;

import com.datadog.android.api.InternalLogger;
import com.google.gson.JsonParseException;
import defpackage.an1;
import defpackage.qs2;
import defpackage.zq3;
import java.util.Arrays;
import java.util.Locale;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class NdkCrashLogDeserializer implements an1 {
    public static final a b = new a(null);
    private final InternalLogger a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public NdkCrashLogDeserializer(InternalLogger internalLogger) {
        zq3.h(internalLogger, "internalLogger");
        this.a = internalLogger;
    }

    @Override // defpackage.an1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.datadog.android.ndk.internal.a a(final String str) {
        zq3.h(str, "model");
        try {
            return com.datadog.android.ndk.internal.a.g.a(str);
        } catch (JsonParseException e) {
            InternalLogger.b.b(this.a, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.ndk.internal.NdkCrashLogDeserializer$deserialize$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.US, "Error while trying to deserialize the NDK Crash info: %s", Arrays.copyOf(new Object[]{str}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, e, false, null, 48, null);
            return null;
        } catch (IllegalStateException e2) {
            InternalLogger.b.b(this.a, InternalLogger.Level.ERROR, i.o(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), new qs2() { // from class: com.datadog.android.ndk.internal.NdkCrashLogDeserializer$deserialize$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.US, "Error while trying to deserialize the NDK Crash info: %s", Arrays.copyOf(new Object[]{str}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, e2, false, null, 48, null);
            return null;
        }
    }
}
