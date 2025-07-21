package defpackage;

import android.app.Application;
import com.nytimes.android.utils.DeviceUtils;

/* loaded from: classes4.dex */
public class l57 {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public l57(Application application) {
        int dimensionPixelOffset = application.getResources().getDimensionPixelOffset(ee6.search_thumbnail_width_and_height);
        this.d = application.getResources().getDimensionPixelOffset(ee6.row_section_front_ordered_number_width);
        this.c = application.getResources().getDimensionPixelOffset(ee6.row_search_thumbnail_vertical_alignment_adjust) + dimensionPixelOffset;
        int dimensionPixelOffset2 = application.getResources().getDimensionPixelOffset(ee6.row_search_padding_left_right) * 3;
        this.a = (DeviceUtils.p(application) - dimensionPixelOffset) - dimensionPixelOffset2;
        this.b = (DeviceUtils.n(application) - dimensionPixelOffset) - dimensionPixelOffset2;
    }

    public int a() {
        return this.c;
    }

    public int b(boolean z) {
        return z ? this.a - this.d : this.a;
    }
}
