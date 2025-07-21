package com.nytimes.android.designsystem.uicompose.composable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.nytimes.android.designsystem.uicompose.utils.TooltipArrowPosition;
import defpackage.b37;
import defpackage.bu1;
import defpackage.cq5;
import defpackage.du7;
import defpackage.fm1;
import defpackage.g01;
import defpackage.hd5;
import defpackage.ip5;
import defpackage.it2;
import defpackage.no7;
import defpackage.nt6;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.ww8;
import defpackage.wx2;
import defpackage.zq3;
import defpackage.zt7;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$FloatRef;

/* loaded from: classes4.dex */
public abstract class TooltipMediumShapeKt {
    public static final no7 a(final TooltipArrowPosition tooltipArrowPosition, final float f, final float f2, final float f3, final float f4, final boolean z) {
        zq3.h(tooltipArrowPosition, "arrowPosition");
        return new wx2(new it2() { // from class: com.nytimes.android.designsystem.uicompose.composable.TooltipMediumShapeKt$TooltipMediumShape$2

            public /* synthetic */ class a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[TooltipArrowPosition.values().length];
                    try {
                        iArr[TooltipArrowPosition.TOP.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TooltipArrowPosition.BOTTOM.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TooltipArrowPosition.NONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(ip5 ip5Var, final long j, LayoutDirection layoutDirection) {
                ip5 a2;
                zq3.h(ip5Var, "$this$$receiver");
                zq3.h(layoutDirection, "<anonymous parameter 1>");
                final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                float f5 = 2;
                ref$FloatRef.element = f - (f2 / f5);
                final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                ref$FloatRef2.element = f3;
                if (z) {
                    ref$FloatRef.element = uo6.l(ref$FloatRef.element, f4, (zt7.i(j) - f4) - f2);
                    ref$FloatRef2.element = uo6.l(ref$FloatRef2.element, 1.0f, zt7.g(j) - (f4 * f5));
                }
                int i = a.a[tooltipArrowPosition.ordinal()];
                if (i == 1) {
                    final float f6 = f4;
                    ss2 ss2Var = new ss2() { // from class: com.nytimes.android.designsystem.uicompose.composable.TooltipMediumShapeKt$TooltipMediumShape$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(ip5 ip5Var2) {
                            zq3.h(ip5Var2, "$this$PathUnion");
                            ip5Var2.D(b37.e(nt6.b(hd5.a(0.0f, Ref$FloatRef.this.element), du7.a(zt7.i(j), zt7.g(j) - Ref$FloatRef.this.element)), g01.b(f6, 0.0f, 2, null)));
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((ip5) obj);
                            return ww8.a;
                        }
                    };
                    final float f7 = f2;
                    a2 = cq5.a(ss2Var, new ss2() { // from class: com.nytimes.android.designsystem.uicompose.composable.TooltipMediumShapeKt$TooltipMediumShape$2.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(ip5 ip5Var2) {
                            zq3.h(ip5Var2, "$this$PathUnion");
                            ip5Var2.r(Ref$FloatRef.this.element, ref$FloatRef2.element);
                            ip5Var2.H(f7, 0.0f);
                            ip5Var2.H((-f7) / 2, -ref$FloatRef2.element);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((ip5) obj);
                            return ww8.a;
                        }
                    });
                } else if (i == 2) {
                    final float f8 = f4;
                    ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.designsystem.uicompose.composable.TooltipMediumShapeKt$TooltipMediumShape$2.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(ip5 ip5Var2) {
                            zq3.h(ip5Var2, "$this$PathUnion");
                            ip5Var2.D(b37.e(du7.c(du7.a(zt7.i(j), zt7.g(j) - ref$FloatRef2.element)), g01.b(f8, 0.0f, 2, null)));
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((ip5) obj);
                            return ww8.a;
                        }
                    };
                    final float f9 = f2;
                    a2 = cq5.a(ss2Var2, new ss2() { // from class: com.nytimes.android.designsystem.uicompose.composable.TooltipMediumShapeKt$TooltipMediumShape$2.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(ip5 ip5Var2) {
                            zq3.h(ip5Var2, "$this$PathUnion");
                            ip5Var2.r(Ref$FloatRef.this.element, zt7.g(j) - ref$FloatRef2.element);
                            ip5Var2.H(f9, 0.0f);
                            ip5Var2.H((-f9) / 2, ref$FloatRef2.element);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((ip5) obj);
                            return ww8.a;
                        }
                    });
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    final float f10 = f4;
                    a2 = cq5.d(false, new ss2() { // from class: com.nytimes.android.designsystem.uicompose.composable.TooltipMediumShapeKt$TooltipMediumShape$2.5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(ip5 ip5Var2) {
                            zq3.h(ip5Var2, "$this$buildComposePath");
                            ip5Var2.D(b37.e(du7.c(j), g01.b(f10, 0.0f, 2, null)));
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((ip5) obj);
                            return ww8.a;
                        }
                    }, 1, null);
                }
                ip5.B(ip5Var, a2, 0L, 2, null);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((ip5) obj, ((zt7) obj2).m(), (LayoutDirection) obj3);
                return ww8.a;
            }
        });
    }

    public static final no7 b(TooltipArrowPosition tooltipArrowPosition, float f, float f2, float f3, float f4, boolean z, Composer composer, int i, int i2) {
        zq3.h(tooltipArrowPosition, "arrowPosition");
        composer.z(-1985650583);
        if ((i2 & 8) != 0) {
            f3 = bu1.g(f2 / 2);
        }
        if ((i2 & 32) != 0) {
            z = true;
        }
        boolean z2 = z;
        if (b.G()) {
            b.S(-1985650583, i, -1, "com.nytimes.android.designsystem.uicompose.composable.TooltipMediumShape (TooltipMediumShape.kt:43)");
        }
        fm1 fm1Var = (fm1) composer.m(CompositionLocalsKt.e());
        no7 a = a(tooltipArrowPosition, fm1Var.f1(f), fm1Var.f1(f2), fm1Var.f1(f3), fm1Var.f1(f4), z2);
        if (b.G()) {
            b.R();
        }
        composer.R();
        return a;
    }
}
