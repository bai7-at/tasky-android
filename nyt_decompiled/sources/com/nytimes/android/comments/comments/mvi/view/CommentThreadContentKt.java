package com.nytimes.android.comments.comments.mvi.view;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.comscore.streaming.ContentType;
import com.nytimes.android.comments.R;
import com.nytimes.android.comments.comments.data.remote.getallcomments.Comment;
import com.nytimes.android.comments.comments.mvi.CommentsIntent;
import com.nytimes.android.comments.comments.mvi.CommentsViewModel;
import com.nytimes.android.comments.comments.mvi.FlagType;
import com.nytimes.android.comments.common.ExtensionsKt;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.et0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.h04;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.kt2;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import defpackage.zr0;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class CommentThreadContentKt {
    public static final void CommentThreadScreen(final CommentsViewModel commentsViewModel, final ss2 ss2Var, final gt2 gt2Var, final ss2 ss2Var2, final qs2 qs2Var, Composer composer, final int i) {
        List l;
        Integer num;
        List<Comment> replies;
        zq3.h(commentsViewModel, "viewModel");
        zq3.h(ss2Var, "isFloatingActionBarExtended");
        zq3.h(gt2Var, "onReplyAction");
        zq3.h(ss2Var2, "onShareAction");
        zq3.h(qs2Var, "onShowNewCommentButton");
        Composer h = composer.h(-849142163);
        if (b.G()) {
            b.S(-849142163, i, -1, "com.nytimes.android.comments.comments.mvi.view.CommentThreadScreen (CommentThreadContent.kt:39)");
        }
        x08 b = y.b(commentsViewModel.getState(), null, h, 8, 1);
        x08 b2 = y.b(commentsViewModel.getCommentThreadState(), null, h, 8, 1);
        Comment commentThread = CommentThreadScreen$lambda$1(b2).getCommentThread();
        if (commentThread == null || (l = i.e(commentThread)) == null) {
            l = i.l();
        }
        final List<FlagType> flagOptions = CommentThreadScreen$lambda$1(b2).getFlagOptions();
        final boolean isCommentingOpen = CommentThreadScreen$lambda$0(b).isCommentingOpen();
        final boolean isLoading = CommentThreadScreen$lambda$1(b2).isLoading();
        boolean showFlagAlertDialog = CommentThreadScreen$lambda$1(b2).getShowFlagAlertDialog();
        if (isCommentingOpen && CommentThreadScreen$lambda$0(b).isRegisteredUser()) {
            qs2Var.mo865invoke();
        }
        h.z(-925442074);
        if (showFlagAlertDialog) {
            FlagCommentAlertDialogKt.FlagCommentAlertDialog(new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentThreadContentKt$CommentThreadScreen$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m205invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m205invoke() {
                    CommentsViewModel.this.intent(new CommentsIntent.DismissFlagComment(true));
                }
            }, new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentThreadContentKt$CommentThreadScreen$2
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m206invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m206invoke() {
                    CommentsViewModel.this.intent(new CommentsIntent.ConfirmFlagComment(true));
                }
            }, h, 0);
        }
        h.R();
        Comment comment = (Comment) i.m0(l);
        if (comment == null || (replies = comment.getReplies()) == null) {
            num = null;
        } else {
            Iterator<Comment> it2 = replies.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i2 = -1;
                    break;
                } else if (it2.next().getCommentID() == commentsViewModel.getPermIdFlow()) {
                    break;
                } else {
                    i2++;
                }
            }
            num = Integer.valueOf(i2);
        }
        if (num != null && num.intValue() == -1) {
            num = null;
        }
        int intValue = num != null ? num.intValue() : 0;
        if (intValue > 0) {
            intValue += 2;
        }
        h.z(-925441023);
        boolean d = h.d(intValue);
        Object A = h.A();
        if (d || A == Composer.a.a()) {
            A = new LazyListState(intValue, 0, 2, null);
            h.q(A);
        }
        LazyListState lazyListState = (LazyListState) A;
        h.R();
        ss2Var.invoke(Boolean.valueOf(ExtensionsKt.isScrollingUp(lazyListState, h, 0)));
        Modifier.a aVar = Modifier.a;
        Modifier f = SizeKt.f(BackgroundKt.d(aVar, eb5.Companion.a(h, 8).a(), null, 2, null), 0.0f, 1, null);
        h.z(733328855);
        rg4 g = BoxKt.g(Alignment.a.o(), false, h, 0);
        h.z(-1323940314);
        int a = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a2 = companion.a();
        it2 c = LayoutKt.c(f);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a2);
        } else {
            h.p();
        }
        Composer a3 = Updater.a(h);
        Updater.c(a3, g, companion.e());
        Updater.c(a3, o, companion.g());
        gt2 b3 = companion.b();
        if (a3.f() || !zq3.c(a3.A(), Integer.valueOf(a))) {
            a3.q(Integer.valueOf(a));
            a3.v(Integer.valueOf(a), b3);
        }
        c.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        final List list = l;
        LazyDslKt.a(SizeKt.d(aVar, 0.0f, 1, null), lazyListState, PaddingKt.e(0.0f, 0.0f, 0.0f, bu1.g(80), 7, null), false, null, null, null, false, new ss2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentThreadContentKt$CommentThreadScreen$3$1
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
                if (isLoading) {
                    LazyListScope.d(lazyListScope, null, null, ComposableSingletons$CommentThreadContentKt.INSTANCE.m241getLambda1$comments_release(), 3, null);
                }
                List<Comment> list2 = list;
                boolean z = isCommentingOpen;
                List<FlagType> list3 = flagOptions;
                gt2 gt2Var2 = gt2Var;
                ss2 ss2Var3 = ss2Var2;
                final CommentsViewModel commentsViewModel2 = commentsViewModel;
                for (Comment comment2 : list2) {
                    final long commentID = comment2.getCommentID();
                    ss2 ss2Var4 = ss2Var3;
                    gt2 gt2Var3 = gt2Var2;
                    CommentThreadContentKt.loadCommentThread(lazyListScope, comment2, comment2.getReplies(), z, list3, (r27 & 16) != 0, new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentThreadContentKt$CommentThreadScreen$3$1$1$1
                        @Override // defpackage.gt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return invoke((Composer) obj, ((Number) obj2).intValue());
                        }

                        public final String invoke(Composer composer2, int i3) {
                            composer2.z(1158078374);
                            if (b.G()) {
                                b.S(1158078374, i3, -1, "com.nytimes.android.comments.comments.mvi.view.CommentThreadScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommentThreadContent.kt:119)");
                            }
                            String b4 = k48.b(R.string.comments_screen_reply_button, composer2, 0);
                            if (b.G()) {
                                b.R();
                            }
                            composer2.R();
                            return b4;
                        }
                    }, new ss2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentThreadContentKt$CommentThreadScreen$3$1$1$2
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
                            CommentsViewModel.this.intent(new CommentsIntent.FlagComment(commentID, str, true));
                        }
                    }, new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentThreadContentKt$CommentThreadScreen$3$1$1$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                            CommentsViewModel.this.intent(new CommentsIntent.FlagReply(commentID, j, str, true));
                        }
                    }, new ss2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentThreadContentKt$CommentThreadScreen$3$1$1$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke(((Boolean) obj).booleanValue());
                            return ww8.a;
                        }

                        public final void invoke(boolean z2) {
                            CommentsViewModel.this.intent(new CommentsIntent.RecommendComment(commentID, z2));
                        }
                    }, new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentThreadContentKt$CommentThreadScreen$3$1$1$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // defpackage.gt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke(((Number) obj).longValue(), ((Boolean) obj2).booleanValue());
                            return ww8.a;
                        }

                        public final void invoke(long j, boolean z2) {
                            CommentsViewModel.this.intent(new CommentsIntent.RecommendReply(commentID, j, z2));
                        }
                    }, gt2Var3, ss2Var4);
                    ss2Var3 = ss2Var4;
                    list3 = list3;
                    gt2Var2 = gt2Var3;
                    z = z;
                }
            }
        }, h, 390, 248);
        String errorMessage = CommentThreadScreen$lambda$0(b).getErrorMessage();
        h.z(-925437858);
        if (errorMessage != null) {
            ErrorAlertDialogKt.ErrorAlertDialog(errorMessage, new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentThreadContentKt$CommentThreadScreen$3$2$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m207invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m207invoke() {
                    CommentsViewModel.this.intent(CommentsIntent.DismissErrorMessage.INSTANCE);
                }
            }, h, 0);
        }
        h.R();
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentThreadContentKt$CommentThreadScreen$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    CommentThreadContentKt.CommentThreadScreen(CommentsViewModel.this, ss2Var, gt2Var, ss2Var2, qs2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    private static final CommentsUIState CommentThreadScreen$lambda$0(x08 x08Var) {
        return (CommentsUIState) x08Var.getValue();
    }

    private static final CommentThreadUIState CommentThreadScreen$lambda$1(x08 x08Var) {
        return (CommentThreadUIState) x08Var.getValue();
    }

    public static final void loadCommentThread(LazyListScope lazyListScope, final Comment comment, final List<Comment> list, final boolean z, final List<? extends FlagType> list2, final boolean z2, final gt2 gt2Var, final ss2 ss2Var, final gt2 gt2Var2, final ss2 ss2Var2, final gt2 gt2Var3, final gt2 gt2Var4, final ss2 ss2Var3) {
        zq3.h(lazyListScope, "<this>");
        zq3.h(comment, "comment");
        zq3.h(list, "replies");
        zq3.h(list2, "flagOptions");
        zq3.h(gt2Var, "rightButtonTitle");
        zq3.h(ss2Var, "onFlagAction");
        zq3.h(gt2Var2, "onFlagReplyAction");
        zq3.h(ss2Var2, "onRecommendToggle");
        zq3.h(gt2Var3, "onReplyRecommendAction");
        zq3.h(gt2Var4, "onReplyAction");
        zq3.h(ss2Var3, "onShareAction");
        LazyListScope.d(lazyListScope, null, null, zr0.c(265522386, true, new it2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentThreadContentKt$loadCommentThread$1
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

            public final void invoke(h04 h04Var, Composer composer, int i) {
                zq3.h(h04Var, "$this$item");
                if ((i & 81) == 16 && composer.i()) {
                    composer.K();
                    return;
                }
                if (b.G()) {
                    b.S(265522386, i, -1, "com.nytimes.android.comments.comments.mvi.view.loadCommentThread.<anonymous> (CommentThreadContent.kt:204)");
                }
                Comment comment2 = Comment.this;
                List<FlagType> list3 = list2;
                gt2 gt2Var5 = gt2Var;
                ss2 ss2Var4 = ss2Var;
                ss2 ss2Var5 = ss2Var2;
                composer.z(875969485);
                boolean S = composer.S(gt2Var4);
                final gt2 gt2Var6 = gt2Var4;
                Object A = composer.A();
                if (S || A == Composer.a.a()) {
                    A = new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentThreadContentKt$loadCommentThread$1$1$1
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
                    composer.q(A);
                }
                composer.R();
                LazyColumnTabContentKt.LoadCommentView(comment2, list3, gt2Var5, ss2Var4, ss2Var5, (gt2) A, z2, ss2Var3, composer, 72, 0);
                if (b.G()) {
                    b.R();
                }
            }
        }), 3, null);
        if (list.isEmpty()) {
            return;
        }
        LazyListScope.d(lazyListScope, null, null, zr0.c(1754867415, true, new it2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentThreadContentKt$loadCommentThread$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((h04) obj, (Composer) obj2, ((Number) obj3).intValue());
                return ww8.a;
            }

            public final void invoke(h04 h04Var, Composer composer, int i) {
                zq3.h(h04Var, "$this$item");
                if ((i & 81) == 16 && composer.i()) {
                    composer.K();
                    return;
                }
                if (b.G()) {
                    b.S(1754867415, i, -1, "com.nytimes.android.comments.comments.mvi.view.loadCommentThread.<anonymous> (CommentThreadContent.kt:223)");
                }
                LazyColumnTabContentKt.LoadRepliesHeader(list.size(), composer, 0);
                if (b.G()) {
                    b.R();
                }
            }
        }), 3, null);
        LazyListScope.e(lazyListScope, list.size(), new ss2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentThreadContentKt$loadCommentThread$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i) {
                return Long.valueOf(list.get(i).getCommentID());
            }
        }, null, zr0.c(-481016082, true, new kt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentThreadContentKt$loadCommentThread$4
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

            public final void invoke(h04 h04Var, int i, Composer composer, int i2) {
                zq3.h(h04Var, "$this$items");
                if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
                    i2 |= composer.d(i) ? 32 : 16;
                }
                if ((i2 & 721) == 144 && composer.i()) {
                    composer.K();
                    return;
                }
                if (b.G()) {
                    b.S(-481016082, i2, -1, "com.nytimes.android.comments.comments.mvi.view.loadCommentThread.<anonymous> (CommentThreadContent.kt:228)");
                }
                Comment comment2 = list.get(i);
                Comment comment3 = comment;
                List<FlagType> list3 = list2;
                boolean z3 = z;
                gt2 gt2Var5 = gt2Var2;
                gt2 gt2Var6 = gt2Var3;
                composer.z(875970316);
                boolean S = composer.S(gt2Var4);
                final gt2 gt2Var7 = gt2Var4;
                Object A = composer.A();
                if (S || A == Composer.a.a()) {
                    A = new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentThreadContentKt$loadCommentThread$4$1$1
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
                    composer.q(A);
                }
                composer.R();
                LazyColumnTabContentKt.LoadReply(comment3, comment2, list3, z3, gt2Var5, gt2Var6, (gt2) A, ss2Var3, composer, 584);
                if (b.G()) {
                    b.R();
                }
            }
        }), 4, null);
    }
}
