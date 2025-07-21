package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.f;
import defpackage.an3;
import defpackage.k04;
import defpackage.o04;
import defpackage.p04;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {
    public static final List a(o04 o04Var, f fVar, k04 k04Var) {
        if (!k04Var.d() && fVar.isEmpty()) {
            return kotlin.collections.i.l();
        }
        ArrayList arrayList = new ArrayList();
        an3 an3Var = k04Var.d() ? new an3(k04Var.c(), Math.min(k04Var.b(), o04Var.a() - 1)) : an3.e.a();
        int size = fVar.size();
        for (int i = 0; i < size; i++) {
            f.a aVar = (f.a) fVar.get(i);
            int a = p04.a(o04Var, aVar.getKey(), aVar.getIndex());
            int g = an3Var.g();
            if ((a > an3Var.j() || g > a) && a >= 0 && a < o04Var.a()) {
                arrayList.add(Integer.valueOf(a));
            }
        }
        int g2 = an3Var.g();
        int j = an3Var.j();
        if (g2 <= j) {
            while (true) {
                arrayList.add(Integer.valueOf(g2));
                if (g2 == j) {
                    break;
                }
                g2++;
            }
        }
        return arrayList;
    }
}
