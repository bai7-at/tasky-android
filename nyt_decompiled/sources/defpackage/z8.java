package defpackage;

import defpackage.ii5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import type.UserInterestsInput;

/* loaded from: classes3.dex */
public final class z8 implements jz4 {
    public static final b Companion = new b(null);
    private final UserInterestsInput a;

    public static final class a {
        private final boolean a;
        private final String b;

        public a(boolean z, String str) {
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && zq3.c(this.b, aVar.b);
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "AddUserInterests(success=" + this.a + ", message=" + this.b + ")";
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "mutation AddUserInterests($input: UserInterestsInput!) { addUserInterests(input: $input) { success message } }";
        }

        private b() {
        }
    }

    public static final class c implements ii5.a {
        private final a a;

        public c(a aVar) {
            this.a = aVar;
        }

        public final a a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            return "Data(addUserInterests=" + this.a + ")";
        }
    }

    public z8(UserInterestsInput userInterestsInput) {
        zq3.h(userInterestsInput, "input");
        this.a = userInterestsInput;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(b9.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        c9.a.a(lu3Var, this, w41Var, z);
    }

    public final UserInterestsInput d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z8) && zq3.c(this.a, ((z8) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "a08f452f044b9e41dbec4b111aa6946454eac09c24b66300f70ebf94252db566";
    }

    @Override // defpackage.ii5
    public String name() {
        return "AddUserInterests";
    }

    public String toString() {
        return "AddUserInterestsMutation(input=" + this.a + ")";
    }
}
