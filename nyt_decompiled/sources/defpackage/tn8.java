package defpackage;

import com.nytimes.android.designsystem.uicompose.utils.TooltipArrowPosition;
import com.nytimes.android.libs.messagingarchitecture.model.a;

/* loaded from: classes4.dex */
public final class tn8 implements a {
    private final TooltipArrowPosition a;
    private final String b;

    public tn8(TooltipArrowPosition tooltipArrowPosition, String str) {
        zq3.h(tooltipArrowPosition, "highlightBlockPosition");
        zq3.h(str, "placementId");
        this.a = tooltipArrowPosition;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn8)) {
            return false;
        }
        tn8 tn8Var = (tn8) obj;
        return this.a == tn8Var.a && zq3.c(this.b, tn8Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "TooltipLargeMessagePlacement(highlightBlockPosition=" + this.a + ", placementId=" + this.b + ")";
    }
}
