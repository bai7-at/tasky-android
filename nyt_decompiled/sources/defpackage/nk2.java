package defpackage;

import com.nytimes.android.sectionfront.adapter.model.SectionAdapterItemType;

/* loaded from: classes4.dex */
public class nk2 extends re7 {
    private final int f;

    public nk2(long j, int i) {
        super(SectionAdapterItemType.FLEX_FRAME_AD, j);
        this.f = i;
    }

    @Override // defpackage.re7
    public boolean i() {
        return true;
    }

    public int n() {
        return this.f;
    }
}
