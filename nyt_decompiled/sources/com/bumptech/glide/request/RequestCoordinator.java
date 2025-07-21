package com.bumptech.glide.request;

import defpackage.ey6;

/* loaded from: classes2.dex */
public interface RequestCoordinator {

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean isComplete;

        RequestState(boolean z) {
            this.isComplete = z;
        }

        boolean isComplete() {
            return this.isComplete;
        }
    }

    boolean a(ey6 ey6Var);

    boolean b();

    void c(ey6 ey6Var);

    void d(ey6 ey6Var);

    boolean f(ey6 ey6Var);

    RequestCoordinator getRoot();

    boolean i(ey6 ey6Var);
}
