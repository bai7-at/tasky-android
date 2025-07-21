package defpackage;

import android.content.SharedPreferences;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.xwords.hybrid.rest.PageService;
import com.nytimes.xwords.hybrid.view.BaseHybridFragment;
import com.squareup.moshi.i;
import defpackage.lc3;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public abstract class n50 implements op4 {
    public static void a(BaseHybridFragment baseHybridFragment, AbraManager abraManager) {
        baseHybridFragment.abraManager = abraManager;
    }

    public static void b(BaseHybridFragment baseHybridFragment, el elVar) {
        baseHybridFragment.appConfig = elVar;
    }

    public static void c(BaseHybridFragment baseHybridFragment, lc3.a aVar) {
        baseHybridFragment.appVersionName = aVar;
    }

    public static void d(BaseHybridFragment baseHybridFragment, sb3 sb3Var) {
        baseHybridFragment.authEventPublisher = sb3Var;
    }

    public static void e(BaseHybridFragment baseHybridFragment, dz1 dz1Var) {
        baseHybridFragment.emailEventHandler = dz1Var;
    }

    public static void f(BaseHybridFragment baseHybridFragment, kb3 kb3Var) {
        baseHybridFragment.hybridAdManager = kb3Var;
    }

    public static void g(BaseHybridFragment baseHybridFragment, bc3 bc3Var) {
        baseHybridFragment.hybridConfigInstaller = bc3Var;
    }

    public static void h(BaseHybridFragment baseHybridFragment, ec3 ec3Var) {
        baseHybridFragment.hybridDependencies = ec3Var;
    }

    public static void i(BaseHybridFragment baseHybridFragment, id3 id3Var) {
        baseHybridFragment.hybridPreferences = id3Var;
    }

    public static void j(BaseHybridFragment baseHybridFragment, kd3 kd3Var) {
        baseHybridFragment.hybridPurrInfoProvider = kd3Var;
    }

    public static void k(BaseHybridFragment baseHybridFragment, i iVar) {
        baseHybridFragment.moshi = iVar;
    }

    public static void l(BaseHybridFragment baseHybridFragment, g55 g55Var) {
        baseHybridFragment.networkStatus = g55Var;
    }

    public static void m(BaseHybridFragment baseHybridFragment, c05 c05Var) {
        baseHybridFragment.nytCookieProvider = c05Var;
    }

    public static void n(BaseHybridFragment baseHybridFragment, PageService pageService) {
        baseHybridFragment.pageService = pageService;
    }

    public static void o(BaseHybridFragment baseHybridFragment, SharedPreferences sharedPreferences) {
        baseHybridFragment.preferences = sharedPreferences;
    }

    public static void p(BaseHybridFragment baseHybridFragment, Retrofit retrofit) {
        baseHybridFragment.retrofit = retrofit;
    }
}
