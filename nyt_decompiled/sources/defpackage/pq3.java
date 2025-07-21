package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* loaded from: classes.dex */
public final class pq3 {
    private final lb4 a;
    private final xx5 b;
    private boolean c;

    public pq3(lb4 lb4Var, xx5 xx5Var) {
        this.a = lb4Var;
        this.b = xx5Var;
    }

    public final lb4 a() {
        return this.a;
    }

    public final MotionEvent b() {
        return this.b.a();
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d(long j) {
        Object obj;
        List b = this.b.b();
        int size = b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = b.get(i);
            if (tx5.d(((yx5) obj).c(), j)) {
                break;
            }
            i++;
        }
        yx5 yx5Var = (yx5) obj;
        if (yx5Var != null) {
            return yx5Var.d();
        }
        return false;
    }

    public final void e(boolean z) {
        this.c = z;
    }
}
