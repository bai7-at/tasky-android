package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.internal.ads.u0;

/* loaded from: classes3.dex */
public final class tga extends cia {
    private final Activity i;
    private final View j;

    public tga(jga jgaVar, String str, String str2, u0 u0Var, int i, int i2, View view, Activity activity) {
        super(jgaVar, "sA157cQy3kuoY6/Q8khf6XMDmxSzcYyzmkuwKzX0O8QIfXTfkmyj/S2OF9jehLNc", "FdxRYG9/HOndmgVdj1eVgDulreHUGSjsWl31nKn2TzY=", u0Var, i, 62);
        this.j = view;
        this.i = activity;
    }

    @Override // defpackage.cia
    protected final void a() {
        if (this.j == null) {
            return;
        }
        Boolean bool = (Boolean) pla.c().a(mpa.u2);
        boolean booleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.f.invoke(null, this.j, this.i, bool);
        synchronized (this.e) {
            try {
                this.e.Y(((Long) objArr[0]).longValue());
                this.e.a0(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.e.Z((String) objArr[2]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
