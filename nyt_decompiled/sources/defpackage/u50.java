package defpackage;

import com.google.android.exoplayer2.source.b0;
import defpackage.pk0;

/* loaded from: classes2.dex */
public final class u50 implements pk0.b {
    private final int[] a;
    private final b0[] b;

    public u50(int[] iArr, b0[] b0VarArr) {
        this.a = iArr;
        this.b = b0VarArr;
    }

    @Override // pk0.b
    public yp8 a(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i3 >= iArr.length) {
                a84.d("BaseMediaChunkOutput", "Unmatched track of type: " + i2);
                return new rw1();
            }
            if (i2 == iArr[i3]) {
                return this.b[i3];
            }
            i3++;
        }
    }

    public int[] b() {
        int[] iArr = new int[this.b.length];
        int i = 0;
        while (true) {
            b0[] b0VarArr = this.b;
            if (i >= b0VarArr.length) {
                return iArr;
            }
            iArr[i] = b0VarArr[i].G();
            i++;
        }
    }

    public void c(long j) {
        for (b0 b0Var : this.b) {
            b0Var.a0(j);
        }
    }
}
