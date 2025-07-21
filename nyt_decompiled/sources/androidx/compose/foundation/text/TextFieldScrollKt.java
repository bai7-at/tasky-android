package androidx.compose.foundation.text;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.y;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.aj8;
import defpackage.ar8;
import defpackage.by0;
import defpackage.dy4;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.it2;
import defpackage.kc9;
import defpackage.kt6;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.pl0;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.tc7;
import defpackage.ww8;
import defpackage.x08;
import defpackage.x29;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class TextFieldScrollKt {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kt6 b(fm1 fm1Var, int i, ar8 ar8Var, aj8 aj8Var, boolean z, int i2) {
        kt6 a2;
        if (aj8Var == null || (a2 = aj8Var.e(ar8Var.a().b(i))) == null) {
            a2 = kt6.e.a();
        }
        kt6 kt6Var = a2;
        int l0 = fm1Var.l0(TextFieldCursorKt.c());
        return kt6.d(kt6Var, z ? (i2 - kt6Var.i()) - l0 : kt6Var.i(), 0.0f, z ? i2 - kt6Var.i() : kt6Var.i() + l0, 0.0f, 10, null);
    }

    public static final Modifier c(Modifier modifier, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, kc9 kc9Var, qs2 qs2Var) {
        Modifier verticalScrollLayoutModifier;
        Orientation f = textFieldScrollerPosition.f();
        int e = textFieldScrollerPosition.e(textFieldValue.g());
        textFieldScrollerPosition.i(textFieldValue.g());
        ar8 a2 = x29.a(kc9Var, textFieldValue.e());
        int i = a.a[f.ordinal()];
        if (i == 1) {
            verticalScrollLayoutModifier = new VerticalScrollLayoutModifier(textFieldScrollerPosition, e, a2, qs2Var);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            verticalScrollLayoutModifier = new HorizontalScrollLayoutModifier(textFieldScrollerPosition, e, a2, qs2Var);
        }
        return pl0.b(modifier).h(verticalScrollLayoutModifier);
    }

    public static final Modifier d(Modifier modifier, final TextFieldScrollerPosition textFieldScrollerPosition, final dy4 dy4Var, final boolean z) {
        return ComposedModifierKt.a(modifier, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        } : InspectableValueKt.a(), new it2() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.z(805428266);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(805428266, i, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:68)");
                }
                boolean z2 = TextFieldScrollerPosition.this.f() == Orientation.Vertical || !(composer.m(CompositionLocalsKt.j()) == LayoutDirection.Rtl);
                composer.z(1235672980);
                boolean S = composer.S(TextFieldScrollerPosition.this);
                final TextFieldScrollerPosition textFieldScrollerPosition2 = TextFieldScrollerPosition.this;
                Object A = composer.A();
                if (S || A == Composer.a.a()) {
                    A = new ss2() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1
                        {
                            super(1);
                        }

                        public final Float b(float f) {
                            float d = TextFieldScrollerPosition.this.d() + f;
                            if (d > TextFieldScrollerPosition.this.c()) {
                                f = TextFieldScrollerPosition.this.c() - TextFieldScrollerPosition.this.d();
                            } else if (d < 0.0f) {
                                f = -TextFieldScrollerPosition.this.d();
                            }
                            TextFieldScrollerPosition textFieldScrollerPosition3 = TextFieldScrollerPosition.this;
                            textFieldScrollerPosition3.h(textFieldScrollerPosition3.d() + f);
                            return Float.valueOf(f);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return b(((Number) obj).floatValue());
                        }
                    };
                    composer.q(A);
                }
                composer.R();
                final tc7 b = ScrollableStateKt.b((ss2) A, composer, 0);
                final TextFieldScrollerPosition textFieldScrollerPosition3 = TextFieldScrollerPosition.this;
                composer.z(511388516);
                boolean S2 = composer.S(b) | composer.S(textFieldScrollerPosition3);
                Object A2 = composer.A();
                if (S2 || A2 == Composer.a.a()) {
                    A2 = new tc7(textFieldScrollerPosition3) { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1
                        private final x08 b;
                        private final x08 c;

                        {
                            this.b = y.d(new qs2() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollForward$2
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public final Boolean mo865invoke() {
                                    return Boolean.valueOf(TextFieldScrollerPosition.this.d() < TextFieldScrollerPosition.this.c());
                                }
                            });
                            this.c = y.d(new qs2() { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1$canScrollBackward$2
                                {
                                    super(0);
                                }

                                @Override // defpackage.qs2
                                /* renamed from: invoke */
                                public final Boolean mo865invoke() {
                                    return Boolean.valueOf(TextFieldScrollerPosition.this.d() > 0.0f);
                                }
                            });
                        }

                        @Override // defpackage.tc7
                        public boolean a() {
                            return ((Boolean) this.b.getValue()).booleanValue();
                        }

                        @Override // defpackage.tc7
                        public Object b(MutatePriority mutatePriority, gt2 gt2Var, by0 by0Var) {
                            return tc7.this.b(mutatePriority, gt2Var, by0Var);
                        }

                        @Override // defpackage.tc7
                        public boolean c() {
                            return tc7.this.c();
                        }

                        @Override // defpackage.tc7
                        public boolean d() {
                            return ((Boolean) this.c.getValue()).booleanValue();
                        }

                        @Override // defpackage.tc7
                        public float f(float f) {
                            return tc7.this.f(f);
                        }
                    };
                    composer.q(A2);
                }
                composer.R();
                Modifier l = ScrollableKt.l(Modifier.a, (TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1) A2, TextFieldScrollerPosition.this.f(), z && TextFieldScrollerPosition.this.c() != 0.0f, z2, null, dy4Var, 16, null);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
                composer.R();
                return l;
            }
        });
    }
}
