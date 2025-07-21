package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes4.dex */
public final class x54 implements f99 {
    private final LinearLayout a;
    public final View b;
    public final TextView c;

    private x54(LinearLayout linearLayout, View view, TextView textView) {
        this.a = linearLayout;
        this.b = view;
        this.c = textView;
    }

    public static x54 a(View view) {
        int i = qg6.header_rule;
        View a = g99.a(view, i);
        if (a != null) {
            i = qg6.notificationGroupTitle;
            TextView textView = (TextView) g99.a(view, i);
            if (textView != null) {
                return new x54((LinearLayout) view, a, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // defpackage.f99
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.a;
    }
}
