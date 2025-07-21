package defpackage;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes4.dex */
public final class ea5 extends k80 implements u02 {
    private final String e;
    private final String f;
    private final la5 g;
    private final qs2 h;
    private TextView i;
    private TextView j;

    public ea5(String str, String str2, la5 la5Var, qs2 qs2Var) {
        zq3.h(str, "channelName");
        zq3.h(str2, "channelDescription");
        zq3.h(la5Var, "notificationsHelper");
        zq3.h(qs2Var, "clickListener");
        this.e = str;
        this.f = str2;
        this.g = la5Var;
        this.h = qs2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(ea5 ea5Var, View view) {
        zq3.h(ea5Var, "this$0");
        ea5Var.h.mo865invoke();
    }

    @Override // defpackage.k80
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void A(y54 y54Var, int i) {
        zq3.h(y54Var, "viewBinding");
        y54Var.e.setText(this.e);
        this.i = y54Var.e;
        y54Var.b.setText(this.f);
        this.j = y54Var.b;
        y54Var.d.setVisibility(8);
        y54Var.getRoot().setOnClickListener(new View.OnClickListener() { // from class: da5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ea5.G(ea5.this, view);
            }
        });
        if (this.g.a()) {
            d();
        } else {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.k80
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public y54 D(View view) {
        zq3.h(view, "view");
        y54 a = y54.a(view);
        zq3.g(a, "bind(...)");
        return a;
    }

    @Override // defpackage.gr3
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void y(u33 u33Var) {
        zq3.h(u33Var, "viewHolder");
        super.y(u33Var);
        ((y54) u33Var.L).getRoot().setOnClickListener(null);
    }

    @Override // defpackage.u02
    public void c() {
        TextView textView = this.i;
        if (textView != null) {
            textView.setAlpha(0.4f);
        }
        TextView textView2 = this.j;
        if (textView2 == null) {
            return;
        }
        textView2.setAlpha(0.4f);
    }

    @Override // defpackage.u02
    public void d() {
        TextView textView = this.i;
        if (textView != null) {
            textView.setAlpha(1.0f);
        }
        TextView textView2 = this.j;
        if (textView2 == null) {
            return;
        }
        textView2.setAlpha(1.0f);
    }

    @Override // defpackage.gr3
    public int o() {
        return ii6.list_item_notifications;
    }
}
