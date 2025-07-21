package defpackage;

import android.app.Application;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public interface f82 {

    public static final class a {
        private final Application a;
        private final b b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Application application) {
            zq3.h(application, "context");
            this.a = application;
            this.b = new b(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final f82 a() {
            e61 e61Var = e61.a;
            e61Var.b(n61.a().b(this.b).a(this.a).build());
            return e61Var.a().a();
        }

        public final a b(d85 d85Var) {
            zq3.h(d85Var, "nonDefaultFirebaseApp");
            this.b.c(d85Var);
            return this;
        }

        public final a c(Set set) {
            zq3.h(set, "nonDefaultFirebaseAppEnvironments");
            this.b.d(set);
            return this;
        }
    }

    r82 a();

    o82 b();

    public static final class b {
        private d85 a;
        private Set b;

        public b(d85 d85Var, Set set) {
            zq3.h(set, "nonDefaultFirebaseAppEnvironments");
            this.a = d85Var;
            this.b = set;
        }

        public final d85 a() {
            return this.a;
        }

        public final Set b() {
            return this.b;
        }

        public final void c(d85 d85Var) {
            this.a = d85Var;
        }

        public final void d(Set set) {
            zq3.h(set, "<set-?>");
            this.b = set;
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
            d85 d85Var = this.a;
            return ((d85Var == null ? 0 : d85Var.hashCode()) * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Settings(nonDefaultFirebaseApp=" + this.a + ", nonDefaultFirebaseAppEnvironments=" + this.b + ")";
        }

        public /* synthetic */ b(d85 d85Var, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d85Var, (i & 2) != 0 ? b0.e() : set);
        }
    }
}
