package defpackage;

import defpackage.ii5;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class f19 implements hb6 {
    public static final a Companion = new a(null);
    private final nk5 a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query userState($identifier: UserIdentifier) { user(identifier: $identifier) { __typename state { __typename ...OnUserStateData ...OnUserStateError } } }  fragment OnUserStateData on UserStateData { messageSelectionMessageCaps { __typename unit campaign audience viewCount lastSeenOn dismissed } }  fragment OnUserStateError on UserStateError { __typename message }";
        }

        private a() {
        }
    }

    public static final class b implements ii5.a {
        private final d a;

        public b(d dVar) {
            this.a = dVar;
        }

        public final d a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            d dVar = this.a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            return "Data(user=" + this.a + ")";
        }
    }

    public static final class c {
        private final String a;
        private final sg5 b;
        private final vg5 c;

        public c(String str, sg5 sg5Var, vg5 vg5Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = sg5Var;
            this.c = vg5Var;
        }

        public final sg5 a() {
            return this.b;
        }

        public final vg5 b() {
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
            sg5 sg5Var = this.b;
            int hashCode2 = (hashCode + (sg5Var == null ? 0 : sg5Var.hashCode())) * 31;
            vg5 vg5Var = this.c;
            return hashCode2 + (vg5Var != null ? vg5Var.hashCode() : 0);
        }

        public String toString() {
            return "State(__typename=" + this.a + ", onUserStateData=" + this.b + ", onUserStateError=" + this.c + ")";
        }
    }

    public static final class d {
        private final String a;
        private final c b;

        public d(String str, c cVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = cVar;
        }

        public final c a() {
            return this.b;
        }

        public final String b() {
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
            return zq3.c(this.a, dVar.a) && zq3.c(this.b, dVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            c cVar = this.b;
            return hashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            return "User(__typename=" + this.a + ", state=" + this.b + ")";
        }
    }

    public f19(nk5 nk5Var) {
        zq3.h(nk5Var, "identifier");
        this.a = nk5Var;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(g19.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        j19.a.a(lu3Var, this, w41Var, z);
    }

    public final nk5 d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f19) && zq3.c(this.a, ((f19) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "6c91d99cf3c2b74cf2966b4dc783e494f828069e9b954aee2dea6b43dd55551c";
    }

    @Override // defpackage.ii5
    public String name() {
        return "userState";
    }

    public String toString() {
        return "UserStateQuery(identifier=" + this.a + ")";
    }
}
