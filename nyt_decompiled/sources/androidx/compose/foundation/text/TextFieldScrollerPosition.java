package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.y;
import defpackage.ea7;
import defpackage.fa7;
import defpackage.gt2;
import defpackage.kt6;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.t26;
import defpackage.uo6;
import defpackage.yx4;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class TextFieldScrollerPosition {
    public static final a f = new a(null);
    private static final ea7 g = ListSaverKt.a(new gt2() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final List invoke(fa7 fa7Var, TextFieldScrollerPosition textFieldScrollerPosition) {
            return i.o(Float.valueOf(textFieldScrollerPosition.d()), Boolean.valueOf(textFieldScrollerPosition.f() == Orientation.Vertical));
        }
    }, new ss2() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$Companion$Saver$2
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TextFieldScrollerPosition invoke(List list) {
            Object obj = list.get(1);
            zq3.f(obj, "null cannot be cast to non-null type kotlin.Boolean");
            Orientation orientation = ((Boolean) obj).booleanValue() ? Orientation.Vertical : Orientation.Horizontal;
            Object obj2 = list.get(0);
            zq3.f(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new TextFieldScrollerPosition(orientation, ((Float) obj2).floatValue());
        }
    });
    private final yx4 a;
    private final yx4 b;
    private kt6 c;
    private long d;
    private final sy4 e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ea7 a() {
            return TextFieldScrollerPosition.g;
        }

        private a() {
        }
    }

    public TextFieldScrollerPosition(Orientation orientation, float f2) {
        this.a = t26.a(f2);
        this.b = t26.a(0.0f);
        this.c = kt6.e.a();
        this.d = androidx.compose.ui.text.i.b.a();
        this.e = y.i(orientation, y.q());
    }

    private final void g(float f2) {
        this.b.r(f2);
    }

    public final void b(float f2, float f3, int i) {
        float d = d();
        float f4 = i;
        float f5 = d + f4;
        h(d() + ((f3 <= f5 && (f2 >= d || f3 - f2 <= f4)) ? (f2 >= d || f3 - f2 > f4) ? 0.0f : f2 - d : f3 - f5));
    }

    public final float c() {
        return this.b.a();
    }

    public final float d() {
        return this.a.a();
    }

    public final int e(long j) {
        return androidx.compose.ui.text.i.n(j) != androidx.compose.ui.text.i.n(this.d) ? androidx.compose.ui.text.i.n(j) : androidx.compose.ui.text.i.i(j) != androidx.compose.ui.text.i.i(this.d) ? androidx.compose.ui.text.i.i(j) : androidx.compose.ui.text.i.l(j);
    }

    public final Orientation f() {
        return (Orientation) this.e.getValue();
    }

    public final void h(float f2) {
        this.a.r(f2);
    }

    public final void i(long j) {
        this.d = j;
    }

    public final void j(Orientation orientation, kt6 kt6Var, int i, int i2) {
        float f2 = i2 - i;
        g(f2);
        if (kt6Var.i() != this.c.i() || kt6Var.l() != this.c.l()) {
            boolean z = orientation == Orientation.Vertical;
            b(z ? kt6Var.l() : kt6Var.i(), z ? kt6Var.e() : kt6Var.j(), i);
            this.c = kt6Var;
        }
        h(uo6.l(d(), 0.0f, f2));
    }

    public /* synthetic */ TextFieldScrollerPosition(Orientation orientation, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(orientation, (i & 2) != 0 ? 0.0f : f2);
    }
}
