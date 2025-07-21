package defpackage;

import androidx.compose.ui.Modifier;
import kotlin.coroutines.intrinsics.a;

/* loaded from: classes.dex */
public final class j75 implements hm5 {
    public static final j75 a = new j75();

    private j75() {
    }

    @Override // defpackage.hm5
    public Object a(long j, gt2 gt2Var, by0 by0Var) {
        Object invoke = gt2Var.invoke(u49.b(j), by0Var);
        return invoke == a.h() ? invoke : ww8.a;
    }

    @Override // defpackage.hm5
    public boolean b() {
        return false;
    }

    @Override // defpackage.hm5
    public Modifier c() {
        return Modifier.a;
    }

    @Override // defpackage.hm5
    public long d(long j, int i, ss2 ss2Var) {
        return ((fd5) ss2Var.invoke(fd5.d(j))).x();
    }
}
