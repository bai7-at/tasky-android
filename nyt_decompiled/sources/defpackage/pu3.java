package defpackage;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class pu3 {

    public static final class a extends pu3 {
        private final String a;
        private final Throwable b;
        private final long c;
        private final String d;
        private final String e;
        private final List f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Throwable th, long j, String str2, String str3, List list) {
            super(null);
            zq3.h(str, "threadName");
            zq3.h(th, "throwable");
            zq3.h(str2, "message");
            zq3.h(str3, "loggerName");
            zq3.h(list, "threads");
            this.a = str;
            this.b = th;
            this.c = j;
            this.d = str2;
            this.e = str3;
            this.f = list;
        }

        public final String a() {
            return this.e;
        }

        public String b() {
            return this.d;
        }

        public final String c() {
            return this.a;
        }

        public List d() {
            return this.f;
        }

        public Throwable e() {
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
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && this.c == aVar.c && zq3.c(this.d, aVar.d) && zq3.c(this.e, aVar.e) && zq3.c(this.f, aVar.f);
        }

        public final long f() {
            return this.c;
        }

        public int hashCode() {
            return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Long.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        }

        public String toString() {
            return "Logs(threadName=" + this.a + ", throwable=" + this.b + ", timestamp=" + this.c + ", message=" + this.d + ", loggerName=" + this.e + ", threads=" + this.f + ")";
        }
    }

    public static final class b extends pu3 {
        private final Throwable a;
        private final String b;
        private final List c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th, String str, List list) {
            super(null);
            zq3.h(th, "throwable");
            zq3.h(str, "message");
            zq3.h(list, "threads");
            this.a = th;
            this.b = str;
            this.c = list;
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
            return "Rum(throwable=" + this.a + ", message=" + this.b + ", threads=" + this.c + ")";
        }
    }

    public /* synthetic */ pu3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private pu3() {
    }
}
