package com.datadog.android.api;

import com.datadog.android.core.internal.logger.SdkInternalLogger;
import com.datadog.android.core.metrics.TelemetryMetricType;
import defpackage.ar5;
import defpackage.qs2;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface InternalLogger {
    public static final a a = a.a;

    public enum Level {
        VERBOSE,
        DEBUG,
        INFO,
        WARN,
        ERROR
    }

    public enum Target {
        USER,
        MAINTAINER,
        TELEMETRY
    }

    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final InternalLogger b = new SdkInternalLogger(null, null, null, 6, null);

        private a() {
        }

        public final InternalLogger a() {
            return b;
        }
    }

    public static final class b {
        public static /* synthetic */ void a(InternalLogger internalLogger, Level level, Target target, qs2 qs2Var, Throwable th, boolean z, Map map, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
            }
            internalLogger.b(level, target, qs2Var, (i & 8) != 0 ? null : th, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : map);
        }

        public static /* synthetic */ void b(InternalLogger internalLogger, Level level, List list, qs2 qs2Var, Throwable th, boolean z, Map map, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
            }
            internalLogger.c(level, list, qs2Var, (i & 8) != 0 ? null : th, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : map);
        }
    }

    void a(qs2 qs2Var, Map map, float f);

    void b(Level level, Target target, qs2 qs2Var, Throwable th, boolean z, Map map);

    void c(Level level, List list, qs2 qs2Var, Throwable th, boolean z, Map map);

    ar5 d(String str, TelemetryMetricType telemetryMetricType, float f, String str2);
}
