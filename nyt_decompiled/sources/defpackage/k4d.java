package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.internal.pal.h3;

/* loaded from: classes3.dex */
public final class k4d extends h0e {
    private final Activity i;
    private final View j;

    public k4d(ksc kscVar, String str, String str2, h3 h3Var, int i, int i2, View view, Activity activity) {
        super(kscVar, "uJ6tafbdnitpIiJcEDt3zh4lzBZEYeFsW45S60suhbKyZNy2K2MuNEbuksualim4", "Cv/m6MvBjdOit7tT7cC+xPCpFEqovwYj4XIOcXUxCMs=", h3Var, i, 62);
        this.j = view;
        this.i = activity;
    }

    @Override // defpackage.h0e
    protected final void a() {
        if (this.j == null) {
            return;
        }
        Boolean bool = (Boolean) lee.c().b(fpe.g2);
        boolean booleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.f.invoke(null, this.j, this.i, bool);
        synchronized (this.e) {
            try {
                this.e.b0(((Long) objArr[0]).longValue());
                this.e.d0(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.e.c0((String) objArr[2]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
