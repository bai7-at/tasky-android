package defpackage;

/* loaded from: classes2.dex */
public final class s3 {
    private String a;

    public static final class a {
        private String a;

        /* synthetic */ a(oq9 oq9Var) {
        }

        public s3 a() {
            String str = this.a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            s3 s3Var = new s3(null);
            s3Var.a = str;
            return s3Var;
        }

        public a b(String str) {
            this.a = str;
            return this;
        }
    }

    /* synthetic */ s3(kla klaVar) {
    }

    public static a b() {
        return new a(null);
    }

    public String a() {
        return this.a;
    }
}
