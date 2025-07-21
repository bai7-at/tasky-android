package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ld implements z2 {
    private static final a b = new a(null);
    public static final int c = 8;
    private final AccessibilityManager a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ld(Context context) {
        Object systemService = context.getSystemService("accessibility");
        zq3.f(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.a = (AccessibilityManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.z2
    public long a(long j, boolean z, boolean z2, boolean z3) {
        int i = z;
        if (j >= 2147483647L) {
            return j;
        }
        if (z2) {
            i = (z ? 1 : 0) | 2;
        }
        if (z3) {
            i = (i == true ? 1 : 0) | 4;
        }
        int a2 = hj.a.a(this.a, (int) j, i);
        if (a2 == Integer.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        return a2;
    }
}
