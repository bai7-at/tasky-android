package defpackage;

import android.content.Context;
import android.net.Uri;
import com.nytimes.android.logging.NYTLogger;

/* loaded from: classes4.dex */
public final class k21 extends id1 {
    private final ms b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k21(ms msVar) {
        super("/create_account/");
        zq3.h(msVar, "wrapper");
        this.b = msVar;
    }

    @Override // defpackage.dd1
    public Object a(Context context, Uri uri, String str, b65 b65Var, boolean z, by0 by0Var) {
        NYTLogger.l("Deeplinking to create account %s", uri);
        return this.b.i(context, str, by0Var);
    }
}
