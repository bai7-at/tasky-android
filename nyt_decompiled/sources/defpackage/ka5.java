package defpackage;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes4.dex */
public final class ka5 extends k80 implements u02 {
    private final String e;
    private final la5 f;
    private TextView g;
    private View h;

    public ka5(String str, la5 la5Var) {
        zq3.h(str, "groupTitle");
        zq3.h(la5Var, "notificationsHelper");
        this.e = str;
        this.f = la5Var;
    }

    @Override // defpackage.k80
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void A(x54 x54Var, int i) {
        zq3.h(x54Var, "viewBinding");
        x54Var.c.setText(this.e);
        this.g = x54Var.c;
        this.h = x54Var.b;
        if (this.f.a()) {
            d();
        } else {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.k80
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public x54 D(View view) {
        zq3.h(view, "view");
        x54 a = x54.a(view);
        zq3.g(a, "bind(...)");
        return a;
    }

    @Override // defpackage.u02
    public void c() {
        TextView textView = this.g;
        if (textView != null) {
            textView.setAlpha(0.4f);
        }
        View view = this.h;
        if (view == null) {
            return;
        }
        view.setAlpha(0.4f);
    }

    @Override // defpackage.u02
    public void d() {
        TextView textView = this.g;
        if (textView != null) {
            textView.setAlpha(1.0f);
        }
        View view = this.h;
        if (view == null) {
            return;
        }
        view.setAlpha(1.0f);
    }

    @Override // defpackage.gr3
    public int o() {
        return ii6.list_item_notification_group_title;
    }
}
