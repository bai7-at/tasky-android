package defpackage;

import com.google.android.gms.internal.pal.h3;

/* loaded from: classes3.dex */
public final class vvd extends h0e {
    public vvd(ksc kscVar, String str, String str2, h3 h3Var, int i, int i2) {
        super(kscVar, "6CWPidOWJZFxRWI8V7yi3OiMbOhIWZX/jTayTGRwqCM0W8dtKHQOPe60TuQicfhG", "gYPijpNio6OwLgbzbH6IuWSNtvp7bCV5UMbKZJCVNdg=", h3Var, i, 48);
    }

    @Override // defpackage.h0e
    protected final void a() {
        this.e.Z(3);
        boolean booleanValue = ((Boolean) this.f.invoke(null, this.b.b())).booleanValue();
        synchronized (this.e) {
            try {
                if (booleanValue) {
                    this.e.Z(2);
                } else {
                    this.e.Z(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
