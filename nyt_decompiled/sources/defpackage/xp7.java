package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes4.dex */
public final class xp7 implements f99 {
    private final ConstraintLayout a;
    public final TextView b;
    public final View c;
    public final TextView d;
    public final TextView e;

    private xp7(ConstraintLayout constraintLayout, TextView textView, View view, TextView textView2, TextView textView3) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = view;
        this.d = textView2;
        this.e = textView3;
    }

    public static xp7 a(View view) {
        View a;
        int i = ng6.articleHeadline;
        TextView textView = (TextView) g99.a(view, i);
        if (textView != null && (a = g99.a(view, (i = ng6.horizontalView))) != null) {
            i = ng6.journalist;
            TextView textView2 = (TextView) g99.a(view, i);
            if (textView2 != null) {
                i = ng6.sharedText;
                TextView textView3 = (TextView) g99.a(view, i);
                if (textView3 != null) {
                    return new xp7((ConstraintLayout) view, textView, a, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static xp7 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(ei6.share_dialog_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // defpackage.f99
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
