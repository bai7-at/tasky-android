package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy_androidKt;
import androidx.lifecycle.Lifecycle;
import defpackage.d44;
import defpackage.qs2;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class ViewCompositionStrategy_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final qs2 c(final AbstractComposeView abstractComposeView, final Lifecycle lifecycle) {
        if (lifecycle.b().compareTo(Lifecycle.State.DESTROYED) > 0) {
            final androidx.lifecycle.g gVar = new androidx.lifecycle.g() { // from class: q99
                @Override // androidx.lifecycle.g
                public final void h(d44 d44Var, Lifecycle.Event event) {
                    ViewCompositionStrategy_androidKt.d(AbstractComposeView.this, d44Var, event);
                }
            };
            lifecycle.a(gVar);
            return new qs2() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$installForLifecycle$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m100invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m100invoke() {
                    Lifecycle.this.d(gVar);
                }
            };
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle + "is already destroyed").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AbstractComposeView abstractComposeView, d44 d44Var, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            abstractComposeView.f();
        }
    }
}
