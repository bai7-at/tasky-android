package defpackage;

/* loaded from: classes2.dex */
public final class lb6 {
    private final String a;

    public static class a {
        private String a;

        /* synthetic */ a(l2b l2bVar) {
        }

        public lb6 a() {
            if (this.a != null) {
                return new lb6(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.a = str;
            return this;
        }
    }

    /* synthetic */ lb6(a aVar, r3b r3bVar) {
        this.a = aVar.a;
    }

    public static a a() {
        return new a(null);
    }

    public final String b() {
        return this.a;
    }
}
