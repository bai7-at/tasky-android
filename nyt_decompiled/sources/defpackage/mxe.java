package defpackage;

import com.google.android.gms.internal.ads.cf;
import com.google.android.gms.internal.ads.ef;
import com.google.android.gms.internal.ads.zzgvz;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class mxe implements ole {
    private final ole a;
    private final zzgvz b;
    private final byte[] c;

    private mxe(ole oleVar, zzgvz zzgvzVar, byte[] bArr) {
        this.a = oleVar;
        this.b = zzgvzVar;
        this.c = bArr;
    }

    public static ole a(bte bteVar) {
        byte[] array;
        lue a = bteVar.a(ale.a());
        cf L = ef.L();
        L.o(a.f());
        L.p(a.d());
        L.n(a.b());
        ole oleVar = (ole) cme.c((ef) L.i(), ole.class);
        zzgvz c = a.c();
        zzgvz zzgvzVar = zzgvz.UNKNOWN_PREFIX;
        int ordinal = c.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    array = new byte[0];
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            array = ByteBuffer.allocate(5).put((byte) 0).putInt(bteVar.b().intValue()).array();
        } else {
            array = ByteBuffer.allocate(5).put((byte) 1).putInt(bteVar.b().intValue()).array();
        }
        return new mxe(oleVar, c, array);
    }
}
