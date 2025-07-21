package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.Lifecycle;
import defpackage.by0;
import defpackage.d44;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.kg6;
import defpackage.ku8;
import defpackage.o76;
import defpackage.py1;
import defpackage.ss2;
import defpackage.ws0;
import defpackage.ww8;
import defpackage.zr0;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
final class WrappedComposition implements ws0, androidx.lifecycle.g {
    private final AndroidComposeView a;
    private final ws0 b;
    private boolean c;
    private Lifecycle d;
    private gt2 e = ComposableSingletons$Wrapper_androidKt.a.a();

    public WrappedComposition(AndroidComposeView androidComposeView, ws0 ws0Var) {
        this.a = androidComposeView;
        this.b = ws0Var;
    }

    @Override // defpackage.ws0
    public void d(final gt2 gt2Var) {
        this.a.setOnViewTreeOwnersAvailable(new ss2() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(AndroidComposeView.c cVar) {
                boolean z;
                Lifecycle lifecycle;
                z = WrappedComposition.this.c;
                if (z) {
                    return;
                }
                Lifecycle lifecycle2 = cVar.a().getLifecycle();
                WrappedComposition.this.e = gt2Var;
                lifecycle = WrappedComposition.this.d;
                if (lifecycle == null) {
                    WrappedComposition.this.d = lifecycle2;
                    lifecycle2.a(WrappedComposition.this);
                } else if (lifecycle2.b().isAtLeast(Lifecycle.State.CREATED)) {
                    ws0 x = WrappedComposition.this.x();
                    final WrappedComposition wrappedComposition = WrappedComposition.this;
                    final gt2 gt2Var2 = gt2Var;
                    x.d(zr0.c(-2000640158, true, new gt2() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1.1

                        @fc1(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", f = "Wrapper.android.kt", l = {136}, m = "invokeSuspend")
                        /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C00631 extends SuspendLambda implements gt2 {
                            int label;
                            final /* synthetic */ WrappedComposition this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C00631(WrappedComposition wrappedComposition, by0 by0Var) {
                                super(2, by0Var);
                                this.this$0 = wrappedComposition;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final by0 create(Object obj, by0 by0Var) {
                                return new C00631(this.this$0, by0Var);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object h = kotlin.coroutines.intrinsics.a.h();
                                int i = this.label;
                                if (i == 0) {
                                    kotlin.f.b(obj);
                                    AndroidComposeView y = this.this$0.y();
                                    this.label = 1;
                                    if (y.Q(this) == h) {
                                        return h;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.f.b(obj);
                                }
                                return ww8.a;
                            }

                            @Override // defpackage.gt2
                            public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                                return ((C00631) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // defpackage.gt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return ww8.a;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 11) == 2 && composer.i()) {
                                composer.K();
                                return;
                            }
                            if (androidx.compose.runtime.b.G()) {
                                androidx.compose.runtime.b.S(-2000640158, i, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:124)");
                            }
                            Object tag = WrappedComposition.this.y().getTag(kg6.inspection_slot_table_set);
                            Set set = ku8.p(tag) ? (Set) tag : null;
                            if (set == null) {
                                Object parent = WrappedComposition.this.y().getParent();
                                View view = parent instanceof View ? (View) parent : null;
                                Object tag2 = view != null ? view.getTag(kg6.inspection_slot_table_set) : null;
                                set = ku8.p(tag2) ? (Set) tag2 : null;
                            }
                            if (set != null) {
                                set.add(composer.B());
                                composer.w();
                            }
                            py1.d(WrappedComposition.this.y(), new C00631(WrappedComposition.this, null), composer, 72);
                            o76 c = InspectionTablesKt.a().c(set);
                            final WrappedComposition wrappedComposition2 = WrappedComposition.this;
                            final gt2 gt2Var3 = gt2Var2;
                            CompositionLocalKt.a(c, zr0.b(composer, -1193460702, true, new gt2() { // from class: androidx.compose.ui.platform.WrappedComposition.setContent.1.1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // defpackage.gt2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return ww8.a;
                                }

                                public final void invoke(Composer composer2, int i2) {
                                    if ((i2 & 11) == 2 && composer2.i()) {
                                        composer2.K();
                                        return;
                                    }
                                    if (androidx.compose.runtime.b.G()) {
                                        androidx.compose.runtime.b.S(-1193460702, i2, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:138)");
                                    }
                                    AndroidCompositionLocals_androidKt.a(WrappedComposition.this.y(), gt2Var3, composer2, 8);
                                    if (androidx.compose.runtime.b.G()) {
                                        androidx.compose.runtime.b.R();
                                    }
                                }
                            }), composer, 56);
                            if (androidx.compose.runtime.b.G()) {
                                androidx.compose.runtime.b.R();
                            }
                        }
                    }));
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((AndroidComposeView.c) obj);
                return ww8.a;
            }
        });
    }

    @Override // defpackage.ws0
    public void dispose() {
        if (!this.c) {
            this.c = true;
            this.a.getView().setTag(kg6.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.d;
            if (lifecycle != null) {
                lifecycle.d(this);
            }
        }
        this.b.dispose();
    }

    @Override // androidx.lifecycle.g
    public void h(d44 d44Var, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else {
            if (event != Lifecycle.Event.ON_CREATE || this.c) {
                return;
            }
            d(this.e);
        }
    }

    public final ws0 x() {
        return this.b;
    }

    public final AndroidComposeView y() {
        return this.a;
    }
}
