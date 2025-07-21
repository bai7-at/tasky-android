package defpackage;

import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
final class d4a extends h4a {
    private static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean n;

    d4a() {
    }

    public static boolean j(b9e b9eVar) {
        return k(b9eVar, o);
    }

    private static boolean k(b9e b9eVar, byte[] bArr) {
        if (b9eVar.q() < 8) {
            return false;
        }
        int s = b9eVar.s();
        byte[] bArr2 = new byte[8];
        b9eVar.g(bArr2, 0, 8);
        b9eVar.k(s);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.h4a
    protected final long a(b9e b9eVar) {
        return f(bx9.d(b9eVar.m()));
    }

    @Override // defpackage.h4a
    protected final void b(boolean z) {
        super.b(z);
        if (z) {
            this.n = false;
        }
    }

    @Override // defpackage.h4a
    protected final boolean c(b9e b9eVar, long j, e4a e4aVar) {
        if (k(b9eVar, o)) {
            byte[] copyOf = Arrays.copyOf(b9eVar.m(), b9eVar.t());
            int i = copyOf[9] & 255;
            List e = bx9.e(copyOf);
            if (e4aVar.a == null) {
                x3a x3aVar = new x3a();
                x3aVar.w("audio/opus");
                x3aVar.k0(i);
                x3aVar.x(48000);
                x3aVar.l(e);
                e4aVar.a = x3aVar.D();
                return true;
            }
        } else {
            if (!k(b9eVar, p)) {
                wad.b(e4aVar.a);
                return false;
            }
            wad.b(e4aVar.a);
            if (!this.n) {
                this.n = true;
                b9eVar.l(8);
                zzby b = cy9.b(zzgaa.q(cy9.c(b9eVar, false, false).b));
                if (b != null) {
                    x3a b2 = e4aVar.a.b();
                    b2.p(b.d(e4aVar.a.j));
                    e4aVar.a = b2.D();
                }
            }
        }
        return true;
    }
}
