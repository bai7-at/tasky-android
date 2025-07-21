package com.apollographql.apollo.network.http;

import com.apollographql.apollo.api.http.HttpMethod;
import com.apollographql.apollo.exception.ApolloNetworkException;
import defpackage.ab3;
import defpackage.an3;
import defpackage.by0;
import defpackage.c04;
import defpackage.db3;
import defpackage.hc1;
import defpackage.pa3;
import defpackage.qd0;
import defpackage.qm3;
import defpackage.qs2;
import defpackage.sa3;
import defpackage.ss2;
import defpackage.sy8;
import defpackage.ud5;
import defpackage.uo6;
import defpackage.va3;
import defpackage.ww8;
import defpackage.zq3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.collections.i;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
final class JvmHttpEngine implements sa3 {
    public static final a c = new a(null);
    private final qs2 a;
    private final c04 b;

    public static final class a {

        /* renamed from: com.apollographql.apollo.network.http.JvmHttpEngine$a$a, reason: collision with other inner class name */
        static final class C0142a implements ss2 {
            final /* synthetic */ Call a;

            C0142a(Call call) {
                this.a = call;
            }

            public final void b(Throwable th) {
                this.a.cancel();
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Throwable) obj);
                return ww8.a;
            }
        }

        public static final class b extends RequestBody {
            final /* synthetic */ pa3 a;

            b(pa3 pa3Var) {
                this.a = pa3Var;
            }

            @Override // okhttp3.RequestBody
            public long contentLength() {
                return this.a.getContentLength();
            }

            @Override // okhttp3.RequestBody
            public MediaType contentType() {
                return MediaType.Companion.get(this.a.getContentType());
            }

            @Override // okhttp3.RequestBody
            public boolean isOneShot() {
                return this.a instanceof sy8;
            }

            @Override // okhttp3.RequestBody
            public void writeTo(qd0 qd0Var) {
                zq3.h(qd0Var, "sink");
                this.a.a(qd0Var);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object a(Call.Factory factory, Request request, by0 by0Var) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
            cancellableContinuationImpl.initCancellability();
            Call newCall = factory.newCall(request);
            cancellableContinuationImpl.invokeOnCancellation(new C0142a(newCall));
            Response response = null;
            try {
                response = newCall.execute();
                e = null;
            } catch (IOException e) {
                e = e;
            }
            if (e != null) {
                Result.a aVar = Result.a;
                cancellableContinuationImpl.resumeWith(Result.b(f.a(new ApolloNetworkException("Failed to execute GraphQL http network request", e))));
            } else {
                Result.a aVar2 = Result.a;
                zq3.e(response);
                cancellableContinuationImpl.resumeWith(Result.b(response));
            }
            Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.a.h()) {
                hc1.c(by0Var);
            }
            return result;
        }

        public final db3 b(Response response) {
            zq3.h(response, "<this>");
            db3.a aVar = new db3.a(response.code());
            ResponseBody body = response.body();
            zq3.e(body);
            db3.a b2 = aVar.b(body.source());
            Headers headers = response.headers();
            an3 u = uo6.u(0, headers.size());
            ArrayList arrayList = new ArrayList(i.w(u, 10));
            Iterator it2 = u.iterator();
            while (it2.hasNext()) {
                int c = ((qm3) it2).c();
                arrayList.add(new va3(headers.name(c), headers.value(c)));
            }
            return b2.a(arrayList).c();
        }

        public final Request c(ab3 ab3Var) {
            zq3.h(ab3Var, "<this>");
            Request.Builder headers = new Request.Builder().url(ab3Var.d()).headers(ud5.e(ab3Var.b()));
            if (ab3Var.c() == HttpMethod.Get) {
                headers.get();
            } else {
                pa3 a = ab3Var.a();
                if (a == null) {
                    throw new IllegalStateException("HTTP POST requires a request body");
                }
                headers.post(new b(a));
            }
            return headers.build();
        }

        private a() {
        }
    }

    public JvmHttpEngine(qs2 qs2Var) {
        zq3.h(qs2Var, "httpCallFactory");
        this.a = qs2Var;
        this.b = kotlin.c.a(new qs2() { // from class: com.apollographql.apollo.network.http.b
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                Call.Factory h;
                h = JvmHttpEngine.h(JvmHttpEngine.this);
                return h;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Call.Factory d(Call.Factory factory) {
        return factory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Call.Factory h(JvmHttpEngine jvmHttpEngine) {
        return (Call.Factory) jvmHttpEngine.a.mo865invoke();
    }

    private final Call.Factory i() {
        return (Call.Factory) this.b.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.sa3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object M0(defpackage.ab3 r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.apollographql.apollo.network.http.JvmHttpEngine$execute$1
            if (r0 == 0) goto L13
            r0 = r7
            com.apollographql.apollo.network.http.JvmHttpEngine$execute$1 r0 = (com.apollographql.apollo.network.http.JvmHttpEngine$execute$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.apollographql.apollo.network.http.JvmHttpEngine$execute$1 r0 = new com.apollographql.apollo.network.http.JvmHttpEngine$execute$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            com.apollographql.apollo.network.http.JvmHttpEngine$a r5 = (com.apollographql.apollo.network.http.JvmHttpEngine.a) r5
            kotlin.f.b(r7)
            goto L50
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r7)
            com.apollographql.apollo.network.http.JvmHttpEngine$a r7 = com.apollographql.apollo.network.http.JvmHttpEngine.c
            okhttp3.Call$Factory r5 = r5.i()
            okhttp3.Request r6 = r7.c(r6)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r5 = r7.a(r5, r6, r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            r4 = r7
            r7 = r5
            r5 = r4
        L50:
            okhttp3.Response r7 = (okhttp3.Response) r7
            db3 r5 = r5.b(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.http.JvmHttpEngine.M0(ab3, by0):java.lang.Object");
    }

    @Override // defpackage.sa3, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JvmHttpEngine(final Call.Factory factory) {
        this(new qs2() { // from class: com.apollographql.apollo.network.http.c
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                Call.Factory d;
                d = JvmHttpEngine.d(Call.Factory.this);
                return d;
            }
        });
        zq3.h(factory, "httpCallFactory");
    }

    public JvmHttpEngine(long j) {
        this(j, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public JvmHttpEngine(long r3, long r5) {
        /*
            r2 = this;
            okhttp3.OkHttpClient$Builder r0 = defpackage.ud5.c()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            okhttp3.OkHttpClient$Builder r3 = r0.connectTimeout(r3, r1)
            okhttp3.OkHttpClient$Builder r3 = r3.readTimeout(r5, r1)
            okhttp3.OkHttpClient r3 = r3.build()
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.http.JvmHttpEngine.<init>(long, long):void");
    }
}
