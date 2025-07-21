package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzgx;

/* loaded from: classes3.dex */
public final class swe extends qve {
    private final byte[] e;
    private Uri f;
    private int g;
    private int h;
    private boolean i;

    public swe(byte[] bArr) {
        super(false);
        wad.d(bArr.length > 0);
        this.e = bArr;
    }

    @Override // defpackage.xyf
    public final int b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.e, this.g, bArr, i, min);
        this.g += min;
        this.h -= min;
        zzg(min);
        return min;
    }

    @Override // defpackage.kye
    public final long e(u1f u1fVar) {
        this.f = u1fVar.a;
        l(u1fVar);
        long j = u1fVar.f;
        int length = this.e.length;
        if (j > length) {
            throw new zzgx(2008);
        }
        int i = (int) j;
        this.g = i;
        int i2 = length - i;
        this.h = i2;
        long j2 = u1fVar.g;
        if (j2 != -1) {
            this.h = (int) Math.min(i2, j2);
        }
        this.i = true;
        m(u1fVar);
        long j3 = u1fVar.g;
        return j3 != -1 ? j3 : this.h;
    }

    @Override // defpackage.kye
    public final Uri zzc() {
        return this.f;
    }

    @Override // defpackage.kye
    public final void zzd() {
        if (this.i) {
            this.i = false;
            k();
        }
        this.f = null;
    }
}
