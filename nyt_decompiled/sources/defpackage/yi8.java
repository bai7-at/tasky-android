package defpackage;

import androidx.compose.ui.text.a;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.g;
import androidx.compose.ui.text.j;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

/* loaded from: classes.dex */
public abstract class yi8 {
    public static final boolean a(aj8 aj8Var, a aVar, j jVar, List list, int i, boolean z, int i2, fm1 fm1Var, LayoutDirection layoutDirection, e.b bVar, long j) {
        g l = aj8Var.l();
        if (aj8Var.w().j().c() || !zq3.c(l.j(), aVar) || !l.i().K(jVar) || !zq3.c(l.g(), list) || l.e() != i || l.h() != z || !kj8.e(l.f(), i2) || !zq3.c(l.b(), fm1Var) || l.d() != layoutDirection || !zq3.c(l.c(), bVar) || fv0.p(j) != fv0.p(l.a())) {
            return false;
        }
        if (z || kj8.e(i2, kj8.a.b())) {
            return fv0.n(j) == fv0.n(l.a()) && fv0.m(j) == fv0.m(l.a());
        }
        return true;
    }
}
