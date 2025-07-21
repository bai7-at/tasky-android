package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes4.dex */
public final class y54 implements f99 {
    private final ConstraintLayout a;
    public final TextView b;
    public final ImageView c;
    public final SwitchCompat d;
    public final TextView e;

    private y54(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, SwitchCompat switchCompat, TextView textView2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = imageView;
        this.d = switchCompat;
        this.e = textView2;
    }

    public static y54 a(View view) {
        int i = qg6.description;
        TextView textView = (TextView) g99.a(view, i);
        if (textView != null) {
            i = qg6.icon;
            ImageView imageView = (ImageView) g99.a(view, i);
            if (imageView != null) {
                i = qg6.subscribedSwitch;
                SwitchCompat switchCompat = (SwitchCompat) g99.a(view, i);
                if (switchCompat != null) {
                    i = qg6.title;
                    TextView textView2 = (TextView) g99.a(view, i);
                    if (textView2 != null) {
                        return new y54((ConstraintLayout) view, textView, imageView, switchCompat, textView2);
                    }
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
