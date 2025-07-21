package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import defpackage.be5;
import defpackage.ch9;
import defpackage.pg9;
import java.util.List;

/* loaded from: classes.dex */
final class h extends pg9.b implements Runnable, be5, View.OnAttachStateChangeListener {
    private final WindowInsetsHolder c;
    private boolean d;
    private boolean e;
    private ch9 f;

    public h(WindowInsetsHolder windowInsetsHolder) {
        super(!windowInsetsHolder.c() ? 1 : 0);
        this.c = windowInsetsHolder;
    }

    @Override // defpackage.be5
    public ch9 a(View view, ch9 ch9Var) {
        this.f = ch9Var;
        this.c.k(ch9Var);
        if (this.d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.e) {
            this.c.j(ch9Var);
            WindowInsetsHolder.i(this.c, ch9Var, 0, 2, null);
        }
        return this.c.c() ? ch9.b : ch9Var;
    }

    @Override // pg9.b
    public void c(pg9 pg9Var) {
        this.d = false;
        this.e = false;
        ch9 ch9Var = this.f;
        if (pg9Var.a() != 0 && ch9Var != null) {
            this.c.j(ch9Var);
            this.c.k(ch9Var);
            WindowInsetsHolder.i(this.c, ch9Var, 0, 2, null);
        }
        this.f = null;
        super.c(pg9Var);
    }

    @Override // pg9.b
    public void d(pg9 pg9Var) {
        this.d = true;
        this.e = true;
        super.d(pg9Var);
    }

    @Override // pg9.b
    public ch9 e(ch9 ch9Var, List list) {
        WindowInsetsHolder.i(this.c, ch9Var, 0, 2, null);
        return this.c.c() ? ch9.b : ch9Var;
    }

    @Override // pg9.b
    public pg9.a f(pg9 pg9Var, pg9.a aVar) {
        this.d = false;
        return super.f(pg9Var, aVar);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.d) {
            this.d = false;
            this.e = false;
            ch9 ch9Var = this.f;
            if (ch9Var != null) {
                this.c.j(ch9Var);
                WindowInsetsHolder.i(this.c, ch9Var, 0, 2, null);
                this.f = null;
            }
        }
    }
}
