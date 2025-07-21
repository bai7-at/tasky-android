package defpackage;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.sectionfront.adapter.model.SectionAdapterItemType;

/* loaded from: classes4.dex */
public class k38 {
    public final int a;
    public final Asset b;
    private SectionAdapterItemType c;

    public k38(int i, Asset asset) {
        this.a = i;
        this.b = asset;
    }

    public SectionAdapterItemType a() {
        return this.c;
    }

    public void b(SectionAdapterItemType sectionAdapterItemType) {
        this.c = sectionAdapterItemType;
    }
}
