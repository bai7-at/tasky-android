package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;

/* loaded from: classes.dex */
public class q16 extends n {
    final RecyclerView f;
    final w2 g;
    final w2 h;

    class a extends w2 {
        a() {
        }

        @Override // defpackage.w2
        public void g(View view, h3 h3Var) {
            Preference N;
            q16.this.g.g(view, h3Var);
            int childAdapterPosition = q16.this.f.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = q16.this.f.getAdapter();
            if ((adapter instanceof e) && (N = ((e) adapter).N(childAdapterPosition)) != null) {
                N.X(h3Var);
            }
        }

        @Override // defpackage.w2
        public boolean k(View view, int i, Bundle bundle) {
            return q16.this.g.k(view, i, bundle);
        }
    }

    public q16(RecyclerView recyclerView) {
        super(recyclerView);
        this.g = super.o();
        this.h = new a();
        this.f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.n
    public w2 o() {
        return this.h;
    }
}
