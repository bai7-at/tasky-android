package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.h3;
import defpackage.i3;
import defpackage.k99;
import defpackage.w2;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class n extends w2 {
    final RecyclerView d;
    private final a e;

    public static class a extends w2 {
        final n d;
        private Map e = new WeakHashMap();

        public a(n nVar) {
            this.d = nVar;
        }

        @Override // defpackage.w2
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            w2 w2Var = (w2) this.e.get(view);
            return w2Var != null ? w2Var.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // defpackage.w2
        public i3 b(View view) {
            w2 w2Var = (w2) this.e.get(view);
            return w2Var != null ? w2Var.b(view) : super.b(view);
        }

        @Override // defpackage.w2
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            w2 w2Var = (w2) this.e.get(view);
            if (w2Var != null) {
                w2Var.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // defpackage.w2
        public void g(View view, h3 h3Var) {
            if (this.d.p() || this.d.d.getLayoutManager() == null) {
                super.g(view, h3Var);
                return;
            }
            this.d.d.getLayoutManager().T0(view, h3Var);
            w2 w2Var = (w2) this.e.get(view);
            if (w2Var != null) {
                w2Var.g(view, h3Var);
            } else {
                super.g(view, h3Var);
            }
        }

        @Override // defpackage.w2
        public void i(View view, AccessibilityEvent accessibilityEvent) {
            w2 w2Var = (w2) this.e.get(view);
            if (w2Var != null) {
                w2Var.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }

        @Override // defpackage.w2
        public boolean j(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            w2 w2Var = (w2) this.e.get(viewGroup);
            return w2Var != null ? w2Var.j(viewGroup, view, accessibilityEvent) : super.j(viewGroup, view, accessibilityEvent);
        }

        @Override // defpackage.w2
        public boolean k(View view, int i, Bundle bundle) {
            if (this.d.p() || this.d.d.getLayoutManager() == null) {
                return super.k(view, i, bundle);
            }
            w2 w2Var = (w2) this.e.get(view);
            if (w2Var != null) {
                if (w2Var.k(view, i, bundle)) {
                    return true;
                }
            } else if (super.k(view, i, bundle)) {
                return true;
            }
            return this.d.d.getLayoutManager().n1(view, i, bundle);
        }

        @Override // defpackage.w2
        public void m(View view, int i) {
            w2 w2Var = (w2) this.e.get(view);
            if (w2Var != null) {
                w2Var.m(view, i);
            } else {
                super.m(view, i);
            }
        }

        @Override // defpackage.w2
        public void n(View view, AccessibilityEvent accessibilityEvent) {
            w2 w2Var = (w2) this.e.get(view);
            if (w2Var != null) {
                w2Var.n(view, accessibilityEvent);
            } else {
                super.n(view, accessibilityEvent);
            }
        }

        w2 o(View view) {
            return (w2) this.e.remove(view);
        }

        void p(View view) {
            w2 k = k99.k(view);
            if (k == null || k == this) {
                return;
            }
            this.e.put(view, k);
        }
    }

    public n(RecyclerView recyclerView) {
        this.d = recyclerView;
        w2 o = o();
        if (o == null || !(o instanceof a)) {
            this.e = new a(this);
        } else {
            this.e = (a) o;
        }
    }

    @Override // defpackage.w2
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || p()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().P0(accessibilityEvent);
        }
    }

    @Override // defpackage.w2
    public void g(View view, h3 h3Var) {
        super.g(view, h3Var);
        if (p() || this.d.getLayoutManager() == null) {
            return;
        }
        this.d.getLayoutManager().R0(h3Var);
    }

    @Override // defpackage.w2
    public boolean k(View view, int i, Bundle bundle) {
        if (super.k(view, i, bundle)) {
            return true;
        }
        if (p() || this.d.getLayoutManager() == null) {
            return false;
        }
        return this.d.getLayoutManager().l1(i, bundle);
    }

    public w2 o() {
        return this.e;
    }

    boolean p() {
        return this.d.hasPendingAdapterUpdates();
    }
}
