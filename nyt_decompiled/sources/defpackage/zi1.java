package defpackage;

import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.Image;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class zi1 implements wf3 {
    @Override // defpackage.wf3
    public Integer a(List list, Image image) {
        zq3.h(list, "mappings");
        zq3.h(image, AssetConstants.IMAGE_TYPE);
        if (list.isEmpty()) {
            return null;
        }
        return (Integer) i.k0(list);
    }
}
