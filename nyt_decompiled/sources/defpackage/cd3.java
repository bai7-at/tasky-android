package defpackage;

import com.nytimes.xwords.hybrid.rest.PageService;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public abstract class cd3 implements ba2 {
    public static PageService a(lc3 lc3Var, Retrofit retrofit) {
        return (PageService) g16.e(lc3Var.q(retrofit));
    }
}
