package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes3.dex */
final class lzf implements kye {
    private final kye a;
    private final int b;
    private final kzf c;
    private final byte[] d;
    private int e;

    public lzf(kye kyeVar, int i, kzf kzfVar) {
        wad.d(i > 0);
        this.a = kyeVar;
        this.b = i;
        this.c = kzfVar;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // defpackage.xyf
    public final int b(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        if (i3 == 0) {
            int i4 = 0;
            if (this.a.b(this.d, 0, 1) != -1) {
                int i5 = (this.d[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int b = this.a.b(bArr2, i4, i6);
                        if (b != -1) {
                            i4 += b;
                            i6 -= b;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr2[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        this.c.b(new b9e(bArr2, i5));
                    }
                }
                i3 = this.b;
                this.e = i3;
            }
            return -1;
        }
        int b2 = this.a.b(bArr, i, Math.min(i3, i2));
        if (b2 != -1) {
            this.e -= b2;
        }
        return b2;
    }

    @Override // defpackage.kye
    public final long e(u1f u1fVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.kye
    public final void h(f6f f6fVar) {
        f6fVar.getClass();
        this.a.h(f6fVar);
    }

    @Override // defpackage.kye
    public final Uri zzc() {
        return this.a.zzc();
    }

    @Override // defpackage.kye
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.kye
    public final Map zze() {
        return this.a.zze();
    }
}
