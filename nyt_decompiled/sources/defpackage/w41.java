package defpackage;

import defpackage.m62;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class w41 implements m62.b {
    public static final b h = new b(null);
    public static final w41 i = new a().c();
    public static final w41 j = new a().h(true).c();
    public final Set c;
    public final Set d;
    public final List e;
    private final boolean f;
    private final Map g;

    public static final class a {
        private final Map a = new LinkedHashMap();
        private boolean b;
        private Set c;
        private Set d;
        private List e;

        public final a a(x41 x41Var, h8 h8Var) {
            zq3.h(x41Var, "customScalarType");
            zq3.h(h8Var, "customScalarAdapter");
            this.a.put(x41Var.a(), h8Var);
            return this;
        }

        public final a b(w41 w41Var) {
            zq3.h(w41Var, "customScalarAdapters");
            this.a.putAll(w41Var.g);
            return this;
        }

        public final w41 c() {
            return new w41(this.a, this.c, this.d, this.e, this.b, null);
        }

        public final void d() {
            this.a.clear();
        }

        public final a e(Set set) {
            this.d = set;
            return this;
        }

        public final a f(List list) {
            this.e = list;
            return this;
        }

        public final a g(Set set) {
            this.c = set;
            return this;
        }

        public final a h(boolean z) {
            this.b = z;
            return this;
        }
    }

    public static final class b implements m62.c {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ w41(Map map, Set set, Set set2, List list, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, set, set2, list, z);
    }

    public final a g() {
        return new a().b(this).g(this.c).e(this.d);
    }

    @Override // m62.b
    public m62.c getKey() {
        return h;
    }

    public final h8 h(x41 x41Var) {
        h8 fp5Var;
        zq3.h(x41Var, "customScalar");
        if (this.g.get(x41Var.a()) != null) {
            fp5Var = (h8) this.g.get(x41Var.a());
        } else if (zq3.c(x41Var.b(), "com.apollographql.apollo.api.Upload")) {
            fp5Var = j8.h;
        } else if (i.o("kotlin.String", "java.lang.String").contains(x41Var.b())) {
            fp5Var = j8.a;
        } else if (i.o("kotlin.Boolean", "java.lang.Boolean").contains(x41Var.b())) {
            fp5Var = j8.f;
        } else if (i.o("kotlin.Int", "java.lang.Int").contains(x41Var.b())) {
            fp5Var = j8.b;
        } else if (i.o("kotlin.Double", "java.lang.Double").contains(x41Var.b())) {
            fp5Var = j8.c;
        } else if (i.o("kotlin.Long", "java.lang.Long").contains(x41Var.b())) {
            fp5Var = j8.e;
        } else if (i.o("kotlin.Float", "java.lang.Float").contains(x41Var.b())) {
            fp5Var = j8.d;
        } else if (i.o("kotlin.Any", "java.lang.Object").contains(x41Var.b())) {
            fp5Var = j8.g;
        } else {
            if (!this.f) {
                throw new IllegalStateException(("Can't map GraphQL type: `" + x41Var.a() + "` to: `" + x41Var.b() + "`. Did you forget to add a scalar Adapter?").toString());
            }
            fp5Var = new fp5();
        }
        zq3.f(fp5Var, "null cannot be cast to non-null type com.apollographql.apollo.api.Adapter<T of com.apollographql.apollo.api.CustomScalarAdapters.responseAdapterFor>");
        return fp5Var;
    }

    private w41(Map map, Set set, Set set2, List list, boolean z) {
        this.c = set;
        this.d = set2;
        this.e = list;
        this.f = z;
        this.g = map;
    }
}
