package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import com.chartbeat.androidsdk.QueryKeys;
import defpackage.ch9;

/* loaded from: classes4.dex */
public final class p4 {
    public static final p4 a = new p4();

    private p4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ch9 c(View view, ch9 ch9Var) {
        zq3.h(view, QueryKeys.INTERNAL_REFERRER);
        zq3.h(ch9Var, "windowInsets");
        jl3 f = ch9Var.f(ch9.l.h());
        zq3.g(f, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        zq3.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = f.b;
        marginLayoutParams.leftMargin = f.a;
        marginLayoutParams.bottomMargin = f.d;
        marginLayoutParams.rightMargin = f.c;
        view.setLayoutParams(marginLayoutParams);
        return ch9Var;
    }

    public final void b(ComponentActivity componentActivity, int i) {
        zq3.h(componentActivity, "activity");
        kg9.b(componentActivity.getWindow(), false);
        View findViewById = componentActivity.findViewById(i);
        zq3.g(findViewById, "findViewById(...)");
        k99.A0(findViewById, new be5() { // from class: o4
            @Override // defpackage.be5
            public final ch9 a(View view, ch9 ch9Var) {
                ch9 c;
                c = p4.c(view, ch9Var);
                return c;
            }
        });
    }
}
