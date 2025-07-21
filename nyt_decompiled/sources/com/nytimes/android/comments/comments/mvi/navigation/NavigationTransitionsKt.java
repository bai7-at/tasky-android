package com.nytimes.android.comments.comments.mvi.navigation;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.c;
import androidx.compose.animation.e;
import androidx.navigation.NavBackStackEntry;
import com.nytimes.android.comments.comments.mvi.ViewingCommentsActivityKt;
import com.nytimes.android.comments.comments.mvi.navigation.ViewCommentsScreen;
import defpackage.di;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class NavigationTransitionsKt {
    public static final c screenSlideInLeft(AnimatedContentTransitionScope animatedContentTransitionScope) {
        zq3.h(animatedContentTransitionScope, "<this>");
        return AnimatedContentTransitionScope.e(animatedContentTransitionScope, AnimatedContentTransitionScope.a.a.c(), di.k(ViewingCommentsActivityKt.ANIMATION_TRANSITION_DURATION_MILLIS, 0, null, 6, null), null, 4, null);
    }

    public static final c screenSlideInRight(AnimatedContentTransitionScope animatedContentTransitionScope) {
        zq3.h(animatedContentTransitionScope, "<this>");
        return AnimatedContentTransitionScope.e(animatedContentTransitionScope, AnimatedContentTransitionScope.a.a.d(), di.k(ViewingCommentsActivityKt.ANIMATION_TRANSITION_DURATION_MILLIS, 0, null, 6, null), null, 4, null);
    }

    public static final e screenSlideOutLeft(AnimatedContentTransitionScope animatedContentTransitionScope) {
        zq3.h(animatedContentTransitionScope, "<this>");
        if (zq3.c(((NavBackStackEntry) animatedContentTransitionScope.a()).e().v(), ViewCommentsScreen.ViewCommentThread.INSTANCE.getRoute())) {
            return AnimatedContentTransitionScope.b(animatedContentTransitionScope, AnimatedContentTransitionScope.a.a.c(), di.k(ViewingCommentsActivityKt.ANIMATION_TRANSITION_DURATION_MILLIS, 0, null, 6, null), null, 4, null);
        }
        return null;
    }

    public static final e screenSlideOutRight(AnimatedContentTransitionScope animatedContentTransitionScope) {
        zq3.h(animatedContentTransitionScope, "<this>");
        return AnimatedContentTransitionScope.b(animatedContentTransitionScope, AnimatedContentTransitionScope.a.a.d(), di.k(ViewingCommentsActivityKt.ANIMATION_TRANSITION_DURATION_MILLIS, 0, null, 6, null), null, 4, null);
    }
}
