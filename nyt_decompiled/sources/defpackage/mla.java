package defpackage;

import android.util.Base64;
import java.util.Random;

/* loaded from: classes3.dex */
public abstract class mla {
    private static final Random a = new Random();

    public static String a() {
        byte[] bArr = new byte[16];
        a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
