package defpackage;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.ImageDimension;
import com.nytimes.android.sectionfront.adapter.model.SectionAdapterItemType;

/* loaded from: classes4.dex */
public class re7 {
    public final SectionAdapterItemType a;
    public final long b;
    public int c;
    private ImageDimension d;
    private ImageDimension e;

    public re7(SectionAdapterItemType sectionAdapterItemType, long j) {
        this.a = sectionAdapterItemType;
        this.b = j;
    }

    public Asset d() {
        return null;
    }

    public k57 e() {
        return null;
    }

    public ImageDimension f() {
        return this.d;
    }

    public ImageDimension g() {
        return this.e;
    }

    public boolean i() {
        return false;
    }

    public boolean j() {
        return false;
    }

    public void k(ImageDimension imageDimension) {
        this.d = imageDimension;
    }

    public void l(ImageDimension imageDimension) {
        this.e = imageDimension;
    }
}
