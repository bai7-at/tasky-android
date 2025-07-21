package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.embrace.android.embracesdk.ViewSwazzledHooks;

/* loaded from: classes4.dex */
public abstract class t33 extends RecyclerView.d0 {
    private View.OnClickListener B;
    private View.OnLongClickListener H;
    private gr3 y;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            t33.W(t33.this);
        }
    }

    class b implements View.OnLongClickListener {
        b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            ViewSwazzledHooks.OnLongClickListener._preOnLongClick(this, view);
            t33.X(t33.this);
            return false;
        }
    }

    public t33(View view) {
        super(view);
        this.B = new a();
        this.H = new b();
    }

    static /* synthetic */ xe5 W(t33 t33Var) {
        t33Var.getClass();
        return null;
    }

    static /* synthetic */ ye5 X(t33 t33Var) {
        t33Var.getClass();
        return null;
    }

    public void Y(gr3 gr3Var, xe5 xe5Var, ye5 ye5Var) {
        this.y = gr3Var;
        if (xe5Var != null && gr3Var.s()) {
            this.a.setOnClickListener(this.B);
        }
        if (ye5Var == null || !gr3Var.t()) {
            return;
        }
        this.a.setOnLongClickListener(this.H);
    }

    public gr3 Z() {
        return this.y;
    }

    public void a0() {
        this.y = null;
    }
}
