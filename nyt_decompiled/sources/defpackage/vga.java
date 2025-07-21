package defpackage;

import android.provider.Settings;
import com.google.android.gms.internal.ads.u0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class vga extends cia {
    public vga(jga jgaVar, String str, String str2, u0 u0Var, int i, int i2) {
        super(jgaVar, "IcH9chIM8pdQBP/eeaIVQOxIkEFtHwPKwBzAXjYRdyw5KOKrZsfN3FYxHItVH2IL", "WQCGmUFTrgSOZ83nswxrNh39wVE6t1Ouq3E0zMLvIMA=", u0Var, i, 49);
    }

    @Override // defpackage.cia
    protected final void a() {
        this.e.Q(3);
        try {
            boolean booleanValue = ((Boolean) this.f.invoke(null, this.b.b())).booleanValue();
            u0 u0Var = this.e;
            int i = 1;
            if (true == booleanValue) {
                i = 2;
            }
            u0Var.Q(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
