package defpackage;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* loaded from: classes2.dex */
public final class xh0 {
    public static final xh0 g = new xh0(-1, -16777216, 0, 0, -1, null);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Typeface f;

    public xh0(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = typeface;
    }

    public static xh0 a(CaptioningManager.CaptionStyle captionStyle) {
        return z19.a >= 21 ? c(captionStyle) : b(captionStyle);
    }

    private static xh0 b(CaptioningManager.CaptionStyle captionStyle) {
        return new xh0(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    private static xh0 c(CaptioningManager.CaptionStyle captionStyle) {
        return new xh0(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : g.a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : g.b, captionStyle.hasWindowColor() ? captionStyle.windowColor : g.c, captionStyle.hasEdgeType() ? captionStyle.edgeType : g.d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : g.e, captionStyle.getTypeface());
    }
}
