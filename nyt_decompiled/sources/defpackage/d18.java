package defpackage;

import android.os.Build;
import android.text.StaticLayout;

/* loaded from: classes.dex */
final class d18 implements o18 {
    @Override // defpackage.o18
    public boolean a(StaticLayout staticLayout, boolean z) {
        return Build.VERSION.SDK_INT >= 33 ? m18.a(staticLayout) : z;
    }

    @Override // defpackage.o18
    public StaticLayout b(p18 p18Var) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(p18Var.r(), p18Var.q(), p18Var.e(), p18Var.o(), p18Var.u());
        obtain.setTextDirection(p18Var.s());
        obtain.setAlignment(p18Var.a());
        obtain.setMaxLines(p18Var.n());
        obtain.setEllipsize(p18Var.c());
        obtain.setEllipsizedWidth(p18Var.d());
        obtain.setLineSpacing(p18Var.l(), p18Var.m());
        obtain.setIncludePad(p18Var.g());
        obtain.setBreakStrategy(p18Var.b());
        obtain.setHyphenationFrequency(p18Var.f());
        obtain.setIndents(p18Var.i(), p18Var.p());
        int i = Build.VERSION.SDK_INT;
        e18.a(obtain, p18Var.h());
        f18.a(obtain, p18Var.t());
        if (i >= 33) {
            m18.b(obtain, p18Var.j(), p18Var.k());
        }
        return obtain.build();
    }
}
