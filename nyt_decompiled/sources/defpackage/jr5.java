package defpackage;

import defpackage.kr5;
import defpackage.us8;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class jr5 extends mr5 implements kr5 {
    public static final b g = new b(null);
    private static final jr5 h;

    public static final class a extends or5 implements kr5.a {
        private jr5 g;

        public a(jr5 jr5Var) {
            super(jr5Var);
            this.g = jr5Var;
        }

        @Override // defpackage.or5, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof bt0) {
                return n((bt0) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof x08) {
                return o((x08) obj);
            }
            return false;
        }

        @Override // defpackage.or5, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof bt0) {
                return q((bt0) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof bt0) ? obj2 : r((bt0) obj, (x08) obj2);
        }

        @Override // defpackage.or5, ds5.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public jr5 build() {
            jr5 jr5Var;
            if (d() == this.g.s()) {
                jr5Var = this.g;
            } else {
                j(new wx4());
                jr5Var = new jr5(d(), size());
            }
            this.g = jr5Var;
            return jr5Var;
        }

        public /* bridge */ boolean n(bt0 bt0Var) {
            return super.containsKey(bt0Var);
        }

        public /* bridge */ boolean o(x08 x08Var) {
            return super.containsValue(x08Var);
        }

        public /* bridge */ x08 q(bt0 bt0Var) {
            return (x08) super.get(bt0Var);
        }

        public /* bridge */ x08 r(bt0 bt0Var, x08 x08Var) {
            return (x08) super.getOrDefault(bt0Var, x08Var);
        }

        @Override // defpackage.or5, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof bt0) {
                return s((bt0) obj);
            }
            return null;
        }

        public /* bridge */ x08 s(bt0 bt0Var) {
            return (x08) super.remove(bt0Var);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final jr5 a() {
            return jr5.h;
        }

        private b() {
        }
    }

    static {
        us8 a2 = us8.e.a();
        zq3.f(a2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>");
        h = new jr5(a2, 0);
    }

    public jr5(us8 us8Var, int i) {
        super(us8Var, i);
    }

    public /* bridge */ x08 A(bt0 bt0Var) {
        return (x08) super.get(bt0Var);
    }

    public /* bridge */ x08 B(bt0 bt0Var, x08 x08Var) {
        return (x08) super.getOrDefault(bt0Var, x08Var);
    }

    @Override // defpackage.et0
    public Object a(bt0 bt0Var) {
        return ft0.c(this, bt0Var);
    }

    @Override // defpackage.mr5, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof bt0) {
            return y((bt0) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof x08) {
            return z((x08) obj);
        }
        return false;
    }

    @Override // defpackage.kr5
    public kr5 e(bt0 bt0Var, x08 x08Var) {
        us8.b P = s().P(bt0Var.hashCode(), bt0Var, x08Var, 0);
        return P == null ? this : new jr5(P.a(), size() + P.b());
    }

    @Override // defpackage.mr5, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof bt0) {
            return A((bt0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof bt0) ? obj2 : B((bt0) obj, (x08) obj2);
    }

    @Override // defpackage.mr5
    /* renamed from: x, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a o() {
        return new a(this);
    }

    public /* bridge */ boolean y(bt0 bt0Var) {
        return super.containsKey(bt0Var);
    }

    public /* bridge */ boolean z(x08 x08Var) {
        return super.containsValue(x08Var);
    }
}
