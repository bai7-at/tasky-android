package defpackage;

import androidx.paging.LoadType;

/* loaded from: classes.dex */
public abstract class en5 {
    public static final boolean a(kx2 kx2Var, kx2 kx2Var2, LoadType loadType) {
        zq3.h(kx2Var, "<this>");
        zq3.h(kx2Var2, "previous");
        zq3.h(loadType, "loadType");
        if (kx2Var.a() > kx2Var2.a()) {
            return true;
        }
        if (kx2Var.a() < kx2Var2.a()) {
            return false;
        }
        return v83.a(kx2Var.b(), kx2Var2.b(), loadType);
    }
}
