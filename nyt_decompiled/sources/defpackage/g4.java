package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public abstract class g4 {
    private final Context a;
    private a b;
    private b c;

    public interface a {
    }

    public interface b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public g4(Context context) {
        this.a = context;
    }

    public Context a() {
        return this.a;
    }

    public boolean b() {
        return false;
    }

    public abstract boolean c();

    public abstract View d();

    public View e(MenuItem menuItem) {
        return d();
    }

    public abstract boolean f();

    public void g(SubMenu subMenu) {
    }

    public abstract boolean h();

    public void i() {
        if (this.c == null || !h()) {
            return;
        }
        this.c.onActionProviderVisibilityChanged(c());
    }

    public void j() {
        this.c = null;
        this.b = null;
    }

    public void k(a aVar) {
        this.b = aVar;
    }

    public void l(b bVar) {
        if (this.c != null && bVar != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.c = bVar;
    }
}
