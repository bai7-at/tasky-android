package defpackage;

import com.nytimes.android.api.cms.HasHybridProperties;
import com.nytimes.android.resourcedownloader.model.HybridProperties;
import java.util.List;

/* loaded from: classes4.dex */
public final class nh5 implements HasHybridProperties {
    private final String a;
    private final List b;
    private final List c;
    private final List d;

    public nh5(String str, List list, List list2, List list3) {
        zq3.h(str, "hybridBody");
        zq3.h(list, "hybridResources");
        zq3.h(list2, "hybridImages");
        zq3.h(list3, "assetsToRetrieve");
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
    }

    public final List a() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh5)) {
            return false;
        }
        nh5 nh5Var = (nh5) obj;
        return zq3.c(this.a, nh5Var.a) && zq3.c(this.b, nh5Var.b) && zq3.c(this.c, nh5Var.c) && zq3.c(this.d, nh5Var.d);
    }

    @Override // com.nytimes.android.api.cms.HasHybridProperties
    public String getHybridBody() {
        return this.a;
    }

    @Override // com.nytimes.android.api.cms.HasHybridProperties
    public List getHybridImages() {
        return this.c;
    }

    @Override // com.nytimes.android.api.cms.HasHybridProperties
    public List getHybridResources() {
        return this.b;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    @Override // com.nytimes.android.api.cms.HasHybridProperties
    public HybridProperties toHybridProperties() {
        return HasHybridProperties.DefaultImpls.toHybridProperties(this);
    }

    public String toString() {
        return "OneWebViewData(hybridBody=" + this.a + ", hybridResources=" + this.b + ", hybridImages=" + this.c + ", assetsToRetrieve=" + this.d + ")";
    }
}
