package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.List;
import org.threeten.bp.Instant;

/* loaded from: classes3.dex */
public final class kr7 implements rp2 {
    private final String a;
    private final Instant b;
    private final a c;

    public static final class a {
        private final String a;
        private final List b;

        public a(String str, List list) {
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            List list = this.b;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "Data(__typename=" + this.a + ", edges=" + this.b + ")";
        }
    }

    public static final class b {
        private final String a;
        private final c b;
        private final List c;

        public b(String str, c cVar, List list) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = cVar;
            this.c = list;
        }

        public final c a() {
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
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b) && zq3.c(this.c, bVar.c);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            c cVar = this.b;
            int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            List list = this.c;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Edge(__typename=" + this.a + ", node=" + this.b + ", trackingParams=" + this.c + ")";
        }
    }

    public static final class c {
        private final String a;
        private final ap3 b;
        private final ip3 c;

        public c(String str, ap3 ap3Var, ip3 ip3Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = ap3Var;
            this.c = ip3Var;
        }

        public final ap3 a() {
            return this.b;
        }

        public final ip3 b() {
            return this.c;
        }

        public final String c() {
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
            return zq3.c(this.a, cVar.a) && zq3.c(this.b, cVar.b) && zq3.c(this.c, cVar.c);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            ap3 ap3Var = this.b;
            int hashCode2 = (hashCode + (ap3Var == null ? 0 : ap3Var.hashCode())) * 31;
            ip3 ip3Var = this.c;
            return hashCode2 + (ip3Var != null ? ip3Var.hashCode() : 0);
        }

        public String toString() {
            return "Node(__typename=" + this.a + ", interestArticleAsset=" + this.b + ", interestInteractiveAsset=" + this.c + ")";
        }
    }

    public static final class d {
        private final String a;
        private final String b;
        private final String c;

        public d(String str, String str2, String str3) {
            zq3.h(str, "__typename");
            zq3.h(str2, TransferTable.COLUMN_KEY);
            zq3.h(str3, "value");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.c;
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
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "TrackingParam(__typename=" + this.a + ", key=" + this.b + ", value=" + this.c + ")";
        }
    }

    public kr7(String str, Instant instant, a aVar) {
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
        if (!(obj instanceof kr7)) {
            return false;
        }
        kr7 kr7Var = (kr7) obj;
        return zq3.c(this.a, kr7Var.a) && zq3.c(this.b, kr7Var.b) && zq3.c(this.c, kr7Var.c);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Instant instant = this.b;
        int hashCode2 = (hashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ShuffleInterestFragment(__typename=" + this.a + ", updatedAt=" + this.b + ", data=" + this.c + ")";
    }
}
