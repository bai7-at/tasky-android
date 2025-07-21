package com.apollographql.apollo;

import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.http.HttpMethod;
import com.apollographql.apollo.interceptor.AutoPersistedQueryInterceptor;
import com.apollographql.apollo.network.http.HttpNetworkTransport;
import com.apollographql.apollo.network.ws.WebSocketNetworkTransport;
import com.apollographql.apollo.network.ws.WsProtocol;
import defpackage.ai1;
import defpackage.gs1;
import defpackage.h8;
import defpackage.hb6;
import defpackage.ie9;
import defpackage.it2;
import defpackage.j55;
import defpackage.jz4;
import defpackage.lt0;
import defpackage.m62;
import defpackage.sa3;
import defpackage.ss2;
import defpackage.uj;
import defpackage.w41;
import defpackage.x35;
import defpackage.x41;
import defpackage.xj;
import defpackage.zq3;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ContextKt;

/* loaded from: classes2.dex */
public final class ApolloClient implements Closeable {
    public static final b w = new b(null);
    private final a a;
    private final lt0 b;
    private final j55 c;
    private final j55 d;
    private final List e;
    private final w41 f;
    private final ss2 g;
    private final uj h;
    private final Boolean i;
    private final List j;
    private final m62 k;
    private final HttpMethod l;
    private final List m;
    private final Boolean n;
    private final Boolean r;
    private final Boolean s;
    private final Boolean t;
    private final x35 u;

    public static final class a {
        private ss2 A;
        private uj B;
        private Boolean C;
        private final w41.a a = new w41.a();
        private final List b;
        private final List c;
        private final List d;
        private final List e;
        private final List f;
        private final List g;
        private m62 h;
        private HttpMethod i;
        private List j;
        private Boolean k;
        private Boolean l;
        private Boolean m;
        private Boolean n;
        private j55 o;
        private j55 p;
        private CoroutineDispatcher q;
        private String r;
        private sa3 s;
        private String t;
        private Long u;
        private WsProtocol.a v;
        private Boolean w;
        private ie9 x;
        private it2 y;
        private ss2 z;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            this.c = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.d = arrayList2;
            this.e = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            this.f = arrayList3;
            this.g = arrayList3;
            this.h = m62.b;
        }

        public static /* synthetic */ a e(a aVar, HttpMethod httpMethod, HttpMethod httpMethod2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                httpMethod = HttpMethod.Get;
            }
            if ((i & 2) != 0) {
                httpMethod2 = HttpMethod.Post;
            }
            if ((i & 4) != 0) {
                z = true;
            }
            return aVar.d(httpMethod, httpMethod2, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean f(uj ujVar) {
            zq3.h(ujVar, "it");
            return ujVar instanceof AutoPersistedQueryInterceptor;
        }

        public final List A() {
            return this.c;
        }

        public final List B() {
            return this.g;
        }

        public final j55 C() {
            return this.o;
        }

        public final ss2 D() {
            return this.A;
        }

        public final uj E() {
            return this.B;
        }

        public Boolean F() {
            return this.k;
        }

        public Boolean G() {
            return this.l;
        }

        public final j55 H() {
            return this.p;
        }

        public final ie9 I() {
            return this.x;
        }

        public final Long J() {
            return this.u;
        }

        public final ss2 K() {
            return this.z;
        }

        public final it2 L() {
            return this.y;
        }

        public final String M() {
            return this.t;
        }

        public final WsProtocol.a N() {
            return this.v;
        }

        public final a O(sa3 sa3Var) {
            this.s = sa3Var;
            return this;
        }

        public final a P(Boolean bool) {
            this.w = bool;
            return this;
        }

        public a Q(List list) {
            this.j = list;
            return this;
        }

        public final a R(List list) {
            zq3.h(list, "httpInterceptors");
            this.d.clear();
            this.d.addAll(list);
            return this;
        }

        public a S(HttpMethod httpMethod) {
            this.i = httpMethod;
            return this;
        }

        public final a T(String str) {
            this.r = str;
            return this;
        }

        public final a U(List list) {
            zq3.h(list, "interceptors");
            this.b.clear();
            i.B(this.b, list);
            return this;
        }

        public final a V(List list) {
            zq3.h(list, "listeners");
            this.f.clear();
            this.f.addAll(list);
            return this;
        }

        public final a W(j55 j55Var) {
            this.o = j55Var;
            return this;
        }

        public final a X(ss2 ss2Var) {
            this.A = ss2Var;
            return this;
        }

        public final a Y(uj ujVar) {
            this.B = ujVar;
            return this;
        }

        public a Z(Boolean bool) {
            this.k = bool;
            return this;
        }

        public a a0(Boolean bool) {
            this.l = bool;
            return this;
        }

        public final a b(x41 x41Var, h8 h8Var) {
            zq3.h(x41Var, "customScalarType");
            zq3.h(h8Var, "customScalarAdapter");
            this.a.a(x41Var, h8Var);
            return this;
        }

        public final a b0(String str) {
            zq3.h(str, "serverUrl");
            this.r = str;
            return this;
        }

        public final a c(uj ujVar) {
            zq3.h(ujVar, "interceptor");
            this.b.add(ujVar);
            return this;
        }

        public final a c0(j55 j55Var) {
            this.p = j55Var;
            return this;
        }

        public final a d(HttpMethod httpMethod, HttpMethod httpMethod2, boolean z) {
            zq3.h(httpMethod, "httpMethodForHashedQueries");
            zq3.h(httpMethod2, "httpMethodForDocumentQueries");
            i.I(this.b, new ss2() { // from class: sj
                @Override // defpackage.ss2
                public final Object invoke(Object obj) {
                    boolean f;
                    f = ApolloClient.a.f((uj) obj);
                    return Boolean.valueOf(f);
                }
            });
            c(new AutoPersistedQueryInterceptor(httpMethod, httpMethod2));
            l(Boolean.valueOf(z));
            return this;
        }

        public final a d0(ie9 ie9Var) {
            this.x = ie9Var;
            return this;
        }

        public final a e0(Long l) {
            this.u = l;
            return this;
        }

        public final a f0(it2 it2Var) {
            this.y = it2Var;
            return this;
        }

        public final ApolloClient g() {
            return new ApolloClient(i(), null);
        }

        public final a g0(ss2 ss2Var) {
            this.z = ss2Var;
            return this;
        }

        public a h(Boolean bool) {
            this.n = bool;
            return this;
        }

        public final a h0(String str) {
            this.t = str;
            return this;
        }

        public final a i() {
            return new a().j(this.a.c()).U(this.c).k(this.q).m(s()).S(y()).Q(w()).T(this.r).O(this.s).P(this.w).R(this.e).Z(F()).a0(G()).l(r()).h(o()).W(this.o).c0(this.p).h0(this.t).g0(this.z).d0(this.x).f0(this.y).e0(this.u).i0(this.v).X(this.A).Y(this.B).n(this.C).V(this.g);
        }

        public final a i0(WsProtocol.a aVar) {
            this.v = aVar;
            return this;
        }

        public final a j(w41 w41Var) {
            zq3.h(w41Var, "customScalarAdapters");
            this.a.d();
            this.a.b(w41Var);
            return this;
        }

        public final a k(CoroutineDispatcher coroutineDispatcher) {
            this.q = coroutineDispatcher;
            return this;
        }

        public a l(Boolean bool) {
            this.m = bool;
            return this;
        }

        public final a m(m62 m62Var) {
            zq3.h(m62Var, "executionContext");
            this.h = m62Var;
            return this;
        }

        public final a n(Boolean bool) {
            this.C = bool;
            return this;
        }

        public Boolean o() {
            return this.n;
        }

        public final w41 p() {
            return this.a.c();
        }

        public final CoroutineDispatcher q() {
            return this.q;
        }

        public Boolean r() {
            return this.m;
        }

        public m62 s() {
            return this.h;
        }

        public final Boolean t() {
            return this.C;
        }

        public final sa3 u() {
            return this.s;
        }

        public final Boolean v() {
            return this.w;
        }

        public List w() {
            return this.j;
        }

        public final List x() {
            return this.e;
        }

        public HttpMethod y() {
            return this.i;
        }

        public final String z() {
            return this.r;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ ApolloClient(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public Boolean C() {
        return this.r;
    }

    public final ApolloCall G(jz4 jz4Var) {
        zq3.h(jz4Var, "mutation");
        return new ApolloCall(this, jz4Var);
    }

    public final ApolloCall L(hb6 hb6Var) {
        zq3.h(hb6Var, "query");
        return new ApolloCall(this, hb6Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        CoroutineScopeKt.cancel$default(this.b.f(), null, 1, null);
        this.c.dispose();
        this.d.dispose();
    }

    public final Flow d(xj xjVar, boolean z) {
        zq3.h(xjVar, "apolloRequest");
        xj.a l = xjVar.l();
        l.e(this.b.c(this.f).c(l()).c(l.i()));
        HttpMethod l2 = l.l();
        if (l2 == null) {
            l2 = r();
        }
        l.r(l2);
        Boolean o = l.o();
        if (o == null) {
            o = s();
        }
        l.v(o);
        Boolean p = l.p();
        if (p == null) {
            p = C();
        }
        l.w(p);
        Boolean h = l.h();
        if (h == null) {
            h = j();
        }
        l.d(h);
        List c = i.c();
        if (!zq3.c(l.m(), Boolean.TRUE)) {
            List m = m();
            if (m == null) {
                m = i.l();
            }
            c.addAll(m);
        }
        List k = l.k();
        if (k == null) {
            k = i.l();
        }
        c.addAll(k);
        l.q(i.a(c));
        Boolean g = l.g();
        if (g == null) {
            g = i();
        }
        if (g != null) {
            l.a("X-APOLLO-CAN-BE-BATCHED", g.toString());
        }
        Boolean n = l.n();
        if (n == null) {
            ss2 ss2Var = this.g;
            n = ss2Var != null ? (Boolean) ss2Var.invoke(xjVar) : null;
        }
        l.u(n);
        Boolean j = l.j();
        if (j == null) {
            j = this.i;
        }
        l.f(j);
        xj b2 = l.b();
        List c2 = i.c();
        c2.addAll(this.e);
        uj ujVar = this.h;
        if (ujVar == null) {
            ujVar = com.apollographql.apollo.interceptor.a.a();
        }
        c2.add(ujVar);
        c2.add(this.u);
        Flow a2 = new ai1(i.a(c2), 0).a(b2);
        return z ? FlowKt.onEach(a2, new ApolloClient$apolloResponses$1$1(null)) : a2;
    }

    public final Flow h(xj xjVar, boolean z) {
        zq3.h(xjVar, "apolloRequest");
        return FlowKt__ContextKt.buffer$default(FlowKt.flowOn(FlowKt.channelFlow(new ApolloClient$executeAsFlowInternal$flow$1(this, xjVar, z, null)), Dispatchers.getUnconfined()), Integer.MAX_VALUE, null, 2, null);
    }

    public Boolean i() {
        return this.t;
    }

    public Boolean j() {
        return this.s;
    }

    public m62 l() {
        return this.k;
    }

    public List m() {
        return this.m;
    }

    public HttpMethod r() {
        return this.l;
    }

    public Boolean s() {
        return this.n;
    }

    private ApolloClient(a aVar) {
        j55 a2;
        j55 a3;
        this.a = aVar;
        this.e = aVar.A();
        this.f = aVar.p();
        this.g = aVar.D();
        this.h = aVar.E();
        this.i = aVar.t();
        this.j = aVar.B();
        this.k = aVar.s();
        this.l = aVar.y();
        this.m = aVar.w();
        this.n = aVar.F();
        this.r = aVar.G();
        this.s = aVar.r();
        this.t = aVar.o();
        if (aVar.C() != null) {
            if (aVar.z() != null) {
                throw new IllegalStateException("Apollo: 'httpServerUrl' has no effect if 'networkTransport' is set");
            }
            if (aVar.u() != null) {
                throw new IllegalStateException("Apollo: 'httpEngine' has no effect if 'networkTransport' is set");
            }
            if (!aVar.x().isEmpty()) {
                throw new IllegalStateException("Apollo: 'addHttpInterceptor' has no effect if 'networkTransport' is set");
            }
            if (aVar.v() != null) {
                throw new IllegalStateException("Apollo: 'httpExposeErrorBody' has no effect if 'networkTransport' is set");
            }
            a2 = aVar.C();
            zq3.e(a2);
        } else {
            if (aVar.z() == null) {
                throw new IllegalStateException("Apollo: 'serverUrl' is required");
            }
            HttpNetworkTransport.a aVar2 = new HttpNetworkTransport.a();
            String z = aVar.z();
            zq3.e(z);
            HttpNetworkTransport.a e = aVar2.e(z);
            if (aVar.u() != null) {
                sa3 u = aVar.u();
                zq3.e(u);
                e.c(u);
            }
            if (aVar.v() != null) {
                Boolean v = aVar.v();
                zq3.e(v);
                e.b(v.booleanValue());
            }
            a2 = e.d(aVar.x()).a();
        }
        this.c = a2;
        if (aVar.H() == null) {
            String M = aVar.M();
            M = M == null ? aVar.z() : M;
            if (M == null) {
                a3 = a2;
            } else {
                WebSocketNetworkTransport.Builder f = new WebSocketNetworkTransport.Builder().f(M);
                if (aVar.I() != null) {
                    ie9 I = aVar.I();
                    zq3.e(I);
                    f.g(I);
                }
                if (aVar.J() != null) {
                    Long J = aVar.J();
                    zq3.e(J);
                    f.b(J.longValue());
                }
                if (aVar.N() != null) {
                    WsProtocol.a N = aVar.N();
                    zq3.e(N);
                    f.c(N);
                }
                if (aVar.L() != null) {
                    f.d(aVar.L());
                }
                if (aVar.K() != null) {
                    f.e(aVar.K());
                }
                a3 = f.a();
            }
        } else {
            if (aVar.M() != null) {
                throw new IllegalStateException("Apollo: 'webSocketServerUrl' has no effect if 'subscriptionNetworkTransport' is set");
            }
            if (aVar.I() != null) {
                throw new IllegalStateException("Apollo: 'webSocketEngine' has no effect if 'subscriptionNetworkTransport' is set");
            }
            if (aVar.J() != null) {
                throw new IllegalStateException("Apollo: 'webSocketIdleTimeoutMillis' has no effect if 'subscriptionNetworkTransport' is set");
            }
            if (aVar.N() != null) {
                throw new IllegalStateException("Apollo: 'wsProtocolFactory' has no effect if 'subscriptionNetworkTransport' is set");
            }
            if (aVar.L() != null) {
                throw new IllegalStateException("Apollo: 'webSocketReopenWhen' has no effect if 'subscriptionNetworkTransport' is set");
            }
            if (aVar.K() != null) {
                throw new IllegalStateException("Apollo: 'webSocketReopenServerUrl' has no effect if 'subscriptionNetworkTransport' is set");
            }
            a3 = aVar.H();
            zq3.e(a3);
        }
        this.d = a3;
        CoroutineDispatcher q = aVar.q();
        q = q == null ? gs1.a() : q;
        this.b = new lt0(q, CoroutineScopeKt.CoroutineScope(q));
        this.u = new x35(a2, a3);
    }
}
