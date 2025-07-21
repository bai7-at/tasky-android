package defpackage;

import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import org.threeten.bp.Instant;
import type.InterestType;

/* loaded from: classes3.dex */
public final class yf2 implements rp2 {
    private final String a;
    private final InterestType b;
    private final Instant c;
    private final l d;
    private final e e;

    public static final class a {
        private final String a;
        private final i b;
        private final c c;

        public a(String str, i iVar, c cVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = iVar;
            this.c = cVar;
        }

        public final c a() {
            return this.c;
        }

        public final i b() {
            return this.b;
        }

        public final String c() {
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
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && zq3.c(this.c, aVar.c);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            i iVar = this.b;
            int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
            c cVar = this.c;
            return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
        }

        public String toString() {
            return "Aggregate(__typename=" + this.a + ", filter=" + this.b + ", assets=" + this.c + ")";
        }
    }

    public static final class b {
        private final String a;
        private final j b;

        public b(String str, j jVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = jVar;
        }

        public final j a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            j jVar = this.b;
            return hashCode + (jVar == null ? 0 : jVar.hashCode());
        }

        public String toString() {
            return "Assets1(__typename=" + this.a + ", hits=" + this.b + ")";
        }
    }

    public static final class c {
        private final String a;
        private final k b;

        public c(String str, k kVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = kVar;
        }

        public final k a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return zq3.c(this.a, cVar.a) && zq3.c(this.b, cVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            k kVar = this.b;
            return hashCode + (kVar == null ? 0 : kVar.hashCode());
        }

        public String toString() {
            return "Assets(__typename=" + this.a + ", hits=" + this.b + ")";
        }
    }

    public static final class d {
        private final String a;
        private final h b;
        private final b c;

        public d(String str, h hVar, b bVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = hVar;
            this.c = bVar;
        }

        public final b a() {
            return this.c;
        }

        public final h b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return zq3.c(this.a, dVar.a) && zq3.c(this.b, dVar.b) && zq3.c(this.c, dVar.c);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            h hVar = this.b;
            int hashCode2 = (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
            b bVar = this.c;
            return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            return "ChildCollection(__typename=" + this.a + ", filter=" + this.b + ", assets=" + this.c + ")";
        }
    }

    public static final class e {
        private final String a;
        private final List b;
        private final List c;

        public e(String str, List list, List list2) {
            zq3.h(str, "__typename");
            zq3.h(list, "aggregate");
            zq3.h(list2, "childCollections");
            this.a = str;
            this.b = list;
            this.c = list2;
        }

        public final List a() {
            return this.b;
        }

        public final List b() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return zq3.c(this.a, eVar.a) && zq3.c(this.b, eVar.b) && zq3.c(this.c, eVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "Data(__typename=" + this.a + ", aggregate=" + this.b + ", childCollections=" + this.c + ")";
        }
    }

    public static final class f {
        private final String a;
        private final m b;

        public f(String str, m mVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = mVar;
        }

        public final m a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return zq3.c(this.a, fVar.a) && zq3.c(this.b, fVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            m mVar = this.b;
            return hashCode + (mVar == null ? 0 : mVar.hashCode());
        }

        public String toString() {
            return "Edge1(__typename=" + this.a + ", node=" + this.b + ")";
        }
    }

    public static final class g {
        private final String a;
        private final n b;

        public g(String str, n nVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = nVar;
        }

        public final n a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return zq3.c(this.a, gVar.a) && zq3.c(this.b, gVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            n nVar = this.b;
            return hashCode + (nVar == null ? 0 : nVar.hashCode());
        }

        public String toString() {
            return "Edge(__typename=" + this.a + ", node=" + this.b + ")";
        }
    }

    public static final class h {
        private final String a;
        private final String b;
        private final int c;

        public h(String str, String str2, int i) {
            zq3.h(str, "__typename");
            zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
            this.a = str;
            this.b = str2;
            this.c = i;
        }

        public final int a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return zq3.c(this.a, hVar.a) && zq3.c(this.b, hVar.b) && this.c == hVar.c;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.c);
        }

        public String toString() {
            return "Filter1(__typename=" + this.a + ", name=" + this.b + ", filterId=" + this.c + ")";
        }
    }

    public static final class i {
        private final String a;
        private final String b;
        private final int c;

        public i(String str, String str2, int i) {
            zq3.h(str, "__typename");
            zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
            this.a = str;
            this.b = str2;
            this.c = i;
        }

        public final int a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return zq3.c(this.a, iVar.a) && zq3.c(this.b, iVar.b) && this.c == iVar.c;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.c);
        }

        public String toString() {
            return "Filter(__typename=" + this.a + ", name=" + this.b + ", filterId=" + this.c + ")";
        }
    }

    public static final class j {
        private final String a;
        private final List b;

        public j(String str, List list) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = list;
        }

        public final List a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return zq3.c(this.a, jVar.a) && zq3.c(this.b, jVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            List list = this.b;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "Hits1(__typename=" + this.a + ", edges=" + this.b + ")";
        }
    }

    public static final class k {
        private final String a;
        private final List b;

        public k(String str, List list) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = list;
        }

        public final List a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return zq3.c(this.a, kVar.a) && zq3.c(this.b, kVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            List list = this.b;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "Hits(__typename=" + this.a + ", edges=" + this.b + ")";
        }
    }

    public static final class l {
        private final String a;
        private final List b;

        public l(String str, List list) {
            zq3.h(str, "__typename");
            zq3.h(list, "ordering");
            this.a = str;
            this.b = list;
        }

        public final List a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return zq3.c(this.a, lVar.a) && zq3.c(this.b, lVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Metadata(__typename=" + this.a + ", ordering=" + this.b + ")";
        }
    }

    public static final class m {
        private final String a;
        private final String b;
        private final tf2 c;
        private final og2 d;

        public m(String str, String str2, tf2 tf2Var, og2 og2Var) {
            zq3.h(str, "__typename");
            zq3.h(str2, "promotionalHeadline");
            this.a = str;
            this.b = str2;
            this.c = tf2Var;
            this.d = og2Var;
        }

        public final tf2 a() {
            return this.c;
        }

        public final og2 b() {
            return this.d;
        }

        public final String c() {
            return this.b;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return zq3.c(this.a, mVar.a) && zq3.c(this.b, mVar.b) && zq3.c(this.c, mVar.c) && zq3.c(this.d, mVar.d);
        }

        public int hashCode() {
            int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
            tf2 tf2Var = this.c;
            int hashCode2 = (hashCode + (tf2Var == null ? 0 : tf2Var.hashCode())) * 31;
            og2 og2Var = this.d;
            return hashCode2 + (og2Var != null ? og2Var.hashCode() : 0);
        }

        public String toString() {
            return "Node1(__typename=" + this.a + ", promotionalHeadline=" + this.b + ", filterInterestArticleAsset=" + this.c + ", filterInterestInteractiveAsset=" + this.d + ")";
        }
    }

    public static final class n {
        private final String a;
        private final String b;
        private final tf2 c;
        private final og2 d;

        public n(String str, String str2, tf2 tf2Var, og2 og2Var) {
            zq3.h(str, "__typename");
            zq3.h(str2, "promotionalHeadline");
            this.a = str;
            this.b = str2;
            this.c = tf2Var;
            this.d = og2Var;
        }

        public final tf2 a() {
            return this.c;
        }

        public final og2 b() {
            return this.d;
        }

        public final String c() {
            return this.b;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return zq3.c(this.a, nVar.a) && zq3.c(this.b, nVar.b) && zq3.c(this.c, nVar.c) && zq3.c(this.d, nVar.d);
        }

        public int hashCode() {
            int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
            tf2 tf2Var = this.c;
            int hashCode2 = (hashCode + (tf2Var == null ? 0 : tf2Var.hashCode())) * 31;
            og2 og2Var = this.d;
            return hashCode2 + (og2Var != null ? og2Var.hashCode() : 0);
        }

        public String toString() {
            return "Node(__typename=" + this.a + ", promotionalHeadline=" + this.b + ", filterInterestArticleAsset=" + this.c + ", filterInterestInteractiveAsset=" + this.d + ")";
        }
    }

    public yf2(String str, InterestType interestType, Instant instant, l lVar, e eVar) {
        zq3.h(str, "__typename");
        zq3.h(interestType, "interestType");
        this.a = str;
        this.b = interestType;
        this.c = instant;
        this.d = lVar;
        this.e = eVar;
    }

    public final e a() {
        return this.e;
    }

    public final InterestType b() {
        return this.b;
    }

    public final l c() {
        return this.d;
    }

    public final Instant d() {
        return this.c;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf2)) {
            return false;
        }
        yf2 yf2Var = (yf2) obj;
        return zq3.c(this.a, yf2Var.a) && this.b == yf2Var.b && zq3.c(this.c, yf2Var.c) && zq3.c(this.d, yf2Var.d) && zq3.c(this.e, yf2Var.e);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Instant instant = this.c;
        int hashCode2 = (hashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        l lVar = this.d;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        e eVar = this.e;
        return hashCode3 + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        return "FilterInterestFragment(__typename=" + this.a + ", interestType=" + this.b + ", updatedAt=" + this.c + ", metadata=" + this.d + ", data=" + this.e + ")";
    }
}
