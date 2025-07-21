package defpackage;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public abstract class k51 implements eg8 {
    private final int a;
    private final int b;
    private ey6 c;

    public k51() {
        this(RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);
    }

    @Override // defpackage.b44
    public void a() {
    }

    @Override // defpackage.b44
    public void b() {
    }

    @Override // defpackage.eg8
    public final ey6 c() {
        return this.c;
    }

    @Override // defpackage.eg8
    public final void d(eu7 eu7Var) {
        eu7Var.d(this.a, this.b);
    }

    @Override // defpackage.eg8
    public void e(Drawable drawable) {
    }

    @Override // defpackage.eg8
    public final void h(ey6 ey6Var) {
        this.c = ey6Var;
    }

    @Override // defpackage.eg8
    public final void i(eu7 eu7Var) {
    }

    @Override // defpackage.eg8
    public void j(Drawable drawable) {
    }

    @Override // defpackage.b44
    public void onDestroy() {
    }

    public k51(int i, int i2) {
        if (x19.r(i, i2)) {
            this.a = i;
            this.b = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }
}
