package androidx.compose.ui.text.font;

import defpackage.x08;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public interface w extends x08 {

    public static final class a implements w, x08 {
        private final AsyncFontListLoader a;

        public a(AsyncFontListLoader asyncFontListLoader) {
            this.a = asyncFontListLoader;
        }

        @Override // androidx.compose.ui.text.font.w
        public boolean e() {
            return this.a.n();
        }

        @Override // defpackage.x08
        public Object getValue() {
            return this.a.getValue();
        }
    }

    boolean e();

    public static final class b implements w {
        private final Object a;
        private final boolean b;

        public b(Object obj, boolean z) {
            this.a = obj;
            this.b = z;
        }

        @Override // androidx.compose.ui.text.font.w
        public boolean e() {
            return this.b;
        }

        @Override // defpackage.x08
        public Object getValue() {
            return this.a;
        }

        public /* synthetic */ b(Object obj, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? true : z);
        }
    }
}
