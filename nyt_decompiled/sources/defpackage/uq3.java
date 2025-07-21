package defpackage;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class uq3 {

    public static final class a extends uq3 {
        private final boolean a;
        private final long b;
        private final long c;
        private final boolean d;
        private final boolean e;
        private final int f;

        public a(boolean z, long j, long j2, boolean z2, boolean z3, int i) {
            super(null);
            this.a = z;
            this.b = j;
            this.c = j2;
            this.d = z2;
            this.e = z3;
            this.f = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
        }

        public int hashCode() {
            return (((((((((Boolean.hashCode(this.a) * 31) + Long.hashCode(this.b)) * 31) + Long.hashCode(this.c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.e)) * 31) + Integer.hashCode(this.f);
        }

        public String toString() {
            return "Configuration(trackErrors=" + this.a + ", batchSize=" + this.b + ", batchUploadFrequency=" + this.c + ", useProxy=" + this.d + ", useLocalEncryption=" + this.e + ", batchProcessingLevel=" + this.f + ")";
        }
    }

    public static abstract class b extends uq3 {
        private final String a;
        private final Map b;

        public static final class a extends b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Map map) {
                super(str, map, null);
                zq3.h(str, "message");
            }
        }

        /* renamed from: uq3$b$b, reason: collision with other inner class name */
        public static final class C0548b extends b {
            private final Throwable c;
            private final String d;
            private final String e;

            public /* synthetic */ C0548b(String str, Map map, Throwable th, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : th, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0548b(String str, Map map, Throwable th, String str2, String str3) {
                super(str, map, null);
                zq3.h(str, "message");
                this.c = th;
                this.d = str2;
                this.e = str3;
            }
        }

        public /* synthetic */ b(String str, Map map, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, map);
        }

        private b(String str, Map map) {
            super(null);
            this.a = str;
            this.b = map;
        }
    }

    public static final class c extends uq3 {
        private final String a;
        private final Map b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Map map) {
            super(null);
            zq3.h(str, "message");
            this.a = str;
            this.b = map;
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
            Map map = this.b;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        public String toString() {
            return "Metric(message=" + this.a + ", additionalProperties=" + this.b + ")";
        }
    }

    public /* synthetic */ uq3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private uq3() {
    }
}
