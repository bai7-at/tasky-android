package defpackage;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class d6 {
    private final String a;
    private final String b;

    public static final class a extends d6 {
        private final String c;
        private final String d;
        private final Map e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Map map) {
            super(str, str2, null);
            zq3.h(str, "pos");
            this.c = str;
            this.d = str2;
            this.e = map;
        }

        @Override // defpackage.d6
        public String a() {
            return this.d;
        }

        public String b() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.c, aVar.c) && zq3.c(this.d, aVar.d) && zq3.c(this.e, aVar.e);
        }

        public int hashCode() {
            int hashCode = this.c.hashCode() * 31;
            String str = this.d;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Map map = this.e;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            return "AdNoFill(pos=" + this.c + ", pageType=" + this.d + ", extras=" + this.e + ")";
        }
    }

    public static final class b extends d6 {
        private final String c;
        private final String d;
        private final Map e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, Map map) {
            super(str, str2, null);
            zq3.h(str, "pos");
            this.c = str;
            this.d = str2;
            this.e = map;
        }

        @Override // defpackage.d6
        public String a() {
            return this.d;
        }

        public final Map b() {
            return this.e;
        }

        public String c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.c, bVar.c) && zq3.c(this.d, bVar.d) && zq3.c(this.e, bVar.e);
        }

        public int hashCode() {
            int hashCode = this.c.hashCode() * 31;
            String str = this.d;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Map map = this.e;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            return "AdRequest(pos=" + this.c + ", pageType=" + this.d + ", extras=" + this.e + ")";
        }
    }

    public static final class c extends d6 {
        private final String c;
        private final String d;
        private final Throwable e;
        private final Map f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, Throwable th, Map map) {
            super(str, str2, null);
            zq3.h(str, "pos");
            zq3.h(th, "error");
            this.c = str;
            this.d = str2;
            this.e = th;
            this.f = map;
        }

        @Override // defpackage.d6
        public String a() {
            return this.d;
        }

        public String b() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return zq3.c(this.c, cVar.c) && zq3.c(this.d, cVar.d) && zq3.c(this.e, cVar.e) && zq3.c(this.f, cVar.f);
        }

        public int hashCode() {
            int hashCode = this.c.hashCode() * 31;
            String str = this.d;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.e.hashCode()) * 31;
            Map map = this.f;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            return "AdResponseFail(pos=" + this.c + ", pageType=" + this.d + ", error=" + this.e + ", extras=" + this.f + ")";
        }
    }

    public static final class d extends d6 {
        private final String c;
        private final String d;
        private final Map e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, Map map) {
            super(str, str2, null);
            zq3.h(str, "pos");
            this.c = str;
            this.d = str2;
            this.e = map;
        }

        @Override // defpackage.d6
        public String a() {
            return this.d;
        }

        public String b() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return zq3.c(this.c, dVar.c) && zq3.c(this.d, dVar.d) && zq3.c(this.e, dVar.e);
        }

        public int hashCode() {
            int hashCode = this.c.hashCode() * 31;
            String str = this.d;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Map map = this.e;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            return "AdResponseSuccess(pos=" + this.c + ", pageType=" + this.d + ", extras=" + this.e + ")";
        }
    }

    public static final class e extends d6 {
        private final String c;
        private final String d;
        private final Map e;
        private final long f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, Map map, long j) {
            super(str, str2, null);
            zq3.h(str, "pos");
            this.c = str;
            this.d = str2;
            this.e = map;
            this.f = j;
        }

        @Override // defpackage.d6
        public String a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return zq3.c(this.c, eVar.c) && zq3.c(this.d, eVar.d) && zq3.c(this.e, eVar.e) && this.f == eVar.f;
        }

        public int hashCode() {
            int hashCode = this.c.hashCode() * 31;
            String str = this.d;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Map map = this.e;
            return ((hashCode2 + (map != null ? map.hashCode() : 0)) * 31) + Long.hashCode(this.f);
        }

        public String toString() {
            return "AdStale(pos=" + this.c + ", pageType=" + this.d + ", extras=" + this.e + ", cachedTime=" + this.f + ")";
        }
    }

    public static final class f extends d6 {
        private final String c;
        private final String d;
        private final Map e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, String str2, Map map) {
            super(str, str2, null);
            zq3.h(str, "pos");
            this.c = str;
            this.d = str2;
            this.e = map;
        }

        @Override // defpackage.d6
        public String a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return zq3.c(this.c, fVar.c) && zq3.c(this.d, fVar.d) && zq3.c(this.e, fVar.e);
        }

        public int hashCode() {
            int hashCode = this.c.hashCode() * 31;
            String str = this.d;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Map map = this.e;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            return "AdViewImpression(pos=" + this.c + ", pageType=" + this.d + ", extras=" + this.e + ")";
        }
    }

    public static final class g extends d6 {
        private final String c;
        private final String d;
        private final Map e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, Map map) {
            super(str, str2, null);
            zq3.h(str, "pos");
            this.c = str;
            this.d = str2;
            this.e = map;
        }

        @Override // defpackage.d6
        public String a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return zq3.c(this.c, gVar.c) && zq3.c(this.d, gVar.d) && zq3.c(this.e, gVar.e);
        }

        public int hashCode() {
            int hashCode = this.c.hashCode() * 31;
            String str = this.d;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Map map = this.e;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            return "AdsDisabled(pos=" + this.c + ", pageType=" + this.d + ", extras=" + this.e + ")";
        }
    }

    public /* synthetic */ d6(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public abstract String a();

    private d6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
