package defpackage;

import defpackage.pl5;

/* loaded from: classes4.dex */
public abstract class ql5 {
    public static final pl5 a(String str) {
        zq3.h(str, "<this>");
        pl5.b bVar = pl5.b.c;
        if (zq3.c(str, bVar.b())) {
            return bVar;
        }
        pl5 pl5Var = pl5.a.c;
        if (!zq3.c(str, pl5Var.b())) {
            pl5Var = pl5.c.c;
            if (!zq3.c(str, pl5Var.b())) {
                pl5Var = pl5.d.c;
                if (!zq3.c(str, pl5Var.b())) {
                    return bVar;
                }
            }
        }
        return pl5Var;
    }
}
