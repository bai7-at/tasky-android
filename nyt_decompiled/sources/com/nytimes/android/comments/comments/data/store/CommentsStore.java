package com.nytimes.android.comments.comments.data.store;

import com.nytimes.android.comments.comments.data.remote.getcommentssummary.GetCommentsSummaryDataSource;
import com.nytimes.android.comments.comments.data.store.CommentsStore;
import defpackage.pr6;
import defpackage.wd2;
import defpackage.zq3;
import io.reactivex.Single;
import kotlinx.coroutines.rx2.RxSingleKt;

/* loaded from: classes4.dex */
public final class CommentsStore extends pr6 {
    public static final int $stable = 8;
    private final GetCommentsSummaryDataSource commentsSummaryDataSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentsStore(final GetCommentsSummaryDataSource getCommentsSummaryDataSource) {
        super(new wd2() { // from class: jp0
            @Override // defpackage.wd2
            public final Single fetch(Object obj) {
                Single _init_$lambda$0;
                _init_$lambda$0 = CommentsStore._init_$lambda$0(GetCommentsSummaryDataSource.this, (String) obj);
                return _init_$lambda$0;
            }
        });
        zq3.h(getCommentsSummaryDataSource, "commentsSummaryDataSource");
        this.commentsSummaryDataSource = getCommentsSummaryDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Single _init_$lambda$0(GetCommentsSummaryDataSource getCommentsSummaryDataSource, String str) {
        zq3.h(getCommentsSummaryDataSource, "$commentsSummaryDataSource");
        zq3.h(str, "url");
        try {
            return RxSingleKt.rxSingle$default(null, new CommentsStore$1$1(getCommentsSummaryDataSource, str, null), 1, null);
        } catch (Exception e) {
            Single error = Single.error(e);
            zq3.e(error);
            return error;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object tryGetCommentSummary(java.lang.String r5, defpackage.by0<? super com.nytimes.android.comments.comments.data.remote.getcommentssummary.CommentsSummary> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.comments.comments.data.store.CommentsStore$tryGetCommentSummary$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.comments.comments.data.store.CommentsStore$tryGetCommentSummary$1 r0 = (com.nytimes.android.comments.comments.data.store.CommentsStore$tryGetCommentSummary$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.comments.comments.data.store.CommentsStore$tryGetCommentSummary$1 r0 = new com.nytimes.android.comments.comments.data.store.CommentsStore$tryGetCommentSummary$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.f.b(r6)     // Catch: java.util.NoSuchElementException -> L29
            goto L48
        L29:
            r4 = move-exception
            goto L4b
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.f.b(r6)
            io.reactivex.Single r4 = r4.get(r5)     // Catch: java.util.NoSuchElementException -> L29
            java.lang.String r5 = "get(...)"
            defpackage.zq3.g(r4, r5)     // Catch: java.util.NoSuchElementException -> L29
            r0.label = r3     // Catch: java.util.NoSuchElementException -> L29
            java.lang.Object r6 = kotlinx.coroutines.rx2.RxAwaitKt.await(r4, r0)     // Catch: java.util.NoSuchElementException -> L29
            if (r6 != r1) goto L48
            return r1
        L48:
            com.nytimes.android.comments.comments.data.remote.getcommentssummary.CommentsSummary r6 = (com.nytimes.android.comments.comments.data.remote.getcommentssummary.CommentsSummary) r6     // Catch: java.util.NoSuchElementException -> L29
            goto L4f
        L4b:
            com.nytimes.android.logging.NYTLogger.h(r4)
            r6 = 0
        L4f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.comments.data.store.CommentsStore.tryGetCommentSummary(java.lang.String, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getCommentCount(java.lang.String r5, defpackage.by0<? super java.lang.Integer> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.comments.comments.data.store.CommentsStore$getCommentCount$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.comments.comments.data.store.CommentsStore$getCommentCount$1 r0 = (com.nytimes.android.comments.comments.data.store.CommentsStore$getCommentCount$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.comments.comments.data.store.CommentsStore$getCommentCount$1 r0 = new com.nytimes.android.comments.comments.data.store.CommentsStore$getCommentCount$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r6)
            r0.label = r3
            java.lang.Object r6 = r4.tryGetCommentSummary(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            com.nytimes.android.comments.comments.data.remote.getcommentssummary.CommentsSummary r6 = (com.nytimes.android.comments.comments.data.remote.getcommentssummary.CommentsSummary) r6
            if (r6 == 0) goto L46
            int r4 = r6.getTotalComments()
            goto L47
        L46:
            r4 = 0
        L47:
            java.lang.Integer r4 = defpackage.cc0.c(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.comments.comments.data.store.CommentsStore.getCommentCount(java.lang.String, by0):java.lang.Object");
    }

    public final Single<Integer> getCommentCountSingle(String str) {
        zq3.h(str, "articleUrl");
        return RxSingleKt.rxSingle$default(null, new CommentsStore$getCommentCountSingle$1(this, str, null), 1, null);
    }
}
