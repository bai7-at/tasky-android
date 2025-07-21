package defpackage;

import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes4.dex */
public abstract class za7 {
    public static final boolean a(ya7 ya7Var, long j) {
        zq3.h(ya7Var, "<this>");
        return j <= ya7Var.getEndTimeInterval() && ya7Var.getStartTimeInterval() <= j;
    }

    public static /* synthetic */ boolean b(ya7 ya7Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = System.currentTimeMillis() / NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
        }
        return a(ya7Var, j);
    }
}
