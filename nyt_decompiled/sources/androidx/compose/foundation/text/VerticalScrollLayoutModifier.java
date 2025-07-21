package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.l;
import defpackage.ar8;
import defpackage.bj8;
import defpackage.dg4;
import defpackage.fv0;
import defpackage.kt6;
import defpackage.qg4;
import defpackage.qs2;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes.dex */
final class VerticalScrollLayoutModifier implements androidx.compose.ui.layout.c {
    private final TextFieldScrollerPosition b;
    private final int c;
    private final ar8 d;
    private final qs2 e;

    public VerticalScrollLayoutModifier(TextFieldScrollerPosition textFieldScrollerPosition, int i, ar8 ar8Var, qs2 qs2Var) {
        this.b = textFieldScrollerPosition;
        this.c = i;
        this.d = ar8Var;
        this.e = qs2Var;
    }

    @Override // androidx.compose.ui.layout.c
    public sg4 d(final f fVar, qg4 qg4Var, long j) {
        final l W = qg4Var.W(fv0.e(j, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        final int min = Math.min(W.v0(), fv0.m(j));
        return f.J(fVar, W.F0(), min, null, new ss2() { // from class: androidx.compose.foundation.text.VerticalScrollLayoutModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(l.a aVar) {
                kt6 b;
                f fVar2 = f.this;
                int l = this.l();
                ar8 v = this.v();
                bj8 bj8Var = (bj8) this.t().mo865invoke();
                b = TextFieldScrollKt.b(fVar2, l, v, bj8Var != null ? bj8Var.f() : null, false, W.F0());
                this.r().j(Orientation.Vertical, b, min, W.v0());
                l.a.j(aVar, W, 0, dg4.d(-this.r().d()), 0.0f, 4, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalScrollLayoutModifier)) {
            return false;
        }
        VerticalScrollLayoutModifier verticalScrollLayoutModifier = (VerticalScrollLayoutModifier) obj;
        return zq3.c(this.b, verticalScrollLayoutModifier.b) && this.c == verticalScrollLayoutModifier.c && zq3.c(this.d, verticalScrollLayoutModifier.d) && zq3.c(this.e, verticalScrollLayoutModifier.e);
    }

    public int hashCode() {
        return (((((this.b.hashCode() * 31) + Integer.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final int l() {
        return this.c;
    }

    public final TextFieldScrollerPosition r() {
        return this.b;
    }

    public final qs2 t() {
        return this.e;
    }

    public String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.b + ", cursorOffset=" + this.c + ", transformedText=" + this.d + ", textLayoutResultProvider=" + this.e + ')';
    }

    public final ar8 v() {
        return this.d;
    }
}
