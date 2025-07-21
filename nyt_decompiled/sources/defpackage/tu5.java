package defpackage;

import android.view.View;
import android.widget.Magnifier;
import androidx.compose.foundation.j;

/* loaded from: classes.dex */
public final class tu5 implements j {
    public static final tu5 b = new tu5();
    private static final boolean c = true;

    public static final class a extends su5 {
        public a(Magnifier magnifier) {
            super(magnifier);
        }

        @Override // defpackage.ru5
        public void b(long j, long j2, float f) {
            if (!Float.isNaN(f)) {
                d().setZoom(f);
            }
            if (hd5.c(j2)) {
                d().show(fd5.o(j), fd5.p(j), fd5.o(j2), fd5.p(j2));
            } else {
                d().show(fd5.o(j), fd5.p(j));
            }
        }
    }

    private tu5() {
    }

    @Override // androidx.compose.foundation.j
    public boolean a() {
        return c;
    }

    @Override // androidx.compose.foundation.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a b(View view, boolean z, long j, float f, float f2, boolean z2, fm1 fm1Var, float f3) {
        if (z) {
            return new a(new Magnifier(view));
        }
        long v1 = fm1Var.v1(j);
        float f1 = fm1Var.f1(f);
        float f12 = fm1Var.f1(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (v1 != zt7.b.a()) {
            builder.setSize(dg4.d(zt7.i(v1)), dg4.d(zt7.g(v1)));
        }
        if (!Float.isNaN(f1)) {
            builder.setCornerRadius(f1);
        }
        if (!Float.isNaN(f12)) {
            builder.setElevation(f12);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new a(builder.build());
    }
}
