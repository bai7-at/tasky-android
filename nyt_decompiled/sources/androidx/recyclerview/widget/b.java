package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.d64;

/* loaded from: classes.dex */
public final class b implements d64 {
    private final RecyclerView.Adapter a;

    public b(RecyclerView.Adapter adapter) {
        this.a = adapter;
    }

    @Override // defpackage.d64
    public void a(int i, int i2) {
        this.a.w(i, i2);
    }

    @Override // defpackage.d64
    public void b(int i, int i2) {
        this.a.x(i, i2);
    }

    @Override // defpackage.d64
    public void c(int i, int i2, Object obj) {
        this.a.v(i, i2, obj);
    }

    @Override // defpackage.d64
    public void d(int i, int i2) {
        this.a.u(i, i2);
    }
}
