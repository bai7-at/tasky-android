package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.g;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.f;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.i;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.aj8;
import defpackage.ao5;
import defpackage.ar8;
import defpackage.bj8;
import defpackage.cz3;
import defpackage.du7;
import defpackage.ez3;
import defpackage.fd5;
import defpackage.fi8;
import defpackage.gv1;
import defpackage.hd5;
import defpackage.hn3;
import defpackage.id5;
import defpackage.jo7;
import defpackage.jy7;
import defpackage.kg4;
import defpackage.kt6;
import defpackage.l74;
import defpackage.li8;
import defpackage.m60;
import defpackage.mj8;
import defpackage.nt6;
import defpackage.ph0;
import defpackage.ph8;
import defpackage.pj8;
import defpackage.rh8;
import defpackage.ri8;
import defpackage.ss2;
import defpackage.vi8;
import defpackage.ww8;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public abstract class TextFieldDelegate {
    public static final Companion a = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ar8 a(long j, ar8 ar8Var) {
            int b = ar8Var.a().b(i.n(j));
            int b2 = ar8Var.a().b(i.i(j));
            int min = Math.min(b, b2);
            int max = Math.max(b, b2);
            a.C0064a c0064a = new a.C0064a(ar8Var.b());
            c0064a.c(new jy7(0L, 0L, (o) null, (l) null, (m) null, (e) null, (String) null, 0L, (m60) null, (li8) null, (l74) null, 0L, ph8.b.d(), (jo7) null, (f) null, (gv1) null, 61439, (DefaultConstructorMarker) null), min, max);
            return new ar8(c0064a.o(), ar8Var.a());
        }

        public final void b(ph0 ph0Var, TextFieldValue textFieldValue, id5 id5Var, aj8 aj8Var, ao5 ao5Var) {
            int b;
            int b2;
            if (!i.h(textFieldValue.g()) && (b = id5Var.b(i.l(textFieldValue.g()))) != (b2 = id5Var.b(i.k(textFieldValue.g())))) {
                ph0Var.r(aj8Var.z(b, b2), ao5Var);
            }
            mj8.a.a(ph0Var, aj8Var);
        }

        public final Triple c(rh8 rh8Var, long j, LayoutDirection layoutDirection, aj8 aj8Var) {
            aj8 l = rh8Var.l(j, layoutDirection, aj8Var);
            return new Triple(Integer.valueOf(hn3.g(l.B())), Integer.valueOf(hn3.f(l.B())), l);
        }

        public final void d(TextFieldValue textFieldValue, rh8 rh8Var, aj8 aj8Var, cz3 cz3Var, vi8 vi8Var, boolean z, id5 id5Var) {
            if (z) {
                int b = id5Var.b(i.k(textFieldValue.g()));
                kt6 d = b < aj8Var.l().j().length() ? aj8Var.d(b) : b != 0 ? aj8Var.d(b - 1) : new kt6(0.0f, 0.0f, 1.0f, hn3.f(fi8.b(rh8Var.j(), rh8Var.a(), rh8Var.b(), null, 0, 24, null)));
                long g0 = cz3Var.g0(hd5.a(d.i(), d.l()));
                vi8Var.c(nt6.b(hd5.a(fd5.o(g0), fd5.p(g0)), du7.a(d.n(), d.h())));
            }
        }

        public final void e(vi8 vi8Var, EditProcessor editProcessor, ss2 ss2Var) {
            ss2Var.invoke(TextFieldValue.c(editProcessor.f(), null, 0L, null, 3, null));
            vi8Var.a();
        }

        public final void f(List list, EditProcessor editProcessor, ss2 ss2Var, vi8 vi8Var) {
            TextFieldValue b = editProcessor.b(list);
            if (vi8Var != null) {
                vi8Var.d(null, b);
            }
            ss2Var.invoke(b);
        }

        public final vi8 g(ri8 ri8Var, TextFieldValue textFieldValue, EditProcessor editProcessor, androidx.compose.ui.text.input.b bVar, ss2 ss2Var, ss2 ss2Var2) {
            return h(ri8Var, textFieldValue, editProcessor, bVar, ss2Var, ss2Var2);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, vi8] */
        public final vi8 h(ri8 ri8Var, TextFieldValue textFieldValue, final EditProcessor editProcessor, androidx.compose.ui.text.input.b bVar, final ss2 ss2Var, ss2 ss2Var2) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ?? d = ri8Var.d(textFieldValue, bVar, new ss2() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$restartInput$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(List list) {
                    TextFieldDelegate.a.f(list, EditProcessor.this, ss2Var, ref$ObjectRef.element);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((List) obj);
                    return ww8.a;
                }
            }, ss2Var2);
            ref$ObjectRef.element = d;
            return d;
        }

        public final void i(long j, bj8 bj8Var, EditProcessor editProcessor, id5 id5Var, ss2 ss2Var) {
            ss2Var.invoke(TextFieldValue.c(editProcessor.f(), null, pj8.a(id5Var.a(bj8.e(bj8Var, j, false, 2, null))), null, 5, null));
        }

        public final void j(vi8 vi8Var, TextFieldValue textFieldValue, id5 id5Var, bj8 bj8Var) {
            cz3 b;
            final cz3 c = bj8Var.c();
            if (c == null || !c.m() || (b = bj8Var.b()) == null) {
                return;
            }
            vi8Var.e(textFieldValue, id5Var, bj8Var.f(), new ss2() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$updateTextLayoutResult$1$1$1
                {
                    super(1);
                }

                public final void b(float[] fArr) {
                    ez3.d(cz3.this).o(cz3.this, fArr);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b(((kg4) obj).o());
                    return ww8.a;
                }
            }, g.b(c), c.z(b, false));
        }

        private Companion() {
        }
    }
}
