package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzgad;
import java.util.Map;

/* loaded from: classes3.dex */
final class blb implements kye {
    private final kye a;
    private final long b;
    private final kye c;
    private long d;
    private Uri e;

    blb(kye kyeVar, int i, kye kyeVar2) {
        this.a = kyeVar;
        this.b = i;
        this.c = kyeVar2;
    }

    @Override // defpackage.xyf
    public final int b(byte[] bArr, int i, int i2) {
        int i3;
        long j = this.d;
        long j2 = this.b;
        if (j < j2) {
            int b = this.a.b(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.d + b;
            this.d = j3;
            i3 = b;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < this.b) {
            return i3;
        }
        int b2 = this.c.b(bArr, i + i3, i2 - i3);
        int i4 = i3 + b2;
        this.d += b2;
        return i4;
    }

    @Override // defpackage.kye
    public final long e(u1f u1fVar) {
        u1f u1fVar2;
        this.e = u1fVar.a;
        long j = this.b;
        long j2 = u1fVar.f;
        u1f u1fVar3 = null;
        if (j2 >= j) {
            u1fVar2 = null;
        } else {
            long j3 = u1fVar.g;
            long j4 = j - j2;
            if (j3 != -1) {
                j4 = Math.min(j3, j4);
            }
            u1fVar2 = new u1f(u1fVar.a, null, j2, j2, j4, null, 0);
        }
        long j5 = u1fVar.g;
        if (j5 == -1 || u1fVar.f + j5 > this.b) {
            long max = Math.max(this.b, u1fVar.f);
            long j6 = u1fVar.g;
            u1fVar3 = new u1f(u1fVar.a, null, max, max, j6 != -1 ? Math.min(j6, (u1fVar.f + j6) - this.b) : -1L, null, 0);
        }
        long e = u1fVar2 != null ? this.a.e(u1fVar2) : 0L;
        long e2 = u1fVar3 != null ? this.c.e(u1fVar3) : 0L;
        this.d = u1fVar.f;
        if (e == -1 || e2 == -1) {
            return -1L;
        }
        return e + e2;
    }

    @Override // defpackage.kye
    public final void h(f6f f6fVar) {
    }

    @Override // defpackage.kye
    public final Uri zzc() {
        return this.e;
    }

    @Override // defpackage.kye
    public final void zzd() {
        this.a.zzd();
        this.c.zzd();
    }

    @Override // defpackage.kye
    public final Map zze() {
        return zzgad.f();
    }
}
