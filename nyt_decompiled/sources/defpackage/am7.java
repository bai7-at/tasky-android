package defpackage;

import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import type.SetUserInterestsInput;

/* loaded from: classes3.dex */
public final class am7 implements jz4 {
    public static final a Companion = new a(null);
    private final SetUserInterestsInput a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "mutation SetUserInterestsMutation($input: SetUserInterestsInput!) { setUserInterests(input: $input) { userInterests optedOutInterests } }";
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
            return "Data(setUserInterests=" + this.a + ")";
        }
    }

    public static final class c {
        private final List a;
        private final List b;

        public c(List list, List list2) {
            zq3.h(list, "userInterests");
            zq3.h(list2, "optedOutInterests");
            this.a = list;
            this.b = list2;
        }

        public final List a() {
            return this.b;
        }

        public final List b() {
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
            return zq3.c(this.a, cVar.a) && zq3.c(this.b, cVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "SetUserInterests(userInterests=" + this.a + ", optedOutInterests=" + this.b + ")";
        }
    }

    public am7(SetUserInterestsInput setUserInterestsInput) {
        zq3.h(setUserInterestsInput, "input");
        this.a = setUserInterestsInput;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(bm7.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        dm7.a.a(lu3Var, this, w41Var, z);
    }

    public final SetUserInterestsInput d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof am7) && zq3.c(this.a, ((am7) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "790279eb3984fa18deae2c1ce33bf30d4487a53085c84bc52dbee292b47da310";
    }

    @Override // defpackage.ii5
    public String name() {
        return "SetUserInterestsMutation";
    }

    public String toString() {
        return "SetUserInterestsMutation(input=" + this.a + ")";
    }
}
