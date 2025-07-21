package defpackage;

import com.google.firebase.remoteconfig.internal.c;

/* loaded from: classes3.dex */
public class ij2 {
    private final long a;
    private final long b;

    public static class b {
        private long a = 60;
        private long b = c.j;

        public ij2 c() {
            return new ij2(this);
        }

        public b d(long j) {
            if (j < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j)));
            }
            this.a = j;
            return this;
        }

        public b e(long j) {
            if (j >= 0) {
                this.b = j;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument");
        }
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    private ij2(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
    }
}
