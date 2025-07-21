package defpackage;

import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.sectionfront.adapter.model.SFSummaryController;
import com.nytimes.android.sectionfront.adapter.model.b;
import com.nytimes.android.utils.TimeStampUtil;
import io.reactivex.functions.Function;

/* loaded from: classes4.dex */
public class tm8 extends f60 implements Function {
    private final SFSummaryController b;
    private final SectionFront c;
    private final ue7 d;

    public tm8(SectionFront sectionFront, ue7 ue7Var, TimeStampUtil timeStampUtil, SFSummaryController sFSummaryController) {
        super(timeStampUtil);
        this.c = sectionFront;
        this.d = ue7Var;
        this.b = sFSummaryController;
    }

    @Override // io.reactivex.functions.Function
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public yq apply(k38 k38Var) {
        b.a m = b.k().m(k38Var.b);
        this.b.b(m, k38Var.b, this.c, k38Var.a());
        a(k38Var, m);
        return new yq(k38Var.a(), k38Var.b.getAssetId(), m.n(), this.c, k38Var.a, this.d.d);
    }
}
