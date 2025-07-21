package io.reactivex.internal.operators.flowable;

import defpackage.PrivacySettingsScreenKt$PrivacySettingsScreen$1$5;
import defpackage.g86;
import defpackage.va8;
import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class FlowableScalarXMap {

    static final class ScalarXMapFlowable<T, R> extends Flowable<R> {
        final Function<? super T, ? extends g86> mapper;
        final T value;

        ScalarXMapFlowable(T t, Function<? super T, ? extends g86> function) {
            this.value = t;
            this.mapper = function;
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(va8 va8Var) {
            try {
                g86 g86Var = (g86) ObjectHelper.requireNonNull(this.mapper.apply(this.value), "The mapper returned a null Publisher");
                if (!(g86Var instanceof Callable)) {
                    g86Var.subscribe(va8Var);
                    return;
                }
                try {
                    Object call = ((Callable) g86Var).call();
                    if (call == null) {
                        EmptySubscription.complete(va8Var);
                    } else {
                        va8Var.onSubscribe(new ScalarSubscription(va8Var, call));
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    EmptySubscription.error(th, va8Var);
                }
            } catch (Throwable th2) {
                EmptySubscription.error(th2, va8Var);
            }
        }
    }

    private FlowableScalarXMap() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Flowable<U> scalarXMap(T t, Function<? super T, ? extends g86> function) {
        return RxJavaPlugins.onAssembly(new ScalarXMapFlowable(t, function));
    }

    public static <T, R> boolean tryScalarXMapSubscribe(g86 g86Var, va8 va8Var, Function<? super T, ? extends g86> function) {
        if (!(g86Var instanceof Callable)) {
            return false;
        }
        try {
            PrivacySettingsScreenKt$PrivacySettingsScreen$1$5 privacySettingsScreenKt$PrivacySettingsScreen$1$5 = (Object) ((Callable) g86Var).call();
            if (privacySettingsScreenKt$PrivacySettingsScreen$1$5 == null) {
                EmptySubscription.complete(va8Var);
                return true;
            }
            try {
                g86 g86Var2 = (g86) ObjectHelper.requireNonNull(function.apply(privacySettingsScreenKt$PrivacySettingsScreen$1$5), "The mapper returned a null Publisher");
                if (g86Var2 instanceof Callable) {
                    try {
                        Object call = ((Callable) g86Var2).call();
                        if (call == null) {
                            EmptySubscription.complete(va8Var);
                            return true;
                        }
                        va8Var.onSubscribe(new ScalarSubscription(va8Var, call));
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        EmptySubscription.error(th, va8Var);
                        return true;
                    }
                } else {
                    g86Var2.subscribe(va8Var);
                }
                return true;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptySubscription.error(th2, va8Var);
                return true;
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            EmptySubscription.error(th3, va8Var);
            return true;
        }
    }
}
