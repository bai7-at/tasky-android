package com.nytimes.android.comments.comments.mvi.navigation;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.c;
import androidx.compose.animation.e;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.NavGraphBuilderKt;
import com.nytimes.android.comments.comments.mvi.CommentTab;
import com.nytimes.android.comments.comments.mvi.CommentsViewModel;
import com.nytimes.android.comments.comments.mvi.SortingOption;
import com.nytimes.android.comments.comments.mvi.navigation.ViewCommentsScreen;
import com.nytimes.android.comments.comments.mvi.view.CommentsScreenKt;
import defpackage.gt2;
import defpackage.kt2;
import defpackage.m25;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.uh;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;

/* loaded from: classes4.dex */
public final class ViewCommentsNavigationKt {
    public static final void viewCommentsScreen(m25 m25Var, final CommentsViewModel commentsViewModel, final List<? extends CommentTab> list, final CommentTab commentTab, final List<? extends SortingOption> list2, final ss2 ss2Var, final qs2 qs2Var, final gt2 gt2Var, final ss2 ss2Var2, final qs2 qs2Var2) {
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
        NavGraphBuilderKt.c(m25Var, ViewCommentsScreen.ViewComments.INSTANCE.getRoute(), null, null, null, new ss2() { // from class: com.nytimes.android.comments.comments.mvi.navigation.ViewCommentsNavigationKt$viewCommentsScreen$1
            @Override // defpackage.ss2
            public final e invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                zq3.h(animatedContentTransitionScope, "$this$composable");
                return NavigationTransitionsKt.screenSlideOutLeft(animatedContentTransitionScope);
            }
        }, new ss2() { // from class: com.nytimes.android.comments.comments.mvi.navigation.ViewCommentsNavigationKt$viewCommentsScreen$2
            @Override // defpackage.ss2
            public final c invoke(AnimatedContentTransitionScope animatedContentTransitionScope) {
                zq3.h(animatedContentTransitionScope, "$this$composable");
                return NavigationTransitionsKt.screenSlideInRight(animatedContentTransitionScope);
            }
        }, null, zr0.c(1244583444, true, new kt2() { // from class: com.nytimes.android.comments.comments.mvi.navigation.ViewCommentsNavigationKt$viewCommentsScreen$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // defpackage.kt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((uh) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
                return ww8.a;
            }

            public final void invoke(uh uhVar, NavBackStackEntry navBackStackEntry, Composer composer, int i) {
                zq3.h(uhVar, "$this$composable");
                zq3.h(navBackStackEntry, "it");
                if (b.G()) {
                    b.S(1244583444, i, -1, "com.nytimes.android.comments.comments.mvi.navigation.viewCommentsScreen.<anonymous> (ViewCommentsNavigation.kt:28)");
                }
                CommentsScreenKt.CommentsScreen(CommentsViewModel.this, list, commentTab, list2, ss2Var, qs2Var, gt2Var, ss2Var2, qs2Var2, composer, 4168);
                if (b.G()) {
                    b.R();
                }
            }
        }), 78, null);
    }
}
