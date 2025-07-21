package defpackage;

import com.nytimes.android.features.giftsharehub.GiftShareHubFilterTab;
import java.util.List;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class k03 {
    private final List a;
    private final GiftShareHubFilterTab b;
    private final List c;
    private final int d;
    private final boolean e;

    public k03(List list, GiftShareHubFilterTab giftShareHubFilterTab, List list2, int i, boolean z) {
        zq3.h(list, "gitHubTabs");
        zq3.h(giftShareHubFilterTab, "selectedTab");
        zq3.h(list2, "giftHubDataBySelectedTab");
        this.a = list;
        this.b = giftShareHubFilterTab;
        this.c = list2;
        this.d = i;
        this.e = z;
    }

    public static /* synthetic */ k03 b(k03 k03Var, List list, GiftShareHubFilterTab giftShareHubFilterTab, List list2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = k03Var.a;
        }
        if ((i2 & 2) != 0) {
            giftShareHubFilterTab = k03Var.b;
        }
        GiftShareHubFilterTab giftShareHubFilterTab2 = giftShareHubFilterTab;
        if ((i2 & 4) != 0) {
            list2 = k03Var.c;
        }
        List list3 = list2;
        if ((i2 & 8) != 0) {
            i = k03Var.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = k03Var.e;
        }
        return k03Var.a(list, giftShareHubFilterTab2, list3, i3, z);
    }

    public final k03 a(List list, GiftShareHubFilterTab giftShareHubFilterTab, List list2, int i, boolean z) {
        zq3.h(list, "gitHubTabs");
        zq3.h(giftShareHubFilterTab, "selectedTab");
        zq3.h(list2, "giftHubDataBySelectedTab");
        return new k03(list, giftShareHubFilterTab, list2, i, z);
    }

    public final List c() {
        return this.c;
    }

    public final List d() {
        return this.a;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k03)) {
            return false;
        }
        k03 k03Var = (k03) obj;
        return zq3.c(this.a, k03Var.a) && this.b == k03Var.b && zq3.c(this.c, k03Var.c) && this.d == k03Var.d && this.e == k03Var.e;
    }

    public final GiftShareHubFilterTab f() {
        return this.b;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + Boolean.hashCode(this.e);
    }

    public String toString() {
        return "GiftShareHubUIState(gitHubTabs=" + this.a + ", selectedTab=" + this.b + ", giftHubDataBySelectedTab=" + this.c + ", remainingGifts=" + this.d + ", showGiftShareFailedError=" + this.e + ")";
    }

    public /* synthetic */ k03(List list, GiftShareHubFilterTab giftShareHubFilterTab, List list2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? d.C0(GiftShareHubFilterTab.values()) : list, (i2 & 2) != 0 ? GiftShareHubFilterTab.ACTIVE_LINKS : giftShareHubFilterTab, (i2 & 4) != 0 ? i.l() : list2, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? false : z);
    }
}
