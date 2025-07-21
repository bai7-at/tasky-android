package defpackage;

import com.nytimes.android.growthui.postauth.PostAuthActivity;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public abstract class h06 implements op4 {
    public static void a(PostAuthActivity postAuthActivity, CoroutineScope coroutineScope) {
        postAuthActivity.applicationScope = coroutineScope;
    }

    public static void b(PostAuthActivity postAuthActivity, Map map) {
        postAuthActivity.eventsSenderMap = map;
    }

    public static void c(PostAuthActivity postAuthActivity, r53 r53Var) {
        postAuthActivity.subscription = r53Var;
    }

    public static void d(PostAuthActivity postAuthActivity, t53 t53Var) {
        postAuthActivity.theme = t53Var;
    }
}
