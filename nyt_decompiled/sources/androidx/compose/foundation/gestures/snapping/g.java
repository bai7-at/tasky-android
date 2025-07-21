package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.snapping.g;

/* loaded from: classes.dex */
public interface g {
    public static final a a = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final g b = new g() { // from class: ew7
            @Override // androidx.compose.foundation.gestures.snapping.g
            public final int a(int i, int i2, int i3, int i4, int i5) {
                int b2;
                b2 = g.a.b(i, i2, i3, i4, i5);
                return b2;
            }
        };

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int b(int i, int i2, int i3, int i4, int i5) {
            return (((i - i3) - i4) / 2) - (i2 / 2);
        }

        public final g c() {
            return b;
        }
    }

    int a(int i, int i2, int i3, int i4, int i5);
}
