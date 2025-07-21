package defpackage;

import java.util.List;
import kotlin.collections.i;

/* loaded from: classes.dex */
public abstract class c14 {
    public static final l14 a(List list, m14 m14Var, List list2, int i, int i2, int i3) {
        int index = ((l14) i.k0(list)).getIndex();
        int size = list2.size();
        int i4 = -1;
        int i5 = -1;
        int i6 = 0;
        while (i6 < size && ((Number) list2.get(i6)).intValue() <= index) {
            i4 = ((Number) list2.get(i6)).intValue();
            i6++;
            i5 = ((Number) ((i6 < 0 || i6 > i.n(list2)) ? -1 : list2.get(i6))).intValue();
        }
        int size2 = list.size();
        int i7 = Integer.MIN_VALUE;
        int i8 = Integer.MIN_VALUE;
        int i9 = -1;
        for (int i10 = 0; i10 < size2; i10++) {
            l14 l14Var = (l14) list.get(i10);
            if (l14Var.getIndex() == i4) {
                i7 = l14Var.b();
                i9 = i10;
            } else if (l14Var.getIndex() == i5) {
                i8 = l14Var.b();
            }
        }
        if (i4 == -1) {
            return null;
        }
        l14 b = m14Var.b(i4);
        b.o(true);
        int max = i7 != Integer.MIN_VALUE ? Math.max(-i, i7) : -i;
        if (i8 != Integer.MIN_VALUE) {
            max = Math.min(max, i8 - b.a());
        }
        b.n(max, i2, i3);
        if (i9 != -1) {
            list.set(i9, b);
        } else {
            list.add(0, b);
        }
        return b;
    }
}
