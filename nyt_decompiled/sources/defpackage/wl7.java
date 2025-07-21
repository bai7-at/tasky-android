package defpackage;

import androidx.compose.ui.text.a;

/* loaded from: classes.dex */
public final class wl7 implements fy1 {
    private final a a;
    private final int b;

    public wl7(a aVar, int i) {
        this.a = aVar;
        this.b = i;
    }

    @Override // defpackage.fy1
    public void a(ly1 ly1Var) {
        if (ly1Var.l()) {
            int f = ly1Var.f();
            ly1Var.m(ly1Var.f(), ly1Var.e(), c());
            if (c().length() > 0) {
                ly1Var.n(f, c().length() + f);
            }
        } else {
            int k = ly1Var.k();
            ly1Var.m(ly1Var.k(), ly1Var.j(), c());
            if (c().length() > 0) {
                ly1Var.n(k, c().length() + k);
            }
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
        if (!(obj instanceof wl7)) {
            return false;
        }
        wl7 wl7Var = (wl7) obj;
        return zq3.c(c(), wl7Var.c()) && this.b == wl7Var.b;
    }

    public int hashCode() {
        return (c().hashCode() * 31) + this.b;
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + c() + "', newCursorPosition=" + this.b + ')';
    }

    public wl7(String str, int i) {
        this(new a(str, null, null, 6, null), i);
    }
}
