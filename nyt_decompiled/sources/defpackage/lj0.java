package defpackage;

import kotlin.collections.c;

/* loaded from: classes5.dex */
public abstract class lj0 {
    private final c a = new c();
    private int b;

    protected final void a(char[] cArr) {
        int i;
        zq3.h(cArr, "array");
        synchronized (this) {
            try {
                int length = this.b + cArr.length;
                i = uo.a;
                if (length < i) {
                    this.b += cArr.length;
                    this.a.addLast(cArr);
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final char[] b(int i) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.a.y();
            if (cArr != null) {
                this.b -= cArr.length;
            } else {
                cArr = null;
            }
        }
        return cArr == null ? new char[i] : cArr;
    }
}
