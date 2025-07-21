package defpackage;

import androidx.compose.ui.text.a;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.j;
import java.util.List;

/* loaded from: classes.dex */
public abstract class th8 {
    public static final int a(float f) {
        return dg4.d((float) Math.ceil(f));
    }

    public static final rh8 b(rh8 rh8Var, a aVar, j jVar, fm1 fm1Var, e.b bVar, boolean z, int i, int i2, int i3, List list) {
        if (zq3.c(rh8Var.k(), aVar) && zq3.c(rh8Var.j(), jVar)) {
            if (rh8Var.i() != z) {
                return new rh8(aVar, jVar, i2, i3, z, i, fm1Var, bVar, list, null);
            }
            if (!kj8.e(rh8Var.g(), i)) {
                return new rh8(aVar, jVar, i2, i3, z, i, fm1Var, bVar, list, null);
            }
            if (rh8Var.d() != i2) {
                return new rh8(aVar, jVar, i2, i3, z, i, fm1Var, bVar, list, null);
            }
            if (rh8Var.e() == i3 && zq3.c(rh8Var.a(), fm1Var)) {
                if (zq3.c(rh8Var.h(), list) && rh8Var.b() == bVar) {
                    return rh8Var;
                }
                return new rh8(aVar, jVar, i2, i3, z, i, fm1Var, bVar, list, null);
            }
            return new rh8(aVar, jVar, i2, i3, z, i, fm1Var, bVar, list, null);
        }
        return new rh8(aVar, jVar, i2, i3, z, i, fm1Var, bVar, list, null);
    }
}
