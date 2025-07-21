package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class s57 extends RecyclerView.t {
    private int a = -1;

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(RecyclerView recyclerView, int i) {
        this.a = i;
    }

    public boolean c() {
        int i = this.a;
        return i == 1 || i == 2;
    }
}
