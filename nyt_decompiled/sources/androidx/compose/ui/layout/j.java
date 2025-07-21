package androidx.compose.ui.layout;

import androidx.compose.ui.platform.q;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.hn3;
import defpackage.in3;
import defpackage.kf5;
import defpackage.ss2;
import defpackage.zq3;

/* loaded from: classes.dex */
final class j extends q implements kf5 {
    private final ss2 c;
    private long d;

    public j(ss2 ss2Var, ss2 ss2Var2) {
        super(ss2Var2);
        this.c = ss2Var;
        this.d = in3.a(RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);
    }

    @Override // defpackage.kf5
    public void e(long j) {
        if (hn3.e(this.d, j)) {
            return;
        }
        this.c.invoke(hn3.b(j));
        this.d = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return zq3.c(this.c, ((j) obj).c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode();
    }
}
