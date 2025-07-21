package defpackage;

import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.text.f;
import androidx.compose.ui.text.j;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.uh8;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class ak8 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zu5 b(f fVar, uu5 uu5Var) {
        if (fVar == null && uu5Var == null) {
            return null;
        }
        return og.a(fVar, uu5Var);
    }

    public static final j c(j jVar, j jVar2, float f) {
        return new j(SpanStyleKt.c(jVar.R(), jVar2.R(), f), oo5.b(jVar.Q(), jVar2.Q(), f));
    }

    public static final j d(j jVar, LayoutDirection layoutDirection) {
        return new j(SpanStyleKt.h(jVar.C()), oo5.e(jVar.z(), layoutDirection), jVar.A());
    }

    public static final int e(LayoutDirection layoutDirection, int i) {
        uh8.a aVar = uh8.b;
        if (uh8.j(i, aVar.a())) {
            int i2 = a.a[layoutDirection.ordinal()];
            if (i2 == 1) {
                return aVar.b();
            }
            if (i2 == 2) {
                return aVar.c();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!uh8.j(i, aVar.f())) {
            return i;
        }
        int i3 = a.a[layoutDirection.ordinal()];
        if (i3 == 1) {
            return aVar.d();
        }
        if (i3 == 2) {
            return aVar.e();
        }
        throw new NoWhenBranchMatchedException();
    }
}
