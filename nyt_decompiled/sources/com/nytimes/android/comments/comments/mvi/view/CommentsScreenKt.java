package com.nytimes.android.comments.comments.mvi.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import com.nytimes.android.comments.comments.mvi.CommentTab;
import com.nytimes.android.comments.comments.mvi.CommentsIntent;
import com.nytimes.android.comments.comments.mvi.CommentsViewModel;
import com.nytimes.android.comments.comments.mvi.SortingOption;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes4.dex */
public final class CommentsScreenKt {
    public static final void CommentsScreen(final CommentsViewModel commentsViewModel, final List<? extends CommentTab> list, final CommentTab commentTab, final List<? extends SortingOption> list2, final ss2 ss2Var, final qs2 qs2Var, final gt2 gt2Var, final ss2 ss2Var2, final qs2 qs2Var2, Composer composer, final int i) {
        Composer composer2;
        zq3.h(commentsViewModel, "viewModel");
        zq3.h(list, "commentsTabs");
        zq3.h(commentTab, "selectedCommentTab");
        zq3.h(list2, "sortingOptions");
        zq3.h(ss2Var, "isFloatingActionBarExtended");
        zq3.h(qs2Var, "onShowNewCommentButton");
        zq3.h(gt2Var, "onReplyAction");
        zq3.h(ss2Var2, "onShareAction");
        zq3.h(qs2Var2, "onViewThreadAction");
        Composer h = composer.h(139205252);
        if (b.G()) {
            b.S(139205252, i, -1, "com.nytimes.android.comments.comments.mvi.view.CommentsScreen (CommentsScreen.kt:24)");
        }
        x08 b = y.b(commentsViewModel.getSelectedSortingOptionState(), null, h, 8, 1);
        if (list.isEmpty()) {
            composer2 = h;
        } else {
            SortingOption CommentsScreen$lambda$0 = CommentsScreen$lambda$0(b);
            gt2 gt2Var2 = new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsScreenKt$CommentsScreen$1
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke(((Number) obj).longValue(), (String) obj2);
                    return ww8.a;
                }

                public final void invoke(long j, String str) {
                    zq3.h(str, "flagOption");
                    CommentsViewModel.this.intent(new CommentsIntent.FlagComment(j, str, false, 4, null));
                }
            };
            gt2 gt2Var3 = new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsScreenKt$CommentsScreen$2
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke(((Number) obj).longValue(), ((Boolean) obj2).booleanValue());
                    return ww8.a;
                }

                public final void invoke(long j, boolean z) {
                    CommentsViewModel.this.intent(new CommentsIntent.RecommendComment(j, z));
                }
            };
            ss2 ss2Var3 = new ss2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsScreenKt$CommentsScreen$3
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).longValue());
                    return ww8.a;
                }

                public final void invoke(long j) {
                    CommentsViewModel.this.intent(new CommentsIntent.GetAllReplies(j));
                }
            };
            it2 it2Var = new it2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsScreenKt$CommentsScreen$4
                {
                    super(3);
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke(((Number) obj).longValue(), ((Number) obj2).longValue(), (String) obj3);
                    return ww8.a;
                }

                public final void invoke(long j, long j2, String str) {
                    zq3.h(str, "flagOption");
                    CommentsViewModel.this.intent(new CommentsIntent.FlagReply(j, j2, str, false, 8, null));
                }
            };
            it2 it2Var2 = new it2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsScreenKt$CommentsScreen$5
                {
                    super(3);
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke(((Number) obj).longValue(), ((Number) obj2).longValue(), ((Boolean) obj3).booleanValue());
                    return ww8.a;
                }

                public final void invoke(long j, long j2, boolean z) {
                    CommentsViewModel.this.intent(new CommentsIntent.RecommendReply(j, j2, z));
                }
            };
            ss2 ss2Var4 = new ss2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsScreenKt$CommentsScreen$6
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SortingOption) obj);
                    return ww8.a;
                }

                public final void invoke(SortingOption sortingOption) {
                    zq3.h(sortingOption, "sortingOption");
                    CommentsViewModel.this.intent(new CommentsIntent.SortOptionChanged(sortingOption));
                }
            };
            ss2 ss2Var5 = new ss2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsScreenKt$CommentsScreen$7
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((CommentTab) obj);
                    return ww8.a;
                }

                public final void invoke(CommentTab commentTab2) {
                    zq3.h(commentTab2, "commentTab");
                    CommentsViewModel.this.intent(new CommentsIntent.CommentTabChanged(commentTab2));
                }
            };
            qs2 qs2Var3 = new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsScreenKt$CommentsScreen$8
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m234invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m234invoke() {
                    CommentsViewModel.this.intent(CommentsIntent.Refresh.INSTANCE);
                }
            };
            h.z(1377161530);
            boolean z = (((3670016 & i) ^ 1572864) > 1048576 && h.S(gt2Var)) || (i & 1572864) == 1048576;
            Object A = h.A();
            if (z || A == Composer.a.a()) {
                A = new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsScreenKt$CommentsScreen$9$1
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((String) obj, ((Number) obj2).longValue());
                        return ww8.a;
                    }

                    public final void invoke(String str, long j) {
                        zq3.h(str, "commenterName");
                        gt2.this.invoke(str, Long.valueOf(j));
                    }
                };
                h.q(A);
            }
            gt2 gt2Var4 = (gt2) A;
            h.R();
            ss2 ss2Var6 = new ss2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsScreenKt$CommentsScreen$10
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).longValue());
                    return ww8.a;
                }

                public final void invoke(long j) {
                    CommentsViewModel.this.intent(new CommentsIntent.GetCommentThread(j));
                    qs2Var2.mo865invoke();
                }
            };
            ss2 ss2Var7 = new ss2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsScreenKt$CommentsScreen$11
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).longValue());
                    return ww8.a;
                }

                public final void invoke(long j) {
                    CommentsViewModel.this.intent(new CommentsIntent.GetCommentThreadReplies(j));
                    qs2Var2.mo865invoke();
                }
            };
            h.z(1377162322);
            boolean z2 = (((i & 458752) ^ 196608) > 131072 && h.S(qs2Var)) || (i & 196608) == 131072;
            Object A2 = h.A();
            if (z2 || A2 == Composer.a.a()) {
                A2 = new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsScreenKt$CommentsScreen$12$1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m230invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m230invoke() {
                        qs2.this.mo865invoke();
                    }
                };
                h.q(A2);
            }
            h.R();
            composer2 = h;
            CommentsScreenContentKt.CommentsScreenContent(commentsViewModel, list, commentTab, list2, CommentsScreen$lambda$0, ss2Var, gt2Var2, gt2Var3, ss2Var3, it2Var, it2Var2, ss2Var4, ss2Var5, qs2Var3, gt2Var4, ss2Var6, ss2Var7, ss2Var2, (qs2) A2, new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsScreenKt$CommentsScreen$13
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m231invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m231invoke() {
                    CommentsViewModel.this.intent(new CommentsIntent.ConfirmFlagComment(false, 1, null));
                }
            }, new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsScreenKt$CommentsScreen$14
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m232invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m232invoke() {
                    CommentsViewModel.this.intent(new CommentsIntent.DismissFlagComment(false, 1, null));
                }
            }, new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsScreenKt$CommentsScreen$15
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m233invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m233invoke() {
                    CommentsViewModel.this.intent(CommentsIntent.DismissErrorMessage.INSTANCE);
                }
            }, composer2, (i & 896) | 4168 | ((i << 3) & 458752), i & 29360128, 0);
        }
        if (b.G()) {
            b.R();
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsScreenKt$CommentsScreen$16
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i2) {
                    CommentsScreenKt.CommentsScreen(CommentsViewModel.this, list, commentTab, list2, ss2Var, qs2Var, gt2Var, ss2Var2, qs2Var2, composer3, gt6.a(i | 1));
                }
            });
        }
    }

    private static final SortingOption CommentsScreen$lambda$0(x08 x08Var) {
        return (SortingOption) x08Var.getValue();
    }
}
