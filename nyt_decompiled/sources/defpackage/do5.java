package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ResourceResolutionException;
import defpackage.dh3;
import kotlin.text.h;

/* loaded from: classes.dex */
public abstract class do5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final sf3 b(CharSequence charSequence, Resources resources, int i) {
        try {
            return wg3.a(sf3.a, resources, i);
        } catch (Exception e) {
            throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e);
        }
    }

    private static final ch3 c(Resources.Theme theme, Resources resources, int i, int i2, Composer composer, int i3) {
        composer.z(21855625);
        if (b.G()) {
            b.S(21855625, i3, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:86)");
        }
        dh3 dh3Var = (dh3) composer.m(AndroidCompositionLocals_androidKt.h());
        dh3.b bVar = new dh3.b(theme, i);
        dh3.a b = dh3Var.b(bVar);
        if (b == null) {
            XmlResourceParser xml = resources.getXml(i);
            if (!zq3.c(cm9.j(xml).getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            b = g49.a(theme, resources, xml, i2);
            dh3Var.d(bVar, b);
        }
        ch3 b2 = b.b();
        if (b.G()) {
            b.R();
        }
        composer.R();
        return b2;
    }

    public static final Painter d(int i, Composer composer, int i2) {
        Painter u80Var;
        composer.z(473971343);
        if (b.G()) {
            b.S(473971343, i2, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        Context context = (Context) composer.m(AndroidCompositionLocals_androidKt.g());
        Resources a = p07.a(composer, 0);
        composer.z(-492369756);
        Object A = composer.A();
        Composer.a aVar = Composer.a;
        if (A == aVar.a()) {
            A = new TypedValue();
            composer.q(A);
        }
        composer.R();
        TypedValue typedValue = (TypedValue) A;
        a.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !h.T(charSequence, ".xml", false, 2, null)) {
            composer.z(-738265172);
            Object valueOf = Integer.valueOf(i);
            Object theme = context.getTheme();
            composer.z(1618982084);
            boolean S = composer.S(valueOf) | composer.S(charSequence) | composer.S(theme);
            Object A2 = composer.A();
            if (S || A2 == aVar.a()) {
                A2 = b(charSequence, a, i);
                composer.q(A2);
            }
            composer.R();
            u80Var = new u80((sf3) A2, 0L, 0L, 6, null);
            composer.R();
        } else {
            composer.z(-738265327);
            u80Var = e49.g(c(context.getTheme(), a, i, typedValue.changingConfigurations, composer, ((i2 << 6) & 896) | 72), composer, 0);
            composer.R();
        }
        if (b.G()) {
            b.R();
        }
        composer.R();
        return u80Var;
    }
}
