package androidx.compose.foundation.text;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.i;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.room.RoomDatabase;
import defpackage.aj8;
import defpackage.bj8;
import defpackage.bu1;
import defpackage.by0;
import defpackage.cc0;
import defpackage.ci;
import defpackage.di;
import defpackage.fc1;
import defpackage.fv1;
import defpackage.gh;
import defpackage.gt2;
import defpackage.hd5;
import defpackage.id5;
import defpackage.it2;
import defpackage.kt6;
import defpackage.nn0;
import defpackage.ox7;
import defpackage.py1;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.ww3;
import defpackage.ww8;
import defpackage.yc0;
import defpackage.yv0;
import defpackage.zt7;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import zendesk.core.BuildConfig;

/* loaded from: classes.dex */
public abstract class TextFieldCursorKt {
    private static final ci a = di.d(di.e(new ss2() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursorAnimationSpec$1
        public final void b(ww3.b bVar) {
            bVar.d(NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
            Float valueOf = Float.valueOf(1.0f);
            bVar.f(valueOf, 0);
            bVar.f(valueOf, 499);
            Float valueOf2 = Float.valueOf(0.0f);
            bVar.f(valueOf2, 500);
            bVar.f(valueOf2, RoomDatabase.MAX_BIND_PARAMETER_CNT);
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ww3.b) obj);
            return ww8.a;
        }
    }), null, 0, 6, null);
    private static final float b = bu1.g(2);

    public static final Modifier b(Modifier modifier, final TextFieldState textFieldState, final TextFieldValue textFieldValue, final id5 id5Var, final yc0 yc0Var, boolean z) {
        return z ? ComposedModifierKt.b(modifier, null, new it2() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1

            @fc1(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1", f = "TextFieldCursor.kt", l = {51}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                final /* synthetic */ Animatable $cursorAlpha;
                int label;

                @fc1(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1", f = "TextFieldCursor.kt", l = {BuildConfig.VERSION_CODE, 55}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C00361 extends SuspendLambda implements gt2 {
                    final /* synthetic */ Animatable $cursorAlpha;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00361(Animatable animatable, by0 by0Var) {
                        super(2, by0Var);
                        this.$cursorAlpha = animatable;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        return new C00361(this.$cursorAlpha, by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        ci ciVar;
                        Object h = kotlin.coroutines.intrinsics.a.h();
                        int i = this.label;
                        if (i == 0) {
                            f.b(obj);
                            Animatable animatable = this.$cursorAlpha;
                            Float b = cc0.b(1.0f);
                            this.label = 1;
                            if (animatable.t(b, this) == h) {
                                return h;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                f.b(obj);
                                return ww8.a;
                            }
                            f.b(obj);
                        }
                        Animatable animatable2 = this.$cursorAlpha;
                        Float b2 = cc0.b(0.0f);
                        ciVar = TextFieldCursorKt.a;
                        this.label = 2;
                        if (Animatable.f(animatable2, b2, ciVar, null, null, this, 12, null) == h) {
                            return h;
                        }
                        return ww8.a;
                    }

                    @Override // defpackage.gt2
                    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                        return ((C00361) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Animatable animatable, by0 by0Var) {
                    super(2, by0Var);
                    this.$cursorAlpha = animatable;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass1(this.$cursorAlpha, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = kotlin.coroutines.intrinsics.a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        a aVar = a.a;
                        C00361 c00361 = new C00361(this.$cursorAlpha, null);
                        this.label = 1;
                        if (BuildersKt.withContext(aVar, c00361, this) == h) {
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
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                Modifier modifier3;
                composer.z(1634330012);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(1634330012, i, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:45)");
                }
                composer.z(-492369756);
                Object A = composer.A();
                if (A == Composer.a.a()) {
                    A = gh.b(1.0f, 0.0f, 2, null);
                    composer.q(A);
                }
                composer.R();
                final Animatable animatable = (Animatable) A;
                yc0 yc0Var2 = yc0.this;
                boolean z2 = ((yc0Var2 instanceof ox7) && ((ox7) yc0Var2).b() == nn0.b.g()) ? false : true;
                if (textFieldState.d() && i.h(textFieldValue.g()) && z2) {
                    py1.e(textFieldValue.e(), i.b(textFieldValue.g()), new AnonymousClass1(animatable, null), composer, 512);
                    final id5 id5Var2 = id5Var;
                    final TextFieldValue textFieldValue2 = textFieldValue;
                    final TextFieldState textFieldState2 = textFieldState;
                    final yc0 yc0Var3 = yc0.this;
                    modifier3 = androidx.compose.ui.draw.a.d(modifier2, new ss2() { // from class: androidx.compose.foundation.text.TextFieldCursorKt$cursor$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(yv0 yv0Var) {
                            kt6 kt6Var;
                            aj8 f;
                            yv0Var.A1();
                            float l = uo6.l(((Number) Animatable.this.m()).floatValue(), 0.0f, 1.0f);
                            if (l == 0.0f) {
                                return;
                            }
                            int b2 = id5Var2.b(i.n(textFieldValue2.g()));
                            bj8 h = textFieldState2.h();
                            if (h == null || (f = h.f()) == null || (kt6Var = f.e(b2)) == null) {
                                kt6Var = new kt6(0.0f, 0.0f, 0.0f, 0.0f);
                            }
                            float f1 = yv0Var.f1(TextFieldCursorKt.c());
                            float f2 = f1 / 2;
                            float c = uo6.c(uo6.h(kt6Var.i() + f2, zt7.i(yv0Var.b()) - f2), f2);
                            fv1.l1(yv0Var, yc0Var3, hd5.a(c, kt6Var.l()), hd5.a(c, kt6Var.e()), f1, 0, null, l, null, 0, 432, null);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((yv0) obj);
                            return ww8.a;
                        }
                    });
                } else {
                    modifier3 = Modifier.a;
                }
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
                composer.R();
                return modifier3;
            }
        }, 1, null) : modifier;
    }

    public static final float c() {
        return b;
    }
}
