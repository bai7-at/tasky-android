package defpackage;

import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class oy2 implements hb6 {
    public static final a Companion = new a(null);
    private final int a;
    private final nk5 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query GetReadingList($first: Int!, $after: String) { user { __typename readingListAssetsConnection(first: $first, after: $after) { __typename totalCount pageInfo { __typename hasNextPage endCursor } edges { __typename metadata { __typename createdDate } node { __typename ...published } } } } }  fragment published on Published { __typename uri url type sourceId firstPublished lastMajorModification lastModified }";
        }

        private a() {
        }
    }

    public static final class b implements ii5.a {
        private final h a;

        public b(h hVar) {
            this.a = hVar;
        }

        public final h a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            h hVar = this.a;
            if (hVar == null) {
                return 0;
            }
            return hVar.hashCode();
        }

        public String toString() {
            return "Data(user=" + this.a + ")";
        }
    }

    public static final class c {
        private final String a;
        private final d b;
        private final e c;

        public c(String str, d dVar, e eVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = dVar;
            this.c = eVar;
        }

        public final d a() {
            return this.b;
        }

        public final e b() {
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
            d dVar = this.b;
            int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
            e eVar = this.c;
            return hashCode2 + (eVar != null ? eVar.hashCode() : 0);
        }

        public String toString() {
            return "Edge(__typename=" + this.a + ", metadata=" + this.b + ", node=" + this.c + ")";
        }
    }

    public static final class d {
        private final String a;
        private final String b;

        public d(String str, String str2) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
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
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Metadata(__typename=" + this.a + ", createdDate=" + this.b + ")";
        }
    }

    public static final class e {
        private final String a;
        private final y76 b;

        public e(String str, y76 y76Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = y76Var;
        }

        public final y76 a() {
            return this.b;
        }

        public final String b() {
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
            return zq3.c(this.a, eVar.a) && zq3.c(this.b, eVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            y76 y76Var = this.b;
            return hashCode + (y76Var == null ? 0 : y76Var.hashCode());
        }

        public String toString() {
            return "Node(__typename=" + this.a + ", published=" + this.b + ")";
        }
    }

    public static final class f {
        private final String a;
        private final boolean b;
        private final String c;

        public f(String str, boolean z, String str2) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = z;
            this.c = str2;
        }

        public final String a() {
            return this.c;
        }

        public final boolean b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return zq3.c(this.a, fVar.a) && this.b == fVar.b && zq3.c(this.c, fVar.c);
        }

        public int hashCode() {
            int hashCode = ((this.a.hashCode() * 31) + Boolean.hashCode(this.b)) * 31;
            String str = this.c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "PageInfo(__typename=" + this.a + ", hasNextPage=" + this.b + ", endCursor=" + this.c + ")";
        }
    }

    public static final class g {
        private final String a;
        private final Integer b;
        private final f c;
        private final List d;

        public g(String str, Integer num, f fVar, List list) {
            zq3.h(str, "__typename");
            zq3.h(fVar, "pageInfo");
            this.a = str;
            this.b = num;
            this.c = fVar;
            this.d = list;
        }

        public final List a() {
            return this.d;
        }

        public final f b() {
            return this.c;
        }

        public final Integer c() {
            return this.b;
        }

        public final String d() {
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
            return zq3.c(this.a, gVar.a) && zq3.c(this.b, gVar.b) && zq3.c(this.c, gVar.c) && zq3.c(this.d, gVar.d);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.c.hashCode()) * 31;
            List list = this.d;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "ReadingListAssetsConnection(__typename=" + this.a + ", totalCount=" + this.b + ", pageInfo=" + this.c + ", edges=" + this.d + ")";
        }
    }

    public static final class h {
        private final String a;
        private final g b;

        public h(String str, g gVar) {
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
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return zq3.c(this.a, hVar.a) && zq3.c(this.b, hVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            g gVar = this.b;
            return hashCode + (gVar == null ? 0 : gVar.hashCode());
        }

        public String toString() {
            return "User(__typename=" + this.a + ", readingListAssetsConnection=" + this.b + ")";
        }
    }

    public oy2(int i, nk5 nk5Var) {
        zq3.h(nk5Var, "after");
        this.a = i;
        this.b = nk5Var;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(py2.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        wy2.a.a(lu3Var, this, w41Var, z);
    }

    public final nk5 d() {
        return this.b;
    }

    public final int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy2)) {
            return false;
        }
        oy2 oy2Var = (oy2) obj;
        return this.a == oy2Var.a && zq3.c(this.b, oy2Var.b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.a) * 31) + this.b.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "d4c221e93ad1d17d1f3137586ff458eb51c55f0a21d0777153f3dcb2cff81e3b";
    }

    @Override // defpackage.ii5
    public String name() {
        return "GetReadingList";
    }

    public String toString() {
        return "GetReadingListQuery(first=" + this.a + ", after=" + this.b + ")";
    }
}
