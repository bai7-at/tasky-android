package defpackage;

import com.google.android.gms.internal.ads.hf;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class mue implements sue {
    private final tze a;
    private final hf b;

    private mue(hf hfVar, tze tzeVar) {
        this.b = hfVar;
        this.a = tzeVar;
    }

    public static mue a(hf hfVar) {
        String R = hfVar.R();
        Charset charset = bve.a;
        byte[] bArr = new byte[R.length()];
        for (int i = 0; i < R.length(); i++) {
            char charAt = R.charAt(i);
            if (charAt < '!' || charAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + charAt);
            }
            bArr[i] = (byte) charAt;
        }
        return new mue(hfVar, tze.b(bArr));
    }

    public static mue b(hf hfVar) {
        return new mue(hfVar, bve.a(hfVar.R()));
    }

    public final hf c() {
        return this.b;
    }

    @Override // defpackage.sue
    public final tze zzd() {
        return this.a;
    }
}
