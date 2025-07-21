package com.nytimes.android.comments.writenewcomment.data.remote.newcomment;

import android.app.Application;
import com.comscore.streaming.EventType;
import com.nytimes.android.comments.R;
import com.nytimes.android.comments.writenewcomment.data.remote.newcomment.SubmitNewCommentResult;
import com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentApi;
import com.nytimes.android.coroutinesutils.FetchResult;
import com.nytimes.android.coroutinesutils.FetchResultKt;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentRemoteDataSource$submitNewComment$2", f = "WriteNewCommentRemoteDataSource.kt", l = {24, EventType.CDN, 30, 32}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WriteNewCommentRemoteDataSource$submitNewComment$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ WriteNewCommentBody $writeNewCommentBody;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WriteNewCommentRemoteDataSource this$0;

    @fc1(c = "com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentRemoteDataSource$submitNewComment$2$1", f = "WriteNewCommentRemoteDataSource.kt", l = {27}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentRemoteDataSource$submitNewComment$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ WriteNewCommentBody $writeNewCommentBody;
        int label;
        final /* synthetic */ WriteNewCommentRemoteDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(WriteNewCommentRemoteDataSource writeNewCommentRemoteDataSource, WriteNewCommentBody writeNewCommentBody, by0<? super AnonymousClass1> by0Var) {
            super(2, by0Var);
            this.this$0 = writeNewCommentRemoteDataSource;
            this.$writeNewCommentBody = writeNewCommentBody;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0<ww8> create(Object obj, by0<?> by0Var) {
            return new AnonymousClass1(this.this$0, this.$writeNewCommentBody, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            WriteNewCommentApi writeNewCommentApi;
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                writeNewCommentApi = this.this$0.writeNewCommentApi;
                WriteNewCommentBody writeNewCommentBody = this.$writeNewCommentBody;
                this.label = 1;
                obj = WriteNewCommentApi.DefaultImpls.submitNewComment$default(writeNewCommentApi, null, null, writeNewCommentBody, this, 3, null);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return obj;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0<? super FetchResult<WriteNewCommentResponse>> by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    @fc1(c = "com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentRemoteDataSource$submitNewComment$2$2", f = "WriteNewCommentRemoteDataSource.kt", l = {31}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentRemoteDataSource$submitNewComment$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements gt2 {
        final /* synthetic */ FlowCollector<SubmitNewCommentResult> $$this$flow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(FlowCollector<? super SubmitNewCommentResult> flowCollector, by0<? super AnonymousClass2> by0Var) {
            super(2, by0Var);
            this.$$this$flow = flowCollector;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0<ww8> create(Object obj, by0<?> by0Var) {
            return new AnonymousClass2(this.$$this$flow, by0Var);
        }

        @Override // defpackage.gt2
        public final Object invoke(WriteNewCommentResponse writeNewCommentResponse, by0<? super ww8> by0Var) {
            return ((AnonymousClass2) create(writeNewCommentResponse, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                FlowCollector<SubmitNewCommentResult> flowCollector = this.$$this$flow;
                SubmitNewCommentResult.Success success = SubmitNewCommentResult.Success.INSTANCE;
                this.label = 1;
                if (flowCollector.emit(success, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return ww8.a;
        }
    }

    @fc1(c = "com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentRemoteDataSource$submitNewComment$2$3", f = "WriteNewCommentRemoteDataSource.kt", l = {41}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentRemoteDataSource$submitNewComment$2$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements gt2 {
        final /* synthetic */ FlowCollector<SubmitNewCommentResult> $$this$flow;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ WriteNewCommentRemoteDataSource this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(FlowCollector<? super SubmitNewCommentResult> flowCollector, WriteNewCommentRemoteDataSource writeNewCommentRemoteDataSource, by0<? super AnonymousClass3> by0Var) {
            super(2, by0Var);
            this.$$this$flow = flowCollector;
            this.this$0 = writeNewCommentRemoteDataSource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0<ww8> create(Object obj, by0<?> by0Var) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$$this$flow, this.this$0, by0Var);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            Application application;
            Object h = a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                Throwable th = (Throwable) this.L$0;
                if (th != null) {
                    WriteNewCommentRemoteDataSource writeNewCommentRemoteDataSource = this.this$0;
                    if (FetchResultKt.b(th)) {
                        application = writeNewCommentRemoteDataSource.application;
                        str = application.getString(R.string.no_network_message);
                    } else {
                        str = th.getMessage();
                    }
                } else {
                    str = null;
                }
                FlowCollector<SubmitNewCommentResult> flowCollector = this.$$this$flow;
                SubmitNewCommentResult.Error error = new SubmitNewCommentResult.Error(str);
                this.label = 1;
                if (flowCollector.emit(error, this) == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(Throwable th, by0<? super ww8> by0Var) {
            return ((AnonymousClass3) create(th, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WriteNewCommentRemoteDataSource$submitNewComment$2(WriteNewCommentRemoteDataSource writeNewCommentRemoteDataSource, WriteNewCommentBody writeNewCommentBody, by0<? super WriteNewCommentRemoteDataSource$submitNewComment$2> by0Var) {
        super(2, by0Var);
        this.this$0 = writeNewCommentRemoteDataSource;
        this.$writeNewCommentBody = writeNewCommentBody;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        WriteNewCommentRemoteDataSource$submitNewComment$2 writeNewCommentRemoteDataSource$submitNewComment$2 = new WriteNewCommentRemoteDataSource$submitNewComment$2(this.this$0, this.$writeNewCommentBody, by0Var);
        writeNewCommentRemoteDataSource$submitNewComment$2.L$0 = obj;
        return writeNewCommentRemoteDataSource$submitNewComment$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r9.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L3a
            if (r1 == r5) goto L32
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            kotlin.f.b(r10)
            goto L8f
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L22:
            java.lang.Object r1 = r9.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.f.b(r10)
            goto L7b
        L2a:
            java.lang.Object r1 = r9.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.f.b(r10)
            goto L69
        L32:
            java.lang.Object r1 = r9.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.f.b(r10)
            goto L4f
        L3a:
            kotlin.f.b(r10)
            java.lang.Object r10 = r9.L$0
            r1 = r10
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            com.nytimes.android.comments.writenewcomment.data.remote.newcomment.SubmitNewCommentResult$Loading r10 = com.nytimes.android.comments.writenewcomment.data.remote.newcomment.SubmitNewCommentResult.Loading.INSTANCE
            r9.L$0 = r1
            r9.label = r5
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L4f
            return r0
        L4f:
            com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentRemoteDataSource r10 = r9.this$0
            kotlinx.coroutines.CoroutineDispatcher r10 = com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentRemoteDataSource.access$getIoDispatcher$p(r10)
            com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentRemoteDataSource$submitNewComment$2$1 r5 = new com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentRemoteDataSource$submitNewComment$2$1
            com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentRemoteDataSource r7 = r9.this$0
            com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentBody r8 = r9.$writeNewCommentBody
            r5.<init>(r7, r8, r6)
            r9.L$0 = r1
            r9.label = r4
            java.lang.Object r10 = kotlinx.coroutines.BuildersKt.withContext(r10, r5, r9)
            if (r10 != r0) goto L69
            return r0
        L69:
            com.nytimes.android.coroutinesutils.FetchResult r10 = (com.nytimes.android.coroutinesutils.FetchResult) r10
            com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentRemoteDataSource$submitNewComment$2$2 r4 = new com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentRemoteDataSource$submitNewComment$2$2
            r4.<init>(r1, r6)
            r9.L$0 = r1
            r9.label = r3
            java.lang.Object r10 = com.nytimes.android.coroutinesutils.FetchResultKt.e(r10, r4, r9)
            if (r10 != r0) goto L7b
            return r0
        L7b:
            com.nytimes.android.coroutinesutils.FetchResult r10 = (com.nytimes.android.coroutinesutils.FetchResult) r10
            com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentRemoteDataSource$submitNewComment$2$3 r3 = new com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentRemoteDataSource$submitNewComment$2$3
            com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentRemoteDataSource r4 = r9.this$0
            r3.<init>(r1, r4, r6)
            r9.L$0 = r6
            r9.label = r2
            java.lang.Object r9 = com.nytimes.android.coroutinesutils.FetchResultKt.d(r10, r3, r9)
            if (r9 != r0) goto L8f
            return r0
        L8f:
            ww8 r9 = defpackage.ww8.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.writenewcomment.data.remote.newcomment.WriteNewCommentRemoteDataSource$submitNewComment$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector<? super SubmitNewCommentResult> flowCollector, by0<? super ww8> by0Var) {
        return ((WriteNewCommentRemoteDataSource$submitNewComment$2) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
