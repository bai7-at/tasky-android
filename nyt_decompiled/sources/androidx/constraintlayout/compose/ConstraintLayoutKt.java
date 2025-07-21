package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.layout.l;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.b;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.du8;
import defpackage.hn3;
import defpackage.qg4;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.u08;
import defpackage.ww8;
import defpackage.yq3;
import defpackage.zq3;
import defpackage.zu0;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes.dex */
public abstract class ConstraintLayoutKt {
    private static final boolean a = false;

    public static final class a {
        a() {
        }
    }

    public static final void d(u08 u08Var, List list) {
        zq3.h(u08Var, TransferTable.COLUMN_STATE);
        zq3.h(list, "measurables");
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            qg4 qg4Var = (qg4) list.get(i);
            Object a2 = androidx.compose.ui.layout.b.a(qg4Var);
            if (a2 == null && (a2 = zu0.a(qg4Var)) == null) {
                a2 = e();
            }
            u08Var.f(a2, qg4Var);
            Object b = zu0.b(qg4Var);
            if (b != null && (b instanceof String) && (a2 instanceof String)) {
                u08Var.j((String) a2, (String) b);
            }
            if (i2 > size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public static final Object e() {
        return new a();
    }

    public static final Pair f(final int i, ConstraintLayoutScope constraintLayoutScope, final sy4 sy4Var, final Measurer measurer, Composer composer, int i2) {
        zq3.h(constraintLayoutScope, "scope");
        zq3.h(sy4Var, "remeasureRequesterState");
        zq3.h(measurer, "measurer");
        composer.z(-441911751);
        composer.z(-3687241);
        Object A = composer.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = new ConstraintSetForInlineDsl(constraintLayoutScope);
            composer.q(A);
        }
        composer.R();
        final ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) A;
        Integer valueOf = Integer.valueOf(i);
        composer.z(-3686930);
        boolean S = composer.S(valueOf);
        Object A2 = composer.A();
        if (S || A2 == aVar.a()) {
            A2 = du8.a(new rg4() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1
                @Override // defpackage.rg4
                public int a(yq3 yq3Var, List list, int i3) {
                    return rg4.a.b(this, yq3Var, list, i3);
                }

                @Override // defpackage.rg4
                public final sg4 d(androidx.compose.ui.layout.f fVar, final List list, long j) {
                    sg4 J;
                    zq3.h(fVar, "$this$MeasurePolicy");
                    zq3.h(list, "measurables");
                    long l = Measurer.this.l(j, fVar.getLayoutDirection(), constraintSetForInlineDsl, list, i, fVar);
                    sy4Var.getValue();
                    int g = hn3.g(l);
                    int f = hn3.f(l);
                    final Measurer measurer2 = Measurer.this;
                    J = androidx.compose.ui.layout.f.J(fVar, g, f, null, new ss2() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$measurePolicy$1$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(l.a aVar2) {
                            zq3.h(aVar2, "$this$layout");
                            Measurer.this.k(aVar2, list);
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            b((l.a) obj);
                            return ww8.a;
                        }
                    }, 4, null);
                    return J;
                }

                @Override // defpackage.rg4
                public int e(yq3 yq3Var, List list, int i3) {
                    return rg4.a.d(this, yq3Var, list, i3);
                }

                @Override // defpackage.rg4
                public int g(yq3 yq3Var, List list, int i3) {
                    return rg4.a.a(this, yq3Var, list, i3);
                }

                @Override // defpackage.rg4
                public int i(yq3 yq3Var, List list, int i3) {
                    return rg4.a.c(this, yq3Var, list, i3);
                }
            }, new qs2() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$rememberConstraintLayoutMeasurePolicy$1$onHelpersChanged$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m115invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m115invoke() {
                    sy4.this.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                    constraintSetForInlineDsl.i(true);
                }
            });
            composer.q(A2);
        }
        composer.R();
        Pair pair = (Pair) A2;
        composer.R();
        return pair;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(ConstraintWidget constraintWidget) {
        return ((Object) constraintWidget.t()) + " width " + constraintWidget.Y() + " minWidth " + constraintWidget.J() + " maxWidth " + constraintWidget.H() + " height " + constraintWidget.x() + " minHeight " + constraintWidget.I() + " maxHeight " + constraintWidget.G() + " HDB " + constraintWidget.A() + " VDB " + constraintWidget.V() + " MCW " + constraintWidget.w + " MCH " + constraintWidget.x + " percentW " + constraintWidget.B + " percentH " + constraintWidget.E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(b.a aVar) {
        return "measure strategy is ";
    }
}
