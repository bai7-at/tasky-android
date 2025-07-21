package defpackage;

import com.google.android.gms.internal.ads.u0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class rha extends cia {
    public rha(jga jgaVar, String str, String str2, u0 u0Var, int i, int i2) {
        super(jgaVar, "PyZj3I+LGZvAhJ9n3OQrlENydgM2JwW0T6dRxf3as8iTDiIpqvAE/3692CSblz+3", "8lD2ezwwsI93agi51tjtw1sdZVRU2vHPSc7HynOlFDE=", u0Var, i, 73);
    }

    @Override // defpackage.cia
    protected final void a() {
        try {
            boolean booleanValue = ((Boolean) this.f.invoke(null, this.b.b())).booleanValue();
            u0 u0Var = this.e;
            int i = 1;
            if (true == booleanValue) {
                i = 2;
            }
            u0Var.V(i);
        } catch (InvocationTargetException unused) {
            this.e.V(3);
        }
    }
}
