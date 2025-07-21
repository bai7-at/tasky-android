package defpackage;

import android.graphics.Shader;
import android.os.Build;
import defpackage.rl8;

/* loaded from: classes.dex */
public abstract class qg {
    public static final Shader.TileMode a(int i) {
        rl8.a aVar = rl8.a;
        if (rl8.f(i, aVar.a())) {
            return Shader.TileMode.CLAMP;
        }
        if (rl8.f(i, aVar.d())) {
            return Shader.TileMode.REPEAT;
        }
        if (rl8.f(i, aVar.c())) {
            return Shader.TileMode.MIRROR;
        }
        if (rl8.f(i, aVar.b()) && Build.VERSION.SDK_INT >= 31) {
            return tl8.a.b();
        }
        return Shader.TileMode.CLAMP;
    }
}
