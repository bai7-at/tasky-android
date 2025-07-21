package com.nytimes.android.comments.comments.mvi.view;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.m;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.j;
import androidx.paging.compose.LazyPagingItems;
import com.amazonaws.event.ProgressEvent;
import com.comscore.streaming.ContentType;
import com.nytimes.android.comments.R;
import com.nytimes.android.comments.comments.data.remote.getallcomments.Comment;
import com.nytimes.android.comments.comments.data.remote.getallcomments.CommentKt;
import com.nytimes.android.comments.comments.mvi.CommentTab;
import com.nytimes.android.comments.comments.mvi.FlagType;
import com.nytimes.android.comments.comments.mvi.SortingOption;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.et0;
import defpackage.gb5;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.h04;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.kt2;
import defpackage.n37;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.ym2;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;

/* loaded from: classes4.dex */
public final class LazyColumnTabContentKt {
    public static final void LazyColumnTabContent(final LazyPagingItems lazyPagingItems, final LazyListState lazyListState, final CommentTab commentTab, final GetAllRepliesState getAllRepliesState, final List<? extends SortingOption> list, final SortingOption sortingOption, final boolean z, final boolean z2, final List<? extends FlagType> list2, final gt2 gt2Var, final gt2 gt2Var2, final ss2 ss2Var, final it2 it2Var, final it2 it2Var2, final ss2 ss2Var2, final gt2 gt2Var3, final ss2 ss2Var3, final ss2 ss2Var4, final ss2 ss2Var5, Composer composer, final int i, final int i2) {
        zq3.h(lazyPagingItems, "comments");
        zq3.h(lazyListState, "listState");
        zq3.h(commentTab, "currentCommentTab");
        zq3.h(getAllRepliesState, "getAllRepliesState");
        zq3.h(list, "sortingOptions");
        zq3.h(sortingOption, "selectedSortingOption");
        zq3.h(list2, "flagOptions");
        zq3.h(gt2Var, "onFlagAction");
        zq3.h(gt2Var2, "onRecommendAction");
        zq3.h(ss2Var, "onViewAllRepliesButtonClicked");
        zq3.h(it2Var, "onFlagReplyAction");
        zq3.h(it2Var2, "onRecommendReplyAction");
        zq3.h(ss2Var2, "onSortingOptionChanged");
        zq3.h(gt2Var3, "onReplyAction");
        zq3.h(ss2Var3, "onViewThreadAction");
        zq3.h(ss2Var4, "onViewThreadRepliesAction");
        zq3.h(ss2Var5, "onShareAction");
        Composer h = composer.h(1220756041);
        if (b.G()) {
            b.S(1220756041, i, i2, "com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContent (LazyColumnTabContent.kt:84)");
        }
        LazyDslKt.a(SizeKt.f(Modifier.a, 0.0f, 1, null), lazyListState, PaddingKt.e(0.0f, 0.0f, 0.0f, bu1.g(80), 7, null), false, null, null, null, false, new ss2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LazyColumnTabContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LazyListScope) obj);
                return ww8.a;
            }

            public final void invoke(LazyListScope lazyListScope) {
                zq3.h(lazyListScope, "$this$LazyColumn");
                final boolean z3 = z;
                final boolean z4 = z2;
                final CommentTab commentTab2 = commentTab;
                final List<SortingOption> list3 = list;
                final SortingOption sortingOption2 = sortingOption;
                final ss2 ss2Var6 = ss2Var2;
                LazyListScope.d(lazyListScope, null, null, zr0.c(-1281555235, true, new it2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LazyColumnTabContent$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, Composer composer2, int i3) {
                        zq3.h(h04Var, "$this$item");
                        if ((i3 & 81) == 16 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-1281555235, i3, -1, "com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContent.<anonymous>.<anonymous> (LazyColumnTabContent.kt:91)");
                        }
                        CommentsHeaderKt.CommentsHeader(z3, z4, commentTab2, list3, sortingOption2, ss2Var6, composer2, ProgressEvent.PART_FAILED_EVENT_CODE);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), 3, null);
                int g = LazyPagingItems.this.g();
                final LazyPagingItems lazyPagingItems2 = LazyPagingItems.this;
                ss2 ss2Var7 = new ss2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LazyColumnTabContent$1.2
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke(((Number) obj).intValue());
                    }

                    public final Object invoke(int i3) {
                        Comment comment = (Comment) LazyPagingItems.this.f(i3);
                        if (comment != null) {
                            return Long.valueOf(comment.getCommentID());
                        }
                        return 0;
                    }
                };
                final LazyPagingItems lazyPagingItems3 = LazyPagingItems.this;
                final CommentTab commentTab3 = commentTab;
                final GetAllRepliesState getAllRepliesState2 = getAllRepliesState;
                final List<FlagType> list4 = list2;
                final gt2 gt2Var4 = gt2Var;
                final gt2 gt2Var5 = gt2Var2;
                final gt2 gt2Var6 = gt2Var3;
                final boolean z5 = z2;
                final ss2 ss2Var8 = ss2Var5;
                final it2 it2Var3 = it2Var;
                final it2 it2Var4 = it2Var2;
                final ss2 ss2Var9 = ss2Var;
                final ss2 ss2Var10 = ss2Var4;
                final ss2 ss2Var11 = ss2Var3;
                LazyListScope.e(lazyListScope, g, ss2Var7, null, zr0.c(237488934, true, new kt2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LazyColumnTabContent$1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(4);
                    }

                    @Override // defpackage.kt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        invoke((h04) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                        return ww8.a;
                    }

                    public final void invoke(h04 h04Var, int i3, Composer composer2, int i4) {
                        zq3.h(h04Var, "$this$items");
                        int i5 = (i4 & ContentType.LONG_FORM_ON_DEMAND) == 0 ? i4 | (composer2.d(i3) ? 32 : 16) : i4;
                        if ((i5 & 721) == 144 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(237488934, i5, -1, "com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContent.<anonymous>.<anonymous> (LazyColumnTabContent.kt:105)");
                        }
                        final Comment comment = (Comment) LazyPagingItems.this.f(i3);
                        if (comment != null) {
                            boolean showThread = commentTab3.getShowThread();
                            boolean z6 = getAllRepliesState2.isLoading() && getAllRepliesState2.getCommentID() == comment.getCommentID();
                            final long commentID = comment.getCommentID();
                            List<Comment> replies = comment.getReplies();
                            List<Comment> list5 = replies;
                            if (list5.isEmpty() || !showThread) {
                                composer2.z(-337971300);
                                final boolean z7 = comment.getReplyCount() > 0;
                                boolean z8 = z7 || z5;
                                List<FlagType> list6 = list4;
                                gt2 gt2Var7 = new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt.LazyColumnTabContent.1.3.7
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // defpackage.gt2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        return invoke((Composer) obj, ((Number) obj2).intValue());
                                    }

                                    public final String invoke(Composer composer3, int i6) {
                                        composer3.z(-614012887);
                                        if (b.G()) {
                                            b.S(-614012887, i6, -1, "com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContent.<anonymous>.<anonymous>.<anonymous> (LazyColumnTabContent.kt:179)");
                                        }
                                        String rightButtonTitle = CommentsScreenContentKt.rightButtonTitle(z7, comment, composer3, 64);
                                        if (b.G()) {
                                            b.R();
                                        }
                                        composer3.R();
                                        return rightButtonTitle;
                                    }
                                };
                                composer2.z(-337970863);
                                boolean S = composer2.S(gt2Var4) | composer2.e(commentID);
                                final gt2 gt2Var8 = gt2Var4;
                                Object A = composer2.A();
                                if (S || A == Composer.a.a()) {
                                    A = new ss2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LazyColumnTabContent$1$3$8$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // defpackage.ss2
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            invoke((String) obj);
                                            return ww8.a;
                                        }

                                        public final void invoke(String str) {
                                            zq3.h(str, "flagOption");
                                            gt2.this.invoke(Long.valueOf(commentID), str);
                                        }
                                    };
                                    composer2.q(A);
                                }
                                ss2 ss2Var12 = (ss2) A;
                                composer2.R();
                                composer2.z(-337970712);
                                boolean S2 = composer2.S(gt2Var5) | composer2.e(commentID);
                                final gt2 gt2Var9 = gt2Var5;
                                Object A2 = composer2.A();
                                if (S2 || A2 == Composer.a.a()) {
                                    A2 = new ss2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LazyColumnTabContent$1$3$9$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // defpackage.ss2
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            invoke(((Boolean) obj).booleanValue());
                                            return ww8.a;
                                        }

                                        public final void invoke(boolean z9) {
                                            gt2.this.invoke(Long.valueOf(commentID), Boolean.valueOf(z9));
                                        }
                                    };
                                    composer2.q(A2);
                                }
                                ss2 ss2Var13 = (ss2) A2;
                                composer2.R();
                                final ss2 ss2Var14 = ss2Var10;
                                final gt2 gt2Var10 = gt2Var6;
                                final ss2 ss2Var15 = ss2Var11;
                                final boolean z9 = z7;
                                LazyColumnTabContentKt.LoadCommentView(comment, list6, gt2Var7, ss2Var12, ss2Var13, new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt.LazyColumnTabContent.1.3.10
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // defpackage.gt2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((String) obj, ((Number) obj2).longValue());
                                        return ww8.a;
                                    }

                                    public final void invoke(String str, long j) {
                                        ww8 ww8Var;
                                        zq3.h(str, "commenterName");
                                        if (!z9) {
                                            gt2Var10.invoke(str, Long.valueOf(j));
                                            return;
                                        }
                                        Long parentID = comment.getParentID();
                                        if (parentID != null) {
                                            ss2Var15.invoke(Long.valueOf(parentID.longValue()));
                                            ww8Var = ww8.a;
                                        } else {
                                            ww8Var = null;
                                        }
                                        if (ww8Var == null) {
                                            ss2Var14.invoke(Long.valueOf(comment.getCommentID()));
                                        }
                                    }
                                }, z8, ss2Var8, composer2, 72, 0);
                                composer2.R();
                            } else {
                                composer2.z(-337974164);
                                List<FlagType> list7 = list4;
                                AnonymousClass1 anonymousClass1 = new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt.LazyColumnTabContent.1.3.1
                                    @Override // defpackage.gt2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        return invoke((Composer) obj, ((Number) obj2).intValue());
                                    }

                                    public final String invoke(Composer composer3, int i6) {
                                        composer3.z(-1635234208);
                                        if (b.G()) {
                                            b.S(-1635234208, i6, -1, "com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContent.<anonymous>.<anonymous>.<anonymous> (LazyColumnTabContent.kt:118)");
                                        }
                                        String b = k48.b(R.string.comments_screen_reply_button, composer3, 0);
                                        if (b.G()) {
                                            b.R();
                                        }
                                        composer3.R();
                                        return b;
                                    }
                                };
                                composer2.z(-337973847);
                                boolean S3 = composer2.S(gt2Var4) | composer2.e(commentID);
                                final gt2 gt2Var11 = gt2Var4;
                                Object A3 = composer2.A();
                                if (S3 || A3 == Composer.a.a()) {
                                    A3 = new ss2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LazyColumnTabContent$1$3$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // defpackage.ss2
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            invoke((String) obj);
                                            return ww8.a;
                                        }

                                        public final void invoke(String str) {
                                            zq3.h(str, "flagOption");
                                            gt2.this.invoke(Long.valueOf(commentID), str);
                                        }
                                    };
                                    composer2.q(A3);
                                }
                                ss2 ss2Var16 = (ss2) A3;
                                composer2.R();
                                composer2.z(-337973696);
                                boolean S4 = composer2.S(gt2Var5) | composer2.e(commentID);
                                final gt2 gt2Var12 = gt2Var5;
                                Object A4 = composer2.A();
                                if (S4 || A4 == Composer.a.a()) {
                                    A4 = new ss2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LazyColumnTabContent$1$3$3$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // defpackage.ss2
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            invoke(((Boolean) obj).booleanValue());
                                            return ww8.a;
                                        }

                                        public final void invoke(boolean z10) {
                                            gt2.this.invoke(Long.valueOf(commentID), Boolean.valueOf(z10));
                                        }
                                    };
                                    composer2.q(A4);
                                }
                                ss2 ss2Var17 = (ss2) A4;
                                composer2.R();
                                composer2.z(-337973448);
                                boolean S5 = composer2.S(gt2Var6);
                                final gt2 gt2Var13 = gt2Var6;
                                Object A5 = composer2.A();
                                if (S5 || A5 == Composer.a.a()) {
                                    A5 = new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LazyColumnTabContent$1$3$4$1
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
                                    composer2.q(A5);
                                }
                                composer2.R();
                                long j = commentID;
                                LazyColumnTabContentKt.LoadCommentView(comment, list7, anonymousClass1, ss2Var16, ss2Var17, (gt2) A5, z5, ss2Var8, composer2, 72, 0);
                                if (!list5.isEmpty()) {
                                    LazyColumnTabContentKt.LoadRepliesHeader(replies.size(), composer2, 0);
                                    composer2.z(-337972983);
                                    List<Comment> replies2 = comment.getReplies();
                                    List<FlagType> list8 = list4;
                                    boolean z10 = z5;
                                    final it2 it2Var5 = it2Var3;
                                    final it2 it2Var6 = it2Var4;
                                    final gt2 gt2Var14 = gt2Var6;
                                    ss2 ss2Var18 = ss2Var8;
                                    for (Comment comment2 : replies2) {
                                        composer2.z(49213561);
                                        final long j2 = j;
                                        boolean S6 = composer2.S(it2Var5) | composer2.e(j2);
                                        Object A6 = composer2.A();
                                        if (S6 || A6 == Composer.a.a()) {
                                            A6 = new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LazyColumnTabContent$1$3$5$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // defpackage.gt2
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                    invoke(((Number) obj).longValue(), (String) obj2);
                                                    return ww8.a;
                                                }

                                                public final void invoke(long j3, String str) {
                                                    zq3.h(str, "flagOption");
                                                    it2.this.invoke(Long.valueOf(j2), Long.valueOf(j3), str);
                                                }
                                            };
                                            composer2.q(A6);
                                        }
                                        gt2 gt2Var15 = (gt2) A6;
                                        composer2.R();
                                        composer2.z(49213764);
                                        boolean S7 = composer2.S(it2Var6) | composer2.e(j2);
                                        Object A7 = composer2.A();
                                        if (S7 || A7 == Composer.a.a()) {
                                            A7 = new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LazyColumnTabContent$1$3$5$2$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(2);
                                                }

                                                @Override // defpackage.gt2
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                    invoke(((Number) obj).longValue(), ((Boolean) obj2).booleanValue());
                                                    return ww8.a;
                                                }

                                                public final void invoke(long j3, boolean z11) {
                                                    it2.this.invoke(Long.valueOf(j2), Long.valueOf(j3), Boolean.valueOf(z11));
                                                }
                                            };
                                            composer2.q(A7);
                                        }
                                        gt2 gt2Var16 = (gt2) A7;
                                        composer2.R();
                                        composer2.z(49213965);
                                        boolean S8 = composer2.S(gt2Var14);
                                        Object A8 = composer2.A();
                                        if (S8 || A8 == Composer.a.a()) {
                                            A8 = new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LazyColumnTabContent$1$3$5$3$1
                                                {
                                                    super(2);
                                                }

                                                @Override // defpackage.gt2
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                    invoke((String) obj, ((Number) obj2).longValue());
                                                    return ww8.a;
                                                }

                                                public final void invoke(String str, long j3) {
                                                    zq3.h(str, "commenterName");
                                                    gt2.this.invoke(str, Long.valueOf(j3));
                                                }
                                            };
                                            composer2.q(A8);
                                        }
                                        composer2.R();
                                        ss2 ss2Var19 = ss2Var18;
                                        LazyColumnTabContentKt.LoadReply(comment, comment2, list8, z10, gt2Var15, gt2Var16, (gt2) A8, ss2Var19, composer2, 584);
                                        ss2Var18 = ss2Var19;
                                        gt2Var14 = gt2Var14;
                                        it2Var6 = it2Var6;
                                        j = j2;
                                        it2Var5 = it2Var5;
                                        z10 = z10;
                                    }
                                    composer2.R();
                                    if (comment.getReplyCount() > replies.size()) {
                                        final ss2 ss2Var20 = ss2Var9;
                                        LazyColumnTabContentKt.LoadRefreshItem(z6, new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt.LazyColumnTabContent.1.3.6
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }

                                            @Override // defpackage.qs2
                                            /* renamed from: invoke */
                                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                                m274invoke();
                                                return ww8.a;
                                            }

                                            /* renamed from: invoke, reason: collision with other method in class */
                                            public final void m274invoke() {
                                                ss2.this.invoke(Long.valueOf(comment.getCommentID()));
                                            }
                                        }, composer2, 0);
                                    }
                                }
                                composer2.R();
                            }
                        }
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), 4, null);
            }
        }, h, (i & ContentType.LONG_FORM_ON_DEMAND) | 390, 248);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LazyColumnTabContent$2
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

                public final void invoke(Composer composer2, int i3) {
                    LazyColumnTabContentKt.LazyColumnTabContent(LazyPagingItems.this, lazyListState, commentTab, getAllRepliesState, list, sortingOption, z, z2, list2, gt2Var, gt2Var2, ss2Var, it2Var, it2Var2, ss2Var2, gt2Var3, ss2Var3, ss2Var4, ss2Var5, composer2, gt6.a(i | 1), gt6.a(i2));
                }
            });
        }
    }

    public static final void LoadCommentView(final Comment comment, final List<? extends FlagType> list, final gt2 gt2Var, final ss2 ss2Var, final ss2 ss2Var2, final gt2 gt2Var2, boolean z, final ss2 ss2Var3, Composer composer, final int i, final int i2) {
        zq3.h(comment, "comment");
        zq3.h(list, "flagOptions");
        zq3.h(gt2Var, "rightButtonTitle");
        zq3.h(ss2Var, "onFlagAction");
        zq3.h(ss2Var2, "onRecommendToggle");
        zq3.h(gt2Var2, "onReplyAction");
        zq3.h(ss2Var3, "onShareAction");
        Composer h = composer.h(-1761874830);
        boolean z2 = (i2 & 64) != 0 ? true : z;
        if (b.G()) {
            b.S(-1761874830, i, -1, "com.nytimes.android.comments.comments.mvi.view.LoadCommentView (LazyColumnTabContent.kt:227)");
        }
        boolean isReporterReply = comment.isReporterReply();
        String commenterLocationAndTime = CommentKt.commenterLocationAndTime(comment);
        String userDisplayName = comment.getUserDisplayName();
        String avatarURL = comment.getAvatarURL();
        String commentBody = comment.getCommentBody();
        int recommendations = comment.getRecommendations();
        boolean editorsSelection = comment.getEditorsSelection();
        boolean isCommentFlagged = comment.isCommentFlagged();
        boolean isRecommended = comment.isRecommended();
        h.z(-473645335);
        boolean z3 = (((i & 7168) ^ 3072) > 2048 && h.S(ss2Var)) || (i & 3072) == 2048;
        Object A = h.A();
        if (z3 || A == Composer.a.a()) {
            A = new ss2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LoadCommentView$1$1
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((String) obj);
                    return ww8.a;
                }

                public final void invoke(String str) {
                    zq3.h(str, "flagOption");
                    ss2.this.invoke(str);
                }
            };
            h.q(A);
        }
        h.R();
        CommentViewKt.CommentView(userDisplayName, avatarURL, commenterLocationAndTime, commentBody, list, (ss2) A, new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LoadCommentView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m275invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m275invoke() {
                ss2.this.invoke(Boolean.valueOf(!comment.isRecommended()));
            }
        }, new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LoadCommentView$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m276invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m276invoke() {
                gt2.this.invoke(comment.getUserDisplayName(), Long.valueOf(comment.getCommentID()));
            }
        }, recommendations, editorsSelection, isReporterReply, isCommentFlagged, isRecommended, false, z2, false, gt2Var, new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LoadCommentView$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m277invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m277invoke() {
                ss2.this.invoke(Long.valueOf(comment.getCommentID()));
            }
        }, h, 32768, ((i >> 6) & 57344) | ((i << 12) & 3670016), 40960);
        DividerKt.a(null, eb5.Companion.a(h, 8).U(), bu1.g(1), 0.0f, h, 384, 9);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final boolean z4 = z2;
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LoadCommentView$5
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

                public final void invoke(Composer composer2, int i3) {
                    LazyColumnTabContentKt.LoadCommentView(Comment.this, list, gt2Var, ss2Var, ss2Var2, gt2Var2, z4, ss2Var3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    public static final void LoadRefreshItem(final boolean z, final qs2 qs2Var, Composer composer, final int i) {
        int i2;
        Composer composer2;
        int i3;
        Composer composer3;
        zq3.h(qs2Var, "onViewAllRepliesButtonClicked");
        Composer h = composer.h(-699332788);
        if ((i & 14) == 0) {
            i2 = (h.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(qs2Var) ? 32 : 16;
        }
        int i4 = i2;
        if ((i4 & 91) == 18 && h.i()) {
            h.K();
            composer3 = h;
        } else {
            if (b.G()) {
                b.S(-699332788, i4, -1, "com.nytimes.android.comments.comments.mvi.view.LoadRefreshItem (LazyColumnTabContent.kt:368)");
            }
            if (z) {
                h.z(-1327144389);
                Modifier j = PaddingKt.j(SizeKt.h(Modifier.a, 0.0f, 1, null), bu1.g(32), bu1.g(24));
                Arrangement.f b = Arrangement.a.b();
                h.z(693286680);
                rg4 a = m.a(b, Alignment.a.l(), h, 6);
                h.z(-1323940314);
                int a2 = cs0.a(h, 0);
                et0 o = h.o();
                ComposeUiNode.Companion companion = ComposeUiNode.F;
                qs2 a3 = companion.a();
                it2 c = LayoutKt.c(j);
                if (h.j() == null) {
                    cs0.c();
                }
                h.G();
                if (h.f()) {
                    h.D(a3);
                } else {
                    h.p();
                }
                Composer a4 = Updater.a(h);
                Updater.c(a4, a, companion.e());
                Updater.c(a4, o, companion.g());
                gt2 b2 = companion.b();
                if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                    a4.q(Integer.valueOf(a2));
                    a4.v(Integer.valueOf(a2), b2);
                }
                c.invoke(ju7.a(ju7.b(h)), h, 0);
                h.z(2058660585);
                n37 n37Var = n37.a;
                ProgressIndicatorKt.a(null, 0L, 0.0f, 0L, 0, h, 0, 31);
                h.R();
                h.t();
                h.R();
                h.R();
                h.R();
                i3 = 24;
                composer2 = h;
            } else {
                h.z(-1327144060);
                Modifier.a aVar = Modifier.a;
                float f = 32;
                SpacerKt.a(SizeKt.i(aVar, bu1.g(f)), h, 6);
                composer2 = h;
                i3 = 24;
                ButtonKt.a(qs2Var, PaddingKt.k(SizeKt.h(aVar, 0.0f, 1, null), bu1.g(f), 0.0f, 2, null), false, null, null, null, null, a.a.a(eb5.Companion.a(h, 8).g(), 0L, 0L, 0L, h, a.l << 12, 14), null, ComposableSingletons$LazyColumnTabContentKt.INSTANCE.m271getLambda1$comments_release(), composer2, ((i4 >> 3) & 14) | 805306416, 380);
                composer2.R();
            }
            composer3 = composer2;
            SpacerKt.a(SizeKt.i(Modifier.a, bu1.g(i3)), composer3, 6);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer3.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LoadRefreshItem$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer4, int i5) {
                    LazyColumnTabContentKt.LoadRefreshItem(z, qs2Var, composer4, gt6.a(i | 1));
                }
            });
        }
    }

    public static final void LoadRepliesHeader(final int i, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer h = composer.h(-183087830);
        if ((i2 & 14) == 0) {
            i3 = (h.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (b.G()) {
                b.S(-183087830, i3, -1, "com.nytimes.android.comments.comments.mvi.view.LoadRepliesHeader (LazyColumnTabContent.kt:273)");
            }
            h.z(-483455358);
            Modifier.a aVar = Modifier.a;
            Arrangement arrangement = Arrangement.a;
            Arrangement.m g = arrangement.g();
            Alignment.a aVar2 = Alignment.a;
            rg4 a = d.a(g, aVar2.k(), h, 0);
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(aVar);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a3);
            } else {
                h.p();
            }
            Composer a4 = Updater.a(h);
            Updater.c(a4, a, companion.e());
            Updater.c(a4, o, companion.g());
            gt2 b = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            ap0 ap0Var = ap0.a;
            String a5 = k48.a(R.plurals.comments_screen_repy_plurals, i, new Object[]{Integer.valueOf(i)}, h, ((i3 << 3) & ContentType.LONG_FORM_ON_DEMAND) | 512);
            SpacerKt.a(SizeKt.i(aVar, bu1.g(16)), h, 6);
            Modifier i4 = SizeKt.i(SizeKt.h(aVar, 0.0f, 1, null), bu1.g(24));
            eb5.a aVar3 = eb5.Companion;
            Modifier m = PaddingKt.m(BackgroundKt.d(i4, aVar3.a(h, 8).a(), null, 2, null), bu1.g(26), 0.0f, 0.0f, 0.0f, 14, null);
            h.z(-483455358);
            rg4 a6 = d.a(arrangement.g(), aVar2.k(), h, 0);
            h.z(-1323940314);
            int a7 = cs0.a(h, 0);
            et0 o2 = h.o();
            qs2 a8 = companion.a();
            it2 c2 = LayoutKt.c(m);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a8);
            } else {
                h.p();
            }
            Composer a9 = Updater.a(h);
            Updater.c(a9, a6, companion.e());
            Updater.c(a9, o2, companion.g());
            gt2 b2 = companion.b();
            if (a9.f() || !zq3.c(a9.A(), Integer.valueOf(a7))) {
                a9.q(Integer.valueOf(a7));
                a9.v(Integer.valueOf(a7), b2);
            }
            c2.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            composer2 = h;
            TextKt.c(a5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new j(aVar3.a(h, 8).q(), ym2.b(14, h, 6), o.b.f(), null, null, gb5.e(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, ym2.b(18, h, 6), null, null, null, 0, 0, null, 16646104, null), composer2, 0, 0, 65534);
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            composer2.R();
            composer2.t();
            composer2.R();
            composer2.R();
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LoadRepliesHeader$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i5) {
                    LazyColumnTabContentKt.LoadRepliesHeader(i, composer3, gt6.a(i2 | 1));
                }
            });
        }
    }

    public static final void LoadReply(final Comment comment, final Comment comment2, final List<? extends FlagType> list, final boolean z, final gt2 gt2Var, final gt2 gt2Var2, final gt2 gt2Var3, final ss2 ss2Var, Composer composer, final int i) {
        zq3.h(comment, "comment");
        zq3.h(comment2, "reply");
        zq3.h(list, "flagOptions");
        zq3.h(gt2Var, "onFlagReplyAction");
        zq3.h(gt2Var2, "onReplyRecommendAction");
        zq3.h(gt2Var3, "onReplyAction");
        zq3.h(ss2Var, "onShareAction");
        Composer h = composer.h(-1386044715);
        if (b.G()) {
            b.S(-1386044715, i, -1, "com.nytimes.android.comments.comments.mvi.view.LoadReply (LazyColumnTabContent.kt:323)");
        }
        String userDisplayName = comment2.getUserDisplayName();
        String commenterLocationAndTime = CommentKt.commenterLocationAndTime(comment2);
        CommentViewKt.CommentView(userDisplayName, comment2.getAvatarURL(), commenterLocationAndTime, comment2.getCommentBody(), list, new ss2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LoadReply$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return ww8.a;
            }

            public final void invoke(String str) {
                zq3.h(str, "flagOption");
                gt2.this.invoke(Long.valueOf(comment2.getCommentID()), str);
            }
        }, new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LoadReply$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m278invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m278invoke() {
                gt2.this.invoke(Long.valueOf(comment2.getCommentID()), Boolean.valueOf(!comment2.isRecommended()));
            }
        }, new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LoadReply$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m279invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m279invoke() {
                gt2.this.invoke(comment2.getUserDisplayName(), Long.valueOf(comment.getCommentID()));
            }
        }, comment2.getRecommendations(), comment2.getEditorsSelection(), comment2.isReporterReply(), comment2.isCommentFlagged(), comment2.isRecommended(), true, z, comment2.getFocusedInThread(), null, new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LoadReply$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m280invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m280invoke() {
                ss2.this.invoke(Long.valueOf(comment2.getCommentID()));
            }
        }, h, 32768, ((i << 3) & 57344) | 3072, 65536);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.LazyColumnTabContentKt$LoadReply$5
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

                public final void invoke(Composer composer2, int i2) {
                    LazyColumnTabContentKt.LoadReply(Comment.this, comment2, list, z, gt2Var, gt2Var2, gt2Var3, ss2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
