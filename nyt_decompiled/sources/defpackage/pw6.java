package defpackage;

import defpackage.ii5;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class pw6 implements jz4 {
    public static final a Companion = new a(null);
    private final String a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "mutation RemoveNewsletterSubscription($code: String!) { unSubscribeNewsletter(unSubscribeNewsletterInput: { nlProductCode: $code } ) { productCode success } }";
        }

        private a() {
        }
    }

    public static final class b implements ii5.a {
        private final c a;

        public b(c cVar) {
            zq3.h(cVar, "unSubscribeNewsletter");
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
            return this.a.hashCode();
        }

        public String toString() {
            return "Data(unSubscribeNewsletter=" + this.a + ")";
        }
    }

    public static final class c {
        private final String a;
        private final boolean b;

        public c(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final String a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
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
            String str = this.a;
            return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            return "UnSubscribeNewsletter(productCode=" + this.a + ", success=" + this.b + ")";
        }
    }

    public pw6(String str) {
        zq3.h(str, "code");
        this.a = str;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(qw6.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        sw6.a.a(lu3Var, this, w41Var, z);
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pw6) && zq3.c(this.a, ((pw6) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "49ac88ddbc9b17cc3934a008d76536b1239fc262ea18e327ecb4108062d307d6";
    }

    @Override // defpackage.ii5
    public String name() {
        return "RemoveNewsletterSubscription";
    }

    public String toString() {
        return "RemoveNewsletterSubscriptionMutation(code=" + this.a + ")";
    }
}
