package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* loaded from: classes3.dex */
final class hs9 implements DisplayManager.DisplayListener, ds9 {
    private final DisplayManager a;
    private xr9 b;

    private hs9(DisplayManager displayManager) {
        this.a = displayManager;
    }

    public static ds9 b(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new hs9(displayManager);
        }
        return null;
    }

    private final Display c() {
        return this.a.getDisplay(0);
    }

    @Override // defpackage.ds9
    public final void a(xr9 xr9Var) {
        this.b = xr9Var;
        this.a.registerDisplayListener(this, khe.L(null));
        ls9.b(xr9Var.a, c());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        xr9 xr9Var = this.b;
        if (xr9Var == null || i != 0) {
            return;
        }
        ls9.b(xr9Var.a, c());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    @Override // defpackage.ds9
    public final void zza() {
        this.a.unregisterDisplayListener(this);
        this.b = null;
    }
}
