package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.runtime.Composer;
import com.comscore.streaming.ContentType;
import defpackage.ej3;
import defpackage.eo3;
import defpackage.fj3;
import defpackage.fv1;
import defpackage.nn0;
import defpackage.x08;
import defpackage.yv0;

/* loaded from: classes.dex */
final class d implements ej3 {
    public static final d a = new d();

    private static final class a implements fj3 {
        private final x08 a;
        private final x08 b;
        private final x08 c;

        public a(x08 x08Var, x08 x08Var2, x08 x08Var3) {
            this.a = x08Var;
            this.b = x08Var2;
            this.c = x08Var3;
        }

        @Override // defpackage.fj3
        public void a(yv0 yv0Var) {
            yv0Var.A1();
            if (((Boolean) this.a.getValue()).booleanValue()) {
                fv1.a0(yv0Var, nn0.r(nn0.b.a(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, yv0Var.b(), 0.0f, null, null, 0, ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, null);
            } else if (((Boolean) this.b.getValue()).booleanValue() || ((Boolean) this.c.getValue()).booleanValue()) {
                fv1.a0(yv0Var, nn0.r(nn0.b.a(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, yv0Var.b(), 0.0f, null, null, 0, ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, null);
            }
        }
    }

    private d() {
    }

    @Override // defpackage.ej3
    public fj3 a(eo3 eo3Var, Composer composer, int i) {
        composer.z(1683566979);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1683566979, i, -1, "androidx.compose.foundation.DefaultDebugIndication.rememberUpdatedInstance (Indication.kt:166)");
        }
        int i2 = i & 14;
        x08 a2 = PressInteractionKt.a(eo3Var, composer, i2);
        x08 a3 = HoverInteractionKt.a(eo3Var, composer, i2);
        x08 a4 = FocusInteractionKt.a(eo3Var, composer, i2);
        composer.z(1157296644);
        boolean S = composer.S(eo3Var);
        Object A = composer.A();
        if (S || A == Composer.a.a()) {
            A = new a(a2, a3, a4);
            composer.q(A);
        }
        composer.R();
        a aVar = (a) A;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return aVar;
    }
}
