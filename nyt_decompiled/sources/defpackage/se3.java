package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.re3;
import java.io.EOFException;

/* loaded from: classes2.dex */
public final class se3 {
    private final yo5 a = new yo5(10);

    public Metadata a(z72 z72Var, re3.a aVar) {
        Metadata metadata = null;
        int i = 0;
        while (true) {
            try {
                z72Var.r(this.a.e(), 0, 10);
                this.a.U(0);
                if (this.a.K() != 4801587) {
                    break;
                }
                this.a.V(3);
                int G = this.a.G();
                int i2 = G + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.a.e(), 0, bArr, 0, 10);
                    z72Var.r(bArr, 10, G);
                    metadata = new re3(aVar).e(bArr, i2);
                } else {
                    z72Var.n(G);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        z72Var.g();
        z72Var.n(i);
        return metadata;
    }
}
