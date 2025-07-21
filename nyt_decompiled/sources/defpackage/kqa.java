package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class kqa {
    private final String[] a;
    private final double[] b;
    private final double[] c;
    private final int[] d;
    private int e;

    /* synthetic */ kqa(loa loaVar, fpa fpaVar) {
        List list;
        List list2;
        List list3;
        List list4;
        list = loaVar.b;
        int size = list.size();
        list2 = loaVar.a;
        this.a = (String[]) list2.toArray(new String[size]);
        list3 = loaVar.b;
        this.b = c(list3);
        list4 = loaVar.c;
        this.c = c(list4);
        this.d = new int[size];
        this.e = 0;
    }

    private static final double[] c(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    public final List a() {
        kqa kqaVar = this;
        ArrayList arrayList = new ArrayList(kqaVar.a.length);
        int i = 0;
        while (true) {
            String[] strArr = kqaVar.a;
            if (i >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i];
            double[] dArr = kqaVar.c;
            double[] dArr2 = kqaVar.b;
            int[] iArr = kqaVar.d;
            double d = dArr[i];
            double d2 = dArr2[i];
            int i2 = iArr[i];
            arrayList.add(new goa(str, d, d2, i2 / kqaVar.e, i2));
            i++;
            kqaVar = this;
        }
    }

    public final void b(double d) {
        this.e++;
        int i = 0;
        while (true) {
            double[] dArr = this.c;
            if (i >= dArr.length) {
                return;
            }
            double d2 = dArr[i];
            if (d2 <= d && d < this.b[i]) {
                int[] iArr = this.d;
                iArr[i] = iArr[i] + 1;
            }
            if (d < d2) {
                return;
            } else {
                i++;
            }
        }
    }
}
