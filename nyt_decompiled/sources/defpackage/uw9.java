package defpackage;

import com.google.android.gms.internal.ads.zzby;
import java.io.EOFException;

/* loaded from: classes3.dex */
public final class uw9 {
    private final b9e a = new b9e(10);

    public final zzby a(ov9 ov9Var, l0a l0aVar) {
        zzby zzbyVar = null;
        int i = 0;
        while (true) {
            try {
                ((bv9) ov9Var).d(this.a.m(), 0, 10, false);
                this.a.k(0);
                if (this.a.D() != 4801587) {
                    break;
                }
                this.a.l(3);
                int A = this.a.A();
                int i2 = A + 10;
                if (zzbyVar == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.a.m(), 0, bArr, 0, 10);
                    ((bv9) ov9Var).d(bArr, 10, A, false);
                    zzbyVar = n0a.a(bArr, i2, l0aVar, new xz9());
                } else {
                    ((bv9) ov9Var).k(A, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        ov9Var.zzj();
        ((bv9) ov9Var).k(i, false);
        return zzbyVar;
    }
}
