package com.nytimes.android.comments.comments.mvi.navigation;

import defpackage.zq3;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class Navigator {
    public static final int $stable = 8;
    private final MutableStateFlow<NavigationIntent> destinationState;
    private final NavigationIntent screen;

    public Navigator(NavigationIntent navigationIntent) {
        zq3.h(navigationIntent, "screen");
        this.screen = navigationIntent;
        this.destinationState = StateFlowKt.MutableStateFlow(navigationIntent);
    }

    public final MutableStateFlow<NavigationIntent> getDestinationState() {
        return this.destinationState;
    }

    public final NavigationIntent getScreen() {
        return this.screen;
    }

    public final void navigate(NavigationIntent navigationIntent) {
        zq3.h(navigationIntent, "destination");
        this.destinationState.setValue(navigationIntent);
    }
}
