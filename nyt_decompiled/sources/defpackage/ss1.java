package defpackage;

import androidx.paging.DiffingChangePayload;

/* loaded from: classes.dex */
public final class ss1 {
    public static final ss1 a = new ss1();

    private ss1() {
    }

    private final void a(d64 d64Var, int i, int i2, int i3, int i4, Object obj) {
        int i5 = i - i3;
        if (i5 > 0) {
            d64Var.c(i3, i5, obj);
        }
        int i6 = i4 - i2;
        if (i6 > 0) {
            d64Var.c(i2, i6, obj);
        }
    }

    public final void b(d64 d64Var, zt5 zt5Var, zt5 zt5Var2) {
        zq3.h(d64Var, "callback");
        zq3.h(zt5Var, "oldList");
        zq3.h(zt5Var2, "newList");
        int max = Math.max(zt5Var.f(), zt5Var2.f());
        int min = Math.min(zt5Var.f() + zt5Var.c(), zt5Var2.f() + zt5Var2.c());
        int i = min - max;
        if (i > 0) {
            d64Var.b(max, i);
            d64Var.a(max, i);
        }
        int min2 = Math.min(max, min);
        int max2 = Math.max(max, min);
        a(d64Var, min2, max2, uo6.i(zt5Var.f(), zt5Var2.a()), uo6.i(zt5Var.f() + zt5Var.c(), zt5Var2.a()), DiffingChangePayload.ITEM_TO_PLACEHOLDER);
        a(d64Var, min2, max2, uo6.i(zt5Var2.f(), zt5Var.a()), uo6.i(zt5Var2.f() + zt5Var2.c(), zt5Var.a()), DiffingChangePayload.PLACEHOLDER_TO_ITEM);
        int a2 = zt5Var2.a() - zt5Var.a();
        if (a2 > 0) {
            d64Var.a(zt5Var.a(), a2);
        } else if (a2 < 0) {
            d64Var.b(zt5Var.a() + a2, -a2);
        }
    }
}
