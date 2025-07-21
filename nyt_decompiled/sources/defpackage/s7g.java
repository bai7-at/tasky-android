package defpackage;

import java.util.Arrays;
import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
public final class s7g {
    private int a;
    private int b;
    private int c = 0;
    private e7g[] d = new e7g[100];

    public s7g(boolean z, int i) {
    }

    public final synchronized int a() {
        return this.b * 65536;
    }

    public final synchronized e7g b() {
        e7g e7gVar;
        try {
            this.b++;
            int i = this.c;
            if (i > 0) {
                e7g[] e7gVarArr = this.d;
                int i2 = i - 1;
                this.c = i2;
                e7gVar = e7gVarArr[i2];
                if (e7gVar == null) {
                    throw null;
                }
                e7gVarArr[i2] = null;
            } else {
                e7gVar = new e7g(new byte[65536], 0);
                int i3 = this.b;
                e7g[] e7gVarArr2 = this.d;
                int length = e7gVarArr2.length;
                if (i3 > length) {
                    this.d = (e7g[]) Arrays.copyOf(e7gVarArr2, length + length);
                    return e7gVar;
                }
            }
            return e7gVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(e7g e7gVar) {
        e7g[] e7gVarArr = this.d;
        int i = this.c;
        this.c = i + 1;
        e7gVarArr[i] = e7gVar;
        this.b--;
        notifyAll();
    }

    public final synchronized void d(g7g g7gVar) {
        while (g7gVar != null) {
            try {
                e7g[] e7gVarArr = this.d;
                int i = this.c;
                this.c = i + 1;
                e7gVarArr[i] = g7gVar.zzc();
                this.b--;
                g7gVar = g7gVar.zzd();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    public final synchronized void e() {
        f(0);
    }

    public final synchronized void f(int i) {
        int i2 = this.a;
        this.a = i;
        if (i < i2) {
            g();
        }
    }

    public final synchronized void g() {
        int i = this.a;
        int i2 = khe.a;
        int max = Math.max(0, ((i + Settings.DEFAULT_INITIAL_WINDOW_SIZE) / 65536) - this.b);
        int i3 = this.c;
        if (max >= i3) {
            return;
        }
        Arrays.fill(this.d, max, i3, (Object) null);
        this.c = max;
    }
}
