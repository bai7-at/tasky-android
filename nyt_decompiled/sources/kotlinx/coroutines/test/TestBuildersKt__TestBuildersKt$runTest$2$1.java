package kotlinx.coroutines.test;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.sequences.d;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.YieldKt;

@fc1(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1", f = "TestBuilders.kt", l = {334, 360, 365}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class TestBuildersKt__TestBuildersKt$runTest$2$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ TestScopeImpl $scope;
    final /* synthetic */ gt2 $testBody;
    final /* synthetic */ TestScope $this_runTest;
    final /* synthetic */ long $timeout;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    @fc1(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1$1", f = "TestBuilders.kt", l = {315, 316}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ gt2 $testBody;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(gt2 gt2Var, by0<? super AnonymousClass1> by0Var) {
            super(2, by0Var);
            this.$testBody = gt2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0<ww8> create(Object obj, by0<?> by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$testBody, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TestScopeImpl testScopeImpl;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                testScopeImpl = (TestScopeImpl) this.L$0;
                this.L$0 = testScopeImpl;
                this.label = 1;
                if (YieldKt.yield(this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                    return ww8.a;
                }
                testScopeImpl = (TestScopeImpl) this.L$0;
                f.b(obj);
            }
            gt2 gt2Var = this.$testBody;
            this.L$0 = null;
            this.label = 2;
            if (gt2Var.invoke(testScopeImpl, this) == h) {
                return h;
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(TestScopeImpl testScopeImpl, by0<? super ww8> by0Var) {
            return ((AnonymousClass1) create(testScopeImpl, by0Var)).invokeSuspend(ww8.a);
        }
    }

    @fc1(c = "kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1$2", f = "TestBuilders.kt", l = {356, 357}, m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        final /* synthetic */ Ref$ObjectRef<CancellationException> $cancellationException;
        final /* synthetic */ TestScopeImpl $scope;
        final /* synthetic */ long $timeout;
        final /* synthetic */ Ref$ObjectRef<Throwable> $timeoutError;
        final /* synthetic */ Job $workRunner;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(TestScopeImpl testScopeImpl, Job job, long j, Ref$ObjectRef<Throwable> ref$ObjectRef, Ref$ObjectRef<CancellationException> ref$ObjectRef2, by0<? super AnonymousClass2> by0Var) {
            super(2, by0Var);
            this.$scope = testScopeImpl;
            this.$workRunner = job;
            this.$timeout = j;
            this.$timeoutError = ref$ObjectRef;
            this.$cancellationException = ref$ObjectRef2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0<ww8> create(Object obj, by0<?> by0Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$scope, this.$workRunner, this.$timeout, this.$timeoutError, this.$cancellationException, by0Var);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                Job job = JobKt.getJob(((CoroutineScope) this.L$0).getCoroutineContext());
                final TestScopeImpl testScopeImpl = this.$scope;
                final long j = this.$timeout;
                final Ref$ObjectRef<Throwable> ref$ObjectRef = this.$timeoutError;
                final Ref$ObjectRef<CancellationException> ref$ObjectRef2 = this.$cancellationException;
                Job.DefaultImpls.invokeOnCompletion$default(job, true, false, new ss2() { // from class: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt.runTest.2.1.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((Throwable) obj2);
                        return ww8.a;
                    }

                    /* JADX WARN: Type inference failed for: r0v5, types: [T, kotlinx.coroutines.test.UncompletedCoroutinesError] */
                    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.util.concurrent.CancellationException] */
                    public final void invoke(Throwable th) {
                        if (th instanceof TimeoutCancellationException) {
                            TestBuildersJvmKt.dumpCoroutines();
                            List w = d.w(d.j(TestScopeImpl.this.getChildren(), new PropertyReference1Impl() { // from class: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1$2$1$activeChildren$1
                                @Override // kotlin.jvm.internal.PropertyReference1Impl, defpackage.kv3
                                public Object get(Object obj2) {
                                    return Boolean.valueOf(((Job) obj2).isActive());
                                }
                            }));
                            Throwable tryGetCompletionCause = TestScopeImpl.this.isCancelled() ? TestScopeImpl.this.tryGetCompletionCause() : null;
                            String str = "After waiting for " + ((Object) b.L(j));
                            if (tryGetCompletionCause == null) {
                                str = str + ", the test coroutine is not completing";
                            }
                            if (!w.isEmpty()) {
                                str = str + ", there were active child jobs: " + w;
                            }
                            if (tryGetCompletionCause != null && w.isEmpty()) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(str);
                                sb.append(TestScopeImpl.this.isCompleted() ? ", the test coroutine completed" : ", the test coroutine was not completed");
                                str = sb.toString();
                            }
                            ref$ObjectRef.element = new UncompletedCoroutinesError(str);
                            ref$ObjectRef2.element = new CancellationException("The test timed out");
                            TestScopeImpl testScopeImpl2 = TestScopeImpl.this;
                            zq3.f(testScopeImpl2, "null cannot be cast to non-null type kotlinx.coroutines.Job");
                            CancellationException cancellationException = ref$ObjectRef2.element;
                            zq3.e(cancellationException);
                            testScopeImpl2.cancel(cancellationException);
                        }
                    }
                }, 2, null);
                TestScopeImpl testScopeImpl2 = this.$scope;
                this.label = 1;
                if (testScopeImpl2.join(this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                    return ww8.a;
                }
                f.b(obj);
            }
            Job job2 = this.$workRunner;
            this.label = 2;
            if (JobKt.cancelAndJoin(job2, this) == h) {
                return h;
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
            return ((AnonymousClass2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TestBuildersKt__TestBuildersKt$runTest$2$1(TestScopeImpl testScopeImpl, long j, TestScope testScope, gt2 gt2Var, by0<? super TestBuildersKt__TestBuildersKt$runTest$2$1> by0Var) {
        super(2, by0Var);
        this.$scope = testScopeImpl;
        this.$timeout = j;
        this.$this_runTest = testScope;
        this.$testBody = gt2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        TestBuildersKt__TestBuildersKt$runTest$2$1 testBuildersKt__TestBuildersKt$runTest$2$1 = new TestBuildersKt__TestBuildersKt$runTest$2$1(this.$scope, this.$timeout, this.$this_runTest, this.$testBody, by0Var);
        testBuildersKt__TestBuildersKt$runTest$2$1.L$0 = obj;
        return testBuildersKt__TestBuildersKt$runTest$2$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x013a, code lost:
    
        if (r2 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00dd, code lost:
    
        kotlinx.coroutines.test.TestBuildersKt.throwAll(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x013f, code lost:
    
        return defpackage.ww8.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d7, code lost:
    
        r2 = r20.$scope.getCompletionExceptionOrNull();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d5, code lost:
    
        if (r2 == null) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f6  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v25 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.test.TestBuildersKt__TestBuildersKt$runTest$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
        return ((TestBuildersKt__TestBuildersKt$runTest$2$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
