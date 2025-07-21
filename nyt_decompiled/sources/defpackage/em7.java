package defpackage;

import defpackage.ii5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import type.UserStateInput;

/* loaded from: classes3.dex */
public final class em7 implements jz4 {
    public static final a Companion = new a(null);
    private final UserStateInput a;
    private final nk5 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "mutation setUserState($data: UserStateInput!, $identifier: UserIdentifier) { setUserState(data: $data, user: $identifier) { __typename ...OnUserStateData ...OnUserStateError } }  fragment OnUserStateData on UserStateData { messageSelectionMessageCaps { __typename unit campaign audience viewCount lastSeenOn dismissed } }  fragment OnUserStateError on UserStateError { __typename message }";
        }

        private a() {
        }
    }

    public static final class b implements ii5.a {
        private final c a;

        public b(c cVar) {
            this.a = cVar;
        }

        public final c a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            c cVar = this.a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            return "Data(setUserState=" + this.a + ")";
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
            return "SetUserState(__typename=" + this.a + ", onUserStateData=" + this.b + ", onUserStateError=" + this.c + ")";
        }
    }

    public em7(UserStateInput userStateInput, nk5 nk5Var) {
        zq3.h(userStateInput, "data");
        zq3.h(nk5Var, "identifier");
        this.a = userStateInput;
        this.b = nk5Var;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(fm7.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        hm7.a.a(lu3Var, this, w41Var, z);
    }

    public final UserStateInput d() {
        return this.a;
    }

    public final nk5 e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof em7)) {
            return false;
        }
        em7 em7Var = (em7) obj;
        return zq3.c(this.a, em7Var.a) && zq3.c(this.b, em7Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "631b3efd0fc2862c999ae065ebef6c45586cc95e5c5fb14422b36f363462e434";
    }

    @Override // defpackage.ii5
    public String name() {
        return "setUserState";
    }

    public String toString() {
        return "SetUserStateMutation(data=" + this.a + ", identifier=" + this.b + ")";
    }
}
