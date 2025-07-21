package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.nytimes.android.designsystem.uiview.AspectRatioImageView;

/* loaded from: classes4.dex */
public final class ur3 implements f99 {
    private final ConstraintLayout a;
    public final AspectRatioImageView b;
    public final TextView c;
    public final ConstraintLayout d;
    public final TextView e;

    private ur3(ConstraintLayout constraintLayout, AspectRatioImageView aspectRatioImageView, TextView textView, ConstraintLayout constraintLayout2, TextView textView2) {
        this.a = constraintLayout;
        this.b = aspectRatioImageView;
        this.c = textView;
        this.d = constraintLayout2;
        this.e = textView2;
    }

    public static ur3 a(View view) {
        int i = ig6.image;
        AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) g99.a(view, i);
        if (aspectRatioImageView != null) {
            i = ig6.label;
            TextView textView = (TextView) g99.a(view, i);
            if (textView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = ig6.promoText;
                TextView textView2 = (TextView) g99.a(view, i);
                if (textView2 != null) {
                    return new ur3(constraintLayout, aspectRatioImageView, textView, constraintLayout, textView2);
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
