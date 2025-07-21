package defpackage;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class ks2 implements wf3 {
    private final zf3 a;
    private final ArrayList b;

    public ks2(zf3 zf3Var) {
        zq3.h(zf3Var, "provider");
        this.a = zf3Var;
        this.b = i.h(Integer.valueOf(zf3Var.f()), Integer.valueOf(zf3Var.d()));
    }

    @Override // defpackage.wf3
    public Integer a(List list, Image image) {
        zq3.h(list, "mappings");
        zq3.h(image, AssetConstants.IMAGE_TYPE);
        if (list.containsAll(this.b)) {
            return Integer.valueOf(this.a.d());
        }
        if (list.isEmpty()) {
            return null;
        }
        return (Integer) i.k0(list);
    }
}
