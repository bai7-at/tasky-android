package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import com.nytimes.android.unfear.nytdesignsystem.model.HasKey;

/* loaded from: classes4.dex */
public abstract class m34 {
    public static final Object a(l34 l34Var, int i, gt2 gt2Var, Composer composer, int i2) {
        Object valueOf;
        zq3.h(l34Var, "obj");
        zq3.h(gt2Var, "block");
        composer.z(-1740757089);
        if (b.G()) {
            b.S(-1740757089, i2, -1, "com.nytimes.android.unfear.reader.utils.levelKey (LevelKey.kt:9)");
        }
        HasKey hasKey = l34Var instanceof HasKey ? (HasKey) l34Var : null;
        if (hasKey == null || (valueOf = hasKey.getKey()) == null) {
            valueOf = Integer.valueOf(i);
        }
        composer.F(-1395698617, valueOf);
        Object invoke = gt2Var.invoke(composer, Integer.valueOf((i2 >> 6) & 14));
        composer.Q();
        if (b.G()) {
            b.R();
        }
        composer.R();
        return invoke;
    }
}
