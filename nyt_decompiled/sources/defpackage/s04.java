package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class s04 implements r04, f {
    private final LazyLayoutItemContentFactory a;
    private final ra8 b;
    private final o04 c;
    private final HashMap d = new HashMap();

    public s04(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, ra8 ra8Var) {
        this.a = lazyLayoutItemContentFactory;
        this.b = ra8Var;
        this.c = (o04) lazyLayoutItemContentFactory.d().mo865invoke();
    }

    @Override // defpackage.an2
    public long A(float f) {
        return this.b.A(f);
    }

    @Override // defpackage.fm1
    public long B(long j) {
        return this.b.B(j);
    }

    @Override // defpackage.an2
    public float F(long j) {
        return this.b.F(j);
    }

    @Override // androidx.compose.ui.layout.f
    public sg4 P(int i, int i2, Map map, ss2 ss2Var) {
        return this.b.P(i, i2, map, ss2Var);
    }

    @Override // defpackage.fm1
    public long Q(float f) {
        return this.b.Q(f);
    }

    @Override // defpackage.r04
    public List T(int i, long j) {
        List list = (List) this.d.get(Integer.valueOf(i));
        if (list != null) {
            return list;
        }
        Object c = this.c.c(i);
        List H0 = this.b.H0(c, this.a.b(i, c, this.c.d(i)));
        int size = H0.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((qg4) H0.get(i2)).W(j));
        }
        this.d.put(Integer.valueOf(i), arrayList);
        return arrayList;
    }

    @Override // defpackage.fm1
    public float X0(float f) {
        return this.b.X0(f);
    }

    @Override // defpackage.yq3
    public boolean Z() {
        return this.b.Z();
    }

    @Override // defpackage.an2
    public float c1() {
        return this.b.c1();
    }

    @Override // defpackage.fm1
    public float f1(float f) {
        return this.b.f1(f);
    }

    @Override // defpackage.fm1
    public float getDensity() {
        return this.b.getDensity();
    }

    @Override // defpackage.yq3
    public LayoutDirection getLayoutDirection() {
        return this.b.getLayoutDirection();
    }

    @Override // defpackage.fm1
    public int k1(long j) {
        return this.b.k1(j);
    }

    @Override // defpackage.fm1
    public int l0(float f) {
        return this.b.l0(f);
    }

    @Override // defpackage.fm1
    public float t0(long j) {
        return this.b.t0(j);
    }

    @Override // defpackage.r04, defpackage.fm1
    public float v(int i) {
        return this.b.v(i);
    }

    @Override // defpackage.fm1
    public long v1(long j) {
        return this.b.v1(j);
    }
}
