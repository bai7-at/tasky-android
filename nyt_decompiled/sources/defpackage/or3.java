package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nytimes.android.designsystem.uiview.CarouselView;

/* loaded from: classes4.dex */
public final class or3 implements f99 {
    private final LinearLayout a;
    public final LinearLayout b;
    public final CarouselView c;
    public final TextView d;

    private or3(LinearLayout linearLayout, LinearLayout linearLayout2, CarouselView carouselView, TextView textView) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = carouselView;
        this.d = textView;
    }

    public static or3 a(View view) {
        int i = ig6.carouselContent;
        LinearLayout linearLayout = (LinearLayout) g99.a(view, i);
        if (linearLayout != null) {
            i = ig6.carouselView;
            CarouselView carouselView = (CarouselView) g99.a(view, i);
            if (carouselView != null) {
                i = ig6.promoText;
                TextView textView = (TextView) g99.a(view, i);
                if (textView != null) {
                    return new or3((LinearLayout) view, linearLayout, carouselView, textView);
                }
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
