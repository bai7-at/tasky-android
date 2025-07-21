package defpackage;

import android.provider.Settings;
import com.google.android.gms.internal.pal.h3;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class p6d extends h0e {
    public p6d(ksc kscVar, String str, String str2, h3 h3Var, int i, int i2) {
        super(kscVar, "6vt+8E5GP5AwoxquDM0Y7lVJzS23/VCjNo5D8xB8rgAaaF6IhToGZhlIAUkgigHl", "jx9F7EAIAhvEI8G+/hWsHBitt0z+K8moFRn7/w45eYc=", h3Var, i, 49);
    }

    @Override // defpackage.h0e
    protected final void a() {
        this.e.U(3);
        try {
            boolean booleanValue = ((Boolean) this.f.invoke(null, this.b.b())).booleanValue();
            h3 h3Var = this.e;
            int i = 1;
            if (true == booleanValue) {
                i = 2;
            }
            h3Var.U(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
