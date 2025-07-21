package defpackage;

import com.nytimes.android.ribbon.config.RibbonConfig;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class yl9 extends xl9 {
    private final RibbonConfig a;
    private final UUID b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl9(RibbonConfig ribbonConfig, UUID uuid) {
        super(null);
        zq3.h(ribbonConfig, "ribbonConfig");
        zq3.h(uuid, "uuid");
        this.a = ribbonConfig;
        this.b = uuid;
    }

    public final RibbonConfig a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl9)) {
            return false;
        }
        yl9 yl9Var = (yl9) obj;
        return this.a == yl9Var.a && zq3.c(this.b, yl9Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "XPNDeeplink(ribbonConfig=" + this.a + ", uuid=" + this.b + ")";
    }
}
