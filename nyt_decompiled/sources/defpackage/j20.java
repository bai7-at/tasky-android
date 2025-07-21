package defpackage;

import com.google.android.datatransport.Priority;
import defpackage.as8;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class j20 extends as8 {
    private final String a;
    private final byte[] b;
    private final Priority c;

    static final class b extends as8.a {
        private String a;
        private byte[] b;
        private Priority c;

        b() {
        }

        @Override // as8.a
        public as8 a() {
            String str = "";
            if (this.a == null) {
                str = " backendName";
            }
            if (this.c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new j20(this.a, this.b, this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // as8.a
        public as8.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.a = str;
            return this;
        }

        @Override // as8.a
        public as8.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }

        @Override // as8.a
        public as8.a d(Priority priority) {
            if (priority == null) {
                throw new NullPointerException("Null priority");
            }
            this.c = priority;
            return this;
        }
    }

    @Override // defpackage.as8
    public String b() {
        return this.a;
    }

    @Override // defpackage.as8
    public byte[] c() {
        return this.b;
    }

    @Override // defpackage.as8
    public Priority d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof as8)) {
            return false;
        }
        as8 as8Var = (as8) obj;
        if (this.a.equals(as8Var.b())) {
            if (Arrays.equals(this.b, as8Var instanceof j20 ? ((j20) as8Var).b : as8Var.c()) && this.c.equals(as8Var.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    private j20(String str, byte[] bArr, Priority priority) {
        this.a = str;
        this.b = bArr;
        this.c = priority;
    }
}
