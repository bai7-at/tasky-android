package defpackage;

import com.google.common.base.Optional;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.sectionfront.adapter.model.b;
import com.nytimes.android.utils.TimeStampUtil;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class f60 {
    private final TimeStampUtil a;

    public f60(TimeStampUtil timeStampUtil) {
        this.a = timeStampUtil;
    }

    private boolean b(Asset asset) {
        return (asset == null || asset.getRealLastModified() == 0 || s48.b(asset.getSummary())) ? false : true;
    }

    protected void a(k38 k38Var, b.a aVar) {
        boolean b = b(k38Var.b);
        aVar.q(b);
        aVar.v(Optional.b(b ? this.a.y(k38Var.b.getRealLastModified(), TimeUnit.SECONDS) : null));
    }
}
