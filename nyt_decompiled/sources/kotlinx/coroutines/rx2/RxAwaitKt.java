package kotlinx.coroutines.rx2;

import defpackage.by0;
import defpackage.hc1;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes5.dex */
public final class RxAwaitKt {
    public static final <T> Object awaitFirst(ObservableSource<T> observableSource, by0<? super T> by0Var) {
        return awaitOne$default(observableSource, Mode.FIRST, null, by0Var, 2, null);
    }

    public static final <T> Object awaitFirstOrDefault(ObservableSource<T> observableSource, T t, by0<? super T> by0Var) {
        return awaitOne(observableSource, Mode.FIRST_OR_DEFAULT, t, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object awaitFirstOrElse(io.reactivex.ObservableSource<T> r7, defpackage.qs2 r8, defpackage.by0<? super T> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.rx2.RxAwaitKt$awaitFirstOrElse$1
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.rx2.RxAwaitKt$awaitFirstOrElse$1 r0 = (kotlinx.coroutines.rx2.RxAwaitKt$awaitFirstOrElse$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            kotlinx.coroutines.rx2.RxAwaitKt$awaitFirstOrElse$1 r0 = new kotlinx.coroutines.rx2.RxAwaitKt$awaitFirstOrElse$1
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r7 = r4.L$0
            r8 = r7
            qs2 r8 = (defpackage.qs2) r8
            kotlin.f.b(r9)
            goto L4d
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            kotlin.f.b(r9)
            kotlinx.coroutines.rx2.Mode r9 = kotlinx.coroutines.rx2.Mode.FIRST_OR_DEFAULT
            r4.L$0 = r8
            r4.label = r2
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r7
            r2 = r9
            java.lang.Object r9 = awaitOne$default(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L4d
            return r0
        L4d:
            if (r9 != 0) goto L53
            java.lang.Object r9 = r8.mo865invoke()
        L53:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.RxAwaitKt.awaitFirstOrElse(io.reactivex.ObservableSource, qs2, by0):java.lang.Object");
    }

    public static final <T> Object awaitFirstOrNull(ObservableSource<T> observableSource, by0<? super T> by0Var) {
        return awaitOne$default(observableSource, Mode.FIRST_OR_DEFAULT, null, by0Var, 2, null);
    }

    public static final <T> Object awaitLast(ObservableSource<T> observableSource, by0<? super T> by0Var) {
        return awaitOne$default(observableSource, Mode.LAST, null, by0Var, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object awaitOne(ObservableSource<T> observableSource, final Mode mode, final T t, by0<? super T> by0Var) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        observableSource.subscribe(new Observer<T>() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$awaitOne$2$1
            private boolean seenValue;
            private Disposable subscription;
            private T value;

            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Mode.values().length];
                    try {
                        iArr[Mode.FIRST.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Mode.FIRST_OR_DEFAULT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Mode.LAST.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Mode.SINGLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                if (this.seenValue) {
                    if (cancellableContinuationImpl.isActive()) {
                        CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl;
                        Result.a aVar = Result.a;
                        cancellableContinuation.resumeWith(Result.b(this.value));
                        return;
                    }
                    return;
                }
                if (mode == Mode.FIRST_OR_DEFAULT) {
                    CancellableContinuation<T> cancellableContinuation2 = cancellableContinuationImpl;
                    Result.a aVar2 = Result.a;
                    cancellableContinuation2.resumeWith(Result.b(t));
                } else if (cancellableContinuationImpl.isActive()) {
                    CancellableContinuation<T> cancellableContinuation3 = cancellableContinuationImpl;
                    Result.a aVar3 = Result.a;
                    cancellableContinuation3.resumeWith(Result.b(f.a(new NoSuchElementException("No value received via onNext for " + mode))));
                }
            }

            @Override // io.reactivex.Observer
            public void onError(Throwable th) {
                CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl;
                Result.a aVar = Result.a;
                cancellableContinuation.resumeWith(Result.b(f.a(th)));
            }

            @Override // io.reactivex.Observer
            public void onNext(T t2) {
                int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
                Disposable disposable = null;
                if (i == 1 || i == 2) {
                    if (this.seenValue) {
                        return;
                    }
                    this.seenValue = true;
                    cancellableContinuationImpl.resumeWith(Result.b(t2));
                    Disposable disposable2 = this.subscription;
                    if (disposable2 == null) {
                        zq3.z("subscription");
                    } else {
                        disposable = disposable2;
                    }
                    disposable.dispose();
                    return;
                }
                if (i == 3 || i == 4) {
                    if (mode != Mode.SINGLE || !this.seenValue) {
                        this.value = t2;
                        this.seenValue = true;
                        return;
                    }
                    if (cancellableContinuationImpl.isActive()) {
                        CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl;
                        Result.a aVar = Result.a;
                        cancellableContinuation.resumeWith(Result.b(f.a(new IllegalArgumentException("More than one onNext value for " + mode))));
                    }
                    Disposable disposable3 = this.subscription;
                    if (disposable3 == null) {
                        zq3.z("subscription");
                    } else {
                        disposable = disposable3;
                    }
                    disposable.dispose();
                }
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(final Disposable disposable) {
                this.subscription = disposable;
                cancellableContinuationImpl.invokeOnCancellation(new ss2() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$awaitOne$2$1$onSubscribe$1
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Throwable) obj);
                        return ww8.a;
                    }

                    public final void invoke(Throwable th) {
                        Disposable.this.dispose();
                    }
                });
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }

    static /* synthetic */ Object awaitOne$default(ObservableSource observableSource, Mode mode, Object obj, by0 by0Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        return awaitOne(observableSource, mode, obj, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object awaitOrDefault(io.reactivex.MaybeSource r4, java.lang.Object r5, defpackage.by0 r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.rx2.RxAwaitKt$awaitOrDefault$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.rx2.RxAwaitKt$awaitOrDefault$1 r0 = (kotlinx.coroutines.rx2.RxAwaitKt$awaitOrDefault$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.rx2.RxAwaitKt$awaitOrDefault$1 r0 = new kotlinx.coroutines.rx2.RxAwaitKt$awaitOrDefault$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            kotlin.f.b(r6)
            goto L41
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.f.b(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = awaitSingleOrNull(r4, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            if (r6 != 0) goto L44
            goto L45
        L44:
            r5 = r6
        L45:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.RxAwaitKt.awaitOrDefault(io.reactivex.MaybeSource, java.lang.Object, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object awaitSingle(io.reactivex.MaybeSource<T> r4, defpackage.by0<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.rx2.RxAwaitKt$awaitSingle$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.rx2.RxAwaitKt$awaitSingle$1 r0 = (kotlinx.coroutines.rx2.RxAwaitKt$awaitSingle$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.rx2.RxAwaitKt$awaitSingle$1 r0 = new kotlinx.coroutines.rx2.RxAwaitKt$awaitSingle$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r5)
            r0.label = r3
            java.lang.Object r5 = awaitSingleOrNull(r4, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            if (r5 == 0) goto L40
            return r5
        L40:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.rx2.RxAwaitKt.awaitSingle(io.reactivex.MaybeSource, by0):java.lang.Object");
    }

    public static final <T> Object awaitSingleOrNull(MaybeSource<T> maybeSource, by0<? super T> by0Var) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        maybeSource.subscribe(new MaybeObserver<T>() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$awaitSingleOrNull$2$1
            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                cancellableContinuationImpl.resumeWith(Result.b(null));
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl;
                Result.a aVar = Result.a;
                cancellableContinuation.resumeWith(Result.b(f.a(th)));
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(Disposable disposable) {
                RxAwaitKt.disposeOnCancellation(cancellableContinuationImpl, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(T t) {
                cancellableContinuationImpl.resumeWith(Result.b(t));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }

    public static final void disposeOnCancellation(CancellableContinuation<?> cancellableContinuation, final Disposable disposable) {
        cancellableContinuation.invokeOnCancellation(new ss2() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$disposeOnCancellation$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                Disposable.this.dispose();
            }
        });
    }

    public static final Object await(CompletableSource completableSource, by0<? super ww8> by0Var) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        completableSource.subscribe(new CompletableObserver() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$await$2$1
            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                CancellableContinuation<ww8> cancellableContinuation = cancellableContinuationImpl;
                Result.a aVar = Result.a;
                cancellableContinuation.resumeWith(Result.b(ww8.a));
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                CancellableContinuation<ww8> cancellableContinuation = cancellableContinuationImpl;
                Result.a aVar = Result.a;
                cancellableContinuation.resumeWith(Result.b(f.a(th)));
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(Disposable disposable) {
                RxAwaitKt.disposeOnCancellation(cancellableContinuationImpl, disposable);
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == a.h()) {
            hc1.c(by0Var);
        }
        return result == a.h() ? result : ww8.a;
    }

    public static final <T> Object awaitSingle(ObservableSource<T> observableSource, by0<? super T> by0Var) {
        return awaitOne$default(observableSource, Mode.SINGLE, null, by0Var, 2, null);
    }

    public static final <T> Object await(SingleSource<T> singleSource, by0<? super T> by0Var) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        singleSource.subscribe(new SingleObserver<T>() { // from class: kotlinx.coroutines.rx2.RxAwaitKt$await$5$1
            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl;
                Result.a aVar = Result.a;
                cancellableContinuation.resumeWith(Result.b(f.a(th)));
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(Disposable disposable) {
                RxAwaitKt.disposeOnCancellation(cancellableContinuationImpl, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(T t) {
                cancellableContinuationImpl.resumeWith(Result.b(t));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }
}
