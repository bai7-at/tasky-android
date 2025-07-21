package com.nytimes.android.comments.comments.mvi.navigation;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class NavigationIntent {
    public static final int $stable = 0;

    public static final class NavigateBack extends NavigationIntent {
        public static final int $stable = 0;
        private final ViewCommentsScreen route;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateBack(ViewCommentsScreen viewCommentsScreen) {
            super(null);
            zq3.h(viewCommentsScreen, "route");
            this.route = viewCommentsScreen;
        }

        public static /* synthetic */ NavigateBack copy$default(NavigateBack navigateBack, ViewCommentsScreen viewCommentsScreen, int i, Object obj) {
            if ((i & 1) != 0) {
                viewCommentsScreen = navigateBack.route;
            }
            return navigateBack.copy(viewCommentsScreen);
        }

        public final ViewCommentsScreen component1() {
            return this.route;
        }

        public final NavigateBack copy(ViewCommentsScreen viewCommentsScreen) {
            zq3.h(viewCommentsScreen, "route");
            return new NavigateBack(viewCommentsScreen);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateBack) && zq3.c(this.route, ((NavigateBack) obj).route);
        }

        @Override // com.nytimes.android.comments.comments.mvi.navigation.NavigationIntent
        public ViewCommentsScreen getRoute() {
            return this.route;
        }

        public int hashCode() {
            return this.route.hashCode();
        }

        public String toString() {
            return "NavigateBack(route=" + this.route + ")";
        }
    }

    public static final class NavigateTo extends NavigationIntent {
        public static final int $stable = 0;
        private final ViewCommentsScreen route;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateTo(ViewCommentsScreen viewCommentsScreen) {
            super(null);
            zq3.h(viewCommentsScreen, "route");
            this.route = viewCommentsScreen;
        }

        public static /* synthetic */ NavigateTo copy$default(NavigateTo navigateTo, ViewCommentsScreen viewCommentsScreen, int i, Object obj) {
            if ((i & 1) != 0) {
                viewCommentsScreen = navigateTo.route;
            }
            return navigateTo.copy(viewCommentsScreen);
        }

        public final ViewCommentsScreen component1() {
            return this.route;
        }

        public final NavigateTo copy(ViewCommentsScreen viewCommentsScreen) {
            zq3.h(viewCommentsScreen, "route");
            return new NavigateTo(viewCommentsScreen);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateTo) && zq3.c(this.route, ((NavigateTo) obj).route);
        }

        @Override // com.nytimes.android.comments.comments.mvi.navigation.NavigationIntent
        public ViewCommentsScreen getRoute() {
            return this.route;
        }

        public int hashCode() {
            return this.route.hashCode();
        }

        public String toString() {
            return "NavigateTo(route=" + this.route + ")";
        }
    }

    public /* synthetic */ NavigationIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract ViewCommentsScreen getRoute();

    private NavigationIntent() {
    }
}
