package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import defpackage.d44;
import defpackage.pz5;
import defpackage.qs2;
import defpackage.qz5;
import defpackage.ww8;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public interface ViewCompositionStrategy {
    public static final a a = a.a;

    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements ViewCompositionStrategy {
        public static final DisposeOnDetachedFromWindowOrReleasedFromPool b = new DisposeOnDetachedFromWindowOrReleasedFromPool();

        public static final class a implements View.OnAttachStateChangeListener {
            final /* synthetic */ AbstractComposeView a;

            a(AbstractComposeView abstractComposeView) {
                this.a = abstractComposeView;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                if (pz5.f(this.a)) {
                    return;
                }
                this.a.f();
            }
        }

        private DisposeOnDetachedFromWindowOrReleasedFromPool() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(AbstractComposeView abstractComposeView) {
            abstractComposeView.f();
        }

        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public qs2 a(final AbstractComposeView abstractComposeView) {
            final a aVar = new a(abstractComposeView);
            abstractComposeView.addOnAttachStateChangeListener(aVar);
            final qz5 qz5Var = new qz5() { // from class: p99
                @Override // defpackage.qz5
                public final void b() {
                    ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.c(AbstractComposeView.this);
                }
            };
            pz5.a(abstractComposeView, qz5Var);
            return new qs2() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m97invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m97invoke() {
                    AbstractComposeView.this.removeOnAttachStateChangeListener(aVar);
                    pz5.g(AbstractComposeView.this, qz5Var);
                }
            };
        }
    }

    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {
        public static final DisposeOnViewTreeLifecycleDestroyed b = new DisposeOnViewTreeLifecycleDestroyed();

        public static final class a implements View.OnAttachStateChangeListener {
            final /* synthetic */ AbstractComposeView a;
            final /* synthetic */ Ref$ObjectRef b;

            a(AbstractComposeView abstractComposeView, Ref$ObjectRef ref$ObjectRef) {
                this.a = abstractComposeView;
                this.b = ref$ObjectRef;
            }

            /* JADX WARN: Type inference failed for: r3v7, types: [T, qs2] */
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                ?? c;
                d44 a = ViewTreeLifecycleOwner.a(this.a);
                AbstractComposeView abstractComposeView = this.a;
                if (a != null) {
                    Ref$ObjectRef ref$ObjectRef = this.b;
                    c = ViewCompositionStrategy_androidKt.c(abstractComposeView, a.getLifecycle());
                    ref$ObjectRef.element = c;
                    this.a.removeOnAttachStateChangeListener(this);
                    return;
                }
                throw new IllegalStateException(("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner").toString());
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
            }
        }

        private DisposeOnViewTreeLifecycleDestroyed() {
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public qs2 a(final AbstractComposeView abstractComposeView) {
            qs2 c;
            if (!abstractComposeView.isAttachedToWindow()) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                final a aVar = new a(abstractComposeView, ref$ObjectRef);
                abstractComposeView.addOnAttachStateChangeListener(aVar);
                ref$ObjectRef.element = new qs2() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m98invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m98invoke() {
                        AbstractComposeView.this.removeOnAttachStateChangeListener(aVar);
                    }
                };
                return new qs2() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m99invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m99invoke() {
                        Ref$ObjectRef.this.element.mo865invoke();
                    }
                };
            }
            d44 a2 = ViewTreeLifecycleOwner.a(abstractComposeView);
            if (a2 != null) {
                c = ViewCompositionStrategy_androidKt.c(abstractComposeView, a2.getLifecycle());
                return c;
            }
            throw new IllegalStateException(("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner").toString());
        }
    }

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final ViewCompositionStrategy a() {
            return DisposeOnDetachedFromWindowOrReleasedFromPool.b;
        }
    }

    qs2 a(AbstractComposeView abstractComposeView);

    public static final class b implements ViewCompositionStrategy {
        private final Lifecycle b;

        public b(Lifecycle lifecycle) {
            this.b = lifecycle;
        }

        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public qs2 a(AbstractComposeView abstractComposeView) {
            qs2 c;
            c = ViewCompositionStrategy_androidKt.c(abstractComposeView, this.b);
            return c;
        }

        public b(d44 d44Var) {
            this(d44Var.getLifecycle());
        }
    }
}
