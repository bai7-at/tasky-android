package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class bd0 {
    private int a;

    public final void e(int i) {
        this.a = i | this.a;
    }

    public void f() {
        this.a = 0;
    }

    public final void g(int i) {
        this.a = (~i) & this.a;
    }

    protected final boolean i(int i) {
        return (this.a & i) == i;
    }

    public final boolean j() {
        return i(268435456);
    }

    public final boolean k() {
        return i(RecyclerView.UNDEFINED_DURATION);
    }

    public final boolean l() {
        return i(4);
    }

    public final boolean n() {
        return i(134217728);
    }

    public final boolean o() {
        return i(1);
    }

    public final boolean p() {
        return i(536870912);
    }

    public final void q(int i) {
        this.a = i;
    }
}
