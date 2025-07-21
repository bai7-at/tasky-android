package androidx.mediarouter.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import defpackage.g4;
import defpackage.tm4;
import defpackage.ym4;
import defpackage.zm4;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class MediaRouteActionProvider extends g4 {
    private final zm4 d;
    private final a e;
    private ym4 f;
    private tm4 g;
    private androidx.mediarouter.app.a h;
    private boolean i;

    private static final class a extends zm4.b {
        private final WeakReference a;

        public a(MediaRouteActionProvider mediaRouteActionProvider) {
            this.a = new WeakReference(mediaRouteActionProvider);
        }

        private void n(zm4 zm4Var) {
            MediaRouteActionProvider mediaRouteActionProvider = (MediaRouteActionProvider) this.a.get();
            if (mediaRouteActionProvider != null) {
                mediaRouteActionProvider.n();
            } else {
                zm4Var.o(this);
            }
        }

        @Override // zm4.b
        public void a(zm4 zm4Var, zm4.g gVar) {
            n(zm4Var);
        }

        @Override // zm4.b
        public void b(zm4 zm4Var, zm4.g gVar) {
            n(zm4Var);
        }

        @Override // zm4.b
        public void c(zm4 zm4Var, zm4.g gVar) {
            n(zm4Var);
        }

        @Override // zm4.b
        public void d(zm4 zm4Var, zm4.h hVar) {
            n(zm4Var);
        }

        @Override // zm4.b
        public void e(zm4 zm4Var, zm4.h hVar) {
            n(zm4Var);
        }

        @Override // zm4.b
        public void g(zm4 zm4Var, zm4.h hVar) {
            n(zm4Var);
        }
    }

    public MediaRouteActionProvider(Context context) {
        super(context);
        this.f = ym4.c;
        this.g = tm4.a();
        this.d = zm4.g(context);
        this.e = new a(this);
    }

    @Override // defpackage.g4
    public boolean c() {
        return this.i || this.d.m(this.f, 1);
    }

    @Override // defpackage.g4
    public View d() {
        if (this.h != null) {
            Log.e("MRActionProvider", "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
        }
        androidx.mediarouter.app.a m = m();
        this.h = m;
        m.setCheatSheetEnabled(true);
        this.h.setRouteSelector(this.f);
        this.h.setAlwaysVisible(this.i);
        this.h.setDialogFactory(this.g);
        this.h.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return this.h;
    }

    @Override // defpackage.g4
    public boolean f() {
        androidx.mediarouter.app.a aVar = this.h;
        if (aVar != null) {
            return aVar.d();
        }
        return false;
    }

    @Override // defpackage.g4
    public boolean h() {
        return true;
    }

    public androidx.mediarouter.app.a m() {
        return new androidx.mediarouter.app.a(a());
    }

    void n() {
        i();
    }
}
