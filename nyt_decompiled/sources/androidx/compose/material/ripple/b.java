package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.eo3;
import defpackage.x08;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class b extends Ripple {
    public /* synthetic */ b(boolean z, float f, x08 x08Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, x08Var);
    }

    private final ViewGroup c(Composer composer, int i) {
        composer.z(-1737891121);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-1737891121, i, -1, "androidx.compose.material.ripple.PlatformRipple.findNearestViewGroup (Ripple.android.kt:86)");
        }
        Object m = composer.m(AndroidCompositionLocals_androidKt.k());
        while (!(m instanceof ViewGroup)) {
            ViewParent parent = ((View) m).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + m + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            m = parent;
        }
        ViewGroup viewGroup = (ViewGroup) m;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return viewGroup;
    }

    @Override // androidx.compose.material.ripple.Ripple
    public c b(eo3 eo3Var, boolean z, float f, x08 x08Var, x08 x08Var2, Composer composer, int i) {
        composer.z(331259447);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(331259447, i, -1, "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:63)");
        }
        ViewGroup c = c(composer, (i >> 15) & 14);
        composer.z(1643267293);
        if (c.isInEditMode()) {
            composer.z(511388516);
            boolean S = composer.S(this) | composer.S(eo3Var);
            Object A = composer.A();
            if (S || A == Composer.a.a()) {
                A = new CommonRippleIndicationInstance(z, f, x08Var, x08Var2, null);
                composer.q(A);
            }
            composer.R();
            CommonRippleIndicationInstance commonRippleIndicationInstance = (CommonRippleIndicationInstance) A;
            composer.R();
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
            composer.R();
            return commonRippleIndicationInstance;
        }
        composer.R();
        composer.z(1618982084);
        boolean S2 = composer.S(this) | composer.S(eo3Var) | composer.S(c);
        Object A2 = composer.A();
        if (S2 || A2 == Composer.a.a()) {
            A2 = new AndroidRippleIndicationInstance(z, f, x08Var, x08Var2, c, null);
            composer.q(A2);
        }
        composer.R();
        AndroidRippleIndicationInstance androidRippleIndicationInstance = (AndroidRippleIndicationInstance) A2;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return androidRippleIndicationInstance;
    }

    private b(boolean z, float f, x08 x08Var) {
        super(z, f, x08Var, null);
    }
}
