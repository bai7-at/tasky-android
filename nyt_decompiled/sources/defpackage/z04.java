package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import java.util.List;
import kotlin.collections.i;
import kotlin.coroutines.intrinsics.a;

/* loaded from: classes.dex */
public final class z04 implements i04 {
    private final LazyListState a;

    public z04(LazyListState lazyListState) {
        this.a = lazyListState;
    }

    @Override // defpackage.i04
    public int a() {
        return this.a.x().h();
    }

    @Override // defpackage.i04
    public int b() {
        return this.a.t();
    }

    @Override // defpackage.i04
    public int c() {
        return this.a.s();
    }

    @Override // defpackage.i04
    public int d() {
        j14 x = this.a.x();
        List k = x.k();
        int size = k.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((g14) k.get(i2)).a();
        }
        return (i / k.size()) + x.i();
    }

    @Override // defpackage.i04
    public int e() {
        g14 g14Var = (g14) i.y0(this.a.x().k());
        if (g14Var != null) {
            return g14Var.getIndex();
        }
        return 0;
    }

    @Override // defpackage.i04
    public int f(int i) {
        Object obj;
        List k = this.a.x().k();
        int size = k.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = k.get(i2);
            if (((g14) obj).getIndex() == i) {
                break;
            }
            i2++;
        }
        g14 g14Var = (g14) obj;
        if (g14Var != null) {
            return g14Var.b();
        }
        return 0;
    }

    @Override // defpackage.i04
    public void g(qc7 qc7Var, int i, int i2) {
        this.a.R(i, i2);
    }

    @Override // defpackage.i04
    public Object h(gt2 gt2Var, by0 by0Var) {
        Object e = tc7.e(this.a, null, gt2Var, by0Var, 1, null);
        return e == a.h() ? e : ww8.a;
    }

    @Override // defpackage.i04
    public float i(int i, int i2) {
        int d = d();
        int c = i - c();
        int min = Math.min(Math.abs(i2), d);
        if (i2 < 0) {
            min *= -1;
        }
        return ((d * c) + min) - b();
    }
}
