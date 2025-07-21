package com.datadog.android.core.internal.time;

import android.os.Process;
import android.os.SystemClock;
import com.datadog.android.core.internal.DatadogCore;
import defpackage.be0;
import defpackage.c04;
import defpackage.qs2;
import defpackage.ym;
import defpackage.zq3;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.c;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class DefaultAppStartTimeProvider implements ym {
    private final c04 a;

    public DefaultAppStartTimeProvider(final be0 be0Var) {
        zq3.h(be0Var, "buildSdkVersionProvider");
        this.a = c.b(LazyThreadSafetyMode.PUBLICATION, new qs2() { // from class: com.datadog.android.core.internal.time.DefaultAppStartTimeProvider$appStartTimeNs$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Long mo865invoke() {
                long a;
                if (be0.this.getVersion() >= 24) {
                    a = System.nanoTime() - TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime());
                } else {
                    a = DatadogCore.l.a();
                }
                return Long.valueOf(a);
            }
        });
    }

    public /* synthetic */ DefaultAppStartTimeProvider(be0 be0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? be0.a.a() : be0Var);
    }
}
