package defpackage;

import kotlin.collections.c;

/* loaded from: classes5.dex */
public abstract class df0 {
    private final c a = new c();
    private int b;

    protected final void a(byte[] bArr) {
        int i;
        zq3.h(bArr, "array");
        synchronized (this) {
            try {
                int length = this.b + bArr.length;
                i = uo.a;
                if (length < i) {
                    this.b += bArr.length / 2;
                    this.a.addLast(bArr);
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final byte[] b(int i) {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.a.y();
            if (bArr != null) {
                this.b -= bArr.length / 2;
            } else {
                bArr = null;
            }
        }
        return bArr == null ? new byte[i] : bArr;
    }
}
