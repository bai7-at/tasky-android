package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes4.dex */
public final class qr3 implements f99 {
    private final FrameLayout a;
    public final TextView b;

    private qr3(FrameLayout frameLayout, TextView textView) {
        this.a = frameLayout;
        this.b = textView;
    }

    public static qr3 a(View view) {
        int i = ig6.textViewSalutation;
        TextView textView = (TextView) g99.a(view, i);
        if (textView != null) {
            return new qr3((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // defpackage.f99
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.a;
    }
}
