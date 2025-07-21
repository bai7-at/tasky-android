package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.android.HandlerDispatcherKt;

/* loaded from: classes.dex */
public final class WindowRecomposerPolicy {
    public static final WindowRecomposerPolicy a = new WindowRecomposerPolicy();
    private static final AtomicReference b = new AtomicReference(x.a.c());
    public static final int c = 8;

    public static final class a implements View.OnAttachStateChangeListener {
        final /* synthetic */ Job a;

        a(Job job) {
            this.a = job;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            Job.DefaultImpls.cancel$default(this.a, (CancellationException) null, 1, (Object) null);
        }
    }

    private WindowRecomposerPolicy() {
    }

    public final Recomposer a(View view) {
        Job launch$default;
        Recomposer a2 = ((x) b.get()).a(view);
        WindowRecomposer_androidKt.i(view, a2);
        launch$default = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, HandlerDispatcherKt.from(view.getHandler(), "windowRecomposer cleanup").getImmediate(), null, new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(a2, view, null), 2, null);
        view.addOnAttachStateChangeListener(new a(launch$default));
        return a2;
    }
}
