package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class MaybeHide<T> extends AbstractMaybeWithUpstream<T, T> {

    static final class HideMaybeObserver<T> implements MaybeObserver<T>, Disposable {
        final MaybeObserver<? super T> downstream;
        Disposable upstream;

        HideMaybeObserver(MaybeObserver<? super T> maybeObserver) {
            this.downstream = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            this.upstream = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }
    }

    public MaybeHide(MaybeSource<T> maybeSource) {
        super(maybeSource);
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new HideMaybeObserver(maybeObserver));
    }
}
