package defpackage;

import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class ho2 implements hb6 {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query ForYouFollowStatus { followStatus(includeBulletin: true) { __typename uri following } }";
        }

        private a() {
        }
    }

    public static final class b implements ii5.a {
        private final List a;

        public b(List list) {
            this.a = list;
        }

        public final List a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            List list = this.a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return "Data(followStatus=" + this.a + ")";
        }
    }

    public static final class c {
        private final String a;
        private final String b;
        private final boolean c;

        public c(String str, String str2, boolean z) {
            zq3.h(str, "__typename");
            zq3.h(str2, "uri");
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public final boolean a() {
            return this.c;
        }

        public final String b() {
            return this.b;
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
            return zq3.c(this.a, cVar.a) && zq3.c(this.b, cVar.b) && this.c == cVar.c;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c);
        }

        public String toString() {
            return "FollowStatus(__typename=" + this.a + ", uri=" + this.b + ", following=" + this.c + ")";
        }
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(io2.a, false, 1, null);
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
        return obj != null && obj.getClass() == ho2.class;
    }

    public int hashCode() {
        return zt6.b(ho2.class).hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "189b5f3356fabb8398d6b06147521a7e86710462b45de1e624f26e529c904c43";
    }

    @Override // defpackage.ii5
    public String name() {
        return "ForYouFollowStatus";
    }
}
