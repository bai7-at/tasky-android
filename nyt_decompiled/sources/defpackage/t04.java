package defpackage;

import androidx.compose.runtime.y;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class t04 implements x08 {
    private static final a e = new a(null);
    private final int a;
    private final int b;
    private final sy4 c;
    private int d;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final an3 b(int i, int i2, int i3) {
            int i4 = (i / i2) * i2;
            return uo6.u(Math.max(i4 - i3, 0), i4 + i2 + i3);
        }

        private a() {
        }
    }

    public t04(int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        this.c = y.i(e.b(i, i2, i3), y.q());
        this.d = i;
    }

    private void n(an3 an3Var) {
        this.c.setValue(an3Var);
    }

    @Override // defpackage.x08
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public an3 getValue() {
        return (an3) this.c.getValue();
    }

    public final void o(int i) {
        if (i != this.d) {
            this.d = i;
            n(e.b(i, this.a, this.b));
        }
    }
}
