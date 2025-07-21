package defpackage;

import com.nytimes.android.designsystem.uicompose.utils.TooltipArrowPosition;
import com.nytimes.android.libs.messagingarchitecture.model.a;

/* loaded from: classes4.dex */
public final class wn8 implements a {
    private final TooltipArrowPosition a;
    private final String b;

    public wn8(TooltipArrowPosition tooltipArrowPosition, String str) {
        zq3.h(tooltipArrowPosition, "arrowPosition");
        zq3.h(str, "placementId");
        this.a = tooltipArrowPosition;
        this.b = str;
    }

    public final TooltipArrowPosition a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn8)) {
            return false;
        }
        wn8 wn8Var = (wn8) obj;
        return this.a == wn8Var.a && zq3.c(this.b, wn8Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "TooltipMediumMessagePlacement(arrowPosition=" + this.a + ", placementId=" + this.b + ")";
    }
}
