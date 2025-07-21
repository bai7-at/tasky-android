package com.nytimes.android.comments.comments.mvi;

import android.content.Intent;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.y;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import com.nytimes.android.comments.comments.mvi.CommentsIntent;
import com.nytimes.android.comments.comments.mvi.navigation.CommentsGraphKt;
import com.nytimes.android.comments.comments.mvi.navigation.NavigationIntent;
import com.nytimes.android.comments.comments.mvi.navigation.NavigatorKt;
import com.nytimes.android.comments.comments.mvi.navigation.ViewCommentsScreen;
import com.nytimes.android.comments.comments.mvi.view.CommentsTabsUIState;
import com.nytimes.android.comments.comments.mvi.view.CommentsTopAppBarKt;
import com.nytimes.android.comments.comments.mvi.view.WriteNewCommentFloatingButtonKt;
import com.nytimes.android.designsystem.uicompose.composable.NytScaffoldKt;
import com.nytimes.android.designsystem.uicompose.ui.NytThemeKt;
import com.nytimes.android.utils.snackbar.LocalSnackbarKt;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.gt2;
import defpackage.it2;
import defpackage.j5;
import defpackage.k48;
import defpackage.m25;
import defpackage.n25;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.x08;
import defpackage.ym5;
import defpackage.yr0;
import defpackage.zq3;
import defpackage.zr0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.i;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
final class ViewingCommentsActivity$onCreate$1 extends Lambda implements gt2 {
    final /* synthetic */ ViewingCommentsActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewingCommentsActivity$onCreate$1(ViewingCommentsActivity viewingCommentsActivity) {
        super(2);
        this.this$0 = viewingCommentsActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$1(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$4(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$5(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    private static final CommentsTabsUIState invoke$lambda$6(x08 x08Var) {
        return (CommentsTabsUIState) x08Var.getValue();
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return ww8.a;
    }

    public final void invoke(Composer composer, int i) {
        CommentsViewModel viewModel;
        if ((i & 11) == 2 && composer.i()) {
            composer.K();
            return;
        }
        if (b.G()) {
            b.S(-1293589459, i, -1, "com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity.onCreate.<anonymous> (ViewingCommentsActivity.kt:73)");
        }
        composer.z(655338945);
        Object A = composer.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = b0.e(Boolean.FALSE, null, 2, null);
            composer.q(A);
        }
        final sy4 sy4Var = (sy4) A;
        composer.R();
        composer.z(655339027);
        Object A2 = composer.A();
        if (A2 == aVar.a()) {
            A2 = b0.e(Boolean.TRUE, null, 2, null);
            composer.q(A2);
        }
        final sy4 sy4Var2 = (sy4) A2;
        composer.R();
        final n25 e = NavHostControllerKt.e(new Navigator[0], composer, 8);
        viewModel = this.this$0.getViewModel();
        x08 b = y.b(viewModel.getTabsState(), null, composer, 8, 1);
        final LinkedHashMap<CommentTab, Integer> commentsTabs = invoke$lambda$6(b).getCommentsTabs();
        final CommentTab selectedCommentTab = invoke$lambda$6(b).getSelectedCommentTab();
        Integer num = commentsTabs.get(selectedCommentTab);
        if (num == null) {
            num = 0;
        }
        final int intValue = num.intValue();
        final List<SortingOption> sortingOptions = invoke$lambda$6(b).getSortingOptions();
        final boolean showOfflineMessage = invoke$lambda$6(b).getShowOfflineMessage();
        final ViewingCommentsActivity viewingCommentsActivity = this.this$0;
        NytThemeKt.a(false, null, null, zr0.b(composer, -1883388771, true, new gt2() { // from class: com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity$onCreate$1.1
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
                if ((i2 & 11) == 2 && composer2.i()) {
                    composer2.K();
                    return;
                }
                if (b.G()) {
                    b.S(-1883388771, i2, -1, "com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity.onCreate.<anonymous>.<anonymous> (ViewingCommentsActivity.kt:87)");
                }
                final int i3 = intValue;
                final CommentTab commentTab = selectedCommentTab;
                final n25 n25Var = e;
                final ViewingCommentsActivity viewingCommentsActivity2 = viewingCommentsActivity;
                yr0 b2 = zr0.b(composer2, -1707121494, true, new gt2() { // from class: com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity.onCreate.1.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer3, int i4) {
                        String b3;
                        if ((i4 & 11) == 2 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-1707121494, i4, -1, "com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ViewingCommentsActivity.kt:89)");
                        }
                        if (i3 > 0) {
                            composer3.z(1090656861);
                            b3 = i3 + " " + k48.b(commentTab.getTitle(), composer3, 0);
                            composer3.R();
                        } else {
                            composer3.z(1090656989);
                            b3 = k48.b(commentTab.getTitle(), composer3, 0);
                            composer3.R();
                        }
                        String str = b3;
                        final n25 n25Var2 = n25Var;
                        final ViewingCommentsActivity viewingCommentsActivity3 = viewingCommentsActivity2;
                        BackHandlerKt.a(false, new qs2() { // from class: com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity.onCreate.1.1.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m199invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m199invoke() {
                                com.nytimes.android.comments.comments.mvi.navigation.Navigator navigator;
                                NavDestination E = n25.this.E();
                                com.nytimes.android.comments.comments.mvi.navigation.Navigator navigator2 = null;
                                String v = E != null ? E.v() : null;
                                ViewCommentsScreen.ViewComments viewComments = ViewCommentsScreen.ViewComments.INSTANCE;
                                if (zq3.c(v, viewComments.getRoute())) {
                                    viewingCommentsActivity3.navigateToSingleArticleActivity();
                                    return;
                                }
                                navigator = viewingCommentsActivity3.navigator;
                                if (navigator == null) {
                                    zq3.z("navigator");
                                } else {
                                    navigator2 = navigator;
                                }
                                navigator2.navigate(new NavigationIntent.NavigateBack(viewComments));
                            }
                        }, composer3, 0, 1);
                        final ViewingCommentsActivity viewingCommentsActivity4 = viewingCommentsActivity2;
                        CommentsTopAppBarKt.CommentsTopAppBar(str, false, false, new qs2() { // from class: com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity.onCreate.1.1.1.2
                            {
                                super(0);
                            }

                            @Override // defpackage.qs2
                            /* renamed from: invoke */
                            public /* bridge */ /* synthetic */ Object mo865invoke() {
                                m200invoke();
                                return ww8.a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m200invoke() {
                                ViewingCommentsActivity.this.getOnBackPressedDispatcher().l();
                            }
                        }, null, composer3, 0, 22);
                        if (b.G()) {
                            b.R();
                        }
                    }
                });
                final sy4 sy4Var3 = sy4Var;
                final sy4 sy4Var4 = sy4Var2;
                final ViewingCommentsActivity viewingCommentsActivity3 = viewingCommentsActivity;
                yr0 b3 = zr0.b(composer2, 1534015791, true, new gt2() { // from class: com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity.onCreate.1.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer3, int i4) {
                        if ((i4 & 11) == 2 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(1534015791, i4, -1, "com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ViewingCommentsActivity.kt:120)");
                        }
                        if (ViewingCommentsActivity$onCreate$1.invoke$lambda$1(sy4.this)) {
                            boolean invoke$lambda$4 = ViewingCommentsActivity$onCreate$1.invoke$lambda$4(sy4Var4);
                            final ViewingCommentsActivity viewingCommentsActivity4 = viewingCommentsActivity3;
                            WriteNewCommentFloatingButtonKt.WriteNewCommentFloatingButton(invoke$lambda$4, new qs2() { // from class: com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity.onCreate.1.1.2.1
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public /* bridge */ /* synthetic */ Object mo865invoke() {
                                    m201invoke();
                                    return ww8.a;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m201invoke() {
                                    CommentsViewModel viewModel2;
                                    j5 j5Var;
                                    ViewingCommentsActivity viewingCommentsActivity5 = ViewingCommentsActivity.this;
                                    viewModel2 = viewingCommentsActivity5.getViewModel();
                                    Intent openWriteNewCommentActivity$default = ViewingCommentsActivityKt.openWriteNewCommentActivity$default(viewingCommentsActivity5, false, viewModel2.getArticleUrlState().getValue(), null, null, 13, null);
                                    j5Var = ViewingCommentsActivity.this.startForResult;
                                    j5Var.a(openWriteNewCommentActivity$default);
                                }
                            }, composer3, 0);
                        }
                        if (b.G()) {
                            b.R();
                        }
                    }
                });
                final ViewingCommentsActivity viewingCommentsActivity4 = viewingCommentsActivity;
                qs2 qs2Var = new qs2() { // from class: com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity.onCreate.1.1.3
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m202invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m202invoke() {
                        CommentsViewModel viewModel2;
                        viewModel2 = ViewingCommentsActivity.this.getViewModel();
                        viewModel2.intent(CommentsIntent.DismissFlagSuccessMessage.INSTANCE);
                    }
                };
                final ViewingCommentsActivity viewingCommentsActivity5 = viewingCommentsActivity;
                final n25 n25Var2 = e;
                final boolean z = showOfflineMessage;
                final LinkedHashMap<CommentTab, Integer> linkedHashMap = commentsTabs;
                final CommentTab commentTab2 = selectedCommentTab;
                final List<SortingOption> list = sortingOptions;
                final sy4 sy4Var5 = sy4Var2;
                final sy4 sy4Var6 = sy4Var;
                NytScaffoldKt.a(null, b2, null, 0.0f, null, null, b3, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, null, qs2Var, zr0.b(composer2, -682854980, true, new it2() { // from class: com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity.onCreate.1.1.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    private static final NavigationIntent invoke$lambda$0(x08 x08Var) {
                        return (NavigationIntent) x08Var.getValue();
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((ym5) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return ww8.a;
                    }

                    public final void invoke(ym5 ym5Var, Composer composer3, int i4) {
                        com.nytimes.android.comments.comments.mvi.navigation.Navigator navigator;
                        zq3.h(ym5Var, "it");
                        if ((i4 & 81) == 16 && composer3.i()) {
                            composer3.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-682854980, i4, -1, "com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ViewingCommentsActivity.kt:132)");
                        }
                        SnackbarUtil snackbarUtil = (SnackbarUtil) composer3.m(LocalSnackbarKt.a());
                        navigator = ViewingCommentsActivity.this.navigator;
                        if (navigator == null) {
                            zq3.z("navigator");
                            navigator = null;
                        }
                        x08 b4 = y.b(navigator.getDestinationState(), null, composer3, 8, 1);
                        NavigatorKt.NavigationEffects(invoke$lambda$0(b4), n25Var2, composer3, 64);
                        n25 n25Var3 = n25Var2;
                        String route = invoke$lambda$0(b4).getRoute().getRoute();
                        final ViewingCommentsActivity viewingCommentsActivity6 = ViewingCommentsActivity.this;
                        final LinkedHashMap<CommentTab, Integer> linkedHashMap2 = linkedHashMap;
                        final CommentTab commentTab3 = commentTab2;
                        final List<SortingOption> list2 = list;
                        final sy4 sy4Var7 = sy4Var5;
                        final sy4 sy4Var8 = sy4Var6;
                        NavHostKt.b(n25Var3, route, null, null, null, null, null, null, null, new ss2() { // from class: com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity.onCreate.1.1.4.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((m25) obj);
                                return ww8.a;
                            }

                            public final void invoke(m25 m25Var) {
                                CommentsViewModel viewModel2;
                                zq3.h(m25Var, "$this$NavHost");
                                viewModel2 = ViewingCommentsActivity.this.getViewModel();
                                Set<CommentTab> keySet = linkedHashMap2.keySet();
                                zq3.g(keySet, "<get-keys>(...)");
                                List X0 = i.X0(keySet);
                                CommentTab commentTab4 = commentTab3;
                                List<SortingOption> list3 = list2;
                                final sy4 sy4Var9 = sy4Var7;
                                ss2 ss2Var = new ss2() { // from class: com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity.onCreate.1.1.4.1.1
                                    {
                                        super(1);
                                    }

                                    @Override // defpackage.ss2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke(((Boolean) obj).booleanValue());
                                        return ww8.a;
                                    }

                                    public final void invoke(boolean z2) {
                                        if (ViewingCommentsActivity$onCreate$1.invoke$lambda$4(sy4.this) != z2) {
                                            ViewingCommentsActivity$onCreate$1.invoke$lambda$5(sy4.this, z2);
                                        }
                                    }
                                };
                                final sy4 sy4Var10 = sy4Var8;
                                qs2 qs2Var2 = new qs2() { // from class: com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity.onCreate.1.1.4.1.2
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        m203invoke();
                                        return ww8.a;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m203invoke() {
                                        if (ViewingCommentsActivity$onCreate$1.invoke$lambda$1(sy4.this)) {
                                            return;
                                        }
                                        ViewingCommentsActivity$onCreate$1.invoke$lambda$2(sy4.this, true);
                                    }
                                };
                                final ViewingCommentsActivity viewingCommentsActivity7 = ViewingCommentsActivity.this;
                                gt2 gt2Var = new gt2() { // from class: com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity.onCreate.1.1.4.1.3
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
                                        ViewingCommentsActivity.this.openReplyScreen(str, j);
                                    }
                                };
                                final ViewingCommentsActivity viewingCommentsActivity8 = ViewingCommentsActivity.this;
                                ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity.onCreate.1.1.4.1.4
                                    {
                                        super(1);
                                    }

                                    @Override // defpackage.ss2
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        invoke(((Number) obj).longValue());
                                        return ww8.a;
                                    }

                                    public final void invoke(long j) {
                                        ViewingCommentsActivity.this.launchShareWithUrl(j);
                                    }
                                };
                                final ViewingCommentsActivity viewingCommentsActivity9 = ViewingCommentsActivity.this;
                                final sy4 sy4Var11 = sy4Var8;
                                CommentsGraphKt.commentsGraph(m25Var, viewModel2, X0, commentTab4, list3, ss2Var, qs2Var2, gt2Var, ss2Var2, new qs2() { // from class: com.nytimes.android.comments.comments.mvi.ViewingCommentsActivity.onCreate.1.1.4.1.5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // defpackage.qs2
                                    /* renamed from: invoke */
                                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                                        m204invoke();
                                        return ww8.a;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m204invoke() {
                                        com.nytimes.android.comments.comments.mvi.navigation.Navigator navigator2;
                                        navigator2 = ViewingCommentsActivity.this.navigator;
                                        if (navigator2 == null) {
                                            zq3.z("navigator");
                                            navigator2 = null;
                                        }
                                        navigator2.navigate(new NavigationIntent.NavigateTo(ViewCommentsScreen.ViewCommentThread.INSTANCE));
                                        if (ViewingCommentsActivity$onCreate$1.invoke$lambda$1(sy4Var11)) {
                                            ViewingCommentsActivity$onCreate$1.invoke$lambda$2(sy4Var11, false);
                                        }
                                    }
                                });
                            }
                        }, composer3, 8, 508);
                        if (z) {
                            SnackbarUtil.p(snackbarUtil, false, 1, null);
                        }
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), composer2, 1572912, 0, 6, 524221);
                if (b.G()) {
                    b.R();
                }
            }
        }), composer, 3072, 7);
        if (b.G()) {
            b.R();
        }
    }
}
