package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes4.dex */
public final class id2 implements f99 {
    private final LinearLayout a;
    public final View b;
    public final TextView c;

    private id2(LinearLayout linearLayout, View view, TextView textView) {
        this.a = linearLayout;
        this.b = view;
        this.c = textView;
    }

    public static id2 a(View view) {
        int i = rg6.tooltip_arrow;
        View a = g99.a(view, i);
        if (a != null) {
            i = rg6.tooltip_text;
            TextView textView = (TextView) g99.a(view, i);
            if (textView != null) {
                return new id2((LinearLayout) view, a, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static id2 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static id2 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(ji6.feedback_tool_tip, viewGroup, false);
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
