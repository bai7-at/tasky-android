package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.nytimes.android.MainActivity;
import com.nytimes.android.entitlements.a;
import com.nytimes.android.logging.NYTLogger;

/* loaded from: classes4.dex */
public final class ua8 extends id1 {
    private final ms b;
    private final a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua8(ms msVar, a aVar) {
        super("/subscribe/");
        zq3.h(msVar, "wrapper");
        zq3.h(aVar, "eCommClient");
        this.b = msVar;
        this.c = aVar;
    }

    @Override // defpackage.dd1
    public Object a(Context context, Uri uri, String str, b65 b65Var, boolean z, by0 by0Var) {
        if (this.c.a()) {
            return new Intent(context, (Class<?>) MainActivity.class);
        }
        NYTLogger.l("Deeplinking to subscribe", new Object[0]);
        ms msVar = this.b;
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        return msVar.j(context, path, str);
    }
}
