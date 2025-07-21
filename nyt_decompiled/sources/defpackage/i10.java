package defpackage;

import defpackage.s11;

/* loaded from: classes3.dex */
final class i10 extends s11.e.d.AbstractC0534d {
    private final String a;

    static final class b extends s11.e.d.AbstractC0534d.a {
        private String a;

        b() {
        }

        @Override // s11.e.d.AbstractC0534d.a
        public s11.e.d.AbstractC0534d a() {
            String str = "";
            if (this.a == null) {
                str = " content";
            }
            if (str.isEmpty()) {
                return new i10(this.a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s11.e.d.AbstractC0534d.a
        public s11.e.d.AbstractC0534d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.a = str;
            return this;
        }
    }

    @Override // s11.e.d.AbstractC0534d
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s11.e.d.AbstractC0534d) {
            return this.a.equals(((s11.e.d.AbstractC0534d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.a + "}";
    }

    private i10(String str) {
        this.a = str;
    }
}
