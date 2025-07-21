package defpackage;

import android.app.Activity;
import com.nytimes.android.side.effects.HideShowSideEffect;

/* loaded from: classes4.dex */
public final class tr7 {
    private final vn8 a;
    private final md3 b;
    private final jk c;

    public tr7(Activity activity, vn8 vn8Var, md3 md3Var) {
        zq3.h(activity, "activity");
        zq3.h(vn8Var, "tooltipManager");
        zq3.h(md3Var, "hybridScrollEventManager");
        this.a = vn8Var;
        this.b = md3Var;
        this.c = (jk) activity;
    }

    public final sr7 a() {
        return new e34(this.c);
    }

    public final sr7 b(boolean z) {
        return new HideShowSideEffect(this.c, this.a, this.b, z);
    }
}
