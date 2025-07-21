package com.nytimes.android.comments.writenewcomment.mvi;

import com.nytimes.android.comments.writenewcomment.data.remote.newcomment.SubmitNewCommentResult;
import defpackage.by0;
import defpackage.ww8;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes4.dex */
final class WriteNewCommentViewModel$handleSubmitNewCommentResult$2<T> implements FlowCollector {
    final /* synthetic */ WriteNewCommentViewModel this$0;

    WriteNewCommentViewModel$handleSubmitNewCommentResult$2(WriteNewCommentViewModel writeNewCommentViewModel) {
        this.this$0 = writeNewCommentViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(com.nytimes.android.comments.writenewcomment.data.remote.newcomment.SubmitNewCommentResult r12, defpackage.by0<? super defpackage.ww8> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel$handleSubmitNewCommentResult$2$emit$1
            if (r0 == 0) goto L13
            r0 = r13
            com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel$handleSubmitNewCommentResult$2$emit$1 r0 = (com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel$handleSubmitNewCommentResult$2$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel$handleSubmitNewCommentResult$2$emit$1 r0 = new com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel$handleSubmitNewCommentResult$2$emit$1
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r11 = r0.L$0
            com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel$handleSubmitNewCommentResult$2 r11 = (com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel$handleSubmitNewCommentResult$2) r11
            kotlin.f.b(r13)
            goto L82
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            kotlin.f.b(r13)
            com.nytimes.android.comments.writenewcomment.data.remote.newcomment.SubmitNewCommentResult$Loading r13 = com.nytimes.android.comments.writenewcomment.data.remote.newcomment.SubmitNewCommentResult.Loading.INSTANCE
            boolean r13 = defpackage.zq3.c(r12, r13)
            if (r13 == 0) goto L63
            com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel r11 = r11.this$0
            kotlinx.coroutines.flow.MutableStateFlow r13 = com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel.access$getMutableState$p(r11)
        L46:
            java.lang.Object r11 = r13.getValue()
            r0 = r11
            com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentUIState r0 = (com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentUIState) r0
            r9 = 239(0xef, float:3.35E-43)
            r10 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 0
            r7 = 0
            r8 = 0
            com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentUIState r12 = com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentUIState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r11 = r13.compareAndSet(r11, r12)
            if (r11 == 0) goto L46
            goto Lb4
        L63:
            com.nytimes.android.comments.writenewcomment.data.remote.newcomment.SubmitNewCommentResult$Success r13 = com.nytimes.android.comments.writenewcomment.data.remote.newcomment.SubmitNewCommentResult.Success.INSTANCE
            boolean r13 = defpackage.zq3.c(r12, r13)
            if (r13 == 0) goto L88
            com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel r12 = r11.this$0
            com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel.access$sendNewCommentEvent(r12)
            com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel r12 = r11.this$0
            com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel.access$updateCommenterPreferences(r12)
            com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel r12 = r11.this$0
            r0.L$0 = r11
            r0.label = r3
            java.lang.Object r12 = com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel.access$tryDiscardDraftComment(r12, r0)
            if (r12 != r1) goto L82
            return r1
        L82:
            com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel r11 = r11.this$0
            com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel.access$dismissUIWithSuccess(r11)
            goto Lb4
        L88:
            boolean r13 = r12 instanceof com.nytimes.android.comments.writenewcomment.data.remote.newcomment.SubmitNewCommentResult.Error
            if (r13 == 0) goto Lb4
            com.nytimes.android.comments.writenewcomment.data.remote.newcomment.SubmitNewCommentResult$Error r12 = (com.nytimes.android.comments.writenewcomment.data.remote.newcomment.SubmitNewCommentResult.Error) r12
            java.lang.String r12 = r12.getErrorMessage()
            com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel r11 = r11.this$0
            kotlinx.coroutines.flow.MutableStateFlow r11 = com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel.access$getMutableState$p(r11)
        L98:
            java.lang.Object r13 = r11.getValue()
            r0 = r13
            com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentUIState r0 = (com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentUIState) r0
            r9 = 227(0xe3, float:3.18E-43)
            r10 = 0
            r1 = 0
            r2 = 0
            r3 = 1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r4 = r12
            com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentUIState r0 = com.nytimes.android.comments.writenewcomment.mvi.view.WriteNewCommentUIState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r13 = r11.compareAndSet(r13, r0)
            if (r13 == 0) goto L98
        Lb4:
            ww8 r11 = defpackage.ww8.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.writenewcomment.mvi.WriteNewCommentViewModel$handleSubmitNewCommentResult$2.emit(com.nytimes.android.comments.writenewcomment.data.remote.newcomment.SubmitNewCommentResult, by0):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ Object emit(Object obj, by0 by0Var) {
        return emit((SubmitNewCommentResult) obj, (by0<? super ww8>) by0Var);
    }
}
