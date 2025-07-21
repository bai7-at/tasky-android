package com.apollographql.apollo.network.http;

import androidx.recyclerview.widget.RecyclerView;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloHttpException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.internal.MultipartKt;
import defpackage.ab3;
import defpackage.bb3;
import defpackage.by0;
import defpackage.db3;
import defpackage.fc1;
import defpackage.ii5;
import defpackage.j55;
import defpackage.m62;
import defpackage.o29;
import defpackage.sa3;
import defpackage.sd0;
import defpackage.ti5;
import defpackage.w41;
import defpackage.ww8;
import defpackage.xa3;
import defpackage.xh1;
import defpackage.xj;
import defpackage.ya3;
import defpackage.yj;
import defpackage.za3;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes2.dex */
public final class HttpNetworkTransport implements j55 {
    private static final b f = new b(null);
    private final bb3 a;
    private final sa3 b;
    private final List c;
    private final boolean d;
    private final c e;

    public static final class a {
        private bb3 a;
        private String b;
        private sa3 c;
        private boolean e;
        private final List d = new ArrayList();
        private final List f = new ArrayList();

        public final HttpNetworkTransport a() {
            bb3 bb3Var = this.a;
            if (bb3Var != null && this.b != null) {
                throw new IllegalStateException("It is an error to set both 'httpRequestComposer' and 'serverUrl'");
            }
            if (bb3Var == null) {
                String str = this.b;
                bb3Var = str != null ? new xh1(str) : null;
                if (bb3Var == null) {
                    throw new IllegalStateException("No HttpRequestComposer found. Use 'httpRequestComposer' or 'serverUrl'");
                }
            }
            bb3 bb3Var2 = bb3Var;
            if (!this.f.isEmpty()) {
                this.d.add(new d(this.f));
            }
            sa3 sa3Var = this.c;
            if (sa3Var == null) {
                sa3Var = com.apollographql.apollo.network.http.a.c(0L, 1, null);
            }
            return new HttpNetworkTransport(bb3Var2, sa3Var, this.d, this.e, null);
        }

        public final a b(boolean z) {
            this.e = z;
            return this;
        }

        public final a c(sa3 sa3Var) {
            zq3.h(sa3Var, "httpEngine");
            this.c = sa3Var;
            return this;
        }

        public final a d(List list) {
            zq3.h(list, "interceptors");
            this.d.clear();
            this.d.addAll(list);
            return this;
        }

        public final a e(String str) {
            zq3.h(str, "serverUrl");
            this.b = str;
            return this;
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public final class c implements ya3 {
        public c() {
        }

        @Override // defpackage.ya3
        public Object a(ab3 ab3Var, za3 za3Var, by0 by0Var) {
            return HttpNetworkTransport.this.b.M0(ab3Var, by0Var);
        }
    }

    private static final class d implements ya3 {
        private final List a;

        public d(List list) {
            zq3.h(list, "headers");
            this.a = list;
        }

        @Override // defpackage.ya3
        public Object a(ab3 ab3Var, za3 za3Var, by0 by0Var) {
            return za3Var.a(ab3.f(ab3Var, null, null, 3, null).c(this.a).e(), by0Var);
        }
    }

    public /* synthetic */ HttpNetworkTransport(bb3 bb3Var, sa3 sa3Var, List list, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(bb3Var, sa3Var, list, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yj i(ii5 ii5Var, Throwable th) {
        ApolloException apolloNetworkException = th instanceof ApolloException ? (ApolloException) th : new ApolloNetworkException("Error while reading JSON response", th);
        UUID randomUUID = UUID.randomUUID();
        zq3.g(randomUUID, "randomUUID(...)");
        return new yj.a(ii5Var, randomUUID).e(apolloNetworkException).g(true).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow j(ii5 ii5Var, db3 db3Var) {
        sd0 sd0Var;
        if (this.d) {
            sd0Var = db3Var.a();
        } else {
            sd0 a2 = db3Var.a();
            if (a2 != null) {
                a2.close();
            }
            sd0Var = null;
        }
        sd0 sd0Var2 = sd0Var;
        return FlowKt.flowOf(i(ii5Var, new ApolloHttpException(db3Var.c(), db3Var.b(), sd0Var2, "Http request failed with status code `" + db3Var.c() + "`", null, 16, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow m(final ii5 ii5Var, final w41 w41Var, db3 db3Var) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        final Flow e = MultipartKt.e(db3Var);
        return FlowKt.m911catch(new Flow() { // from class: com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1

            /* renamed from: com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ ii5 b;
                final /* synthetic */ w41 c;
                final /* synthetic */ HttpNetworkTransport d;
                final /* synthetic */ Ref$ObjectRef e;

                @fc1(c = "com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2", f = "HttpNetworkTransport.kt", l = {281}, m = "emit")
                /* renamed from: com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(by0 by0Var) {
                        super(by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, ii5 ii5Var, w41 w41Var, HttpNetworkTransport httpNetworkTransport, Ref$ObjectRef ref$ObjectRef) {
                    this.a = flowCollector;
                    this.b = ii5Var;
                    this.c = w41Var;
                    this.d = httpNetworkTransport;
                    this.e = ref$ObjectRef;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                /* JADX WARN: Type inference failed for: r4v6, types: [T, il1] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r12, defpackage.by0 r13) {
                    /*
                        r11 = this;
                        boolean r0 = r13 instanceof com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r13
                        com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1 r0 = (com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1 r0 = new com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1$2$1
                        r0.<init>(r13)
                    L18:
                        java.lang.Object r13 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        kotlin.f.b(r13)
                        goto La5
                    L2a:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r12)
                        throw r11
                    L32:
                        kotlin.f.b(r13)
                        kotlinx.coroutines.flow.FlowCollector r13 = r11.a
                        sd0 r12 = (defpackage.sd0) r12
                        kotlin.jvm.internal.Ref$ObjectRef r2 = r11.e
                        T r4 = r2.element
                        if (r4 != 0) goto L46
                        il1 r4 = new il1
                        r4.<init>()
                        r2.element = r4
                    L46:
                        kotlin.jvm.internal.Ref$ObjectRef r2 = r11.e
                        T r2 = r2.element
                        defpackage.zq3.e(r2)
                        il1 r2 = (defpackage.il1) r2
                        java.util.Map r12 = r2.f(r12)
                        kotlin.jvm.internal.Ref$ObjectRef r2 = r11.e
                        T r2 = r2.element
                        defpackage.zq3.e(r2)
                        il1 r2 = (defpackage.il1) r2
                        java.util.Set r8 = r2.c()
                        kotlin.jvm.internal.Ref$ObjectRef r2 = r11.e
                        T r2 = r2.element
                        defpackage.zq3.e(r2)
                        il1 r2 = (defpackage.il1) r2
                        boolean r2 = r2.b()
                        r2 = r2 ^ r3
                        kotlin.jvm.internal.Ref$ObjectRef r4 = r11.e
                        T r4 = r4.element
                        defpackage.zq3.e(r4)
                        il1 r4 = (defpackage.il1) r4
                        boolean r4 = r4.d()
                        if (r4 == 0) goto L7f
                        r11 = 0
                        goto L9a
                    L7f:
                        com.apollographql.apollo.api.json.JsonReader r4 = com.apollographql.apollo.api.json.a.c(r12)
                        ii5 r5 = r11.b
                        w41 r7 = r11.c
                        r9 = 2
                        r10 = 0
                        r6 = 0
                        yj r11 = defpackage.ti5.b(r4, r5, r6, r7, r8, r9, r10)
                        yj$a r11 = r11.d()
                        yj$a r11 = r11.g(r2)
                        yj r11 = r11.b()
                    L9a:
                        if (r11 == 0) goto La5
                        r0.label = r3
                        java.lang.Object r11 = r13.emit(r11, r0)
                        if (r11 != r1) goto La5
                        return r1
                    La5:
                        ww8 r11 = defpackage.ww8.a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.http.HttpNetworkTransport$multipleResponses$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, ii5Var, w41Var, this, ref$ObjectRef), by0Var);
                return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
            }
        }, new HttpNetworkTransport$multipleResponses$2(ii5Var, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow n(ii5 ii5Var, w41 w41Var, db3 db3Var) {
        sd0 a2 = db3Var.a();
        zq3.e(a2);
        return FlowKt.flowOf(ti5.b(com.apollographql.apollo.api.json.a.b(a2), ii5Var, null, w41Var, null, 2, null).d().g(true).b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yj o(yj yjVar, UUID uuid, db3 db3Var, long j) {
        yj.a h = yjVar.d().h(uuid);
        if (db3Var != null) {
            h.a(new xa3(j, o29.a(), db3Var.c(), db3Var.b()));
        }
        return h.b();
    }

    @Override // defpackage.j55
    public Flow a(xj xjVar) {
        zq3.h(xjVar, "request");
        m62.b b2 = xjVar.c().b(w41.h);
        zq3.e(b2);
        return k(xjVar, this.a.a(xjVar), (w41) b2);
    }

    @Override // defpackage.j55
    public void dispose() {
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            ((ya3) it2.next()).dispose();
        }
        this.b.close();
    }

    public final Flow k(xj xjVar, ab3 ab3Var, w41 w41Var) {
        zq3.h(xjVar, "request");
        zq3.h(ab3Var, "httpRequest");
        zq3.h(w41Var, "customScalarAdapters");
        return FlowKt.flow(new HttpNetworkTransport$execute$1(this, ab3Var, xjVar, w41Var, null));
    }

    public final List l() {
        return this.c;
    }

    private HttpNetworkTransport(bb3 bb3Var, sa3 sa3Var, List list, boolean z) {
        this.a = bb3Var;
        this.b = sa3Var;
        this.c = list;
        this.d = z;
        this.e = new c();
    }
}
