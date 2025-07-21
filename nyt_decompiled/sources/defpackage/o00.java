package defpackage;

import defpackage.p30;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class o00 extends p30 {
    private final Iterable a;
    private final byte[] b;

    static final class b extends p30.a {
        private Iterable a;
        private byte[] b;

        b() {
        }

        @Override // p30.a
        public p30 a() {
            String str = "";
            if (this.a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new o00(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p30.a
        public p30.a b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.a = iterable;
            return this;
        }

        @Override // p30.a
        public p30.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    @Override // defpackage.p30
    public Iterable b() {
        return this.a;
    }

    @Override // defpackage.p30
    public byte[] c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p30)) {
            return false;
        }
        p30 p30Var = (p30) obj;
        if (this.a.equals(p30Var.b())) {
            if (Arrays.equals(this.b, p30Var instanceof o00 ? ((o00) p30Var).b : p30Var.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.b) + "}";
    }

    private o00(Iterable iterable, byte[] bArr) {
        this.a = iterable;
        this.b = bArr;
    }
}
