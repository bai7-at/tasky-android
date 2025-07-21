package defpackage;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes4.dex */
public final class jr3 implements f99 {
    private final TextView a;
    public final TextView b;

    private jr3(TextView textView, TextView textView2) {
        this.a = textView;
        this.b = textView2;
    }

    public static jr3 a(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new jr3(textView, textView);
    }

    @Override // defpackage.f99
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TextView getRoot() {
        return this.a;
    }
}
