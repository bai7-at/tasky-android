package defpackage;

import androidx.compose.animation.core.VectorConvertersKt;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.t;

/* loaded from: classes.dex */
public final class q49 implements l49 {
    private final Map a;
    private final int b;
    private final int c;
    private mi d;
    private mi e;

    public q49(Map map, int i, int i2) {
        this.a = map;
        this.b = i;
        this.c = i2;
    }

    private final void h(mi miVar) {
        if (this.d == null) {
            this.d = ni.g(miVar);
            this.e = ni.g(miVar);
        }
    }

    @Override // defpackage.l49
    public int c() {
        return this.c;
    }

    @Override // defpackage.l49
    public int d() {
        return this.b;
    }

    @Override // defpackage.i49
    public mi f(long j, mi miVar, mi miVar2, mi miVar3) {
        long b = j49.b(this, j / 1000000);
        if (b <= 0) {
            return miVar3;
        }
        mi d = j49.d(this, b - 1, miVar, miVar2, miVar3);
        mi d2 = j49.d(this, b, miVar, miVar2, miVar3);
        h(miVar);
        int b2 = d.b();
        int i = 0;
        while (true) {
            mi miVar4 = null;
            if (i >= b2) {
                break;
            }
            mi miVar5 = this.e;
            if (miVar5 == null) {
                zq3.z("velocityVector");
            } else {
                miVar4 = miVar5;
            }
            miVar4.e(i, (d.a(i) - d2.a(i)) * 1000.0f);
            i++;
        }
        mi miVar6 = this.e;
        if (miVar6 != null) {
            return miVar6;
        }
        zq3.z("velocityVector");
        return null;
    }

    @Override // defpackage.i49
    public mi g(long j, mi miVar, mi miVar2, mi miVar3) {
        int b = (int) j49.b(this, j / 1000000);
        if (this.a.containsKey(Integer.valueOf(b))) {
            return (mi) ((Pair) t.j(this.a, Integer.valueOf(b))).c();
        }
        if (b >= d()) {
            return miVar2;
        }
        if (b <= 0) {
            return miVar;
        }
        int d = d();
        vx1 d2 = xx1.d();
        int i = 0;
        mi miVar4 = miVar;
        int i2 = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            Pair pair = (Pair) entry.getValue();
            if (b > intValue && intValue >= i2) {
                miVar4 = (mi) pair.c();
                d2 = (vx1) pair.d();
                i2 = intValue;
            } else if (b < intValue && intValue <= d) {
                miVar2 = (mi) pair.c();
                d = intValue;
            }
        }
        float a = d2.a((b - i2) / (d - i2));
        h(miVar);
        int b2 = miVar4.b();
        while (true) {
            mi miVar5 = null;
            if (i >= b2) {
                break;
            }
            mi miVar6 = this.d;
            if (miVar6 == null) {
                zq3.z("valueVector");
            } else {
                miVar5 = miVar6;
            }
            miVar5.e(i, VectorConvertersKt.k(miVar4.a(i), miVar2.a(i), a));
            i++;
        }
        mi miVar7 = this.d;
        if (miVar7 != null) {
            return miVar7;
        }
        zq3.z("valueVector");
        return null;
    }
}
