package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes4.dex */
public final class vc2 implements f99 {
    private final LinearLayout a;
    public final TextView b;
    public final TextView c;

    private vc2(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.a = linearLayout;
        this.b = textView;
        this.c = textView2;
    }

    public static vc2 a(View view) {
        int i = rg6.feedback_bottomsheet_delete;
        TextView textView = (TextView) g99.a(view, i);
        if (textView != null) {
            i = rg6.feedback_bottomsheet_update;
            TextView textView2 = (TextView) g99.a(view, i);
            if (textView2 != null) {
                return new vc2((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static vc2 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(ji6.feedback_edit_screenshot, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // defpackage.f99
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.a;
    }
}
