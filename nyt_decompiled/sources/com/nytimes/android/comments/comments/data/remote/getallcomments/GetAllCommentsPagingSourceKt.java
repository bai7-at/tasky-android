package com.nytimes.android.comments.comments.data.remote.getallcomments;

import androidx.paging.PagingSource;
import com.nytimes.android.comments.comments.data.remote.CommentsResponse;
import com.nytimes.android.coroutinesutils.FetchResult;
import com.nytimes.android.utils.TimeStampUtil;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class GetAllCommentsPagingSourceKt {
    public static final PagingSource.b mapCatchingLoadResult(FetchResult<CommentsResponse> fetchResult, TimeStampUtil timeStampUtil, PagingSource.a aVar) {
        Long l;
        zq3.h(fetchResult, "fetchResult");
        zq3.h(timeStampUtil, "timeStampUtil");
        zq3.h(aVar, "previousParams");
        if (!(fetchResult instanceof FetchResult.b.C0251b)) {
            if (fetchResult instanceof FetchResult.b.a) {
                return new PagingSource.b.a(((FetchResult.b.a) fetchResult).b());
            }
            if (fetchResult instanceof FetchResult.c) {
                return new PagingSource.b.a(new Throwable("timeout"));
            }
            throw new NoWhenBranchMatchedException();
        }
        List<CommentResponse> comments = ((CommentsResponse) ((FetchResult.b.C0251b) fetchResult).b()).getComments();
        ArrayList arrayList = new ArrayList(i.w(comments, 10));
        Iterator<T> it2 = comments.iterator();
        while (it2.hasNext()) {
            arrayList.add(CommentKt.mapToComment((CommentResponse) it2.next(), timeStampUtil));
        }
        Long l2 = (Long) aVar.a();
        int b = aVar.b();
        Comment comment = (Comment) i.y0(arrayList);
        if (comment != null) {
            long commentID = comment.getCommentID();
            if ((l2 == null || l2.longValue() != commentID) && arrayList.size() >= b) {
                l = Long.valueOf(commentID);
                return new PagingSource.b.C0106b(arrayList, null, l);
            }
        }
        l = null;
        return new PagingSource.b.C0106b(arrayList, null, l);
    }
}
