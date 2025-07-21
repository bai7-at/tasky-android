package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.j;
import androidx.constraintlayout.core.widgets.analyzer.l;
import com.chartbeat.androidsdk.QueryKeys;
import defpackage.ig9;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintWidget {
    public static float K0 = 0.5f;
    public int A;
    int A0;
    public float B;
    boolean B0;
    public int C;
    boolean C0;
    public int D;
    public float[] D0;
    public float E;
    protected ConstraintWidget[] E0;
    int F;
    protected ConstraintWidget[] F0;
    float G;
    ConstraintWidget G0;
    private int[] H;
    ConstraintWidget H0;
    private float I;
    public int I0;
    private boolean J;
    public int J0;
    private boolean K;
    private boolean L;
    private int M;
    private int N;
    public ConstraintAnchor O;
    public ConstraintAnchor P;
    public ConstraintAnchor Q;
    public ConstraintAnchor R;
    public ConstraintAnchor S;
    ConstraintAnchor T;
    ConstraintAnchor U;
    public ConstraintAnchor V;
    public ConstraintAnchor[] W;
    protected ArrayList X;
    private boolean[] Y;
    public DimensionBehaviour[] Z;
    public boolean a;
    public ConstraintWidget a0;
    public WidgetRun[] b;
    int b0;
    public androidx.constraintlayout.core.widgets.analyzer.c c;
    int c0;
    public androidx.constraintlayout.core.widgets.analyzer.c d;
    public float d0;
    public j e;
    protected int e0;
    public l f;
    protected int f0;
    public boolean[] g;
    protected int g0;
    boolean h;
    int h0;
    private boolean i;
    int i0;
    private boolean j;
    protected int j0;
    private boolean k;
    protected int k0;
    private int l;
    int l0;
    private int m;
    protected int m0;
    public ig9 n;
    protected int n0;
    public String o;
    float o0;
    private boolean p;
    float p0;
    private boolean q;
    private Object q0;
    private boolean r;
    private int r0;
    private boolean s;
    private int s0;
    public int t;
    private boolean t0;
    public int u;
    private String u0;
    private int v;
    private String v0;
    public int w;
    boolean w0;
    public int x;
    boolean x0;
    public int[] y;
    boolean y0;
    public int z;
    int z0;

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[DimensionBehaviour.values().length];
            b = iArr;
            try {
                iArr[DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ConstraintAnchor.Type.values().length];
            a = iArr2;
            try {
                iArr2[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public ConstraintWidget() {
        this.a = false;
        this.b = new WidgetRun[2];
        this.e = null;
        this.f = null;
        this.g = new boolean[]{true, true};
        this.h = false;
        this.i = true;
        this.j = false;
        this.k = true;
        this.l = -1;
        this.m = -1;
        this.n = new ig9(this);
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = -1;
        this.u = -1;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = new int[2];
        this.z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.F = -1;
        this.G = 1.0f;
        this.H = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.I = 0.0f;
        this.J = false;
        this.L = false;
        this.M = 0;
        this.N = 0;
        this.O = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.P = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.Q = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.R = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.S = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.T = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.U = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.V = constraintAnchor;
        this.W = new ConstraintAnchor[]{this.O, this.Q, this.P, this.R, this.S, constraintAnchor};
        this.X = new ArrayList();
        this.Y = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.Z = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.a0 = null;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0.0f;
        this.e0 = -1;
        this.f0 = 0;
        this.g0 = 0;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        float f = K0;
        this.o0 = f;
        this.p0 = f;
        this.r0 = 0;
        this.s0 = 0;
        this.t0 = false;
        this.u0 = null;
        this.v0 = null;
        this.y0 = false;
        this.z0 = 0;
        this.A0 = 0;
        this.D0 = new float[]{-1.0f, -1.0f};
        this.E0 = new ConstraintWidget[]{null, null};
        this.F0 = new ConstraintWidget[]{null, null};
        this.G0 = null;
        this.H0 = null;
        this.I0 = -1;
        this.J0 = -1;
        d();
    }

    private void A0(StringBuilder sb, String str, int i, int i2) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    private void B0(StringBuilder sb, String str, float f, int i) {
        if (f == 0.0f) {
            return;
        }
        sb.append(str);
        sb.append(" :  [");
        sb.append(f);
        sb.append(",");
        sb.append(i);
        sb.append("");
        sb.append("],\n");
    }

    private void Q(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        A0(sb, "      size", i, 0);
        A0(sb, "      min", i2, 0);
        A0(sb, "      max", i3, Integer.MAX_VALUE);
        A0(sb, "      matchMin", i5, 0);
        A0(sb, "      matchDef", i6, 0);
        z0(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    private void R(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(constraintAnchor.f);
        sb.append("'");
        if (constraintAnchor.h != Integer.MIN_VALUE || constraintAnchor.g != 0) {
            sb.append(",");
            sb.append(constraintAnchor.g);
            if (constraintAnchor.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(constraintAnchor.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    private void d() {
        this.X.add(this.O);
        this.X.add(this.P);
        this.X.add(this.Q);
        this.X.add(this.R);
        this.X.add(this.T);
        this.X.add(this.U);
        this.X.add(this.V);
        this.X.add(this.S);
    }

    private boolean h0(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i2 = i * 2;
        ConstraintAnchor[] constraintAnchorArr = this.W;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i2];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        return (constraintAnchor4 == null || constraintAnchor4.f == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i2 + 1]).f) == null || constraintAnchor2.f != constraintAnchor) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0481, code lost:
    
        if ((r4 instanceof androidx.constraintlayout.core.widgets.a) != false) goto L266;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0524 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x056f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:316:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0541 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(androidx.constraintlayout.core.d r38, boolean r39, boolean r40, boolean r41, boolean r42, androidx.constraintlayout.core.SolverVariable r43, androidx.constraintlayout.core.SolverVariable r44, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r45, boolean r46, androidx.constraintlayout.core.widgets.ConstraintAnchor r47, androidx.constraintlayout.core.widgets.ConstraintAnchor r48, int r49, int r50, int r51, int r52, float r53, boolean r54, boolean r55, boolean r56, boolean r57, boolean r58, int r59, int r60, int r61, int r62, float r63, boolean r64) {
        /*
            Method dump skipped, instructions count: 1450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.i(androidx.constraintlayout.core.d, boolean, boolean, boolean, boolean, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private void z0(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public DimensionBehaviour A() {
        return this.Z[0];
    }

    public int B() {
        ConstraintAnchor constraintAnchor = this.O;
        int i = constraintAnchor != null ? constraintAnchor.g : 0;
        ConstraintAnchor constraintAnchor2 = this.Q;
        return constraintAnchor2 != null ? i + constraintAnchor2.g : i;
    }

    public int C() {
        return this.M;
    }

    public void C0(int i) {
        this.l0 = i;
        this.J = i > 0;
    }

    public int D() {
        return this.N;
    }

    public void D0(Object obj) {
        this.q0 = obj;
    }

    public int E() {
        return Z();
    }

    public void E0(String str) {
        this.u0 = str;
    }

    public int F(int i) {
        if (i == 0) {
            return Y();
        }
        if (i == 1) {
            return x();
        }
        return 0;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0086 -> B:31:0x0087). Please report as a decompilation issue!!! */
    public void F0(String str) {
        float f;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.d0 = 0.0f;
            return;
        }
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i2 = -1;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            i2 = substring.equalsIgnoreCase(QueryKeys.WRITING) ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
            r3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(r3);
            if (substring2.length() > 0) {
                f = Float.parseFloat(substring2);
            }
            f = i;
        } else {
            String substring3 = str.substring(r3, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    f = i2 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f = i;
        }
        i = (f > i ? 1 : (f == i ? 0 : -1));
        if (i > 0) {
            this.d0 = f;
            this.e0 = i2;
        }
    }

    public int G() {
        return this.H[1];
    }

    public void G0(int i) {
        if (this.J) {
            int i2 = i - this.l0;
            int i3 = this.c0 + i2;
            this.g0 = i2;
            this.P.t(i2);
            this.R.t(i3);
            this.S.t(i);
            this.q = true;
        }
    }

    public int H() {
        return this.H[0];
    }

    public void H0(int i, int i2) {
        if (this.p) {
            return;
        }
        this.O.t(i);
        this.Q.t(i2);
        this.f0 = i;
        this.b0 = i2 - i;
        this.p = true;
    }

    public int I() {
        return this.n0;
    }

    public void I0(int i) {
        this.O.t(i);
        this.f0 = i;
    }

    public int J() {
        return this.m0;
    }

    public void J0(int i) {
        this.P.t(i);
        this.g0 = i;
    }

    public ConstraintWidget K(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.R).f) != null && constraintAnchor2.f == constraintAnchor) {
                return constraintAnchor2.d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.Q;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        if (constraintAnchor4 == null || constraintAnchor4.f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.d;
    }

    public void K0(int i, int i2) {
        if (this.q) {
            return;
        }
        this.P.t(i);
        this.R.t(i2);
        this.g0 = i;
        this.c0 = i2 - i;
        if (this.J) {
            this.S.t(i + this.l0);
        }
        this.q = true;
    }

    public ConstraintWidget L() {
        return this.a0;
    }

    public void L0(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.f0 = i;
        this.g0 = i2;
        if (this.s0 == 8) {
            this.b0 = 0;
            this.c0 = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.Z;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i7 < (i6 = this.b0)) {
            i7 = i6;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i8 < (i5 = this.c0)) {
            i8 = i5;
        }
        this.b0 = i7;
        this.c0 = i8;
        int i9 = this.n0;
        if (i8 < i9) {
            this.c0 = i9;
        }
        int i10 = this.m0;
        if (i7 < i10) {
            this.b0 = i10;
        }
        int i11 = this.A;
        if (i11 > 0 && dimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.b0 = Math.min(this.b0, i11);
        }
        int i12 = this.D;
        if (i12 > 0 && this.Z[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.c0 = Math.min(this.c0, i12);
        }
        int i13 = this.b0;
        if (i7 != i13) {
            this.l = i13;
        }
        int i14 = this.c0;
        if (i8 != i14) {
            this.m = i14;
        }
    }

    public ConstraintWidget M(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.P).f) != null && constraintAnchor2.f == constraintAnchor) {
                return constraintAnchor2.d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.O;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        if (constraintAnchor4 == null || constraintAnchor4.f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.d;
    }

    public void M0(boolean z) {
        this.J = z;
    }

    public int N() {
        return Z() + this.b0;
    }

    public void N0(int i) {
        this.c0 = i;
        int i2 = this.n0;
        if (i < i2) {
            this.c0 = i2;
        }
    }

    public WidgetRun O(int i) {
        if (i == 0) {
            return this.e;
        }
        if (i == 1) {
            return this.f;
        }
        return null;
    }

    public void O0(float f) {
        this.o0 = f;
    }

    public void P(StringBuilder sb) {
        sb.append("  " + this.o + ":{\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    actualWidth:");
        sb2.append(this.b0);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.c0);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f0);
        sb.append("\n");
        sb.append("    actualTop:" + this.g0);
        sb.append("\n");
        R(sb, "left", this.O);
        R(sb, "top", this.P);
        R(sb, "right", this.Q);
        R(sb, "bottom", this.R);
        R(sb, "baseline", this.S);
        R(sb, "centerX", this.T);
        R(sb, "centerY", this.U);
        Q(sb, "    width", this.b0, this.m0, this.H[0], this.l, this.z, this.w, this.B, this.D0[0]);
        Q(sb, "    height", this.c0, this.n0, this.H[1], this.m, this.C, this.x, this.E, this.D0[1]);
        B0(sb, "    dimensionRatio", this.d0, this.e0);
        z0(sb, "    horizontalBias", this.o0, K0);
        z0(sb, "    verticalBias", this.p0, K0);
        A0(sb, "    horizontalChainStyle", this.z0, 0);
        A0(sb, "    verticalChainStyle", this.A0, 0);
        sb.append("  }");
    }

    public void P0(int i) {
        this.z0 = i;
    }

    public void Q0(int i, int i2) {
        this.f0 = i;
        int i3 = i2 - i;
        this.b0 = i3;
        int i4 = this.m0;
        if (i3 < i4) {
            this.b0 = i4;
        }
    }

    public void R0(DimensionBehaviour dimensionBehaviour) {
        this.Z[0] = dimensionBehaviour;
    }

    public int S() {
        return a0();
    }

    public void S0(int i, int i2, int i3, float f) {
        this.w = i;
        this.z = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.A = i3;
        this.B = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.w = 2;
    }

    public float T() {
        return this.p0;
    }

    public void T0(float f) {
        this.D0[0] = f;
    }

    public int U() {
        return this.A0;
    }

    protected void U0(int i, boolean z) {
        this.Y[i] = z;
    }

    public DimensionBehaviour V() {
        return this.Z[1];
    }

    public void V0(boolean z) {
        this.K = z;
    }

    public int W() {
        int i = this.O != null ? this.P.g : 0;
        return this.Q != null ? i + this.R.g : i;
    }

    public void W0(boolean z) {
        this.L = z;
    }

    public int X() {
        return this.s0;
    }

    public void X0(int i, int i2) {
        this.M = i;
        this.N = i2;
        a1(false);
    }

    public int Y() {
        if (this.s0 == 8) {
            return 0;
        }
        return this.b0;
    }

    public void Y0(int i) {
        this.H[1] = i;
    }

    public int Z() {
        ConstraintWidget constraintWidget = this.a0;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.f0 : ((d) constraintWidget).S0 + this.f0;
    }

    public void Z0(int i) {
        this.H[0] = i;
    }

    public int a0() {
        ConstraintWidget constraintWidget = this.a0;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.g0 : ((d) constraintWidget).T0 + this.g0;
    }

    public void a1(boolean z) {
        this.i = z;
    }

    public boolean b0() {
        return this.J;
    }

    public void b1(int i) {
        if (i < 0) {
            this.n0 = 0;
        } else {
            this.n0 = i;
        }
    }

    public boolean c0(int i) {
        if (i == 0) {
            return (this.O.f != null ? 1 : 0) + (this.Q.f != null ? 1 : 0) < 2;
        }
        return ((this.P.f != null ? 1 : 0) + (this.R.f != null ? 1 : 0)) + (this.S.f != null ? 1 : 0) < 2;
    }

    public void c1(int i) {
        if (i < 0) {
            this.m0 = 0;
        } else {
            this.m0 = i;
        }
    }

    public boolean d0() {
        int size = this.X.size();
        for (int i = 0; i < size; i++) {
            if (((ConstraintAnchor) this.X.get(i)).m()) {
                return true;
            }
        }
        return false;
    }

    public void d1(int i, int i2) {
        this.f0 = i;
        this.g0 = i2;
    }

    public void e(d dVar, androidx.constraintlayout.core.d dVar2, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            g.a(dVar, dVar2, this);
            hashSet.remove(this);
            g(dVar2, dVar.W1(64));
        }
        if (i == 0) {
            HashSet d = this.O.d();
            if (d != null) {
                Iterator it2 = d.iterator();
                while (it2.hasNext()) {
                    ((ConstraintAnchor) it2.next()).d.e(dVar, dVar2, hashSet, i, true);
                }
            }
            HashSet d2 = this.Q.d();
            if (d2 != null) {
                Iterator it3 = d2.iterator();
                while (it3.hasNext()) {
                    ((ConstraintAnchor) it3.next()).d.e(dVar, dVar2, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet d3 = this.P.d();
        if (d3 != null) {
            Iterator it4 = d3.iterator();
            while (it4.hasNext()) {
                ((ConstraintAnchor) it4.next()).d.e(dVar, dVar2, hashSet, i, true);
            }
        }
        HashSet d4 = this.R.d();
        if (d4 != null) {
            Iterator it5 = d4.iterator();
            while (it5.hasNext()) {
                ((ConstraintAnchor) it5.next()).d.e(dVar, dVar2, hashSet, i, true);
            }
        }
        HashSet d5 = this.S.d();
        if (d5 != null) {
            Iterator it6 = d5.iterator();
            while (it6.hasNext()) {
                ((ConstraintAnchor) it6.next()).d.e(dVar, dVar2, hashSet, i, true);
            }
        }
    }

    public boolean e0() {
        return (this.l == -1 && this.m == -1) ? false : true;
    }

    public void e1(ConstraintWidget constraintWidget) {
        this.a0 = constraintWidget;
    }

    boolean f() {
        return (this instanceof h) || (this instanceof f);
    }

    public boolean f0(int i, int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i == 0) {
            ConstraintAnchor constraintAnchor3 = this.O.f;
            return constraintAnchor3 != null && constraintAnchor3.n() && (constraintAnchor2 = this.Q.f) != null && constraintAnchor2.n() && (this.Q.f.e() - this.Q.f()) - (this.O.f.e() + this.O.f()) >= i2;
        }
        ConstraintAnchor constraintAnchor4 = this.P.f;
        return constraintAnchor4 != null && constraintAnchor4.n() && (constraintAnchor = this.R.f) != null && constraintAnchor.n() && (this.R.f.e() - this.R.f()) - (this.P.f.e() + this.P.f()) >= i2;
        return false;
    }

    public void f1(float f) {
        this.p0 = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(androidx.constraintlayout.core.d r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.g(androidx.constraintlayout.core.d, boolean):void");
    }

    public void g0(ConstraintAnchor.Type type2, ConstraintWidget constraintWidget, ConstraintAnchor.Type type3, int i, int i2) {
        o(type2).b(constraintWidget.o(type3), i, i2, true);
    }

    public void g1(int i) {
        this.A0 = i;
    }

    public boolean h() {
        return this.s0 != 8;
    }

    public void h1(int i, int i2) {
        this.g0 = i;
        int i3 = i2 - i;
        this.c0 = i3;
        int i4 = this.n0;
        if (i3 < i4) {
            this.c0 = i4;
        }
    }

    public boolean i0() {
        return this.r;
    }

    public void i1(DimensionBehaviour dimensionBehaviour) {
        this.Z[1] = dimensionBehaviour;
    }

    public void j(ConstraintAnchor.Type type2, ConstraintWidget constraintWidget, ConstraintAnchor.Type type3, int i) {
        ConstraintAnchor.Type type4;
        ConstraintAnchor.Type type5;
        boolean z;
        ConstraintAnchor.Type type6 = ConstraintAnchor.Type.CENTER;
        if (type2 == type6) {
            if (type3 != type6) {
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.LEFT;
                if (type3 == type7 || type3 == ConstraintAnchor.Type.RIGHT) {
                    j(type7, constraintWidget, type3, 0);
                    j(ConstraintAnchor.Type.RIGHT, constraintWidget, type3, 0);
                    o(type6).a(constraintWidget.o(type3), 0);
                    return;
                }
                ConstraintAnchor.Type type8 = ConstraintAnchor.Type.TOP;
                if (type3 == type8 || type3 == ConstraintAnchor.Type.BOTTOM) {
                    j(type8, constraintWidget, type3, 0);
                    j(ConstraintAnchor.Type.BOTTOM, constraintWidget, type3, 0);
                    o(type6).a(constraintWidget.o(type3), 0);
                    return;
                }
                return;
            }
            ConstraintAnchor.Type type9 = ConstraintAnchor.Type.LEFT;
            ConstraintAnchor o = o(type9);
            ConstraintAnchor.Type type10 = ConstraintAnchor.Type.RIGHT;
            ConstraintAnchor o2 = o(type10);
            ConstraintAnchor.Type type11 = ConstraintAnchor.Type.TOP;
            ConstraintAnchor o3 = o(type11);
            ConstraintAnchor.Type type12 = ConstraintAnchor.Type.BOTTOM;
            ConstraintAnchor o4 = o(type12);
            boolean z2 = true;
            if ((o == null || !o.o()) && (o2 == null || !o2.o())) {
                j(type9, constraintWidget, type9, 0);
                j(type10, constraintWidget, type10, 0);
                z = true;
            } else {
                z = false;
            }
            if ((o3 == null || !o3.o()) && (o4 == null || !o4.o())) {
                j(type11, constraintWidget, type11, 0);
                j(type12, constraintWidget, type12, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                o(type6).a(constraintWidget.o(type6), 0);
                return;
            }
            if (z) {
                ConstraintAnchor.Type type13 = ConstraintAnchor.Type.CENTER_X;
                o(type13).a(constraintWidget.o(type13), 0);
                return;
            } else {
                if (z2) {
                    ConstraintAnchor.Type type14 = ConstraintAnchor.Type.CENTER_Y;
                    o(type14).a(constraintWidget.o(type14), 0);
                    return;
                }
                return;
            }
        }
        ConstraintAnchor.Type type15 = ConstraintAnchor.Type.CENTER_X;
        if (type2 == type15 && (type3 == (type5 = ConstraintAnchor.Type.LEFT) || type3 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor o5 = o(type5);
            ConstraintAnchor o6 = constraintWidget.o(type3);
            ConstraintAnchor o7 = o(ConstraintAnchor.Type.RIGHT);
            o5.a(o6, 0);
            o7.a(o6, 0);
            o(type15).a(o6, 0);
            return;
        }
        ConstraintAnchor.Type type16 = ConstraintAnchor.Type.CENTER_Y;
        if (type2 == type16 && (type3 == (type4 = ConstraintAnchor.Type.TOP) || type3 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor o8 = constraintWidget.o(type3);
            o(type4).a(o8, 0);
            o(ConstraintAnchor.Type.BOTTOM).a(o8, 0);
            o(type16).a(o8, 0);
            return;
        }
        if (type2 == type15 && type3 == type15) {
            ConstraintAnchor.Type type17 = ConstraintAnchor.Type.LEFT;
            o(type17).a(constraintWidget.o(type17), 0);
            ConstraintAnchor.Type type18 = ConstraintAnchor.Type.RIGHT;
            o(type18).a(constraintWidget.o(type18), 0);
            o(type15).a(constraintWidget.o(type3), 0);
            return;
        }
        if (type2 == type16 && type3 == type16) {
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.TOP;
            o(type19).a(constraintWidget.o(type19), 0);
            ConstraintAnchor.Type type20 = ConstraintAnchor.Type.BOTTOM;
            o(type20).a(constraintWidget.o(type20), 0);
            o(type16).a(constraintWidget.o(type3), 0);
            return;
        }
        ConstraintAnchor o9 = o(type2);
        ConstraintAnchor o10 = constraintWidget.o(type3);
        if (o9.p(o10)) {
            ConstraintAnchor.Type type21 = ConstraintAnchor.Type.BASELINE;
            if (type2 == type21) {
                ConstraintAnchor o11 = o(ConstraintAnchor.Type.TOP);
                ConstraintAnchor o12 = o(ConstraintAnchor.Type.BOTTOM);
                if (o11 != null) {
                    o11.q();
                }
                if (o12 != null) {
                    o12.q();
                }
            } else if (type2 == ConstraintAnchor.Type.TOP || type2 == ConstraintAnchor.Type.BOTTOM) {
                ConstraintAnchor o13 = o(type21);
                if (o13 != null) {
                    o13.q();
                }
                ConstraintAnchor o14 = o(type6);
                if (o14.j() != o10) {
                    o14.q();
                }
                ConstraintAnchor g = o(type2).g();
                ConstraintAnchor o15 = o(type16);
                if (o15.o()) {
                    g.q();
                    o15.q();
                }
            } else if (type2 == ConstraintAnchor.Type.LEFT || type2 == ConstraintAnchor.Type.RIGHT) {
                ConstraintAnchor o16 = o(type6);
                if (o16.j() != o10) {
                    o16.q();
                }
                ConstraintAnchor g2 = o(type2).g();
                ConstraintAnchor o17 = o(type15);
                if (o17.o()) {
                    g2.q();
                    o17.q();
                }
            }
            o9.a(o10, i);
        }
    }

    public boolean j0(int i) {
        return this.Y[i];
    }

    public void j1(int i, int i2, int i3, float f) {
        this.x = i;
        this.C = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.D = i3;
        this.E = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.x = 2;
    }

    public void k(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.h() == this) {
            j(constraintAnchor.k(), constraintAnchor2.h(), constraintAnchor2.k(), i);
        }
    }

    public boolean k0() {
        ConstraintAnchor constraintAnchor = this.O;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 != null && constraintAnchor2.f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.Q;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        return constraintAnchor4 != null && constraintAnchor4.f == constraintAnchor3;
    }

    public void k1(float f) {
        this.D0[1] = f;
    }

    public void l(ConstraintWidget constraintWidget, float f, int i) {
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.CENTER;
        g0(type2, constraintWidget, type2, i, 0);
        this.I = f;
    }

    public boolean l0() {
        return this.K;
    }

    public void l1(int i) {
        this.s0 = i;
    }

    public void m(androidx.constraintlayout.core.d dVar) {
        dVar.q(this.O);
        dVar.q(this.P);
        dVar.q(this.Q);
        dVar.q(this.R);
        if (this.l0 > 0) {
            dVar.q(this.S);
        }
    }

    public boolean m0() {
        ConstraintAnchor constraintAnchor = this.P;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 != null && constraintAnchor2.f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.R;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        return constraintAnchor4 != null && constraintAnchor4.f == constraintAnchor3;
    }

    public void m1(int i) {
        this.b0 = i;
        int i2 = this.m0;
        if (i < i2) {
            this.b0 = i2;
        }
    }

    public void n() {
        if (this.e == null) {
            this.e = new j(this);
        }
        if (this.f == null) {
            this.f = new l(this);
        }
    }

    public boolean n0() {
        return this.L;
    }

    public void n1(int i) {
        if (i < 0 || i > 3) {
            return;
        }
        this.v = i;
    }

    public ConstraintAnchor o(ConstraintAnchor.Type type2) {
        switch (a.a[type2.ordinal()]) {
            case 1:
                return this.O;
            case 2:
                return this.P;
            case 3:
                return this.Q;
            case 4:
                return this.R;
            case 5:
                return this.S;
            case 6:
                return this.V;
            case 7:
                return this.T;
            case 8:
                return this.U;
            case 9:
                return null;
            default:
                throw new AssertionError(type2.name());
        }
    }

    public boolean o0() {
        return this.i && this.s0 != 8;
    }

    public void o1(int i) {
        this.f0 = i;
    }

    public int p() {
        return this.l0;
    }

    public boolean p0() {
        return this.p || (this.O.n() && this.Q.n());
    }

    public void p1(int i) {
        this.g0 = i;
    }

    public float q(int i) {
        if (i == 0) {
            return this.o0;
        }
        if (i == 1) {
            return this.p0;
        }
        return -1.0f;
    }

    public boolean q0() {
        return this.q || (this.P.n() && this.R.n());
    }

    public void q1(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.F == -1) {
            if (z3 && !z4) {
                this.F = 0;
            } else if (!z3 && z4) {
                this.F = 1;
                if (this.e0 == -1) {
                    this.G = 1.0f / this.G;
                }
            }
        }
        if (this.F == 0 && (!this.P.o() || !this.R.o())) {
            this.F = 1;
        } else if (this.F == 1 && (!this.O.o() || !this.Q.o())) {
            this.F = 0;
        }
        if (this.F == -1 && (!this.P.o() || !this.R.o() || !this.O.o() || !this.Q.o())) {
            if (this.P.o() && this.R.o()) {
                this.F = 0;
            } else if (this.O.o() && this.Q.o()) {
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
        if (this.F == -1) {
            int i = this.z;
            if (i > 0 && this.C == 0) {
                this.F = 0;
            } else {
                if (i != 0 || this.C <= 0) {
                    return;
                }
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
    }

    public int r() {
        return a0() + this.c0;
    }

    public boolean r0() {
        return this.s;
    }

    public void r1(boolean z, boolean z2) {
        int i;
        int i2;
        boolean k = z & this.e.k();
        boolean k2 = z2 & this.f.k();
        j jVar = this.e;
        int i3 = jVar.h.g;
        l lVar = this.f;
        int i4 = lVar.h.g;
        int i5 = jVar.i.g;
        int i6 = lVar.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (k) {
            this.f0 = i3;
        }
        if (k2) {
            this.g0 = i4;
        }
        if (this.s0 == 8) {
            this.b0 = 0;
            this.c0 = 0;
            return;
        }
        if (k) {
            if (this.Z[0] == DimensionBehaviour.FIXED && i8 < (i2 = this.b0)) {
                i8 = i2;
            }
            this.b0 = i8;
            int i10 = this.m0;
            if (i8 < i10) {
                this.b0 = i10;
            }
        }
        if (k2) {
            if (this.Z[1] == DimensionBehaviour.FIXED && i9 < (i = this.c0)) {
                i9 = i;
            }
            this.c0 = i9;
            int i11 = this.n0;
            if (i9 < i11) {
                this.c0 = i11;
            }
        }
    }

    public Object s() {
        return this.q0;
    }

    public void s0() {
        this.r = true;
    }

    public void s1(androidx.constraintlayout.core.d dVar, boolean z) {
        l lVar;
        j jVar;
        int y = dVar.y(this.O);
        int y2 = dVar.y(this.P);
        int y3 = dVar.y(this.Q);
        int y4 = dVar.y(this.R);
        if (z && (jVar = this.e) != null) {
            DependencyNode dependencyNode = jVar.h;
            if (dependencyNode.j) {
                DependencyNode dependencyNode2 = jVar.i;
                if (dependencyNode2.j) {
                    y = dependencyNode.g;
                    y3 = dependencyNode2.g;
                }
            }
        }
        if (z && (lVar = this.f) != null) {
            DependencyNode dependencyNode3 = lVar.h;
            if (dependencyNode3.j) {
                DependencyNode dependencyNode4 = lVar.i;
                if (dependencyNode4.j) {
                    y2 = dependencyNode3.g;
                    y4 = dependencyNode4.g;
                }
            }
        }
        int i = y4 - y2;
        if (y3 - y < 0 || i < 0 || y == Integer.MIN_VALUE || y == Integer.MAX_VALUE || y2 == Integer.MIN_VALUE || y2 == Integer.MAX_VALUE || y3 == Integer.MIN_VALUE || y3 == Integer.MAX_VALUE || y4 == Integer.MIN_VALUE || y4 == Integer.MAX_VALUE) {
            y = 0;
            y4 = 0;
            y2 = 0;
            y3 = 0;
        }
        L0(y, y2, y3, y4);
    }

    public String t() {
        return this.u0;
    }

    public void t0() {
        this.s = true;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.v0 != null) {
            str = "type: " + this.v0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.u0 != null) {
            str2 = "id: " + this.u0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f0);
        sb.append(", ");
        sb.append(this.g0);
        sb.append(") - (");
        sb.append(this.b0);
        sb.append(" x ");
        sb.append(this.c0);
        sb.append(")");
        return sb.toString();
    }

    public DimensionBehaviour u(int i) {
        if (i == 0) {
            return A();
        }
        if (i == 1) {
            return V();
        }
        return null;
    }

    public boolean u0() {
        DimensionBehaviour[] dimensionBehaviourArr = this.Z;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
        return dimensionBehaviour == dimensionBehaviour2 && dimensionBehaviourArr[1] == dimensionBehaviour2;
    }

    public float v() {
        return this.d0;
    }

    public void v0() {
        this.O.q();
        this.P.q();
        this.Q.q();
        this.R.q();
        this.S.q();
        this.T.q();
        this.U.q();
        this.V.q();
        this.a0 = null;
        this.I = 0.0f;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0.0f;
        this.e0 = -1;
        this.f0 = 0;
        this.g0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        float f = K0;
        this.o0 = f;
        this.p0 = f;
        DimensionBehaviour[] dimensionBehaviourArr = this.Z;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.q0 = null;
        this.r0 = 0;
        this.s0 = 0;
        this.v0 = null;
        this.w0 = false;
        this.x0 = false;
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = false;
        this.C0 = false;
        float[] fArr = this.D0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.t = -1;
        this.u = -1;
        int[] iArr = this.H;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.w = 0;
        this.x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.z = 0;
        this.C = 0;
        this.h = false;
        this.F = -1;
        this.G = 1.0f;
        this.y0 = false;
        boolean[] zArr = this.g;
        zArr[0] = true;
        zArr[1] = true;
        this.L = false;
        boolean[] zArr2 = this.Y;
        zArr2[0] = false;
        zArr2[1] = false;
        this.i = true;
        int[] iArr2 = this.y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.l = -1;
        this.m = -1;
    }

    public int w() {
        return this.e0;
    }

    public void w0() {
        ConstraintWidget L = L();
        if (L != null && (L instanceof d) && ((d) L()).O1()) {
            return;
        }
        int size = this.X.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintAnchor) this.X.get(i)).q();
        }
    }

    public int x() {
        if (this.s0 == 8) {
            return 0;
        }
        return this.c0;
    }

    public void x0() {
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        int size = this.X.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintAnchor) this.X.get(i)).r();
        }
    }

    public float y() {
        return this.o0;
    }

    public void y0(androidx.constraintlayout.core.c cVar) {
        this.O.s(cVar);
        this.P.s(cVar);
        this.Q.s(cVar);
        this.R.s(cVar);
        this.S.s(cVar);
        this.V.s(cVar);
        this.T.s(cVar);
        this.U.s(cVar);
    }

    public int z() {
        return this.z0;
    }

    public ConstraintWidget(int i, int i2, int i3, int i4) {
        this.a = false;
        this.b = new WidgetRun[2];
        this.e = null;
        this.f = null;
        this.g = new boolean[]{true, true};
        this.h = false;
        this.i = true;
        this.j = false;
        this.k = true;
        this.l = -1;
        this.m = -1;
        this.n = new ig9(this);
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = -1;
        this.u = -1;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = new int[2];
        this.z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.F = -1;
        this.G = 1.0f;
        this.H = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.I = 0.0f;
        this.J = false;
        this.L = false;
        this.M = 0;
        this.N = 0;
        this.O = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.P = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.Q = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.R = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.S = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.T = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.U = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.V = constraintAnchor;
        this.W = new ConstraintAnchor[]{this.O, this.Q, this.P, this.R, this.S, constraintAnchor};
        this.X = new ArrayList();
        this.Y = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.Z = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.a0 = null;
        this.d0 = 0.0f;
        this.e0 = -1;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        float f = K0;
        this.o0 = f;
        this.p0 = f;
        this.r0 = 0;
        this.s0 = 0;
        this.t0 = false;
        this.u0 = null;
        this.v0 = null;
        this.y0 = false;
        this.z0 = 0;
        this.A0 = 0;
        this.D0 = new float[]{-1.0f, -1.0f};
        this.E0 = new ConstraintWidget[]{null, null};
        this.F0 = new ConstraintWidget[]{null, null};
        this.G0 = null;
        this.H0 = null;
        this.I0 = -1;
        this.J0 = -1;
        this.f0 = i;
        this.g0 = i2;
        this.b0 = i3;
        this.c0 = i4;
        d();
    }

    public ConstraintWidget(int i, int i2) {
        this(0, 0, i, i2);
    }
}
