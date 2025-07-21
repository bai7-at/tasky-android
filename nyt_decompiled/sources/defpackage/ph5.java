package defpackage;

import defpackage.ii5;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class ph5 implements hb6 {
    public static final a Companion = new a(null);
    private final String a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query OneWebViewHomeQuery($id: String!) @cacheHint(includeSurrogateTypes: [\"nyt://article\",\"nyt://audio\",\"nyt://embeddedinteractive\",\"nyt://interactive\",\"nyt://legacycollection\",\"nyt://carddeck\",\"nyt://promo\",\"nyt://slideshow\",\"nyt://video\",\"nyt://programmingnode\",\"nyt://programmingvariantset\"]) { home(id: $id) { __typename ...hasHybridProperties ...descendantAssets } }  fragment hasHybridProperties on HasHybridProperties { __typename hybridBody { __typename main { __typename contents } subResources { __typename target } images { __typename crops { __typename minViewportWidth target } } } }  fragment descendantAssets on DescendantAssets { __typename descendantAssets { __typename ... on Published { __typename uri lastModified ... on Article { __typename hybridBody { __typename lastModified } } } } }";
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
            return "Data(home=" + this.a + ")";
        }
    }

    public static final class c {
        private final String a;
        private final b73 b;
        private final qm1 c;

        public c(String str, b73 b73Var, qm1 qm1Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = b73Var;
            this.c = qm1Var;
        }

        public final qm1 a() {
            return this.c;
        }

        public final b73 b() {
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
            return zq3.c(this.a, cVar.a) && zq3.c(this.b, cVar.b) && zq3.c(this.c, cVar.c);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            b73 b73Var = this.b;
            int hashCode2 = (hashCode + (b73Var == null ? 0 : b73Var.hashCode())) * 31;
            qm1 qm1Var = this.c;
            return hashCode2 + (qm1Var != null ? qm1Var.hashCode() : 0);
        }

        public String toString() {
            return "Home(__typename=" + this.a + ", hasHybridProperties=" + this.b + ", descendantAssets=" + this.c + ")";
        }
    }

    public ph5(String str) {
        zq3.h(str, "id");
        this.a = str;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(qh5.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        sh5.a.a(lu3Var, this, w41Var, z);
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ph5) && zq3.c(this.a, ((ph5) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "dc6f58e06a4dbf4240a1128ce145b8f8e4289c3a2524fb0520bc1cd3a988b3ec";
    }

    @Override // defpackage.ii5
    public String name() {
        return "OneWebViewHomeQuery";
    }

    public String toString() {
        return "OneWebViewHomeQuery(id=" + this.a + ")";
    }
}
