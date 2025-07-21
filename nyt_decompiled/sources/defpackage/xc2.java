package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* loaded from: classes4.dex */
public final class xc2 implements f99 {
    private final TextView a;
    public final TextView b;

    private xc2(TextView textView, TextView textView2) {
        this.a = textView;
        this.b = textView2;
    }

    public static xc2 a(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new xc2(textView, textView);
    }

    public static xc2 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static xc2 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(ji6.feedback_info_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // defpackage.f99
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TextView getRoot() {
        return this.a;
    }
}
