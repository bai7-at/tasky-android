package kotlinx.coroutines.rx2;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.kz4;
import defpackage.qs2;
import defpackage.ww8;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;

@fc1(c = "kotlinx.coroutines.rx2.RxConvertKt$asFlow$1", f = "RxConvert.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class RxConvertKt$asFlow$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ ObservableSource<T> $this_asFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RxConvertKt$asFlow$1(ObservableSource<T> observableSource, by0<? super RxConvertKt$asFlow$1> by0Var) {
        super(2, by0Var);
        this.$this_asFlow = observableSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        RxConvertKt$asFlow$1 rxConvertKt$asFlow$1 = new RxConvertKt$asFlow$1(this.$this_asFlow, by0Var);
        rxConvertKt$asFlow$1.L$0 = obj;
        return rxConvertKt$asFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            final AtomicReference atomicReference = new AtomicReference();
            this.$this_asFlow.subscribe(new Observer<T>() { // from class: kotlinx.coroutines.rx2.RxConvertKt$asFlow$1$observer$1
                @Override // io.reactivex.Observer
                public void onComplete() {
                    SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
                }

                @Override // io.reactivex.Observer
                public void onError(Throwable th) {
                    producerScope.close(th);
                }

                @Override // io.reactivex.Observer
                public void onNext(T t) {
                    try {
                        ChannelsKt.trySendBlocking(producerScope, t);
                    } catch (InterruptedException unused) {
                    }
                }

                @Override // io.reactivex.Observer
                public void onSubscribe(Disposable disposable) {
                    if (kz4.a(atomicReference, null, disposable)) {
                        return;
                    }
                    disposable.dispose();
                }
            });
            qs2 qs2Var = new qs2() { // from class: kotlinx.coroutines.rx2.RxConvertKt$asFlow$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    invoke();
                    return ww8.a;
                }

                public final void invoke() {
                    Disposable andSet = atomicReference.getAndSet(Disposables.disposed());
                    if (andSet != null) {
                        andSet.dispose();
                    }
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, qs2Var, this) == h) {
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
    public final Object invoke(ProducerScope<? super T> producerScope, by0<? super ww8> by0Var) {
        return ((RxConvertKt$asFlow$1) create(producerScope, by0Var)).invokeSuspend(ww8.a);
    }
}
