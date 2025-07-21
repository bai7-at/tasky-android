package defpackage;

import android.content.Context;
import android.net.Uri;
import com.nytimes.android.logging.NYTLogger;

/* loaded from: classes4.dex */
public final class cv2 extends id1 {
    private final ms b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv2(ms msVar) {
        super("/gamesProducts/");
        zq3.h(msVar, "wrapper");
        this.b = msVar;
    }

    @Override // defpackage.dd1
    public Object a(Context context, Uri uri, String str, b65 b65Var, boolean z, by0 by0Var) {
        NYTLogger.l("Deeplinking to Games Landing Page", new Object[0]);
        ms msVar = this.b;
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        return msVar.k(context, path);
    }
}
