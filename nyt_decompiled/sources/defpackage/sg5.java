package defpackage;

import java.util.List;
import org.threeten.bp.Instant;

/* loaded from: classes3.dex */
public final class sg5 implements rp2 {
    private final List a;

    public static final class a {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final Integer e;
        private final Instant f;
        private final Boolean g;

        public a(String str, String str2, String str3, String str4, Integer num, Instant instant, Boolean bool) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = num;
            this.f = instant;
            this.g = bool;
        }

        public final String a() {
            return this.d;
        }

        public final String b() {
            return this.c;
        }

        public final Boolean c() {
            return this.g;
        }

        public final Instant d() {
            return this.f;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && zq3.c(this.c, aVar.c) && zq3.c(this.d, aVar.d) && zq3.c(this.e, aVar.e) && zq3.c(this.f, aVar.f) && zq3.c(this.g, aVar.g);
        }

        public final Integer f() {
            return this.e;
        }

        public final String g() {
            return this.a;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.e;
            int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            Instant instant = this.f;
            int hashCode6 = (hashCode5 + (instant == null ? 0 : instant.hashCode())) * 31;
            Boolean bool = this.g;
            return hashCode6 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "MessageSelectionMessageCap(__typename=" + this.a + ", unit=" + this.b + ", campaign=" + this.c + ", audience=" + this.d + ", viewCount=" + this.e + ", lastSeenOn=" + this.f + ", dismissed=" + this.g + ")";
        }
    }

    public sg5(List list) {
        this.a = list;
    }

    public final List a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sg5) && zq3.c(this.a, ((sg5) obj).a);
    }

    public int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "OnUserStateData(messageSelectionMessageCaps=" + this.a + ")";
    }
}
