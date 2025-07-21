package defpackage;

import com.google.android.gms.internal.pal.zzqc;

/* loaded from: classes3.dex */
public abstract class vsf {
    public static final n7g a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                throw new zzqc("Not a printable ASCII character: " + charAt);
            }
            bArr[i] = (byte) charAt;
        }
        return n7g.b(bArr);
    }
}
