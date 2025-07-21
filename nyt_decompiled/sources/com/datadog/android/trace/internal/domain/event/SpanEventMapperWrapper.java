package com.datadog.android.trace.internal.domain.event;

import com.datadog.android.api.InternalLogger;
import defpackage.cy7;
import defpackage.dy7;
import defpackage.h42;
import defpackage.qs2;
import defpackage.zq3;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class SpanEventMapperWrapper implements h42 {
    public static final a c = new a(null);
    private final dy7 a;
    private final InternalLogger b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public SpanEventMapperWrapper(dy7 dy7Var, InternalLogger internalLogger) {
        zq3.h(dy7Var, "wrappedEventMapper");
        zq3.h(internalLogger, "internalLogger");
        this.a = dy7Var;
        this.b = internalLogger;
    }

    @Override // defpackage.h42
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public cy7 b(final cy7 cy7Var) {
        zq3.h(cy7Var, "event");
        cy7 b = this.a.b(cy7Var);
        if (b == cy7Var) {
            return b;
        }
        InternalLogger.b.a(this.b, InternalLogger.Level.INFO, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.trace.internal.domain.event.SpanEventMapperWrapper$map$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                String format = String.format(Locale.US, "SpanEventMapper: the returned mapped object was not the same instance as the original object. This event will be dropped: %s", Arrays.copyOf(new Object[]{cy7.this}, 1));
                zq3.g(format, "format(...)");
                return format;
            }
        }, null, false, null, 56, null);
        return null;
    }
}
