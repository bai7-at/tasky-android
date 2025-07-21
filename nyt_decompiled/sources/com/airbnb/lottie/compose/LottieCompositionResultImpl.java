package com.airbnb.lottie.compose;

import androidx.compose.runtime.b0;
import androidx.compose.runtime.y;
import com.airbnb.lottie.LottieComposition;
import defpackage.lc4;
import defpackage.qs2;
import defpackage.sy4;
import defpackage.x08;
import defpackage.zq3;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;

/* loaded from: classes.dex */
public final class LottieCompositionResultImpl implements lc4 {
    private final CompletableDeferred a = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
    private final sy4 b = b0.e(null, null, 2, null);
    private final sy4 c = b0.e(null, null, 2, null);
    private final x08 d = y.d(new qs2() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isLoading$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final Boolean mo865invoke() {
            return Boolean.valueOf(LottieCompositionResultImpl.this.getValue() == null && LottieCompositionResultImpl.this.o() == null);
        }
    });
    private final x08 e = y.d(new qs2() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isComplete$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final Boolean mo865invoke() {
            return Boolean.valueOf((LottieCompositionResultImpl.this.getValue() == null && LottieCompositionResultImpl.this.o() == null) ? false : true);
        }
    });
    private final x08 f = y.d(new qs2() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isFailure$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final Boolean mo865invoke() {
            return Boolean.valueOf(LottieCompositionResultImpl.this.o() != null);
        }
    });
    private final x08 g = y.d(new qs2() { // from class: com.airbnb.lottie.compose.LottieCompositionResultImpl$isSuccess$2
        {
            super(0);
        }

        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final Boolean mo865invoke() {
            return Boolean.valueOf(LottieCompositionResultImpl.this.getValue() != null);
        }
    });

    private void B(Throwable th) {
        this.c.setValue(th);
    }

    private void C(LottieComposition lottieComposition) {
        this.b.setValue(lottieComposition);
    }

    public boolean A() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    public final synchronized void j(LottieComposition lottieComposition) {
        zq3.h(lottieComposition, "composition");
        if (t()) {
            return;
        }
        C(lottieComposition);
        this.a.complete(lottieComposition);
    }

    public final synchronized void n(Throwable th) {
        zq3.h(th, "error");
        if (t()) {
            return;
        }
        B(th);
        this.a.completeExceptionally(th);
    }

    public Throwable o() {
        return (Throwable) this.c.getValue();
    }

    public boolean t() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    @Override // defpackage.x08
    public LottieComposition getValue() {
        return (LottieComposition) this.b.getValue();
    }
}
