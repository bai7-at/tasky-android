package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.nytimes.android.designsystem.uiview.CarouselView;

/* loaded from: classes4.dex */
public final class lr3 implements f99 {
    private final CarouselView a;
    public final LinearLayout b;
    public final CarouselView c;

    private lr3(CarouselView carouselView, LinearLayout linearLayout, CarouselView carouselView2) {
        this.a = carouselView;
        this.b = linearLayout;
        this.c = carouselView2;
    }

    public static lr3 a(View view) {
        int i = ig6.gamesCarouselContent;
        LinearLayout linearLayout = (LinearLayout) g99.a(view, i);
        if (linearLayout == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        CarouselView carouselView = (CarouselView) view;
        return new lr3(carouselView, linearLayout, carouselView);
    }

    @Override // defpackage.f99
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CarouselView getRoot() {
        return this.a;
    }
}
