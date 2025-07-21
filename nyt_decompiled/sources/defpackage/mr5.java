package defpackage;

import defpackage.us8;
import java.util.Set;
import kotlin.collections.AbstractMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public class mr5 extends AbstractMap implements ds5 {
    public static final a d = new a(null);
    public static final int e = 8;
    private static final mr5 f = new mr5(us8.e.a(), 0);
    private final us8 b;
    private final int c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final mr5 a() {
            mr5 mr5Var = mr5.f;
            zq3.f(mr5Var, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return mr5Var;
        }

        private a() {
        }
    }

    public mr5(us8 us8Var, int i) {
        this.b = us8Var;
        this.c = i;
    }

    private final zh3 q() {
        return new wr5(this);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.b.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // kotlin.collections.AbstractMap
    public final Set f() {
        return q();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.b.o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // kotlin.collections.AbstractMap
    public int i() {
        return this.c;
    }

    @Override // defpackage.ds5
    public or5 o() {
        return new or5(this);
    }

    @Override // kotlin.collections.AbstractMap
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public zh3 h() {
        return new yr5(this);
    }

    public final us8 s() {
        return this.b;
    }

    @Override // kotlin.collections.AbstractMap
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public ih3 j() {
        return new as5(this);
    }

    public mr5 u(Object obj, Object obj2) {
        us8.b P = this.b.P(obj != null ? obj.hashCode() : 0, obj, obj2, 0);
        return P == null ? this : new mr5(P.a(), size() + P.b());
    }

    public mr5 v(Object obj) {
        us8 Q = this.b.Q(obj != null ? obj.hashCode() : 0, obj, 0);
        return this.b == Q ? this : Q == null ? d.a() : new mr5(Q, size() - 1);
    }
}
