package defpackage;

import com.google.android.gms.internal.pal.h3;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class ind extends h0e {
    public ind(ksc kscVar, String str, String str2, h3 h3Var, int i, int i2) {
        super(kscVar, "WepZYnT/MXyJE28LKN26NT6D3mAA2J2spDFApE1ixrQxTNXRg7wshW7BC/EU90LT", "sjYkfzJTuYKxh1jvZaP9n5dx9JGmzJotOUC/vdvgi4M=", h3Var, i, 73);
    }

    @Override // defpackage.h0e
    protected final void a() {
        try {
            boolean booleanValue = ((Boolean) this.f.invoke(null, this.b.b())).booleanValue();
            h3 h3Var = this.e;
            int i = 1;
            if (true == booleanValue) {
                i = 2;
            }
            h3Var.Y(i);
        } catch (InvocationTargetException unused) {
            this.e.Y(3);
        }
    }
}
