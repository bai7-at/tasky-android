package defpackage;

import com.google.android.gms.internal.pal.j7;
import com.google.android.gms.internal.pal.k7;
import com.google.android.gms.internal.pal.zzaby;

/* loaded from: classes3.dex */
public final class xbf {
    private final k7 a;

    private xbf(k7 k7Var) {
        this.a = k7Var;
    }

    public static xbf d(String str, byte[] bArr, int i) {
        j7 s = k7.s();
        s.k(str);
        s.l(zzaby.u(bArr));
        int i2 = i - 1;
        s.m(i2 != 0 ? i2 != 1 ? 5 : 4 : 3);
        return new xbf((k7) s.g());
    }

    public final String a() {
        return this.a.w();
    }

    public final byte[] b() {
        return this.a.v().A();
    }

    public final int c() {
        int E = this.a.E() - 2;
        int i = 1;
        if (E != 1) {
            i = 2;
            if (E != 2) {
                i = 3;
                if (E != 3) {
                    if (E == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i;
    }
}
