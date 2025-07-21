package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class st6 {
    private final lx2 a;
    private final List b;

    public st6(lx2 lx2Var) {
        this.a = lx2Var;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(new mx2(lx2Var, new int[]{1}));
    }

    private mx2 a(int i) {
        if (i >= this.b.size()) {
            List list = this.b;
            mx2 mx2Var = (mx2) list.get(list.size() - 1);
            for (int size = this.b.size(); size <= i; size++) {
                lx2 lx2Var = this.a;
                mx2Var = mx2Var.g(new mx2(lx2Var, new int[]{1, lx2Var.c((size - 1) + lx2Var.d())}));
                this.b.add(mx2Var);
            }
        }
        return (mx2) this.b.get(i);
    }

    public void b(int[] iArr, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        mx2 a = a(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] d = new mx2(this.a, iArr2).h(i, 1).b(a)[1].d();
        int length2 = i - d.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(d, 0, iArr, length + length2, d.length);
    }
}
