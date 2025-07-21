package defpackage;

import android.view.ViewConfiguration;
import com.nytimes.android.side.effects.a;

/* loaded from: classes4.dex */
public final class rr7 implements a {
    private final sr7 a;
    private final ViewConfiguration b;

    public rr7(sr7 sr7Var, ViewConfiguration viewConfiguration) {
        zq3.h(sr7Var, "callbacks");
        zq3.h(viewConfiguration, "config");
        this.a = sr7Var;
        this.b = viewConfiguration;
    }

    private final boolean b(int i, int i2) {
        return (i == -1) & (i2 == 0);
    }

    @Override // com.nytimes.android.side.effects.a
    public void a(int i, int i2) {
        if (Math.abs(i2) >= this.b.getScaledTouchSlop() && i2 < 0) {
            this.a.a();
            return;
        }
        if (Math.abs(i2) >= this.b.getScaledTouchSlop() && i > 0) {
            this.a.b();
        } else if (i == 0) {
            this.a.a();
        } else if (b(i, i2)) {
            this.a.a();
        }
    }
}
