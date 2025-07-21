package defpackage;

import androidx.compose.ui.text.a;

/* loaded from: classes.dex */
public final class kp0 implements fy1 {
    private final a a;
    private final int b;

    public kp0(a aVar, int i) {
        this.a = aVar;
        this.b = i;
    }

    @Override // defpackage.fy1
    public void a(ly1 ly1Var) {
        if (ly1Var.l()) {
            ly1Var.m(ly1Var.f(), ly1Var.e(), c());
        } else {
            ly1Var.m(ly1Var.k(), ly1Var.j(), c());
        }
        int g = ly1Var.g();
        int i = this.b;
        ly1Var.o(uo6.m(i > 0 ? (g + i) - 1 : (g + i) - c().length(), 0, ly1Var.h()));
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.a.j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp0)) {
            return false;
        }
        kp0 kp0Var = (kp0) obj;
        return zq3.c(c(), kp0Var.c()) && this.b == kp0Var.b;
    }

    public int hashCode() {
        return (c().hashCode() * 31) + this.b;
    }

    public String toString() {
        return "CommitTextCommand(text='" + c() + "', newCursorPosition=" + this.b + ')';
    }

    public kp0(String str, int i) {
        this(new a(str, null, null, 6, null), i);
    }
}
