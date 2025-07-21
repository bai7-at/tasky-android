package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes4.dex */
public final class yz3 implements f99 {
    private final ConstraintLayout a;
    public final Button b;
    public final Button c;
    public final TextView d;
    public final ConstraintLayout e;

    private yz3(ConstraintLayout constraintLayout, Button button, Button button2, TextView textView, ConstraintLayout constraintLayout2) {
        this.a = constraintLayout;
        this.b = button;
        this.c = button2;
        this.d = textView;
        this.e = constraintLayout2;
    }

    public static yz3 a(View view) {
        int i = sg6.bannerDismissBtn;
        Button button = (Button) g99.a(view, i);
        if (button != null) {
            i = sg6.bannerSubscribeBtn;
            Button button2 = (Button) g99.a(view, i);
            if (button2 != null) {
                i = sg6.bannerText;
                TextView textView = (TextView) g99.a(view, i);
                if (textView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new yz3(constraintLayout, button, button2, textView, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // defpackage.f99
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
