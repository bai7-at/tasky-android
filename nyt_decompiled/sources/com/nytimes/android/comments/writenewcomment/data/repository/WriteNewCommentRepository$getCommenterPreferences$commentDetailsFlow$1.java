package com.nytimes.android.comments.writenewcomment.data.repository;

import com.nytimes.android.comments.writenewcomment.data.db.DraftCommentEntity;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.android.comments.writenewcomment.data.repository.WriteNewCommentRepository$getCommenterPreferences$commentDetailsFlow$1", f = "WriteNewCommentRepository.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WriteNewCommentRepository$getCommenterPreferences$commentDetailsFlow$1 extends SuspendLambda implements it2 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ WriteNewCommentRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WriteNewCommentRepository$getCommenterPreferences$commentDetailsFlow$1(WriteNewCommentRepository writeNewCommentRepository, by0<? super WriteNewCommentRepository$getCommenterPreferences$commentDetailsFlow$1> by0Var) {
        super(3, by0Var);
        this.this$0 = writeNewCommentRepository;
    }

    @Override // defpackage.it2
    public final Object invoke(DraftCommentEntity draftCommentEntity, CommenterPreferences commenterPreferences, by0<? super CommenterDetails> by0Var) {
        WriteNewCommentRepository$getCommenterPreferences$commentDetailsFlow$1 writeNewCommentRepository$getCommenterPreferences$commentDetailsFlow$1 = new WriteNewCommentRepository$getCommenterPreferences$commentDetailsFlow$1(this.this$0, by0Var);
        writeNewCommentRepository$getCommenterPreferences$commentDetailsFlow$1.L$0 = draftCommentEntity;
        writeNewCommentRepository$getCommenterPreferences$commentDetailsFlow$1.L$1 = commenterPreferences;
        return writeNewCommentRepository$getCommenterPreferences$commentDetailsFlow$1.invokeSuspend(ww8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (r1 == null) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r10.label
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r0 = r10.L$1
            com.nytimes.android.comments.writenewcomment.data.repository.CommenterPreferences r0 = (com.nytimes.android.comments.writenewcomment.data.repository.CommenterPreferences) r0
            java.lang.Object r10 = r10.L$0
            com.nytimes.android.comments.writenewcomment.data.db.DraftCommentEntity r10 = (com.nytimes.android.comments.writenewcomment.data.db.DraftCommentEntity) r10
            kotlin.f.b(r11)
            goto L3d
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L1f:
            kotlin.f.b(r11)
            java.lang.Object r11 = r10.L$0
            com.nytimes.android.comments.writenewcomment.data.db.DraftCommentEntity r11 = (com.nytimes.android.comments.writenewcomment.data.db.DraftCommentEntity) r11
            java.lang.Object r1 = r10.L$1
            com.nytimes.android.comments.writenewcomment.data.repository.CommenterPreferences r1 = (com.nytimes.android.comments.writenewcomment.data.repository.CommenterPreferences) r1
            com.nytimes.android.comments.writenewcomment.data.repository.WriteNewCommentRepository r3 = r10.this$0
            r10.L$0 = r11
            r10.L$1 = r1
            r10.label = r2
            java.lang.Object r10 = com.nytimes.android.comments.writenewcomment.data.repository.WriteNewCommentRepository.access$getCurrentUser(r3, r10)
            if (r10 != r0) goto L39
            return r0
        L39:
            r0 = r1
            r9 = r11
            r11 = r10
            r10 = r9
        L3d:
            com.nytimes.android.coroutinesutils.FetchResult r11 = (com.nytimes.android.coroutinesutils.FetchResult) r11
            if (r10 == 0) goto L46
            java.lang.String r10 = r10.getContent()
            goto L47
        L46:
            r10 = 0
        L47:
            boolean r1 = r11 instanceof com.nytimes.android.coroutinesutils.FetchResult.b.C0251b
            if (r1 == 0) goto Lb4
            com.nytimes.android.coroutinesutils.FetchResult$b$b r11 = (com.nytimes.android.coroutinesutils.FetchResult.b.C0251b) r11
            java.lang.Object r11 = r11.b()
            com.nytimes.android.comments.writenewcomment.data.remote.getuser.User r11 = (com.nytimes.android.comments.writenewcomment.data.remote.getuser.User) r11
            java.lang.String r1 = r11.getName()
            if (r1 == 0) goto L68
            boolean r3 = kotlin.text.h.d0(r1)
            if (r3 == 0) goto L63
            java.lang.String r1 = r0.getCommenterName()
        L63:
            if (r1 != 0) goto L66
            goto L68
        L66:
            r4 = r1
            goto L6d
        L68:
            java.lang.String r1 = r0.getCommenterName()
            goto L66
        L6d:
            java.lang.String r1 = r11.getLocation()
            if (r1 == 0) goto L82
            boolean r3 = kotlin.text.h.d0(r1)
            if (r3 == 0) goto L7d
            java.lang.String r1 = r0.getCommenterLocation()
        L7d:
            if (r1 != 0) goto L80
            goto L82
        L80:
            r5 = r1
            goto L87
        L82:
            java.lang.String r1 = r0.getCommenterLocation()
            goto L80
        L87:
            java.lang.Boolean r1 = r11.getEmailMe()
            if (r1 == 0) goto L93
            boolean r0 = r1.booleanValue()
        L91:
            r6 = r0
            goto L98
        L93:
            boolean r0 = r0.getSendEmailNotification()
            goto L91
        L98:
            java.lang.Boolean r0 = r11.isReporter()
            java.lang.Boolean r1 = defpackage.cc0.a(r2)
            boolean r7 = defpackage.zq3.c(r0, r1)
            java.lang.String r11 = r11.getTitle()
            if (r11 != 0) goto Lac
            java.lang.String r11 = ""
        Lac:
            r8 = r11
            com.nytimes.android.comments.writenewcomment.data.repository.CommenterPreferences r0 = new com.nytimes.android.comments.writenewcomment.data.repository.CommenterPreferences
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            goto Lbd
        Lb4:
            boolean r1 = r11 instanceof com.nytimes.android.coroutinesutils.FetchResult.b.a
            if (r1 == 0) goto Lb9
            goto Lbd
        Lb9:
            boolean r11 = r11 instanceof com.nytimes.android.coroutinesutils.FetchResult.c
            if (r11 == 0) goto Lc3
        Lbd:
            com.nytimes.android.comments.writenewcomment.data.repository.CommenterDetails r11 = new com.nytimes.android.comments.writenewcomment.data.repository.CommenterDetails
            r11.<init>(r0, r10)
            return r11
        Lc3:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.writenewcomment.data.repository.WriteNewCommentRepository$getCommenterPreferences$commentDetailsFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
