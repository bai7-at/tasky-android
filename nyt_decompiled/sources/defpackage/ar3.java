package defpackage;

import androidx.compose.runtime.b0;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ar3 {
    private static final a c = new a(null);
    public static final int d = 8;
    private final LayoutNode a;
    private final sy4 b = b0.e(null, null, 2, null);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ar3(LayoutNode layoutNode) {
        this.a = layoutNode;
    }

    private final rg4 a() {
        return (rg4) this.b.getValue();
    }

    private final rg4 f() {
        rg4 a2 = a();
        if (a2 != null) {
            return a2;
        }
        throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.");
    }

    private final void k(rg4 rg4Var) {
        this.b.setValue(rg4Var);
    }

    public final int b(int i) {
        return f().g(this.a.i0(), this.a.E(), i);
    }

    public final int c(int i) {
        return f().a(this.a.i0(), this.a.E(), i);
    }

    public final int d(int i) {
        return f().g(this.a.i0(), this.a.D(), i);
    }

    public final int e(int i) {
        return f().a(this.a.i0(), this.a.D(), i);
    }

    public final int g(int i) {
        return f().i(this.a.i0(), this.a.E(), i);
    }

    public final int h(int i) {
        return f().e(this.a.i0(), this.a.E(), i);
    }

    public final int i(int i) {
        return f().i(this.a.i0(), this.a.D(), i);
    }

    public final int j(int i) {
        return f().e(this.a.i0(), this.a.D(), i);
    }

    public final void l(rg4 rg4Var) {
        k(rg4Var);
    }
}
