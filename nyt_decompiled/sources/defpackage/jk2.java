package defpackage;

import com.nytimes.android.api.cms.AssetConstants;
import java.util.List;
import org.threeten.bp.Instant;

/* loaded from: classes3.dex */
public final class jk2 implements rp2 {
    private final String a;
    private final Double b;
    private final Instant c;
    private final List d;
    private final String e;
    private final String f;
    private final a g;

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

    public jk2(String str, Double d, Instant instant, List list, String str2, String str3, a aVar) {
        zq3.h(str, "__typename");
        zq3.h(str2, "event");
        zq3.h(str3, AssetConstants.IMAGE_TYPE);
        this.a = str;
        this.b = d;
        this.c = instant;
        this.d = list;
        this.e = str2;
        this.f = str3;
        this.g = aVar;
    }

    public final List a() {
        return this.d;
    }

    public final a b() {
        return this.g;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.f;
    }

    public final Double e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk2)) {
            return false;
        }
        jk2 jk2Var = (jk2) obj;
        return zq3.c(this.a, jk2Var.a) && zq3.c(this.b, jk2Var.b) && zq3.c(this.c, jk2Var.c) && zq3.c(this.d, jk2Var.d) && zq3.c(this.e, jk2Var.e) && zq3.c(this.f, jk2Var.f) && zq3.c(this.g, jk2Var.g);
    }

    public final Instant f() {
        return this.c;
    }

    public final String g() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Double d = this.b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Instant instant = this.c;
        int hashCode3 = (hashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
        List list = this.d;
        int hashCode4 = (((((hashCode3 + (list == null ? 0 : list.hashCode())) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        a aVar = this.g;
        return hashCode4 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "FlashbackQuizInterestFragment(__typename=" + this.a + ", score=" + this.b + ", updatedAt=" + this.c + ", answers=" + this.d + ", event=" + this.e + ", image=" + this.f + ", data=" + this.g + ")";
    }
}
