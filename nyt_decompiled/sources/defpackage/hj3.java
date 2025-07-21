package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.List;

/* loaded from: classes3.dex */
public final class hj3 implements rp2 {
    private final String a;
    private final List b;
    private final String c;
    private final a d;

    public static final class a {
        private final String a;
        private final kq b;
        private final to3 c;
        private final d63 d;

        public a(String str, kq kqVar, to3 to3Var, d63 d63Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = kqVar;
            this.c = to3Var;
            this.d = d63Var;
        }

        public final kq a() {
            return this.b;
        }

        public final d63 b() {
            return this.d;
        }

        public final to3 c() {
            return this.c;
        }

        public final String d() {
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
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && zq3.c(this.c, aVar.c) && zq3.c(this.d, aVar.d);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            kq kqVar = this.b;
            int hashCode2 = (hashCode + (kqVar == null ? 0 : kqVar.hashCode())) * 31;
            to3 to3Var = this.c;
            int hashCode3 = (hashCode2 + (to3Var == null ? 0 : to3Var.hashCode())) * 31;
            d63 d63Var = this.d;
            return hashCode3 + (d63Var != null ? d63Var.hashCode() : 0);
        }

        public String toString() {
            return "Node(__typename=" + this.a + ", articleFields=" + this.b + ", interactiveFields=" + this.c + ", guideFields=" + this.d + ")";
        }
    }

    public static final class b {
        private final String a;
        private final String b;
        private final String c;

        public b(String str, String str2, String str3) {
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
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b) && zq3.c(this.c, bVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "TrackingParam(__typename=" + this.a + ", key=" + this.b + ", value=" + this.c + ")";
        }
    }

    public hj3(String str, List list, String str2, a aVar) {
        zq3.h(str, "__typename");
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = aVar;
    }

    public final String a() {
        return this.c;
    }

    public final a b() {
        return this.d;
    }

    public final List c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj3)) {
            return false;
        }
        hj3 hj3Var = (hj3) obj;
        return zq3.c(this.a, hj3Var.a) && zq3.c(this.b, hj3Var.b) && zq3.c(this.c, hj3Var.c) && zq3.c(this.d, hj3Var.d);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.d;
        return hashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "InferredRecommendation(__typename=" + this.a + ", trackingParams=" + this.b + ", channelUri=" + this.c + ", node=" + this.d + ")";
    }
}
