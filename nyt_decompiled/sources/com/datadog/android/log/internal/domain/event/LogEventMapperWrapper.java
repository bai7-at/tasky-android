package com.datadog.android.log.internal.domain.event;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.log.model.LogEvent;
import defpackage.h42;
import defpackage.qs2;
import defpackage.zq3;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class LogEventMapperWrapper implements h42 {
    public static final a c = new a(null);
    private final h42 a;
    private final InternalLogger b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public LogEventMapperWrapper(h42 h42Var, InternalLogger internalLogger) {
        zq3.h(h42Var, "wrappedEventMapper");
        zq3.h(internalLogger, "internalLogger");
        this.a = h42Var;
        this.b = internalLogger;
    }

    @Override // defpackage.h42
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public LogEvent b(final LogEvent logEvent) {
        zq3.h(logEvent, "event");
        LogEvent logEvent2 = (LogEvent) this.a.b(logEvent);
        if (logEvent2 == null) {
            InternalLogger.b.a(this.b, InternalLogger.Level.INFO, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.log.internal.domain.event.LogEventMapperWrapper$map$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.US, "LogEventMapper: the returned mapped object was null. This event will be dropped: %s", Arrays.copyOf(new Object[]{LogEvent.this}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, null, false, null, 56, null);
        } else {
            if (logEvent2 == logEvent) {
                return logEvent2;
            }
            InternalLogger.b.a(this.b, InternalLogger.Level.ERROR, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.log.internal.domain.event.LogEventMapperWrapper$map$2
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    String format = String.format(Locale.US, "LogEventMapper: the returned mapped object was not the same instance as the original object. This event will be dropped: %s", Arrays.copyOf(new Object[]{LogEvent.this}, 1));
                    zq3.g(format, "format(...)");
                    return format;
                }
            }, null, false, null, 56, null);
        }
        return null;
    }
}
