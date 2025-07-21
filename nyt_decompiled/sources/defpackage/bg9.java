package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
final class bg9 implements ub8 {
    private final List a;
    private final long[] b;
    private final long[] c;

    public bg9(List list) {
        this.a = Collections.unmodifiableList(new ArrayList(list));
        this.b = new long[list.size() * 2];
        for (int i = 0; i < list.size(); i++) {
            uf9 uf9Var = (uf9) list.get(i);
            int i2 = i * 2;
            long[] jArr = this.b;
            jArr[i2] = uf9Var.b;
            jArr[i2 + 1] = uf9Var.c;
        }
        long[] jArr2 = this.b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.c = copyOf;
        Arrays.sort(copyOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int f(uf9 uf9Var, uf9 uf9Var2) {
        return Long.compare(uf9Var.b, uf9Var2.b);
    }

    @Override // defpackage.ub8
    public int a(long j) {
        int e = z19.e(this.c, j, false, false);
        if (e < this.c.length) {
            return e;
        }
        return -1;
    }

    @Override // defpackage.ub8
    public List b(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.a.size(); i++) {
            long[] jArr = this.b;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                uf9 uf9Var = (uf9) this.a.get(i);
                y31 y31Var = uf9Var.a;
                if (y31Var.e == -3.4028235E38f) {
                    arrayList2.add(uf9Var);
                } else {
                    arrayList.add(y31Var);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: ag9
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int f;
                f = bg9.f((uf9) obj, (uf9) obj2);
                return f;
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((uf9) arrayList2.get(i3)).a.c().h((-1) - i3, 1).a());
        }
        return arrayList;
    }

    @Override // defpackage.ub8
    public long c(int i) {
        ur.a(i >= 0);
        ur.a(i < this.c.length);
        return this.c[i];
    }

    @Override // defpackage.ub8
    public int d() {
        return this.c.length;
    }
}
