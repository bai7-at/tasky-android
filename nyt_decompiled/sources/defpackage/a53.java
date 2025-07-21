package defpackage;

import android.app.Application;
import com.nytimes.android.growthui.postauth.models.remoteconfig.PostAuthConfigRepository;
import com.squareup.moshi.i;

/* loaded from: classes4.dex */
public abstract class a53 implements ba2 {
    public static PostAuthConfigRepository a(y43 y43Var, Application application, p53 p53Var, r53 r53Var, i iVar) {
        return (PostAuthConfigRepository) g16.e(y43Var.c(application, p53Var, r53Var, iVar));
    }
}
