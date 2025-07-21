package kotlinx.coroutines.reactive;

import defpackage.by0;
import defpackage.hb8;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.va8;
import defpackage.ww8;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.f;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;

/* loaded from: classes5.dex */
public final class AwaitKt$awaitOne$2$1 implements va8 {
    final /* synthetic */ CancellableContinuation<T> $cont;
    final /* synthetic */ T $default;
    final /* synthetic */ Mode $mode;
    private boolean inTerminalState;
    private boolean seenValue;
    private hb8 subscription;
    private T value;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.FIRST_OR_DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Mode.LAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Mode.SINGLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Mode.SINGLE_OR_DEFAULT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    AwaitKt$awaitOne$2$1(CancellableContinuation<? super T> cancellableContinuation, Mode mode, T t) {
        this.$cont = cancellableContinuation;
        this.$mode = mode;
        this.$default = t;
    }

    private final boolean tryEnterTerminalState(String str) {
        if (this.inTerminalState) {
            AwaitKt.gotSignalInTerminalStateException(this.$cont.getContext(), str);
            return false;
        }
        this.inTerminalState = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void withSubscriptionLock(qs2 qs2Var) {
        qs2Var.mo865invoke();
    }

    @Override // defpackage.va8
    public void onComplete() {
        if (tryEnterTerminalState("onComplete")) {
            if (this.seenValue) {
                Mode mode = this.$mode;
                if (mode == Mode.FIRST_OR_DEFAULT || mode == Mode.FIRST || !this.$cont.isActive()) {
                    return;
                }
                by0 by0Var = this.$cont;
                Result.a aVar = Result.a;
                by0Var.resumeWith(Result.b(this.value));
                return;
            }
            Mode mode2 = this.$mode;
            if (mode2 == Mode.FIRST_OR_DEFAULT || mode2 == Mode.SINGLE_OR_DEFAULT) {
                by0 by0Var2 = this.$cont;
                Result.a aVar2 = Result.a;
                by0Var2.resumeWith(Result.b(this.$default));
            } else if (this.$cont.isActive()) {
                by0 by0Var3 = this.$cont;
                Result.a aVar3 = Result.a;
                by0Var3.resumeWith(Result.b(f.a(new NoSuchElementException("No value received via onNext for " + this.$mode))));
            }
        }
    }

    @Override // defpackage.va8
    public void onError(Throwable th) {
        if (tryEnterTerminalState("onError")) {
            by0 by0Var = this.$cont;
            Result.a aVar = Result.a;
            by0Var.resumeWith(Result.b(f.a(th)));
        }
    }

    @Override // defpackage.va8
    public void onNext(T t) {
        final hb8 hb8Var = this.subscription;
        by0 by0Var = this.$cont;
        if (hb8Var == null) {
            CoroutineExceptionHandlerKt.handleCoroutineException(by0Var.getContext(), new IllegalStateException("'onNext' was called before 'onSubscribe'"));
            return;
        }
        if (this.inTerminalState) {
            AwaitKt.gotSignalInTerminalStateException(by0Var.getContext(), "onNext");
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.$mode.ordinal()];
        if (i == 1 || i == 2) {
            if (this.seenValue) {
                AwaitKt.moreThanOneValueProvidedException(this.$cont.getContext(), this.$mode);
                return;
            }
            this.seenValue = true;
            withSubscriptionLock(new qs2() { // from class: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onNext$1
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
                    hb8.this.cancel();
                }
            });
            this.$cont.resumeWith(Result.b(t));
            return;
        }
        if (i == 3 || i == 4 || i == 5) {
            Mode mode = this.$mode;
            if ((mode != Mode.SINGLE && mode != Mode.SINGLE_OR_DEFAULT) || !this.seenValue) {
                this.value = t;
                this.seenValue = true;
                return;
            }
            withSubscriptionLock(new qs2() { // from class: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onNext$2
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
                    hb8.this.cancel();
                }
            });
            if (this.$cont.isActive()) {
                by0 by0Var2 = this.$cont;
                Result.a aVar = Result.a;
                by0Var2.resumeWith(Result.b(f.a(new IllegalArgumentException("More than one onNext value for " + this.$mode))));
            }
        }
    }

    @Override // defpackage.va8
    public void onSubscribe(final hb8 hb8Var) {
        if (this.subscription != null) {
            withSubscriptionLock(new qs2() { // from class: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onSubscribe$1
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
                    hb8.this.cancel();
                }
            });
            return;
        }
        this.subscription = hb8Var;
        this.$cont.invokeOnCancellation(new ss2() { // from class: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onSubscribe$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                AwaitKt$awaitOne$2$1 awaitKt$awaitOne$2$1 = AwaitKt$awaitOne$2$1.this;
                final hb8 hb8Var2 = hb8Var;
                awaitKt$awaitOne$2$1.withSubscriptionLock(new qs2() { // from class: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onSubscribe$2.1
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
                        hb8.this.cancel();
                    }
                });
            }
        });
        final Mode mode = this.$mode;
        withSubscriptionLock(new qs2() { // from class: kotlinx.coroutines.reactive.AwaitKt$awaitOne$2$1$onSubscribe$3
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
                hb8 hb8Var2 = hb8.this;
                Mode mode2 = mode;
                hb8Var2.request((mode2 == Mode.FIRST || mode2 == Mode.FIRST_OR_DEFAULT) ? 1L : Long.MAX_VALUE);
            }
        });
    }
}
