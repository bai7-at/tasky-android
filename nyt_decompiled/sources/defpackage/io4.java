package defpackage;

import android.app.Activity;
import com.nytimes.android.share.IntentChooserTitle;
import com.nytimes.android.utils.ShareOrigin;

/* loaded from: classes4.dex */
public final class io4 implements ho4 {
    public static final int b = uq7.b;
    private final uq7 a;

    public io4(uq7 uq7Var) {
        zq3.h(uq7Var, "sharingManager");
        this.a = uq7Var;
    }

    @Override // defpackage.ho4
    public void a(Activity activity, String str, String str2, String str3, ShareOrigin shareOrigin) {
        zq3.h(activity, "activity");
        zq3.h(str, "webUrl");
        zq3.h(str2, "title");
        zq3.h(str3, "assetType");
        zq3.h(shareOrigin, "shareOrigin");
        this.a.g(activity, str, str2, str3, IntentChooserTitle.VIDEO, shareOrigin);
    }

    @Override // defpackage.ho4
    public void b(Activity activity, String str, String str2, String str3, ShareOrigin shareOrigin) {
        zq3.h(activity, "activity");
        zq3.h(str, "title");
        zq3.h(str2, "webUrl");
        zq3.h(str3, "assetType");
        zq3.h(shareOrigin, "shareOrigin");
        this.a.p(activity, str, str2, str3, shareOrigin);
    }

    @Override // defpackage.ho4
    public void c(Activity activity, String str, String str2, String str3, ShareOrigin shareOrigin) {
        zq3.h(activity, "activity");
        zq3.h(str, "shareUrl");
        zq3.h(str2, "title");
        zq3.h(shareOrigin, "articleFront");
        uq7.n(this.a, activity, str, str2, str3, shareOrigin, null, null, null, null, false, null, null, 4064, null);
    }
}
