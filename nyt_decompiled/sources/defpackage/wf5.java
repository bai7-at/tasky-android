package defpackage;

/* loaded from: classes4.dex */
public final class wf5 implements rp2 {
    private final a a;

    public static final class a {
        private final String a;
        private final String b;
        private final String c;

        public a(String str, String str2, String str3) {
            zq3.h(str, "tcString");
            zq3.h(str2, "noticeVersion");
            zq3.h(str3, "tcDecodedData");
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && zq3.c(this.c, aVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "UserTcfData(tcString=" + this.a + ", noticeVersion=" + this.b + ", tcDecodedData=" + this.c + ")";
        }
    }

    public wf5(a aVar) {
        this.a = aVar;
    }

    public final a a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wf5) && zq3.c(this.a, ((wf5) obj).a);
    }

    public int hashCode() {
        a aVar = this.a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public String toString() {
        return "OnTcfPreference(userTcfData=" + this.a + ")";
    }
}
