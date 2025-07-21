package defpackage;

import com.google.accompanist.systemuicontroller.SystemUiControllerKt;

/* loaded from: classes2.dex */
public interface ve8 {
    static /* synthetic */ void a(ve8 ve8Var, long j, boolean z, boolean z2, ss2 ss2Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSystemBarsColor-Iv8Zu3U");
        }
        if ((i & 2) != 0) {
            z = wn0.i(j) > 0.5f;
        }
        boolean z3 = z;
        boolean z4 = (i & 4) != 0 ? true : z2;
        if ((i & 8) != 0) {
            ss2Var = SystemUiControllerKt.b;
        }
        ve8Var.e(j, z3, z4, ss2Var);
    }

    static /* synthetic */ void b(ve8 ve8Var, long j, boolean z, boolean z2, ss2 ss2Var, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setNavigationBarColor-Iv8Zu3U");
        }
        if ((i & 2) != 0) {
            z = wn0.i(j) > 0.5f;
        }
        boolean z3 = z;
        boolean z4 = (i & 4) != 0 ? true : z2;
        if ((i & 8) != 0) {
            ss2Var = SystemUiControllerKt.b;
        }
        ve8Var.c(j, z3, z4, ss2Var);
    }

    void c(long j, boolean z, boolean z2, ss2 ss2Var);

    void d(long j, boolean z, ss2 ss2Var);

    default void e(long j, boolean z, boolean z2, ss2 ss2Var) {
        zq3.h(ss2Var, "transformColorForLightContent");
        d(j, z, ss2Var);
        c(j, z, z2, ss2Var);
    }
}
