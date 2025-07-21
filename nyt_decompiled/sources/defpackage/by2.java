package defpackage;

import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class by2 implements hb6 {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query GetInterests { __typename interests { __typename ...InterestPreview } }  fragment InterestPreview on Interest { __typename interestId interestType interestSubType name description promoImageURL isOpinion isEditorsPick }";
        }

        private a() {
        }
    }

    public static final class b implements ii5.a {
        private final String a;
        private final List b;

        public b(String str, List list) {
            zq3.h(str, "__typename");
            zq3.h(list, "interests");
            this.a = str;
            this.b = list;
        }

        public final List a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Data(__typename=" + this.a + ", interests=" + this.b + ")";
        }
    }

    public static final class c {
        private final String a;
        private final up3 b;

        public c(String str, up3 up3Var) {
            zq3.h(str, "__typename");
            zq3.h(up3Var, "interestPreview");
            this.a = str;
            this.b = up3Var;
        }

        public final up3 a() {
            return this.b;
        }

        public final String b() {
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
            return "Interest(__typename=" + this.a + ", interestPreview=" + this.b + ")";
        }
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(cy2.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
    }

    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == by2.class;
    }

    public int hashCode() {
        return zt6.b(by2.class).hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "787abb24be6e325f426cfc090cab3dcdbb1e8a94de823200d8b6a685ba118191";
    }

    @Override // defpackage.ii5
    public String name() {
        return "GetInterests";
    }
}
