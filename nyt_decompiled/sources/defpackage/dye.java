package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgx;
import java.net.URLDecoder;

/* loaded from: classes3.dex */
public final class dye extends qve {
    private u1f e;
    private byte[] f;
    private int g;
    private int h;

    public dye() {
        super(false);
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
        byte[] bArr2 = this.f;
        int i4 = khe.a;
        System.arraycopy(bArr2, this.g, bArr, i, min);
        this.g += min;
        this.h -= min;
        zzg(min);
        return min;
    }

    @Override // defpackage.kye
    public final long e(u1f u1fVar) {
        l(u1fVar);
        this.e = u1fVar;
        Uri normalizeScheme = u1fVar.a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        wad.e("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i = khe.a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw zzcc.b("Unexpected URI format: ".concat(String.valueOf(normalizeScheme)), null);
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw zzcc.b("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e);
            }
        } else {
            this.f = URLDecoder.decode(str, ege.a.name()).getBytes(ege.c);
        }
        long j = u1fVar.f;
        int length = this.f.length;
        if (j > length) {
            this.f = null;
            throw new zzgx(2008);
        }
        int i2 = (int) j;
        this.g = i2;
        int i3 = length - i2;
        this.h = i3;
        long j2 = u1fVar.g;
        if (j2 != -1) {
            this.h = (int) Math.min(i3, j2);
        }
        m(u1fVar);
        long j3 = u1fVar.g;
        return j3 != -1 ? j3 : this.h;
    }

    @Override // defpackage.kye
    public final Uri zzc() {
        u1f u1fVar = this.e;
        if (u1fVar != null) {
            return u1fVar.a;
        }
        return null;
    }

    @Override // defpackage.kye
    public final void zzd() {
        if (this.f != null) {
            this.f = null;
            k();
        }
        this.e = null;
    }
}
