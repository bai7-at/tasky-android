package defpackage;

import androidx.compose.runtime.r;
import androidx.compose.runtime.t;

/* loaded from: classes.dex */
public final class hd {
    private int a;

    public hd(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean b() {
        return this.a != Integer.MIN_VALUE;
    }

    public final void c(int i) {
        this.a = i;
    }

    public final int d(r rVar) {
        return rVar.c(this);
    }

    public final int e(t tVar) {
        return tVar.G(this);
    }

    public String toString() {
        return super.toString() + "{ location = " + this.a + " }";
    }
}
