package defpackage;

import com.facebook.AuthenticationTokenClaims;
import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class fy2 implements hb6 {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query GetOnboardingInterests { __typename user { __typename onboardingInterests { __typename topics { __typename description id name title interests { __typename ...InterestPreview } } userInterests { __typename ...InterestPreview } editorsPicks { __typename ...InterestPreview } } } }  fragment InterestPreview on Interest { __typename interestId interestType interestSubType name description promoImageURL isOpinion isEditorsPick }";
        }

        private a() {
        }
    }

    public static final class b implements ii5.a {
        private final String a;
        private final g b;

        public b(String str, g gVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = gVar;
        }

        public final g a() {
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
            int hashCode = this.a.hashCode() * 31;
            g gVar = this.b;
            return hashCode + (gVar == null ? 0 : gVar.hashCode());
        }

        public String toString() {
            return "Data(__typename=" + this.a + ", user=" + this.b + ")";
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
            return "EditorsPick(__typename=" + this.a + ", interestPreview=" + this.b + ")";
        }
    }

    public static final class d {
        private final String a;
        private final up3 b;

        public d(String str, up3 up3Var) {
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
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return zq3.c(this.a, dVar.a) && zq3.c(this.b, dVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Interest(__typename=" + this.a + ", interestPreview=" + this.b + ")";
        }
    }

    public static final class e {
        private final String a;
        private final List b;
        private final List c;
        private final List d;

        public e(String str, List list, List list2, List list3) {
            zq3.h(str, "__typename");
            zq3.h(list, "topics");
            zq3.h(list3, "editorsPicks");
            this.a = str;
            this.b = list;
            this.c = list2;
            this.d = list3;
        }

        public final List a() {
            return this.d;
        }

        public final List b() {
            return this.b;
        }

        public final List c() {
            return this.c;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return zq3.c(this.a, eVar.a) && zq3.c(this.b, eVar.b) && zq3.c(this.c, eVar.c) && zq3.c(this.d, eVar.d);
        }

        public int hashCode() {
            int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
            List list = this.c;
            return ((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "OnboardingInterests(__typename=" + this.a + ", topics=" + this.b + ", userInterests=" + this.c + ", editorsPicks=" + this.d + ")";
        }
    }

    public static final class f {
        private final String a;
        private final String b;
        private final int c;
        private final String d;
        private final String e;
        private final List f;

        public f(String str, String str2, int i, String str3, String str4, List list) {
            zq3.h(str, "__typename");
            zq3.h(str2, "description");
            zq3.h(str3, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(str4, "title");
            zq3.h(list, "interests");
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = str3;
            this.e = str4;
            this.f = list;
        }

        public final String a() {
            return this.b;
        }

        public final int b() {
            return this.c;
        }

        public final List c() {
            return this.f;
        }

        public final String d() {
            return this.d;
        }

        public final String e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return zq3.c(this.a, fVar.a) && zq3.c(this.b, fVar.b) && this.c == fVar.c && zq3.c(this.d, fVar.d) && zq3.c(this.e, fVar.e) && zq3.c(this.f, fVar.f);
        }

        public final String f() {
            return this.a;
        }

        public int hashCode() {
            return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        }

        public String toString() {
            return "Topic(__typename=" + this.a + ", description=" + this.b + ", id=" + this.c + ", name=" + this.d + ", title=" + this.e + ", interests=" + this.f + ")";
        }
    }

    public static final class g {
        private final String a;
        private final e b;

        public g(String str, e eVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = eVar;
        }

        public final e a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return zq3.c(this.a, gVar.a) && zq3.c(this.b, gVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            e eVar = this.b;
            return hashCode + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            return "User(__typename=" + this.a + ", onboardingInterests=" + this.b + ")";
        }
    }

    public static final class h {
        private final String a;
        private final up3 b;

        public h(String str, up3 up3Var) {
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
            return "UserInterest(__typename=" + this.a + ", interestPreview=" + this.b + ")";
        }
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(gy2.a, false, 1, null);
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
        return obj != null && obj.getClass() == fy2.class;
    }

    public int hashCode() {
        return zt6.b(fy2.class).hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "ee0551c2b21220c7cdc75f910f8b21e592701080f708c771309f806c3160f38b";
    }

    @Override // defpackage.ii5
    public String name() {
        return "GetOnboardingInterests";
    }
}
