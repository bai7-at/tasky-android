package defpackage;

import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloGraphQLException;
import com.apollographql.apollo.exception.DefaultApolloException;
import com.apollographql.apollo.exception.NoDataException;
import defpackage.ii5;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class yj {
    public final UUID a;
    public final ii5 b;
    public final ii5.a c;
    public final List d;
    public final ApolloException e;
    public final Map f;
    public final m62 g;
    public final boolean h;

    public /* synthetic */ yj(UUID uuid, ii5 ii5Var, ii5.a aVar, List list, ApolloException apolloException, Map map, m62 m62Var, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, ii5Var, aVar, list, apolloException, map, m62Var, z);
    }

    public final ii5.a a() {
        if (c()) {
            List list = this.d;
            zq3.e(list);
            throw new ApolloGraphQLException((q22) i.k0(list));
        }
        if (this.e == null) {
            return b();
        }
        throw new DefaultApolloException("An exception happened", this.e);
    }

    public final ii5.a b() {
        ii5.a aVar = this.c;
        if (aVar != null) {
            return aVar;
        }
        throw new NoDataException(this.e);
    }

    public final boolean c() {
        List list = this.d;
        return !(list == null || list.isEmpty());
    }

    public final a d() {
        return new a(this.b, this.a, this.c, this.d, this.f, this.e).a(this.g).g(this.h);
    }

    private yj(UUID uuid, ii5 ii5Var, ii5.a aVar, List list, ApolloException apolloException, Map map, m62 m62Var, boolean z) {
        this.a = uuid;
        this.b = ii5Var;
        this.c = aVar;
        this.d = list;
        this.e = apolloException;
        this.f = map;
        this.g = m62Var;
        this.h = z;
    }

    public static final class a {
        private final ii5 a;
        private UUID b;
        private ii5.a c;
        private List d;
        private Map e;
        private ApolloException f;
        private m62 g;
        private boolean h;

        public a(ii5 ii5Var, UUID uuid, ii5.a aVar, List list, Map map, ApolloException apolloException) {
            zq3.h(ii5Var, "operation");
            zq3.h(uuid, "requestUuid");
            this.a = ii5Var;
            this.b = uuid;
            this.c = aVar;
            this.d = list;
            this.e = map;
            this.f = apolloException;
            this.g = m62.b;
        }

        public final a a(m62 m62Var) {
            zq3.h(m62Var, "executionContext");
            this.g = this.g.c(m62Var);
            return this;
        }

        public final yj b() {
            ii5 ii5Var = this.a;
            UUID uuid = this.b;
            ii5.a aVar = this.c;
            m62 m62Var = this.g;
            Map map = this.e;
            if (map == null) {
                map = t.i();
            }
            return new yj(uuid, ii5Var, aVar, this.d, this.f, map, m62Var, this.h, null);
        }

        public final a c(ii5.a aVar) {
            this.c = aVar;
            return this;
        }

        public final a d(List list) {
            this.d = list;
            return this;
        }

        public final a e(ApolloException apolloException) {
            this.f = apolloException;
            return this;
        }

        public final a f(Map map) {
            this.e = map;
            return this;
        }

        public final a g(boolean z) {
            this.h = z;
            return this;
        }

        public final a h(UUID uuid) {
            zq3.h(uuid, "requestUuid");
            this.b = uuid;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(ii5 ii5Var, UUID uuid) {
            this(ii5Var, uuid, null, null, null, null);
            zq3.h(ii5Var, "operation");
            zq3.h(uuid, "requestUuid");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(ii5 ii5Var, UUID uuid, ii5.a aVar) {
            this(ii5Var, uuid, aVar, null, null, null);
            zq3.h(ii5Var, "operation");
            zq3.h(uuid, "requestUuid");
        }
    }
}
