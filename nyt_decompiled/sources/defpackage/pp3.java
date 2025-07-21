package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import type.Tone;

/* loaded from: classes3.dex */
public final class pp3 implements rp2 {
    private final String a;
    private final String b;
    private final Tone c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final boolean h;
    private final String i;
    private final String j;
    private final a k;
    private final e24 l;

    public static final class a {
        private final String a;
        private final wp3 b;

        public a(String str, wp3 wp3Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = wp3Var;
        }

        public final wp3 a() {
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
            wp3 wp3Var = this.b;
            return hashCode + (wp3Var == null ? 0 : wp3Var.hashCode());
        }

        public String toString() {
            return "PromotionalMedia(__typename=" + this.a + ", interestPromoImageFragment=" + this.b + ")";
        }
    }

    public pp3(String str, String str2, Tone tone, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, a aVar, e24 e24Var) {
        zq3.h(str, "__typename");
        zq3.h(str2, "id");
        zq3.h(tone, "tone");
        zq3.h(str3, "url");
        zq3.h(str4, "uri");
        zq3.h(str5, TransferTable.COLUMN_TYPE);
        zq3.h(str6, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str7, "promotionalHeadline");
        zq3.h(str8, "promotionalExcerpt");
        zq3.h(e24Var, "legacyCollectionAssetFragment");
        this.a = str;
        this.b = str2;
        this.c = tone;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = z;
        this.i = str7;
        this.j = str8;
        this.k = aVar;
        this.l = e24Var;
    }

    public final String a() {
        return this.b;
    }

    public final e24 b() {
        return this.l;
    }

    public final String c() {
        return this.g;
    }

    public final String d() {
        return this.j;
    }

    public final String e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp3)) {
            return false;
        }
        pp3 pp3Var = (pp3) obj;
        return zq3.c(this.a, pp3Var.a) && zq3.c(this.b, pp3Var.b) && this.c == pp3Var.c && zq3.c(this.d, pp3Var.d) && zq3.c(this.e, pp3Var.e) && zq3.c(this.f, pp3Var.f) && zq3.c(this.g, pp3Var.g) && this.h == pp3Var.h && zq3.c(this.i, pp3Var.i) && zq3.c(this.j, pp3Var.j) && zq3.c(this.k, pp3Var.k) && zq3.c(this.l, pp3Var.l);
    }

    public final a f() {
        return this.k;
    }

    public final boolean g() {
        return this.h;
    }

    public final Tone h() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + Boolean.hashCode(this.h)) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31;
        a aVar = this.k;
        return ((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.l.hashCode();
    }

    public final String i() {
        return this.f;
    }

    public final String j() {
        return this.e;
    }

    public final String k() {
        return this.d;
    }

    public final String l() {
        return this.a;
    }

    public String toString() {
        return "InterestLegacyCollectionWithSingleAsset(__typename=" + this.a + ", id=" + this.b + ", tone=" + this.c + ", url=" + this.d + ", uri=" + this.e + ", type=" + this.f + ", name=" + this.g + ", showPicture=" + this.h + ", promotionalHeadline=" + this.i + ", promotionalExcerpt=" + this.j + ", promotionalMedia=" + this.k + ", legacyCollectionAssetFragment=" + this.l + ")";
    }
}
