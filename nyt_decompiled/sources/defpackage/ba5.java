package defpackage;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.push.NotificationsChannel;

/* loaded from: classes4.dex */
public final class ba5 extends k80 implements u02 {
    private final String e;
    private final String f;
    private final NotificationsChannel g;
    private final la5 h;
    private final j5 i;
    private bf5 j;
    private TextView k;
    private TextView l;
    private SwitchCompat m;

    public ba5(String str, String str2, NotificationsChannel notificationsChannel, la5 la5Var, j5 j5Var) {
        zq3.h(str, "channelName");
        zq3.h(str2, "channelDescription");
        zq3.h(notificationsChannel, AppsFlyerProperties.CHANNEL);
        zq3.h(la5Var, "notificationsHelper");
        zq3.h(j5Var, "resultLauncher");
        this.e = str;
        this.f = str2;
        this.g = notificationsChannel;
        this.h = la5Var;
        this.i = j5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(ba5 ba5Var, y54 y54Var, CompoundButton compoundButton, boolean z) {
        zq3.h(ba5Var, "this$0");
        zq3.h(y54Var, "$viewBinding");
        if (!ba5Var.h.a()) {
            y54Var.d.setChecked(false);
            ba5Var.i.a("android.permission.POST_NOTIFICATIONS");
            return;
        }
        ba5Var.g.h(z);
        bf5 bf5Var = ba5Var.j;
        if (bf5Var != null) {
            bf5Var.a(ba5Var.g, z);
        }
    }

    @Override // defpackage.k80
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void A(final y54 y54Var, int i) {
        zq3.h(y54Var, "viewBinding");
        y54Var.e.setText(this.e);
        this.k = y54Var.e;
        y54Var.b.setText(this.f);
        this.l = y54Var.b;
        y54Var.d.setVisibility(0);
        y54Var.d.setChecked(this.g.g());
        y54Var.d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: aa5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ba5.G(ba5.this, y54Var, compoundButton, z);
            }
        });
        if (this.h.a()) {
            d();
        } else {
            c();
        }
        this.m = y54Var.d;
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

    public final void I(bf5 bf5Var) {
        this.j = bf5Var;
    }

    @Override // defpackage.gr3
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void y(u33 u33Var) {
        zq3.h(u33Var, "viewHolder");
        super.y(u33Var);
        ((y54) u33Var.L).d.setOnCheckedChangeListener(null);
    }

    @Override // defpackage.u02
    public void c() {
        TextView textView = this.k;
        if (textView != null) {
            textView.setAlpha(0.4f);
        }
        TextView textView2 = this.l;
        if (textView2 != null) {
            textView2.setAlpha(0.4f);
        }
        SwitchCompat switchCompat = this.m;
        if (switchCompat != null) {
            switchCompat.setAlpha(0.4f);
        }
        SwitchCompat switchCompat2 = this.m;
        if (switchCompat2 != null) {
            switchCompat2.setChecked(false);
        }
        SwitchCompat switchCompat3 = this.m;
        if (switchCompat3 == null) {
            return;
        }
        switchCompat3.setEnabled(false);
    }

    @Override // defpackage.u02
    public void d() {
        TextView textView = this.k;
        if (textView != null) {
            textView.setAlpha(1.0f);
        }
        TextView textView2 = this.l;
        if (textView2 != null) {
            textView2.setAlpha(1.0f);
        }
        SwitchCompat switchCompat = this.m;
        if (switchCompat != null) {
            switchCompat.setAlpha(1.0f);
        }
        SwitchCompat switchCompat2 = this.m;
        if (switchCompat2 == null) {
            return;
        }
        switchCompat2.setEnabled(true);
    }

    @Override // defpackage.gr3
    public int o() {
        return ii6.list_item_notifications;
    }
}
