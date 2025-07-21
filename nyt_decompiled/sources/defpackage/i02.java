package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes.dex */
final class i02 implements zd0 {
    public static final i02 a = new i02();
    private static final long b = zt7.b.a();
    private static final LayoutDirection c = LayoutDirection.Ltr;
    private static final fm1 d = hm1.a(1.0f, 1.0f);

    private i02() {
    }

    @Override // defpackage.zd0
    public long b() {
        return b;
    }

    @Override // defpackage.zd0
    public fm1 getDensity() {
        return d;
    }

    @Override // defpackage.zd0
    public LayoutDirection getLayoutDirection() {
        return c;
    }
}
