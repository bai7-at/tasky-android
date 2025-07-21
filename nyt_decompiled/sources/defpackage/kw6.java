package defpackage;

import defpackage.ii5;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class kw6 implements jz4 {
    public static final a Companion = new a(null);
    private final String a;
    private final String b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "mutation RemoveFromSaved($url: String!, $clientMutationId: String!) { removeFromReadingList(input: { clientMutationId: $clientMutationId url: $url } ) { item { status } } }";
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
            return "Data(removeFromReadingList=" + this.a + ")";
        }
    }

    public static final class c {
        private final String a;

        public c(String str) {
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Item(status=" + this.a + ")";
        }
    }

    public static final class d {
        private final c a;

        public d(c cVar) {
            this.a = cVar;
        }

        public final c a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && zq3.c(this.a, ((d) obj).a);
        }

        public int hashCode() {
            c cVar = this.a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            return "RemoveFromReadingList(item=" + this.a + ")";
        }
    }

    public kw6(String str, String str2) {
        zq3.h(str, "url");
        zq3.h(str2, "clientMutationId");
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(lw6.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        ow6.a.a(lu3Var, this, w41Var, z);
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw6)) {
            return false;
        }
        kw6 kw6Var = (kw6) obj;
        return zq3.c(this.a, kw6Var.a) && zq3.c(this.b, kw6Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "d8cf500acf2e35d235ee208e1032d3706bed68029aba243f60d3c33f7e1b432e";
    }

    @Override // defpackage.ii5
    public String name() {
        return "RemoveFromSaved";
    }

    public String toString() {
        return "RemoveFromSavedMutation(url=" + this.a + ", clientMutationId=" + this.b + ")";
    }
}
