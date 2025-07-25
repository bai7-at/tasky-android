package io.reactivex.disposables;

import defpackage.hb8;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.Future;

/* loaded from: classes5.dex */
public final class Disposables {
    private Disposables() {
        throw new IllegalStateException("No instances!");
    }

    @NonNull
    public static Disposable disposed() {
        return EmptyDisposable.INSTANCE;
    }

    @NonNull
    public static Disposable empty() {
        return fromRunnable(Functions.EMPTY_RUNNABLE);
    }

    @NonNull
    public static Disposable fromAction(@NonNull Action action) {
        ObjectHelper.requireNonNull(action, "run is null");
        return new ActionDisposable(action);
    }

    @NonNull
    public static Disposable fromFuture(@NonNull Future<?> future) {
        ObjectHelper.requireNonNull(future, "future is null");
        return fromFuture(future, true);
    }

    @NonNull
    public static Disposable fromRunnable(@NonNull Runnable runnable) {
        ObjectHelper.requireNonNull(runnable, "run is null");
        return new RunnableDisposable(runnable);
    }

    @NonNull
    public static Disposable fromSubscription(@NonNull hb8 hb8Var) {
        ObjectHelper.requireNonNull(hb8Var, "subscription is null");
        return new SubscriptionDisposable(hb8Var);
    }

    @NonNull
    public static Disposable fromFuture(@NonNull Future<?> future, boolean z) {
        ObjectHelper.requireNonNull(future, "future is null");
        return new FutureDisposable(future, z);
    }
}
