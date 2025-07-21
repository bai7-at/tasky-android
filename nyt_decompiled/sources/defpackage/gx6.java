package defpackage;

import defpackage.ii5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import type.UserInterestsInput;

/* loaded from: classes3.dex */
public final class gx6 implements jz4 {
    public static final a Companion = new a(null);
    private final UserInterestsInput a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "mutation ReorderUserInterests($input: UserInterestsInput!) { reorderUserInterests(input: $input) { success message } }";
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
            return "Data(reorderUserInterests=" + this.a + ")";
        }
    }

    public static final class c {
        private final boolean a;
        private final String b;

        public c(boolean z, String str) {
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
            return "ReorderUserInterests(success=" + this.a + ", message=" + this.b + ")";
        }
    }

    public gx6(UserInterestsInput userInterestsInput) {
        zq3.h(userInterestsInput, "input");
        this.a = userInterestsInput;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(hx6.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        jx6.a.a(lu3Var, this, w41Var, z);
    }

    public final UserInterestsInput d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gx6) && zq3.c(this.a, ((gx6) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "e4a7263a990a0928daee3ee0acf0c0e0320db1e17721243f01f786042377dcef";
    }

    @Override // defpackage.ii5
    public String name() {
        return "ReorderUserInterests";
    }

    public String toString() {
        return "ReorderUserInterestsMutation(input=" + this.a + ")";
    }
}
