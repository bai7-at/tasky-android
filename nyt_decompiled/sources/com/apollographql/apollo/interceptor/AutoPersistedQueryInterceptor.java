package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.api.http.HttpMethod;
import defpackage.f00;
import defpackage.jz4;
import defpackage.q22;
import defpackage.uj;
import defpackage.vj;
import defpackage.xj;
import defpackage.yj;
import defpackage.zq3;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes2.dex */
public final class AutoPersistedQueryInterceptor implements uj {
    public static final a c = new a(null);
    private final HttpMethod a;
    private final HttpMethod b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public AutoPersistedQueryInterceptor(HttpMethod httpMethod, HttpMethod httpMethod2) {
        zq3.h(httpMethod, "httpMethodForHashedQueries");
        zq3.h(httpMethod2, "httpMethodForDocumentQueries");
        this.a = httpMethod;
        this.b = httpMethod2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f(List list) {
        if (list == null) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (h.w(((q22) it2.next()).b(), "PersistedQueryNotFound", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g(List list) {
        if (list == null) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (h.w(((q22) it2.next()).b(), "PersistedQueryNotSupported", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yj h(yj yjVar, boolean z) {
        return yjVar.d().a(new f00(z)).b();
    }

    @Override // defpackage.uj
    public Flow a(xj xjVar, vj vjVar) {
        zq3.h(xjVar, "request");
        zq3.h(vjVar, "chain");
        Boolean b = xjVar.b();
        if (!(b != null ? b.booleanValue() : true)) {
            return vjVar.a(xjVar);
        }
        boolean z = xjVar.g() instanceof jz4;
        return FlowKt.flow(new AutoPersistedQueryInterceptor$intercept$1(vjVar, xjVar.l().r(z ? HttpMethod.Post : this.a).w(Boolean.FALSE).v(Boolean.TRUE).b(), this, z, null));
    }
}
