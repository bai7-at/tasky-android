package com.nytimes.android.onboarding.compose;

import android.app.Activity;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.e;
import androidx.compose.runtime.y;
import androidx.navigation.NavController;
import com.nytimes.android.onboarding.compose.c;
import defpackage.by0;
import defpackage.cc7;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.n25;
import defpackage.py1;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public abstract class OnboardingNavStateConductorKt {
    public static final void a(final Activity activity, final b bVar, final n25 n25Var, final qs2 qs2Var, Composer composer, final int i) {
        zq3.h(activity, "activity");
        zq3.h(bVar, "navStateConductor");
        zq3.h(n25Var, "navController");
        zq3.h(qs2Var, "observeLoginEvents");
        Composer h = composer.h(241300929);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(241300929, i, -1, "com.nytimes.android.onboarding.compose.NavStateConductor (OnboardingNavStateConductor.kt:93)");
        }
        d(bVar, h, 8);
        b(activity, n25Var, bVar, qs2Var, h, (i & 7168) | 584);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.onboarding.compose.OnboardingNavStateConductorKt$NavStateConductor$1
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
                    OnboardingNavStateConductorKt.a(activity, bVar, n25Var, qs2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final Activity activity, final n25 n25Var, final b bVar, final qs2 qs2Var, Composer composer, final int i) {
        Composer h = composer.h(-1113554460);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1113554460, i, -1, "com.nytimes.android.onboarding.compose.NavigationHandler (OnboardingNavStateConductor.kt:109)");
        }
        x08 b = y.b(bVar.b(), null, h, 8, 1);
        c c = c(b);
        c.e eVar = c.e.b;
        if (!(zq3.c(c, eVar) ? true : zq3.c(c, c.b.b))) {
            qs2Var.mo865invoke();
        }
        c c2 = c(b);
        c.d dVar = c.d.b;
        if (zq3.c(c2, dVar)) {
            NavController.T(n25Var, dVar.a(), null, null, 6, null);
        } else {
            c.f fVar = c.f.b;
            if (zq3.c(c2, fVar)) {
                NavController.T(n25Var, fVar.a(), null, null, 6, null);
            } else {
                c.C0372c c0372c = c.C0372c.b;
                if (zq3.c(c2, c0372c)) {
                    NavController.T(n25Var, c0372c.a(), null, null, 6, null);
                } else if (zq3.c(c2, c.b.b)) {
                    bVar.a(activity);
                } else {
                    zq3.c(c2, eVar);
                }
            }
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.onboarding.compose.OnboardingNavStateConductorKt$NavigationHandler$1
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
                    OnboardingNavStateConductorKt.b(activity, n25Var, bVar, qs2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    private static final c c(x08 x08Var) {
        return (c) x08Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final b bVar, Composer composer, final int i) {
        Composer h = composer.h(-202953112);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-202953112, i, -1, "com.nytimes.android.onboarding.compose.OnBackHandler (OnboardingNavStateConductor.kt:131)");
        }
        h.z(773894976);
        h.z(-492369756);
        Object A = h.A();
        if (A == Composer.a.a()) {
            e eVar = new e(py1.j(EmptyCoroutineContext.a, h));
            h.q(eVar);
            A = eVar;
        }
        h.R();
        final CoroutineScope a = ((e) A).a();
        h.R();
        BackHandlerKt.a(true, new qs2() { // from class: com.nytimes.android.onboarding.compose.OnboardingNavStateConductorKt$OnBackHandler$1

            @fc1(c = "com.nytimes.android.onboarding.compose.OnboardingNavStateConductorKt$OnBackHandler$1$1", f = "OnboardingNavStateConductor.kt", l = {138}, m = "invokeSuspend")
            /* renamed from: com.nytimes.android.onboarding.compose.OnboardingNavStateConductorKt$OnBackHandler$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ b $navStateConductor;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(b bVar, by0 by0Var) {
                    super(2, by0Var);
                    this.$navStateConductor = bVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$navStateConductor, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = kotlin.coroutines.intrinsics.a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        b bVar = this.$navStateConductor;
                        this.label = 1;
                        if (bVar.e(this) == h) {
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
                public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                    return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m618invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m618invoke() {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(bVar, null), 3, null);
            }
        }, h, 6, 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.onboarding.compose.OnboardingNavStateConductorKt$OnBackHandler$2
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
                    OnboardingNavStateConductorKt.d(b.this, composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
