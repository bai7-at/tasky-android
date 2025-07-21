package defpackage;

import defpackage.ii5;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class q03 implements hb6 {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query GiftShareRemaining { user { __typename giftHistory { __typename remaining } } }";
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
        private final int b;

        public c(String str, int i) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = i;
        }

        public final int a() {
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
            return zq3.c(this.a, cVar.a) && this.b == cVar.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
        }

        public String toString() {
            return "GiftHistory(__typename=" + this.a + ", remaining=" + this.b + ")";
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
            return "User(__typename=" + this.a + ", giftHistory=" + this.b + ")";
        }
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(r03.a, false, 1, null);
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
        return obj != null && obj.getClass() == q03.class;
    }

    public int hashCode() {
        return zt6.b(q03.class).hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "2aca1116783c3e77241e075ef1301ef3be8b023060df3f2957706c8843e78529";
    }

    @Override // defpackage.ii5
    public String name() {
        return "GiftShareRemaining";
    }
}
