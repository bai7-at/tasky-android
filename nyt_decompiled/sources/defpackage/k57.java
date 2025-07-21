package defpackage;

import com.google.common.base.Optional;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.InteractiveAsset;
import com.nytimes.android.api.cms.PromoAsset;

/* loaded from: classes4.dex */
public abstract class k57 {
    public abstract Asset a();

    public boolean b() {
        return (a() instanceof PromoAsset) || (a() instanceof InteractiveAsset) || !a().isCommentsEnabled();
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public abstract Optional e();

    public abstract Optional f();

    public abstract Optional g();
}
