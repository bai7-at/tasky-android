package defpackage;

import com.google.android.exoplayer2.t0;
import java.util.Arrays;

/* loaded from: classes2.dex */
public interface yp8 {

    public static final class a {
        public final int a;
        public final byte[] b;
        public final int c;
        public final int d;

        public a(int i, byte[] bArr, int i2, int i3) {
            this.a = i;
            this.b = bArr;
            this.c = i2;
            this.d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.c == aVar.c && this.d == aVar.d && Arrays.equals(this.b, aVar.b);
        }

        public int hashCode() {
            return (((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
        }
    }

    default void a(yo5 yo5Var, int i) {
        c(yo5Var, i, 0);
    }

    void b(long j, int i, int i2, int i3, a aVar);

    void c(yo5 yo5Var, int i, int i2);

    void d(t0 t0Var);

    default int e(s91 s91Var, int i, boolean z) {
        return f(s91Var, i, z, 0);
    }

    int f(s91 s91Var, int i, boolean z, int i2);
}
