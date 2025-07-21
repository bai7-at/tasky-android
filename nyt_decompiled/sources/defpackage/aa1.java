package defpackage;

import com.google.android.exoplayer2.upstream.a;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class aa1 {
    public static void a(a aVar) {
        if (aVar != null) {
            try {
                aVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] b(a aVar) {
        byte[] bArr = new byte[1024];
        int i = 0;
        int i2 = 0;
        while (i != -1) {
            if (i2 == bArr.length) {
                bArr = Arrays.copyOf(bArr, bArr.length * 2);
            }
            i = aVar.read(bArr, i2, bArr.length - i2);
            if (i != -1) {
                i2 += i;
            }
        }
        return Arrays.copyOf(bArr, i2);
    }
}
