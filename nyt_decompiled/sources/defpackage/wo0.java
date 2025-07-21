package defpackage;

import org.threeten.bp.Instant;

/* loaded from: classes3.dex */
public final class wo0 implements rp2 {
    private final String a;
    private final Instant b;
    private final a c;

    public static final class a {
        private final String a;
        private final mp3 b;

        public a(String str, mp3 mp3Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = mp3Var;
        }

        public final mp3 a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            mp3 mp3Var = this.b;
            return hashCode + (mp3Var == null ? 0 : mp3Var.hashCode());
        }

        public String toString() {
            return "Data(__typename=" + this.a + ", interestLegacyCollectionWithAssetList=" + this.b + ")";
        }
    }

    public wo0(String str, Instant instant, a aVar) {
        zq3.h(str, "__typename");
        this.a = str;
        this.b = instant;
        this.c = aVar;
    }

    public final a a() {
        return this.c;
    }

    public final Instant b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo0)) {
            return false;
        }
        wo0 wo0Var = (wo0) obj;
        return zq3.c(this.a, wo0Var.a) && zq3.c(this.b, wo0Var.b) && zq3.c(this.c, wo0Var.c);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Instant instant = this.b;
        int hashCode2 = (hashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ColumnInterestFragment(__typename=" + this.a + ", updatedAt=" + this.b + ", data=" + this.c + ")";
    }
}
