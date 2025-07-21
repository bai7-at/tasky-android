package defpackage;

import defpackage.s11;

/* loaded from: classes3.dex */
final class t00 extends s11.d {
    private final nh3 a;
    private final String b;

    static final class b extends s11.d.a {
        private nh3 a;
        private String b;

        b() {
        }

        @Override // s11.d.a
        public s11.d a() {
            String str = "";
            if (this.a == null) {
                str = " files";
            }
            if (str.isEmpty()) {
                return new t00(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s11.d.a
        public s11.d.a b(nh3 nh3Var) {
            if (nh3Var == null) {
                throw new NullPointerException("Null files");
            }
            this.a = nh3Var;
            return this;
        }

        @Override // s11.d.a
        public s11.d.a c(String str) {
            this.b = str;
            return this;
        }
    }

    @Override // s11.d
    public nh3 b() {
        return this.a;
    }

    @Override // s11.d
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s11.d)) {
            return false;
        }
        s11.d dVar = (s11.d) obj;
        if (this.a.equals(dVar.b())) {
            String str = this.b;
            if (str == null) {
                if (dVar.c() == null) {
                    return true;
                }
            } else if (str.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "FilesPayload{files=" + this.a + ", orgId=" + this.b + "}";
    }

    private t00(nh3 nh3Var, String str) {
        this.a = nh3Var;
        this.b = str;
    }
}
