package defpackage;

import defpackage.ii5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class q8 implements jz4 {
    public static final a Companion = new a(null);
    private final List a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "mutation AddNewsletterSubscription($newsletters: [NewsletterProductsInput!]!) { createNoCaptchaNewsletterSubscription(input: { collapseEmail: true confirm: true newsletters: $newsletters signupFormVersion: \"APP_XPN_newsletter\" } ) { message } }";
        }

        private a() {
        }
    }

    public static final class b {
        private final String a;

        public b(String str) {
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "CreateNoCaptchaNewsletterSubscription(message=" + this.a + ")";
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
            return "Data(createNoCaptchaNewsletterSubscription=" + this.a + ")";
        }
    }

    public q8(List list) {
        zq3.h(list, "newsletters");
        this.a = list;
    }

    @Override // defpackage.j62
    public h8 a() {
        return j8.d(s8.a, false, 1, null);
    }

    @Override // defpackage.ii5
    public String b() {
        return Companion.a();
    }

    @Override // defpackage.j62
    public void c(lu3 lu3Var, w41 w41Var, boolean z) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        t8.a.a(lu3Var, this, w41Var, z);
    }

    public final List d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q8) && zq3.c(this.a, ((q8) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ii5
    public String id() {
        return "90169ea4756f4eb7d2707b989b10d74e85b686265a868870e12c57f2bd3d6042";
    }

    @Override // defpackage.ii5
    public String name() {
        return "AddNewsletterSubscription";
    }

    public String toString() {
        return "AddNewsletterSubscriptionMutation(newsletters=" + this.a + ")";
    }
}
