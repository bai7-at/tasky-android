package defpackage;

import defpackage.s11;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class u00 extends s11.d.b {
    private final String a;
    private final byte[] b;

    static final class b extends s11.d.b.a {
        private String a;
        private byte[] b;

        b() {
        }

        @Override // s11.d.b.a
        public s11.d.b a() {
            String str = "";
            if (this.a == null) {
                str = " filename";
            }
            if (this.b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new u00(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s11.d.b.a
        public s11.d.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.b = bArr;
            return this;
        }

        @Override // s11.d.b.a
        public s11.d.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.a = str;
            return this;
        }
    }

    @Override // s11.d.b
    public byte[] b() {
        return this.b;
    }

    @Override // s11.d.b
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s11.d.b)) {
            return false;
        }
        s11.d.b bVar = (s11.d.b) obj;
        if (this.a.equals(bVar.c())) {
            if (Arrays.equals(this.b, bVar instanceof u00 ? ((u00) bVar).b : bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }

    private u00(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }
}
