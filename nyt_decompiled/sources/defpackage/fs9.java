package defpackage;

import android.content.Context;
import android.view.WindowManager;

/* loaded from: classes3.dex */
final class fs9 implements ds9 {
    private final WindowManager a;

    private fs9(WindowManager windowManager) {
        this.a = windowManager;
    }

    public static ds9 b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new fs9(windowManager);
        }
        return null;
    }

    @Override // defpackage.ds9
    public final void a(xr9 xr9Var) {
        ls9.b(xr9Var.a, this.a.getDefaultDisplay());
    }

    @Override // defpackage.ds9
    public final void zza() {
    }
}
