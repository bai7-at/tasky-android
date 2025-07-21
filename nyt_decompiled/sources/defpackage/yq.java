package defpackage;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.sectionfront.adapter.model.SectionAdapterItemType;

/* loaded from: classes4.dex */
public class yq extends re7 implements Comparable, mn2 {
    public final int f;
    public final boolean g;
    public final Asset h;
    public final SectionFront i;
    public final k57 j;
    private int k;

    public yq(SectionAdapterItemType sectionAdapterItemType, long j, k57 k57Var, SectionFront sectionFront, int i, boolean z) {
        super(sectionAdapterItemType, j);
        this.k = -1;
        this.f = i;
        this.i = sectionFront;
        this.j = k57Var;
        this.h = k57Var.a();
        this.g = z;
    }

    @Override // defpackage.mn2
    public void a(int i) {
        this.k = i;
    }

    @Override // defpackage.mn2
    public String b() {
        return this.h.getUrl();
    }

    @Override // defpackage.mn2
    public int c() {
        return this.k;
    }

    @Override // defpackage.re7
    public Asset d() {
        return this.h;
    }

    @Override // defpackage.re7
    public k57 e() {
        return this.j;
    }

    @Override // defpackage.re7
    public boolean j() {
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int compareTo(yq yqVar) {
        return this.f - yqVar.f;
    }
}
