package androidx.compose.ui.layout;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.yq3;
import java.util.Map;

/* loaded from: classes.dex */
public final class a implements f, yq3 {
    private final LayoutDirection a;
    private final /* synthetic */ yq3 b;

    /* renamed from: androidx.compose.ui.layout.a$a, reason: collision with other inner class name */
    public static final class C0060a implements sg4 {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ Map c;

        C0060a(int i, int i2, Map map) {
            this.a = i;
            this.b = i2;
            this.c = map;
        }

        @Override // defpackage.sg4
        public void e() {
        }

        @Override // defpackage.sg4
        public Map f() {
            return this.c;
        }

        @Override // defpackage.sg4
        public int getHeight() {
            return this.b;
        }

        @Override // defpackage.sg4
        public int getWidth() {
            return this.a;
        }
    }

    public a(yq3 yq3Var, LayoutDirection layoutDirection) {
        this.a = layoutDirection;
        this.b = yq3Var;
    }

    @Override // defpackage.an2
    public long A(float f) {
        return this.b.A(f);
    }

    @Override // defpackage.fm1
    public long B(long j) {
        return this.b.B(j);
    }

    @Override // defpackage.an2
    public float F(long j) {
        return this.b.F(j);
    }

    @Override // androidx.compose.ui.layout.f
    public sg4 P(int i, int i2, Map map, ss2 ss2Var) {
        int d = uo6.d(i, 0);
        int d2 = uo6.d(i2, 0);
        if ((d & (-16777216)) == 0 && ((-16777216) & d2) == 0) {
            return new C0060a(d, d2, map);
        }
        throw new IllegalStateException(("Size(" + d + " x " + d2 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }

    @Override // defpackage.fm1
    public long Q(float f) {
        return this.b.Q(f);
    }

    @Override // defpackage.fm1
    public float X0(float f) {
        return this.b.X0(f);
    }

    @Override // defpackage.yq3
    public boolean Z() {
        return this.b.Z();
    }

    @Override // defpackage.an2
    public float c1() {
        return this.b.c1();
    }

    @Override // defpackage.fm1
    public float f1(float f) {
        return this.b.f1(f);
    }

    @Override // defpackage.fm1
    public float getDensity() {
        return this.b.getDensity();
    }

    @Override // defpackage.yq3
    public LayoutDirection getLayoutDirection() {
        return this.a;
    }

    @Override // defpackage.fm1
    public int k1(long j) {
        return this.b.k1(j);
    }

    @Override // defpackage.fm1
    public int l0(float f) {
        return this.b.l0(f);
    }

    @Override // defpackage.fm1
    public float t0(long j) {
        return this.b.t0(j);
    }

    @Override // defpackage.fm1
    public float v(int i) {
        return this.b.v(i);
    }

    @Override // defpackage.fm1
    public long v1(long j) {
        return this.b.v1(j);
    }
}
