package retrofit2;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.by0;
import defpackage.hc1;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.f;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes5.dex */
public final class KotlinExtensions {
    public static final <T> Object await(final Call<T> call, by0<? super T> by0Var) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new ss2() { // from class: retrofit2.KotlinExtensions$await$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                call.cancel();
            }
        });
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable th) {
                zq3.h(call2, "call");
                zq3.h(th, QueryKeys.TOKEN);
                CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl;
                Result.a aVar = Result.a;
                cancellableContinuation.resumeWith(Result.b(f.a(th)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                zq3.h(call2, "call");
                zq3.h(response, "response");
                if (!response.isSuccessful()) {
                    CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl;
                    Result.a aVar = Result.a;
                    cancellableContinuation.resumeWith(Result.b(f.a(new HttpException(response))));
                    return;
                }
                T body = response.body();
                if (body != null) {
                    cancellableContinuationImpl.resumeWith(Result.b(body));
                    return;
                }
                Object tag = call2.request().tag(Invocation.class);
                zq3.e(tag);
                Invocation invocation = (Invocation) tag;
                KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException("Response from " + invocation.service().getName() + '.' + invocation.method().getName() + " was null but response body type was declared as non-null");
                CancellableContinuation<T> cancellableContinuation2 = cancellableContinuationImpl;
                Result.a aVar2 = Result.a;
                cancellableContinuation2.resumeWith(Result.b(f.a(kotlinNullPointerException)));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }

    public static final <T> Object awaitNullable(final Call<T> call, by0<? super T> by0Var) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new ss2() { // from class: retrofit2.KotlinExtensions$await$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                call.cancel();
            }
        });
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable th) {
                zq3.h(call2, "call");
                zq3.h(th, QueryKeys.TOKEN);
                CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl;
                Result.a aVar = Result.a;
                cancellableContinuation.resumeWith(Result.b(f.a(th)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                zq3.h(call2, "call");
                zq3.h(response, "response");
                if (response.isSuccessful()) {
                    CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl;
                    Result.a aVar = Result.a;
                    cancellableContinuation.resumeWith(Result.b(response.body()));
                } else {
                    CancellableContinuation<T> cancellableContinuation2 = cancellableContinuationImpl;
                    Result.a aVar2 = Result.a;
                    cancellableContinuation2.resumeWith(Result.b(f.a(new HttpException(response))));
                }
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }

    public static final <T> Object awaitResponse(final Call<T> call, by0<? super Response<T>> by0Var) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new ss2() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                call.cancel();
            }
        });
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable th) {
                zq3.h(call2, "call");
                zq3.h(th, QueryKeys.TOKEN);
                CancellableContinuation<Response<T>> cancellableContinuation = cancellableContinuationImpl;
                Result.a aVar = Result.a;
                cancellableContinuation.resumeWith(Result.b(f.a(th)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                zq3.h(call2, "call");
                zq3.h(response, "response");
                cancellableContinuationImpl.resumeWith(Result.b(response));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }

    public static final Object awaitUnit(Call<ww8> call, by0<? super ww8> by0Var) {
        zq3.f(call, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return awaitNullable(call, by0Var);
    }

    public static final /* synthetic */ <T> T create(Retrofit retrofit) {
        zq3.h(retrofit, "<this>");
        zq3.n(4, "T");
        T t = (T) retrofit.create(Object.class);
        zq3.g(t, "create(...)");
        return t;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object suspendAndThrow(final java.lang.Throwable r4, defpackage.by0<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions$suspendAndThrow$1
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions$suspendAndThrow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.L$0
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            kotlin.f.b(r5)
            goto L5c
        L35:
            kotlin.f.b(r5)
            r0.L$0 = r4
            r0.label = r3
            kotlinx.coroutines.CoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getDefault()
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            retrofit2.KotlinExtensions$suspendAndThrow$2$1 r3 = new retrofit2.KotlinExtensions$suspendAndThrow$2$1
            r3.<init>()
            r5.mo937dispatch(r2, r3)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.h()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.h()
            if (r4 != r5) goto L59
            defpackage.hc1.c(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.suspendAndThrow(java.lang.Throwable, by0):java.lang.Object");
    }
}
