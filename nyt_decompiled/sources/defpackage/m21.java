package defpackage;

import defpackage.ii5;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class m21 implements jz4 {
    public static final a Companion = new a(null);
    private final Object a;
    private final nk5 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "mutation CreateSubscriberShareLinkMutation($url: NonEmptyString!, $options: ShareCodeOptions) { createShareCode(url: $url, options: $options) { __typename ...OnShareCodeData ...OnShareCodeError } }  fragment OnShareCodeData on ShareCodeData { __typename url code remaining contents { __typename uri url creationDate expirationDate regiId } }  fragment OnShareCodeError on ShareCodeError { __typename code message }";
        }

        private a() {
        }
    }

    public static final class b {
        private final String a;
        private final mf5 b;
        private final pf5 c;

        public b(String str, mf5 mf5Var, pf5 pf5Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = mf5Var;
            this.c = pf5Var;
        }

        public final mf5 a() {
            return this.b;
        }

        public final pf5 b() {
            return this.c;
        }

        public final String c() {
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
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b) && zq3.c(this.c, bVar.c);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            mf5 mf5Var = this.b;
            int hashCode2 = (hashCode + (mf5Var == null ? 0 : mf5Var.hashCode())) * 31;
            pf5 pf5Var = this.c;
            return hashCode2 + (pf5Var != null ? pf5Var.hashCode() : 0);
        }

        public String toString() {
            return "CreateShareCode(__typename=" + this.a + ", onShareCodeData=" + this.b + ", onShareCodeError=" + this.c + ")";
        }
    }

    public static final class c implements ii5.a {
        private final b a;

        public c(b bVar) {
            this.a = bVar;
        }

        public final b a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            b bVar = this.a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            return "Data(createShareCode=" + this.a + ")";
        }
    }

    public m21(Object obj, nk5 nk5Var) {
        zq3.h(obj, "url");
        zq3.h(nk5Var, "options");
        this.a = obj;
        this.b = nk5Var;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(o21.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        p21.a.a(lu3Var, this, w41Var, z);
    }

    public final nk5 d() {
        return this.b;
    }

    public final Object e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m21)) {
            return false;
        }
        m21 m21Var = (m21) obj;
        return zq3.c(this.a, m21Var.a) && zq3.c(this.b, m21Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "5ac2732b2ed2efed91d0ddadcc2687e81a91ec7514dd90ed9ee05bff18aec15a";
    }

    @Override // defpackage.ii5
    public String name() {
        return "CreateSubscriberShareLinkMutation";
    }

    public String toString() {
        return "CreateSubscriberShareLinkMutation(url=" + this.a + ", options=" + this.b + ")";
    }
}
