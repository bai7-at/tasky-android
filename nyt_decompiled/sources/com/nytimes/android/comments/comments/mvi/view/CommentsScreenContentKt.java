package com.nytimes.android.comments.comments.mvi.view;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material.pullrefresh.PullRefreshStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import androidx.paging.d;
import com.comscore.streaming.ContentType;
import com.nytimes.android.comments.R;
import com.nytimes.android.comments.comments.data.remote.getallcomments.Comment;
import com.nytimes.android.comments.comments.mvi.CommentTab;
import com.nytimes.android.comments.comments.mvi.CommentsViewModel;
import com.nytimes.android.comments.comments.mvi.FlagType;
import com.nytimes.android.comments.comments.mvi.SortingOption;
import com.nytimes.android.comments.common.ExtensionsKt;
import com.nytimes.android.utils.snackbar.LocalSnackbarKt;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.ap0;
import defpackage.bu1;
import defpackage.by0;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.eb5;
import defpackage.et0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.k48;
import defpackage.kt2;
import defpackage.py1;
import defpackage.qn5;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class CommentsScreenContentKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommentTab.values().length];
            try {
                iArr[CommentTab.All.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommentTab.NYTPicks.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommentTab.ReaderPicks.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CommentTab.NYTReplies.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void CommentsScreenContent(final CommentsViewModel commentsViewModel, final List<? extends CommentTab> list, final CommentTab commentTab, final List<? extends SortingOption> list2, final SortingOption sortingOption, final ss2 ss2Var, final gt2 gt2Var, final gt2 gt2Var2, final ss2 ss2Var2, final it2 it2Var, final it2 it2Var2, final ss2 ss2Var3, final ss2 ss2Var4, final qs2 qs2Var, final gt2 gt2Var3, final ss2 ss2Var5, final ss2 ss2Var6, final ss2 ss2Var7, final qs2 qs2Var2, final qs2 qs2Var3, final qs2 qs2Var4, final qs2 qs2Var5, Composer composer, final int i, final int i2, final int i3) {
        boolean c;
        zq3.h(commentsViewModel, "viewModel");
        zq3.h(list, "commentsTabs");
        zq3.h(commentTab, "selectedCommentTab");
        zq3.h(list2, "sortingOptions");
        zq3.h(sortingOption, "selectedSortingOption");
        zq3.h(ss2Var, "isFloatingActionBarExtended");
        zq3.h(gt2Var, "onFlagAction");
        zq3.h(gt2Var2, "onRecommendAction");
        zq3.h(ss2Var2, "onViewAllRepliesButtonClicked");
        zq3.h(it2Var, "onFlagReplyAction");
        zq3.h(it2Var2, "onRecommendReplyAction");
        zq3.h(ss2Var3, "onSortingOptionChanged");
        zq3.h(ss2Var4, "onSelectedTabChanged");
        zq3.h(qs2Var, "onRefresh");
        zq3.h(gt2Var3, "onReplyAction");
        zq3.h(ss2Var5, "onViewThreadAction");
        zq3.h(ss2Var6, "onViewThreadRepliesAction");
        zq3.h(ss2Var7, "onShareAction");
        zq3.h(qs2Var2, "onShowNewCommentButton");
        zq3.h(qs2Var3, "onConfirmFlagComment");
        zq3.h(qs2Var4, "onDismissFlagComment");
        zq3.h(qs2Var5, "onDismissErrorMessage");
        Composer h = composer.h(2106410464);
        if (b.G()) {
            b.S(2106410464, i, i2, "com.nytimes.android.comments.comments.mvi.view.CommentsScreenContent (CommentsScreenContent.kt:92)");
        }
        SnackbarUtil snackbarUtil = (SnackbarUtil) h.m(LocalSnackbarKt.a());
        x08 b = y.b(commentsViewModel.getState(), null, h, 8, 1);
        boolean z = CommentsScreenContent$lambda$0(b).isCommentingOpen() && CommentsScreenContent$lambda$0(b).isRegisteredUser();
        boolean showEmptyContent = CommentsScreenContent$lambda$0(b).getShowEmptyContent();
        final boolean isReporter = CommentsScreenContent$lambda$0(b).isReporter();
        boolean showFlagAlertDialog = CommentsScreenContent$lambda$0(b).getShowFlagAlertDialog();
        boolean showFlagSuccessMessage = CommentsScreenContent$lambda$0(b).getShowFlagSuccessMessage();
        final List<FlagType> flagOptions = CommentsScreenContent$lambda$0(b).getFlagOptions();
        if (z) {
            qs2Var2.mo865invoke();
        }
        h.z(329109066);
        if (showEmptyContent && z) {
            CommentsEmptyContentKt.CommentsEmptyContent(null, h, 0, 1);
            h.R();
            if (b.G()) {
                b.R();
            }
            cc7 k = h.k();
            if (k != null) {
                k.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsScreenContentKt$CommentsScreenContent$1
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

                    public final void invoke(Composer composer2, int i4) {
                        CommentsScreenContentKt.CommentsScreenContent(CommentsViewModel.this, list, commentTab, list2, sortingOption, ss2Var, gt2Var, gt2Var2, ss2Var2, it2Var, it2Var2, ss2Var3, ss2Var4, qs2Var, gt2Var3, ss2Var5, ss2Var6, ss2Var7, qs2Var2, qs2Var3, qs2Var4, qs2Var5, composer2, gt6.a(i | 1), gt6.a(i2), gt6.a(i3));
                    }
                });
                return;
            }
            return;
        }
        h.R();
        final LazyPagingItems b2 = LazyPagingItemsKt.b(commentsViewModel.getGetAllComments(), null, h, 8, 1);
        final LazyPagingItems b3 = LazyPagingItemsKt.b(commentsViewModel.getGetNYTPicksComments(), null, h, 8, 1);
        final LazyPagingItems b4 = LazyPagingItemsKt.b(commentsViewModel.getGetReadersPicksComments(), null, h, 8, 1);
        final LazyPagingItems b5 = LazyPagingItemsKt.b(commentsViewModel.getGetReporterReplies(), null, h, 8, 1);
        int i4 = WhenMappings.$EnumSwitchMapping$0[commentTab.ordinal()];
        if (i4 == 1) {
            c = zq3.c(b2.i().d(), d.b.b);
        } else if (i4 == 2) {
            c = zq3.c(b3.i().d(), d.b.b);
        } else if (i4 == 3) {
            c = zq3.c(b4.i().d(), d.b.b);
        } else {
            if (i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            c = zq3.c(b5.i().d(), d.b.b);
        }
        boolean z2 = c;
        h.z(329109982);
        boolean z3 = (((i2 & 7168) ^ 3072) > 2048 && h.S(qs2Var)) || (i2 & 3072) == 2048;
        Object A = h.A();
        if (z3 || A == Composer.a.a()) {
            A = new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsScreenContentKt$CommentsScreenContent$pullRefreshState$1$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m229invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m229invoke() {
                    qs2.this.mo865invoke();
                }
            };
            h.q(A);
        }
        h.R();
        PullRefreshState a = PullRefreshStateKt.a(z2, (qs2) A, 0.0f, 0.0f, h, 0, 12);
        final GetAllRepliesState getAllRepliesState = CommentsScreenContent$lambda$0(b).getGetAllRepliesState();
        int indexOf = list.indexOf(commentTab);
        final PagerState j = PagerStateKt.j(indexOf, 0.0f, new qs2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsScreenContentKt$CommentsScreenContent$pagerState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Integer mo865invoke() {
                return Integer.valueOf(list.size());
            }
        }, h, 0, 2);
        h.z(773894976);
        h.z(-492369756);
        Object A2 = h.A();
        if (A2 == Composer.a.a()) {
            e eVar = new e(py1.j(EmptyCoroutineContext.a, h));
            h.q(eVar);
            A2 = eVar;
        }
        h.R();
        final CoroutineScope a2 = ((e) A2).a();
        h.R();
        py1.d(j, new CommentsScreenContentKt$CommentsScreenContent$2(j, ss2Var4, list, null), h, 64);
        Modifier.a aVar = Modifier.a;
        Modifier d = PullRefreshKt.d(aVar, a, false, 2, null);
        h.z(733328855);
        Alignment.a aVar2 = Alignment.a;
        rg4 g = BoxKt.g(aVar2.o(), false, h, 0);
        h.z(-1323940314);
        int a3 = cs0.a(h, 0);
        et0 o = h.o();
        ComposeUiNode.Companion companion = ComposeUiNode.F;
        qs2 a4 = companion.a();
        it2 c2 = LayoutKt.c(d);
        if (h.j() == null) {
            cs0.c();
        }
        h.G();
        if (h.f()) {
            h.D(a4);
        } else {
            h.p();
        }
        Composer a5 = Updater.a(h);
        Updater.c(a5, g, companion.e());
        Updater.c(a5, o, companion.g());
        gt2 b6 = companion.b();
        if (a5.f() || !zq3.c(a5.A(), Integer.valueOf(a3))) {
            a5.q(Integer.valueOf(a3));
            a5.v(Integer.valueOf(a3), b6);
        }
        c2.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
        Modifier c3 = boxScopeInstance.c(PaddingKt.k(SizeKt.d(BackgroundKt.d(aVar, eb5.Companion.a(h, 8).a(), null, 2, null), 0.0f, 1, null), bu1.g(14), 0.0f, 2, null), aVar2.m());
        h.z(-483455358);
        rg4 a6 = androidx.compose.foundation.layout.d.a(Arrangement.a.g(), aVar2.k(), h, 0);
        h.z(-1323940314);
        int a7 = cs0.a(h, 0);
        et0 o2 = h.o();
        qs2 a8 = companion.a();
        it2 c4 = LayoutKt.c(c3);
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
        gt2 b7 = companion.b();
        if (a9.f() || !zq3.c(a9.A(), Integer.valueOf(a7))) {
            a9.q(Integer.valueOf(a7));
            a9.v(Integer.valueOf(a7), b7);
        }
        c4.invoke(ju7.a(ju7.b(h)), h, 0);
        h.z(2058660585);
        ap0 ap0Var = ap0.a;
        SpacerKt.a(SizeKt.i(aVar, bu1.g(24)), h, 6);
        CommentsTabsKt.CommentsTabs(list, null, indexOf, new ss2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsScreenContentKt$CommentsScreenContent$3$1$1

            @fc1(c = "com.nytimes.android.comments.comments.mvi.view.CommentsScreenContentKt$CommentsScreenContent$3$1$1$1", f = "CommentsScreenContent.kt", l = {168}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.comments.comments.mvi.view.CommentsScreenContentKt$CommentsScreenContent$3$1$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ int $index;
                final /* synthetic */ PagerState $pagerState;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PagerState pagerState, int i, by0<? super AnonymousClass1> by0Var) {
                    super(2, by0Var);
                    this.$pagerState = pagerState;
                    this.$index = i;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0<ww8> create(Object obj, by0<?> by0Var) {
                    return new AnonymousClass1(this.$pagerState, this.$index, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        PagerState pagerState = this.$pagerState;
                        int i2 = this.$index;
                        this.label = 1;
                        if (PagerState.b0(pagerState, i2, 0.0f, this, 2, null) == h) {
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
                public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
                    return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return ww8.a;
            }

            public final void invoke(int i5) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(j, i5, null), 3, null);
            }
        }, h, 8, 2);
        final boolean z4 = z;
        PagerKt.a(j, null, null, null, 0, 0.0f, null, null, false, false, null, null, zr0.b(h, 226756929, true, new kt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsScreenContentKt$CommentsScreenContent$3$1$2

            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CommentTab.values().length];
                    try {
                        iArr[CommentTab.All.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CommentTab.NYTPicks.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CommentTab.ReaderPicks.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CommentTab.NYTReplies.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // defpackage.kt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((qn5) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
                return ww8.a;
            }

            public final void invoke(qn5 qn5Var, int i5, Composer composer2, int i6) {
                LazyPagingItems lazyPagingItems;
                zq3.h(qn5Var, "$this$HorizontalPager");
                if (b.G()) {
                    b.S(226756929, i6, -1, "com.nytimes.android.comments.comments.mvi.view.CommentsScreenContent.<anonymous>.<anonymous>.<anonymous> (CommentsScreenContent.kt:175)");
                }
                CommentTab commentTab2 = list.get(i5);
                int i7 = WhenMappings.$EnumSwitchMapping$0[commentTab2.ordinal()];
                if (i7 == 1) {
                    lazyPagingItems = b2;
                } else if (i7 == 2) {
                    lazyPagingItems = b3;
                } else if (i7 == 3) {
                    lazyPagingItems = b4;
                } else {
                    if (i7 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lazyPagingItems = b5;
                }
                int i8 = LazyPagingItems.f;
                LazyListState rememberLazyListState = ExtensionsKt.rememberLazyListState(lazyPagingItems, composer2, i8);
                ss2Var.invoke(Boolean.valueOf(ExtensionsKt.isScrollingUp(rememberLazyListState, composer2, 0)));
                LazyColumnTabContentKt.LazyColumnTabContent(lazyPagingItems, rememberLazyListState, commentTab2, getAllRepliesState, list2, sortingOption, isReporter, z4, flagOptions, gt2Var, gt2Var2, ss2Var2, it2Var, it2Var2, ss2Var3, gt2Var3, ss2Var5, ss2Var6, ss2Var7, composer2, i8 | 134250496, 0);
                if (b.G()) {
                    b.R();
                }
            }
        }), h, 0, 384, 4094);
        h.R();
        h.t();
        h.R();
        h.R();
        PullRefreshIndicatorKt.d(z2, a, boxScopeInstance.c(aVar, aVar2.m()), 0L, 0L, false, h, PullRefreshState.j << 3, 56);
        h.z(901108733);
        if (showFlagSuccessMessage) {
            SnackbarUtil.z(snackbarUtil, k48.b(R.string.flag_comment_success_message, h, 0), 0, false, 6, null);
        }
        h.R();
        h.z(901108916);
        if (showFlagAlertDialog) {
            FlagCommentAlertDialogKt.FlagCommentAlertDialog(qs2Var4, qs2Var3, h, (i3 & 14) | ((i2 >> 24) & ContentType.LONG_FORM_ON_DEMAND));
        }
        h.R();
        String errorMessage = CommentsScreenContent$lambda$0(b).getErrorMessage();
        h.z(329113625);
        if (errorMessage != null) {
            ErrorAlertDialogKt.ErrorAlertDialog(errorMessage, qs2Var5, h, i3 & ContentType.LONG_FORM_ON_DEMAND);
            ww8 ww8Var = ww8.a;
        }
        h.R();
        h.R();
        h.t();
        h.R();
        h.R();
        if (b.G()) {
            b.R();
        }
        cc7 k2 = h.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: com.nytimes.android.comments.comments.mvi.view.CommentsScreenContentKt$CommentsScreenContent$4
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

                public final void invoke(Composer composer2, int i5) {
                    CommentsScreenContentKt.CommentsScreenContent(CommentsViewModel.this, list, commentTab, list2, sortingOption, ss2Var, gt2Var, gt2Var2, ss2Var2, it2Var, it2Var2, ss2Var3, ss2Var4, qs2Var, gt2Var3, ss2Var5, ss2Var6, ss2Var7, qs2Var2, qs2Var3, qs2Var4, qs2Var5, composer2, gt6.a(i | 1), gt6.a(i2), gt6.a(i3));
                }
            });
        }
    }

    private static final CommentsUIState CommentsScreenContent$lambda$0(x08 x08Var) {
        return (CommentsUIState) x08Var.getValue();
    }

    public static final String rightButtonTitle(boolean z, Comment comment, Composer composer, int i) {
        String b;
        zq3.h(comment, "comment");
        composer.z(695055219);
        if (b.G()) {
            b.S(695055219, i, -1, "com.nytimes.android.comments.comments.mvi.view.rightButtonTitle (CommentsScreenContent.kt:240)");
        }
        if (z) {
            composer.z(1616061273);
            Long parentID = comment.getParentID();
            composer.z(1616061291);
            b = null;
            if (parentID != null) {
                String parentUserDisplayName = comment.getParentUserDisplayName();
                composer.z(1616061340);
                if (parentUserDisplayName != null) {
                    b = k48.b(R.string.comments_screen_thread_in_reply_to_button, composer, 0) + " " + parentUserDisplayName;
                }
                composer.R();
                composer.z(1616061309);
                if (b == null) {
                    b = k48.b(R.string.comments_screen_thread_button, composer, 0);
                }
                composer.R();
            }
            composer.R();
            if (b == null) {
                b = k48.a(R.plurals.comments_screen_thread_button_plurals, comment.getReplyCount(), new Object[]{Integer.valueOf(comment.getReplyCount())}, composer, 512);
            }
            composer.R();
        } else {
            composer.z(1616061817);
            b = k48.b(R.string.comments_screen_reply_button, composer, 0);
            composer.R();
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return b;
    }
}
