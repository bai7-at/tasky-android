package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.platform.x;

/* loaded from: classes.dex */
public interface x {
    public static final a a = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final x b = new x() { // from class: wh9
            @Override // androidx.compose.ui.platform.x
            public final Recomposer a(View view) {
                Recomposer b2;
                b2 = x.a.b(view);
                return b2;
            }
        };

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Recomposer b(View view) {
            return WindowRecomposer_androidKt.c(view, null, null, 3, null);
        }

        public final x c() {
            return b;
        }
    }

    Recomposer a(View view);
}
