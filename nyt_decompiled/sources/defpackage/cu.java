package defpackage;

import defpackage.lh5;
import defpackage.oa4;
import defpackage.qv7;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class cu {

    public static final class a extends cu {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends cu {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends cu {
        private final oa4.a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(oa4.a aVar) {
            super(null);
            zq3.h(aVar, "loginStatus");
            this.a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "LoginCancelled(loginStatus=" + this.a + ")";
        }
    }

    public static final class d extends cu {
        private final oa4.b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(oa4.b bVar) {
            super(null);
            zq3.h(bVar, "loginStatus");
            this.a = bVar;
        }

        public final oa4.b a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && zq3.c(this.a, ((d) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "LoginFailed(loginStatus=" + this.a + ")";
        }
    }

    public static final class e extends cu {
        private final oa4.b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(oa4.b bVar) {
            super(null);
            zq3.h(bVar, "loginStatus");
            this.a = bVar;
        }

        public final oa4.b a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && zq3.c(this.a, ((e) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "LoginFailedWithSSO(loginStatus=" + this.a + ")";
        }
    }

    public static final class f extends cu {
        private final oa4.c a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(oa4.c cVar) {
            super(null);
            zq3.h(cVar, "loginStatus");
            this.a = cVar;
        }

        public final oa4.c a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && zq3.c(this.a, ((f) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "LoginSuccess(loginStatus=" + this.a + ")";
        }
    }

    public static final class g extends cu {
        private final oa4.c a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(oa4.c cVar) {
            super(null);
            zq3.h(cVar, "loginStatus");
            this.a = cVar;
        }

        public final oa4.c a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && zq3.c(this.a, ((g) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "LoginSuccessWithSSO(loginStatus=" + this.a + ")";
        }
    }

    public static final class h extends cu {
        private final oa4.b a;
        private final lh5.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(oa4.b bVar, lh5.a aVar) {
            super(null);
            zq3.h(bVar, "loginStatus");
            zq3.h(aVar, "smartLockReadResult");
            this.a = bVar;
            this.b = aVar;
        }

        public final oa4.b a() {
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
            return zq3.c(this.a, hVar.a) && zq3.c(this.b, hVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "OneTapFailed(loginStatus=" + this.a + ", smartLockReadResult=" + this.b + ")";
        }
    }

    public static final class i extends cu {
        private final oa4.b a;
        private final qv7.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(oa4.b bVar, qv7.a aVar) {
            super(null);
            zq3.h(bVar, "loginStatus");
            zq3.h(aVar, "smartLockReadResult");
            this.a = bVar;
            this.b = aVar;
        }

        public final oa4.b a() {
            return this.a;
        }

        public final qv7.a b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return zq3.c(this.a, iVar.a) && zq3.c(this.b, iVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "SmartLockFailed(loginStatus=" + this.a + ", smartLockReadResult=" + this.b + ")";
        }
    }

    public /* synthetic */ cu(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private cu() {
    }
}
