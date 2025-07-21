package defpackage;

import androidx.fragment.app.f;
import androidx.lifecycle.Lifecycle;
import com.nytimes.android.hybrid.HybridEventListener;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes3.dex */
public interface sq {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final HybridEventListener a(f fVar, ld3 ld3Var, CoroutineDispatcher coroutineDispatcher) {
            zq3.h(fVar, "activity");
            zq3.h(ld3Var, "hybridScripts");
            zq3.h(coroutineDispatcher, "mainDispatcher");
            Lifecycle lifecycle = fVar.getLifecycle();
            zq3.g(lifecycle, "<get-lifecycle>(...)");
            return new HybridEventListener(lifecycle, ld3Var, coroutineDispatcher);
        }
    }
}
