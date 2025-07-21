package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.comscore.streaming.ContentDistributionModel;
import defpackage.c92;
import defpackage.ig9;
import defpackage.ut6;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a implements ut6 {
    private float Z;
    private Object a;
    private float a0;
    final State b;
    b c0;
    b d0;
    private Object e0;
    private ConstraintWidget f0;
    private HashMap g0;
    private HashMap h0;
    String c = null;
    int d = 0;
    int e = 0;
    float f = -1.0f;
    float g = -1.0f;
    float h = 0.5f;
    float i = 0.5f;
    protected int j = 0;
    protected int k = 0;
    protected int l = 0;
    protected int m = 0;
    protected int n = 0;
    protected int o = 0;
    protected int p = 0;
    protected int q = 0;
    protected int r = 0;
    protected int s = 0;
    protected int t = 0;
    protected int u = 0;
    int v = 0;
    int w = 0;
    float x = Float.NaN;
    float y = Float.NaN;
    float z = Float.NaN;
    float A = Float.NaN;
    float B = Float.NaN;
    float C = Float.NaN;
    float D = Float.NaN;
    float E = Float.NaN;
    float F = Float.NaN;
    float G = Float.NaN;
    float H = Float.NaN;
    int I = 0;
    protected Object J = null;
    protected Object K = null;
    protected Object L = null;
    protected Object M = null;
    protected Object N = null;
    protected Object O = null;
    protected Object P = null;
    protected Object Q = null;
    protected Object R = null;
    protected Object S = null;
    protected Object T = null;
    protected Object U = null;
    Object V = null;
    Object W = null;
    Object X = null;
    Object Y = null;
    State.Constraint b0 = null;

    /* renamed from: androidx.constraintlayout.core.state.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0070a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[State.Constraint.values().length];
            a = iArr;
            try {
                iArr[State.Constraint.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[State.Constraint.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[State.Constraint.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[State.Constraint.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[State.Constraint.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[State.Constraint.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[State.Constraint.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[State.Constraint.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[State.Constraint.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[State.Constraint.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[State.Constraint.BOTTOM_TO_TOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[State.Constraint.BOTTOM_TO_BOTTOM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[State.Constraint.BASELINE_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[State.Constraint.BASELINE_TO_TOP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[State.Constraint.BASELINE_TO_BASELINE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[State.Constraint.CIRCULAR_CONSTRAINT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[State.Constraint.CENTER_HORIZONTALLY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[State.Constraint.CENTER_VERTICALLY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public a(State state) {
        Object obj = b.j;
        this.c0 = b.b(obj);
        this.d0 = b.b(obj);
        this.g0 = new HashMap();
        this.h0 = new HashMap();
        this.b = state;
    }

    private void e(ConstraintWidget constraintWidget, Object obj, State.Constraint constraint) {
        ConstraintWidget o = o(obj);
        if (o == null) {
        }
        int[] iArr = C0070a.a;
        int i = iArr[constraint.ordinal()];
        switch (iArr[constraint.ordinal()]) {
            case 1:
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.LEFT;
                constraintWidget.o(type2).b(o.o(type2), this.j, this.p, false);
                break;
            case 2:
                constraintWidget.o(ConstraintAnchor.Type.LEFT).b(o.o(ConstraintAnchor.Type.RIGHT), this.j, this.p, false);
                break;
            case 3:
                constraintWidget.o(ConstraintAnchor.Type.RIGHT).b(o.o(ConstraintAnchor.Type.LEFT), this.k, this.q, false);
                break;
            case 4:
                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.o(type3).b(o.o(type3), this.k, this.q, false);
                break;
            case 5:
                ConstraintAnchor.Type type4 = ConstraintAnchor.Type.LEFT;
                constraintWidget.o(type4).b(o.o(type4), this.l, this.r, false);
                break;
            case 6:
                constraintWidget.o(ConstraintAnchor.Type.LEFT).b(o.o(ConstraintAnchor.Type.RIGHT), this.l, this.r, false);
                break;
            case 7:
                constraintWidget.o(ConstraintAnchor.Type.RIGHT).b(o.o(ConstraintAnchor.Type.LEFT), this.m, this.s, false);
                break;
            case 8:
                ConstraintAnchor.Type type5 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.o(type5).b(o.o(type5), this.m, this.s, false);
                break;
            case 9:
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.TOP;
                constraintWidget.o(type6).b(o.o(type6), this.n, this.t, false);
                break;
            case 10:
                constraintWidget.o(ConstraintAnchor.Type.TOP).b(o.o(ConstraintAnchor.Type.BOTTOM), this.n, this.t, false);
                break;
            case 11:
                constraintWidget.o(ConstraintAnchor.Type.BOTTOM).b(o.o(ConstraintAnchor.Type.TOP), this.o, this.u, false);
                break;
            case 12:
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.BOTTOM;
                constraintWidget.o(type7).b(o.o(type7), this.o, this.u, false);
                break;
            case 13:
                constraintWidget.g0(ConstraintAnchor.Type.BASELINE, o, ConstraintAnchor.Type.BOTTOM, this.v, this.w);
                break;
            case 14:
                constraintWidget.g0(ConstraintAnchor.Type.BASELINE, o, ConstraintAnchor.Type.TOP, this.v, this.w);
                break;
            case 15:
                ConstraintAnchor.Type type8 = ConstraintAnchor.Type.BASELINE;
                constraintWidget.g0(type8, o, type8, this.v, this.w);
                break;
            case 16:
                constraintWidget.l(o, this.Z, (int) this.a0);
                break;
        }
    }

    private void j() {
        this.J = m(this.J);
        this.K = m(this.K);
        this.L = m(this.L);
        this.M = m(this.M);
        this.N = m(this.N);
        this.O = m(this.O);
        this.P = m(this.P);
        this.Q = m(this.Q);
        this.R = m(this.R);
        this.S = m(this.S);
        this.T = m(this.T);
        this.U = m(this.U);
        this.V = m(this.V);
        this.W = m(this.W);
        this.X = m(this.X);
    }

    private Object m(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof a) ? this.b.g(obj) : obj;
    }

    private ConstraintWidget o(Object obj) {
        if (obj instanceof ut6) {
            return ((ut6) obj).b();
        }
        return null;
    }

    public void A(String str) {
        this.c = str;
    }

    public void B(Object obj) {
        this.e0 = obj;
        ConstraintWidget constraintWidget = this.f0;
        if (constraintWidget != null) {
            constraintWidget.D0(obj);
        }
    }

    public a C(b bVar) {
        this.c0 = bVar;
        return this;
    }

    public a D(Object obj) {
        this.b0 = State.Constraint.START_TO_END;
        this.O = obj;
        return this;
    }

    public a E(Object obj) {
        this.b0 = State.Constraint.START_TO_START;
        this.N = obj;
        return this;
    }

    public a F(Object obj) {
        this.b0 = State.Constraint.TOP_TO_BOTTOM;
        this.S = obj;
        return this;
    }

    public a G(Object obj) {
        this.b0 = State.Constraint.TOP_TO_TOP;
        this.R = obj;
        return this;
    }

    @Override // defpackage.ut6
    public void a(ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return;
        }
        this.f0 = constraintWidget;
        constraintWidget.D0(this.e0);
    }

    @Override // defpackage.ut6
    public void apply() {
        ConstraintWidget constraintWidget = this.f0;
        if (constraintWidget == null) {
            return;
        }
        this.c0.d(this.b, constraintWidget, 0);
        this.d0.d(this.b, this.f0, 1);
        j();
        e(this.f0, this.J, State.Constraint.LEFT_TO_LEFT);
        e(this.f0, this.K, State.Constraint.LEFT_TO_RIGHT);
        e(this.f0, this.L, State.Constraint.RIGHT_TO_LEFT);
        e(this.f0, this.M, State.Constraint.RIGHT_TO_RIGHT);
        e(this.f0, this.N, State.Constraint.START_TO_START);
        e(this.f0, this.O, State.Constraint.START_TO_END);
        e(this.f0, this.P, State.Constraint.END_TO_START);
        e(this.f0, this.Q, State.Constraint.END_TO_END);
        e(this.f0, this.R, State.Constraint.TOP_TO_TOP);
        e(this.f0, this.S, State.Constraint.TOP_TO_BOTTOM);
        e(this.f0, this.T, State.Constraint.BOTTOM_TO_TOP);
        e(this.f0, this.U, State.Constraint.BOTTOM_TO_BOTTOM);
        e(this.f0, this.V, State.Constraint.BASELINE_TO_BASELINE);
        e(this.f0, this.W, State.Constraint.BASELINE_TO_TOP);
        e(this.f0, this.X, State.Constraint.BASELINE_TO_BOTTOM);
        e(this.f0, this.Y, State.Constraint.CIRCULAR_CONSTRAINT);
        int i = this.d;
        if (i != 0) {
            this.f0.P0(i);
        }
        int i2 = this.e;
        if (i2 != 0) {
            this.f0.g1(i2);
        }
        float f = this.f;
        if (f != -1.0f) {
            this.f0.T0(f);
        }
        float f2 = this.g;
        if (f2 != -1.0f) {
            this.f0.k1(f2);
        }
        this.f0.O0(this.h);
        this.f0.f1(this.i);
        ConstraintWidget constraintWidget2 = this.f0;
        ig9 ig9Var = constraintWidget2.n;
        ig9Var.f = this.x;
        ig9Var.g = this.y;
        ig9Var.h = this.z;
        ig9Var.i = this.A;
        ig9Var.j = this.B;
        ig9Var.k = this.C;
        ig9Var.l = this.D;
        ig9Var.m = this.E;
        ig9Var.n = this.G;
        ig9Var.o = this.H;
        ig9Var.p = this.F;
        int i3 = this.I;
        ig9Var.r = i3;
        constraintWidget2.l1(i3);
        HashMap hashMap = this.g0;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                this.f0.n.g(str, ContentDistributionModel.EXCLUSIVELY_ONLINE, ((Integer) this.g0.get(str)).intValue());
            }
        }
        HashMap hashMap2 = this.h0;
        if (hashMap2 != null) {
            for (String str2 : hashMap2.keySet()) {
                this.f0.n.f(str2, ContentDistributionModel.TV_AND_ONLINE, ((Float) this.h0.get(str2)).floatValue());
            }
        }
    }

    @Override // defpackage.ut6
    public ConstraintWidget b() {
        if (this.f0 == null) {
            ConstraintWidget i = i();
            this.f0 = i;
            i.D0(this.e0);
        }
        return this.f0;
    }

    @Override // defpackage.ut6
    public void c(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ut6
    public c92 d() {
        return null;
    }

    public a f(Object obj) {
        this.b0 = State.Constraint.BASELINE_TO_BASELINE;
        this.V = obj;
        return this;
    }

    public a g(Object obj) {
        this.b0 = State.Constraint.BOTTOM_TO_BOTTOM;
        this.U = obj;
        return this;
    }

    @Override // defpackage.ut6
    public Object getKey() {
        return this.a;
    }

    public a h(Object obj) {
        this.b0 = State.Constraint.BOTTOM_TO_TOP;
        this.T = obj;
        return this;
    }

    public ConstraintWidget i() {
        return new ConstraintWidget(p().g(), n().g());
    }

    public a k(Object obj) {
        this.b0 = State.Constraint.END_TO_END;
        this.Q = obj;
        return this;
    }

    public a l(Object obj) {
        this.b0 = State.Constraint.END_TO_START;
        this.P = obj;
        return this;
    }

    public b n() {
        return this.d0;
    }

    public b p() {
        return this.c0;
    }

    public a q(float f) {
        this.h = f;
        return this;
    }

    public a r(Object obj) {
        this.b0 = State.Constraint.LEFT_TO_LEFT;
        this.J = obj;
        return this;
    }

    public a s(Object obj) {
        this.b0 = State.Constraint.LEFT_TO_RIGHT;
        this.K = obj;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a t(int i) {
        State.Constraint constraint = this.b0;
        if (constraint != null) {
            switch (C0070a.a[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.j = i;
                    break;
                case 3:
                case 4:
                    this.k = i;
                    break;
                case 5:
                case 6:
                    this.l = i;
                    break;
                case 7:
                case 8:
                    this.m = i;
                    break;
                case 9:
                case 10:
                    this.n = i;
                    break;
                case 11:
                case 12:
                    this.o = i;
                    break;
                case 13:
                case 14:
                case 15:
                    this.v = i;
                    break;
                case 16:
                    this.a0 = i;
                    break;
            }
        } else {
            this.j = i;
            this.k = i;
            this.l = i;
            this.m = i;
            this.n = i;
            this.o = i;
        }
        return this;
    }

    public a u(Object obj) {
        return t(this.b.c(obj));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a v(int i) {
        State.Constraint constraint = this.b0;
        if (constraint != null) {
            switch (C0070a.a[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.p = i;
                    break;
                case 3:
                case 4:
                    this.q = i;
                    break;
                case 5:
                case 6:
                    this.r = i;
                    break;
                case 7:
                case 8:
                    this.s = i;
                    break;
                case 9:
                case 10:
                    this.t = i;
                    break;
                case 11:
                case 12:
                    this.u = i;
                    break;
                case 13:
                case 14:
                case 15:
                    this.w = i;
                    break;
            }
        } else {
            this.p = i;
            this.q = i;
            this.r = i;
            this.s = i;
            this.t = i;
            this.u = i;
        }
        return this;
    }

    public a w(Object obj) {
        return v(this.b.c(obj));
    }

    public a x(Object obj) {
        this.b0 = State.Constraint.RIGHT_TO_LEFT;
        this.L = obj;
        return this;
    }

    public a y(Object obj) {
        this.b0 = State.Constraint.RIGHT_TO_RIGHT;
        this.M = obj;
        return this;
    }

    public a z(b bVar) {
        this.d0 = bVar;
        return this;
    }
}
