package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c6f implements kye {
    private final kye a;
    private long b;
    private Uri c = Uri.EMPTY;
    private Map d = Collections.emptyMap();

    public c6f(kye kyeVar) {
        this.a = kyeVar;
    }

    @Override // defpackage.xyf
    public final int b(byte[] bArr, int i, int i2) {
        int b = this.a.b(bArr, i, i2);
        if (b != -1) {
            this.b += b;
        }
        return b;
    }

    @Override // defpackage.kye
    public final long e(u1f u1fVar) {
        this.c = u1fVar.a;
        this.d = Collections.emptyMap();
        long e = this.a.e(u1fVar);
        Uri zzc = zzc();
        zzc.getClass();
        this.c = zzc;
        this.d = zze();
        return e;
    }

    @Override // defpackage.kye
    public final void h(f6f f6fVar) {
        f6fVar.getClass();
        this.a.h(f6fVar);
    }

    public final long k() {
        return this.b;
    }

    public final Uri l() {
        return this.c;
    }

    public final Map m() {
        return this.d;
    }

    @Override // defpackage.kye
    public final Uri zzc() {
        return this.a.zzc();
    }

    @Override // defpackage.kye
    public final void zzd() {
        this.a.zzd();
    }

    @Override // defpackage.kye
    public final Map zze() {
        return this.a.zze();
    }
}
