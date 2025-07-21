package com.nytimes.android.comments.comments.mvi;

import androidx.paging.PagingData;
import androidx.paging.PagingDataTransforms__PagingDataTransformsKt;
import com.nytimes.android.comments.comments.data.remote.getallcomments.Comment;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ww8;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.comments.comments.mvi.CommentsViewModel$updateWithLocalChanges$1", f = "CommentsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CommentsViewModel$updateWithLocalChanges$1 extends SuspendLambda implements it2 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @fc1(c = "com.nytimes.android.comments.comments.mvi.CommentsViewModel$updateWithLocalChanges$1$1", f = "CommentsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.comments.comments.mvi.CommentsViewModel$updateWithLocalChanges$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ Map<Long, List<Comment>> $commentReplies;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Map<Long, ? extends List<Comment>> map, by0<? super AnonymousClass1> by0Var) {
            super(2, by0Var);
            this.$commentReplies = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0<ww8> create(Object obj, by0<?> by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$commentReplies, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.gt2
        public final Object invoke(Comment comment, by0<? super Comment> by0Var) {
            return ((AnonymousClass1) create(comment, by0Var)).invokeSuspend(ww8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
        
            r0 = r1.copy((r36 & 1) != 0 ? r1.commentID : 0, (r36 & 2) != 0 ? r1.userDisplayName : null, (r36 & 4) != 0 ? r1.parentUserDisplayName : null, (r36 & 8) != 0 ? r1.userLocation : null, (r36 & 16) != 0 ? r1.userTitle : null, (r36 & 32) != 0 ? r1.commentBody : null, (r36 & 64) != 0 ? r1.approveDate : null, (r36 & 128) != 0 ? r1.replies : r11, (r36 & com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r1.editorsSelection : false, (r36 & 512) != 0 ? r1.recommendations : 0, (r36 & 1024) != 0 ? r1.replyCount : 0, (r36 & com.amazonaws.event.ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r1.parentID : null, (r36 & com.amazonaws.event.ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r1.isReporterReply : false, (r36 & 8192) != 0 ? r1.avatarURL : null, (r36 & okhttp3.internal.http2.Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r1.isCommentFlagged : false, (r36 & 32768) != 0 ? r1.isRecommended : false, (r36 & 65536) != 0 ? r1.focusedInThread : false);
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                r23 = this;
                r0 = r23
                kotlin.coroutines.intrinsics.a.h()
                int r1 = r0.label
                if (r1 != 0) goto L48
                kotlin.f.b(r24)
                java.lang.Object r1 = r0.L$0
                com.nytimes.android.comments.comments.data.remote.getallcomments.Comment r1 = (com.nytimes.android.comments.comments.data.remote.getallcomments.Comment) r1
                java.util.Map<java.lang.Long, java.util.List<com.nytimes.android.comments.comments.data.remote.getallcomments.Comment>> r0 = r0.$commentReplies
                long r2 = r1.getCommentID()
                java.lang.Long r2 = defpackage.cc0.d(r2)
                java.lang.Object r0 = r0.get(r2)
                r11 = r0
                java.util.List r11 = (java.util.List) r11
                if (r11 == 0) goto L47
                r21 = 130943(0x1ff7f, float:1.8349E-40)
                r22 = 0
                r3 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r2 = r1
                com.nytimes.android.comments.comments.data.remote.getallcomments.Comment r0 = com.nytimes.android.comments.comments.data.remote.getallcomments.Comment.copy$default(r2, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                if (r0 != 0) goto L46
                goto L47
            L46:
                r1 = r0
            L47:
                return r1
            L48:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.comments.mvi.CommentsViewModel$updateWithLocalChanges$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    CommentsViewModel$updateWithLocalChanges$1(by0<? super CommentsViewModel$updateWithLocalChanges$1> by0Var) {
        super(3, by0Var);
    }

    @Override // defpackage.it2
    public final Object invoke(PagingData pagingData, Map<Long, ? extends List<Comment>> map, by0<? super PagingData> by0Var) {
        CommentsViewModel$updateWithLocalChanges$1 commentsViewModel$updateWithLocalChanges$1 = new CommentsViewModel$updateWithLocalChanges$1(by0Var);
        commentsViewModel$updateWithLocalChanges$1.L$0 = pagingData;
        commentsViewModel$updateWithLocalChanges$1.L$1 = map;
        return commentsViewModel$updateWithLocalChanges$1.invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PagingData a;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        PagingData pagingData = (PagingData) this.L$0;
        Map map = (Map) this.L$1;
        if (map.isEmpty()) {
            return pagingData;
        }
        a = PagingDataTransforms__PagingDataTransformsKt.a(pagingData, new AnonymousClass1(map, null));
        return a;
    }
}
