package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.i;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.comscore.streaming.ContentMediaFormat;
import defpackage.aj8;
import defpackage.bd8;
import defpackage.bj8;
import defpackage.cc7;
import defpackage.cz3;
import defpackage.fd5;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hd5;
import defpackage.hn3;
import defpackage.jd5;
import defpackage.kt6;
import defpackage.rh8;
import defpackage.uo6;
import defpackage.ww8;
import defpackage.xh8;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class TextFieldSelectionManagerKt {

    static final class a implements jd5 {
        final /* synthetic */ TextFieldSelectionManager a;
        final /* synthetic */ boolean b;

        a(TextFieldSelectionManager textFieldSelectionManager, boolean z) {
            this.a = textFieldSelectionManager;
            this.b = z;
        }

        @Override // defpackage.jd5
        public final long a() {
            return this.a.D(this.b);
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final void a(final boolean z, final ResolvedTextDirection resolvedTextDirection, final TextFieldSelectionManager textFieldSelectionManager, Composer composer, final int i) {
        Composer h = composer.h(-1344558920);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1344558920, i, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:957)");
        }
        Boolean valueOf = Boolean.valueOf(z);
        h.z(511388516);
        boolean S = h.S(valueOf) | h.S(textFieldSelectionManager);
        Object A = h.A();
        if (S || A == Composer.a.a()) {
            A = textFieldSelectionManager.M(z);
            h.q(A);
        }
        h.R();
        xh8 xh8Var = (xh8) A;
        AndroidSelectionHandles_androidKt.b(new a(textFieldSelectionManager, z), z, resolvedTextDirection, i.m(textFieldSelectionManager.L().g()), bd8.c(Modifier.a, xh8Var, new TextFieldSelectionManagerKt$TextFieldSelectionHandle$2(xh8Var, null)), h, (i << 3) & ContentMediaFormat.PREVIEW_EPISODE);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    TextFieldSelectionManagerKt.a(z, resolvedTextDirection, textFieldSelectionManager, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public static final long b(TextFieldSelectionManager textFieldSelectionManager, long j) {
        int n;
        bj8 h;
        rh8 s;
        androidx.compose.ui.text.a k;
        fd5 y = textFieldSelectionManager.y();
        if (y == null) {
            return fd5.b.b();
        }
        long x = y.x();
        androidx.compose.ui.text.a K = textFieldSelectionManager.K();
        if (K == null || K.length() == 0) {
            return fd5.b.b();
        }
        Handle A = textFieldSelectionManager.A();
        int i = A == null ? -1 : b.a[A.ordinal()];
        if (i == -1) {
            return fd5.b.b();
        }
        if (i == 1 || i == 2) {
            n = i.n(textFieldSelectionManager.L().g());
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            n = i.i(textFieldSelectionManager.L().g());
        }
        TextFieldState I = textFieldSelectionManager.I();
        if (I == null || (h = I.h()) == null) {
            return fd5.b.b();
        }
        TextFieldState I2 = textFieldSelectionManager.I();
        if (I2 == null || (s = I2.s()) == null || (k = s.k()) == null) {
            return fd5.b.b();
        }
        int m = uo6.m(textFieldSelectionManager.G().b(n), 0, k.length());
        float o = fd5.o(h.j(x));
        aj8 f = h.f();
        int q = f.q(m);
        float s2 = f.s(q);
        float t = f.t(q);
        float l = uo6.l(o, Math.min(s2, t), Math.max(s2, t));
        if (Math.abs(o - l) > hn3.g(j) / 2) {
            return fd5.b.b();
        }
        float v = f.v(q);
        return hd5.a(l, ((f.m(q) - v) / 2) + v);
    }

    public static final boolean c(TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        cz3 g;
        kt6 b2;
        TextFieldState I = textFieldSelectionManager.I();
        if (I == null || (g = I.g()) == null || (b2 = g.b(g)) == null) {
            return false;
        }
        return g.a(b2, textFieldSelectionManager.D(z));
    }
}
