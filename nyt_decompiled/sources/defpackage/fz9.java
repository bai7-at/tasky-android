package defpackage;

import com.google.android.gms.internal.ads.zzaff;
import java.util.Collections;

/* loaded from: classes3.dex */
final class fz9 extends jz9 {
    private static final int[] e = {5512, 11025, 22050, 44100};
    private boolean b;
    private boolean c;
    private int d;

    public fz9(tx9 tx9Var) {
        super(tx9Var);
    }

    @Override // defpackage.jz9
    protected final boolean a(b9e b9eVar) {
        if (this.b) {
            b9eVar.l(1);
        } else {
            int B = b9eVar.B();
            int i = B >> 4;
            this.d = i;
            if (i == 2) {
                int i2 = e[(B >> 2) & 3];
                x3a x3aVar = new x3a();
                x3aVar.w("audio/mpeg");
                x3aVar.k0(1);
                x3aVar.x(i2);
                this.a.f(x3aVar.D());
                this.c = true;
            } else if (i == 7 || i == 8) {
                x3a x3aVar2 = new x3a();
                x3aVar2.w(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                x3aVar2.k0(1);
                x3aVar2.x(8000);
                this.a.f(x3aVar2.D());
                this.c = true;
            } else if (i != 10) {
                throw new zzaff("Audio format not supported: " + i);
            }
            this.b = true;
        }
        return true;
    }

    @Override // defpackage.jz9
    protected final boolean b(b9e b9eVar, long j) {
        if (this.d == 2) {
            int q = b9eVar.q();
            this.a.b(b9eVar, q);
            this.a.c(j, 1, q, 0, null);
            return true;
        }
        int B = b9eVar.B();
        if (B != 0 || this.c) {
            if (this.d == 10 && B != 1) {
                return false;
            }
            int q2 = b9eVar.q();
            this.a.b(b9eVar, q2);
            this.a.c(j, 1, q2, 0, null);
            return true;
        }
        int q3 = b9eVar.q();
        byte[] bArr = new byte[q3];
        b9eVar.g(bArr, 0, q3);
        wt9 a = xt9.a(bArr);
        x3a x3aVar = new x3a();
        x3aVar.w("audio/mp4a-latm");
        x3aVar.l0(a.c);
        x3aVar.k0(a.b);
        x3aVar.x(a.a);
        x3aVar.l(Collections.singletonList(bArr));
        this.a.f(x3aVar.D());
        this.c = true;
        return false;
    }
}
