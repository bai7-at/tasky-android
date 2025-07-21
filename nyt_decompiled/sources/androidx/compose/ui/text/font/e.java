package androidx.compose.ui.text.font;

import defpackage.x08;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class e {
    public static final a b = new a(null);
    private static final v c = new androidx.compose.ui.text.font.b();
    private static final p d = new p("sans-serif", "FontFamily.SansSerif");
    private static final p e = new p("serif", "FontFamily.Serif");
    private static final p f = new p("monospace", "FontFamily.Monospace");
    private static final p g = new p("cursive", "FontFamily.Cursive");
    private final boolean a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v a() {
            return e.c;
        }

        public final p b() {
            return e.f;
        }

        public final p c() {
            return e.d;
        }

        public final p d() {
            return e.e;
        }

        private a() {
        }
    }

    public interface b {
        static /* synthetic */ x08 b(b bVar, e eVar, o oVar, int i, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
            }
            if ((i3 & 1) != 0) {
                eVar = null;
            }
            if ((i3 & 2) != 0) {
                oVar = o.b.f();
            }
            if ((i3 & 4) != 0) {
                i = l.b.b();
            }
            if ((i3 & 8) != 0) {
                i2 = m.b.a();
            }
            return bVar.a(eVar, oVar, i, i2);
        }

        x08 a(e eVar, o oVar, int i, int i2);
    }

    public /* synthetic */ e(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    private e(boolean z) {
        this.a = z;
    }
}
