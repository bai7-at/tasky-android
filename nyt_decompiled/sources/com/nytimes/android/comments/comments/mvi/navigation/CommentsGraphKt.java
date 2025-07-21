package com.nytimes.android.comments.comments.mvi.navigation;

import com.nytimes.android.comments.comments.mvi.CommentTab;
import com.nytimes.android.comments.comments.mvi.CommentsViewModel;
import com.nytimes.android.comments.comments.mvi.SortingOption;
import defpackage.gt2;
import defpackage.m25;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes4.dex */
public final class CommentsGraphKt {
    public static final void commentsGraph(m25 m25Var, CommentsViewModel commentsViewModel, List<? extends CommentTab> list, CommentTab commentTab, List<? extends SortingOption> list2, ss2 ss2Var, qs2 qs2Var, gt2 gt2Var, ss2 ss2Var2, qs2 qs2Var2) {
        zq3.h(m25Var, "<this>");
        zq3.h(commentsViewModel, "viewModel");
        zq3.h(list, "commentsTabs");
        zq3.h(commentTab, "selectedCommentTab");
        zq3.h(list2, "sortingOptions");
        zq3.h(ss2Var, "isFloatingActionBarExtended");
        zq3.h(qs2Var, "onShowNewCommentButton");
        zq3.h(gt2Var, "onReplyAction");
        zq3.h(ss2Var2, "onShareAction");
        zq3.h(qs2Var2, "onViewThreadAction");
        ViewCommentsNavigationKt.viewCommentsScreen(m25Var, commentsViewModel, list, commentTab, list2, ss2Var, qs2Var, gt2Var, ss2Var2, qs2Var2);
        ViewThreadNavigationKt.viewThreadScreen(m25Var, commentsViewModel, ss2Var, gt2Var, ss2Var2, qs2Var);
    }
}
