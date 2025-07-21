package defpackage;

import defpackage.ii5;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class u8 implements jz4 {
    public static final b Companion = new b(null);
    private final String a;
    private final String b;

    public static final class a {
        private final d a;

        public a(d dVar) {
            this.a = dVar;
        }

        public final d a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && zq3.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            d dVar = this.a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            return "AddToReadingList(item=" + this.a + ")";
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "mutation AddToSaved($url: String!, $clientMutationId: String!) { addToReadingList(input: { clientMutationId: $clientMutationId url: $url } ) { item { status } } }";
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
            return "Data(addToReadingList=" + this.a + ")";
        }
    }

    public static final class d {
        private final String a;

        public d(String str) {
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && zq3.c(this.a, ((d) obj).a);
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

    public u8(String str, String str2) {
        zq3.h(str, "url");
        zq3.h(str2, "clientMutationId");
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(w8.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        y8.a.a(lu3Var, this, w41Var, z);
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
        if (!(obj instanceof u8)) {
            return false;
        }
        u8 u8Var = (u8) obj;
        return zq3.c(this.a, u8Var.a) && zq3.c(this.b, u8Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "b8dd435b5ad6f84a3104ee56fe77386cc8389a12a1fc42e37afa191944cb1e4e";
    }

    @Override // defpackage.ii5
    public String name() {
        return "AddToSaved";
    }

    public String toString() {
        return "AddToSavedMutation(url=" + this.a + ", clientMutationId=" + this.b + ")";
    }
}
