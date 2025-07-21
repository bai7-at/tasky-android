package defpackage;

import defpackage.s11;

/* loaded from: classes3.dex */
final class k10 extends s11.e.f {
    private final String a;

    static final class b extends s11.e.f.a {
        private String a;

        b() {
        }

        @Override // s11.e.f.a
        public s11.e.f a() {
            String str = "";
            if (this.a == null) {
                str = " identifier";
            }
            if (str.isEmpty()) {
                return new k10(this.a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s11.e.f.a
        public s11.e.f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.a = str;
            return this;
        }
    }

    @Override // s11.e.f
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s11.e.f) {
            return this.a.equals(((s11.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.a + "}";
    }

    private k10(String str) {
        this.a = str;
    }
}
