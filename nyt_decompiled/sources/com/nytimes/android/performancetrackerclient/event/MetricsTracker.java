package com.nytimes.android.performancetrackerclient.event;

import com.nytimes.android.internal.common.time.TimeDuration;
import defpackage.d44;
import defpackage.ei1;
import defpackage.zq3;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class MetricsTracker implements ei1 {
    public static final a Companion = new a(null);
    private static final long a = new TimeDuration(1, TimeUnit.MINUTES).d(TimeUnit.MILLISECONDS);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // defpackage.ei1
    public void onPause(d44 d44Var) {
        zq3.h(d44Var, "owner");
        throw null;
    }

    @Override // defpackage.ei1
    public void onResume(d44 d44Var) {
        zq3.h(d44Var, "owner");
        throw null;
    }
}
