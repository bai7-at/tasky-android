package defpackage;

import com.nytimes.android.growthui.landingpage.LandingPageActivity;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public abstract class by3 implements op4 {
    public static void a(LandingPageActivity landingPageActivity, CoroutineScope coroutineScope) {
        landingPageActivity.applicationScope = coroutineScope;
    }

    public static void b(LandingPageActivity landingPageActivity, t43 t43Var) {
        landingPageActivity.auth = t43Var;
    }

    public static void c(LandingPageActivity landingPageActivity, Map map) {
        landingPageActivity.eventsSenderMap = map;
    }

    public static void d(LandingPageActivity landingPageActivity, r53 r53Var) {
        landingPageActivity.subscription = r53Var;
    }

    public static void e(LandingPageActivity landingPageActivity, t53 t53Var) {
        landingPageActivity.theme = t53Var;
    }
}
