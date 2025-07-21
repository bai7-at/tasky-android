package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class i78 {

    public static final class a extends i78 {
        private final u52 a;
        private final v32 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u52 u52Var, v32 v32Var) {
            super(null);
            zq3.h(u52Var, "eventType");
            zq3.h(v32Var, "eventData");
            this.a = u52Var;
            this.b = v32Var;
        }

        public final v32 a() {
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
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "ImpressionEvent(eventType=" + this.a + ", eventData=" + this.b + ")";
        }
    }

    public static final class b extends i78 {
        private final u52 a;
        private final v32 b;
        private final Boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u52 u52Var, v32 v32Var, Boolean bool) {
            super(null);
            zq3.h(u52Var, "eventType");
            zq3.h(v32Var, "eventData");
            this.a = u52Var;
            this.b = v32Var;
            this.c = bool;
        }

        public final v32 a() {
            return this.b;
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
            int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
            Boolean bool = this.c;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            return "InteractionEvent(eventType=" + this.a + ", eventData=" + this.b + ", isLoginComplete=" + this.c + ")";
        }
    }

    public static final class c extends i78 {
        private final boolean a;
        private final String b;

        public c(boolean z, String str) {
            super(null);
            this.a = z;
            this.b = str;
        }

        public final String a() {
            return this.b;
        }

        public final boolean b() {
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
            return this.a == cVar.a && zq3.c(this.b, cVar.b);
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "OnEmailSupportRequestedEvent(isThrownError=" + this.a + ", errorMessage=" + this.b + ")";
        }
    }

    public static final class d extends i78 {
        private final boolean a;

        public d(boolean z) {
            super(null);
            this.a = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public String toString() {
            return "OnLIREFlowExitEvent(isLoggedIn=" + this.a + ")";
        }
    }

    public static final class e extends i78 {
        private final u52 a;
        private final e32 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(u52 u52Var, e32 e32Var) {
            super(null);
            zq3.h(u52Var, "eventType");
            zq3.h(e32Var, "pageEventAsset");
            this.a = u52Var;
            this.b = e32Var;
        }

        public final e32 a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return zq3.c(this.a, eVar.a) && zq3.c(this.b, eVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "PageEvent(eventType=" + this.a + ", pageEventAsset=" + this.b + ")";
        }
    }

    public /* synthetic */ i78(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private i78() {
    }
}
