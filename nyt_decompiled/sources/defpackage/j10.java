package defpackage;

import defpackage.s11;

/* loaded from: classes3.dex */
final class j10 extends s11.e.AbstractC0535e {
    private final int a;
    private final String b;
    private final String c;
    private final boolean d;

    static final class b extends s11.e.AbstractC0535e.a {
        private Integer a;
        private String b;
        private String c;
        private Boolean d;

        b() {
        }

        @Override // s11.e.AbstractC0535e.a
        public s11.e.AbstractC0535e a() {
            String str = "";
            if (this.a == null) {
                str = " platform";
            }
            if (this.b == null) {
                str = str + " version";
            }
            if (this.c == null) {
                str = str + " buildVersion";
            }
            if (this.d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new j10(this.a.intValue(), this.b, this.c, this.d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s11.e.AbstractC0535e.a
        public s11.e.AbstractC0535e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.c = str;
            return this;
        }

        @Override // s11.e.AbstractC0535e.a
        public s11.e.AbstractC0535e.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // s11.e.AbstractC0535e.a
        public s11.e.AbstractC0535e.a d(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        @Override // s11.e.AbstractC0535e.a
        public s11.e.AbstractC0535e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.b = str;
            return this;
        }
    }

    @Override // s11.e.AbstractC0535e
    public String b() {
        return this.c;
    }

    @Override // s11.e.AbstractC0535e
    public int c() {
        return this.a;
    }

    @Override // s11.e.AbstractC0535e
    public String d() {
        return this.b;
    }

    @Override // s11.e.AbstractC0535e
    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s11.e.AbstractC0535e)) {
            return false;
        }
        s11.e.AbstractC0535e abstractC0535e = (s11.e.AbstractC0535e) obj;
        return this.a == abstractC0535e.c() && this.b.equals(abstractC0535e.d()) && this.c.equals(abstractC0535e.b()) && this.d == abstractC0535e.e();
    }

    public int hashCode() {
        return (this.d ? 1231 : 1237) ^ ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.a + ", version=" + this.b + ", buildVersion=" + this.c + ", jailbroken=" + this.d + "}";
    }

    private j10(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }
}
