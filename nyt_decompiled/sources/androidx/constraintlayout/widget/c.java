package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.oaid.BuildConfig;
import com.chartbeat.androidsdk.QueryKeys;
import com.comscore.android.util.AndroidTcfDataLoader;
import com.comscore.streaming.EventType;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.dh6;
import defpackage.dw4;
import defpackage.ux1;
import defpackage.xn6;
import defpackage.zb1;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c {
    private static final int[] f = {0, 4, 8};
    private static SparseIntArray g = new SparseIntArray();
    private static SparseIntArray h = new SparseIntArray();
    public String a = "";
    public int b = 0;
    private HashMap c = new HashMap();
    private boolean d = true;
    private HashMap e = new HashMap();

    public static class a {
        int a;
        String b;
        public final d c = new d();
        public final C0074c d = new C0074c();
        public final b e = new b();
        public final e f = new e();
        public HashMap g = new HashMap();
        C0073a h;

        /* renamed from: androidx.constraintlayout.widget.c$a$a, reason: collision with other inner class name */
        static class C0073a {
            int[] a = new int[10];
            int[] b = new int[10];
            int c = 0;
            int[] d = new int[10];
            float[] e = new float[10];
            int f = 0;
            int[] g = new int[5];
            String[] h = new String[5];
            int i = 0;
            int[] j = new int[4];
            boolean[] k = new boolean[4];
            int l = 0;

            C0073a() {
            }

            void a(int i, float f) {
                int i2 = this.f;
                int[] iArr = this.d;
                if (i2 >= iArr.length) {
                    this.d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.e;
                    this.e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.d;
                int i3 = this.f;
                iArr2[i3] = i;
                float[] fArr2 = this.e;
                this.f = i3 + 1;
                fArr2[i3] = f;
            }

            void b(int i, int i2) {
                int i3 = this.c;
                int[] iArr = this.a;
                if (i3 >= iArr.length) {
                    this.a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.b;
                    this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.a;
                int i4 = this.c;
                iArr3[i4] = i;
                int[] iArr4 = this.b;
                this.c = i4 + 1;
                iArr4[i4] = i2;
            }

            void c(int i, String str) {
                int i2 = this.i;
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    this.g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.h;
                    this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.g;
                int i3 = this.i;
                iArr2[i3] = i;
                String[] strArr2 = this.h;
                this.i = i3 + 1;
                strArr2[i3] = str;
            }

            void d(int i, boolean z) {
                int i2 = this.l;
                int[] iArr = this.j;
                if (i2 >= iArr.length) {
                    this.j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.k;
                    this.k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.j;
                int i3 = this.l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.k;
                this.l = i3 + 1;
                zArr2[i3] = z;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(int i, ConstraintLayout.b bVar) {
            this.a = i;
            b bVar2 = this.e;
            bVar2.j = bVar.e;
            bVar2.k = bVar.f;
            bVar2.l = bVar.g;
            bVar2.m = bVar.h;
            bVar2.n = bVar.i;
            bVar2.o = bVar.j;
            bVar2.p = bVar.k;
            bVar2.q = bVar.l;
            bVar2.r = bVar.m;
            bVar2.s = bVar.n;
            bVar2.t = bVar.o;
            bVar2.u = bVar.s;
            bVar2.v = bVar.t;
            bVar2.w = bVar.u;
            bVar2.x = bVar.v;
            bVar2.y = bVar.G;
            bVar2.z = bVar.H;
            bVar2.A = bVar.I;
            bVar2.B = bVar.p;
            bVar2.C = bVar.q;
            bVar2.D = bVar.r;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.G = bVar.Z;
            bVar2.h = bVar.c;
            bVar2.f = bVar.a;
            bVar2.g = bVar.b;
            bVar2.d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.N = bVar.D;
            bVar2.V = bVar.M;
            bVar2.W = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.X = bVar.N;
            bVar2.n0 = bVar.a0;
            bVar2.o0 = bVar.b0;
            bVar2.Z = bVar.P;
            bVar2.a0 = bVar.Q;
            bVar2.b0 = bVar.T;
            bVar2.c0 = bVar.U;
            bVar2.d0 = bVar.R;
            bVar2.e0 = bVar.S;
            bVar2.f0 = bVar.V;
            bVar2.g0 = bVar.W;
            bVar2.m0 = bVar.c0;
            bVar2.P = bVar.x;
            bVar2.R = bVar.z;
            bVar2.O = bVar.w;
            bVar2.Q = bVar.y;
            bVar2.T = bVar.A;
            bVar2.S = bVar.B;
            bVar2.U = bVar.C;
            bVar2.q0 = bVar.d0;
            bVar2.L = bVar.getMarginEnd();
            this.e.M = bVar.getMarginStart();
        }

        public void b(ConstraintLayout.b bVar) {
            b bVar2 = this.e;
            bVar.e = bVar2.j;
            bVar.f = bVar2.k;
            bVar.g = bVar2.l;
            bVar.h = bVar2.m;
            bVar.i = bVar2.n;
            bVar.j = bVar2.o;
            bVar.k = bVar2.p;
            bVar.l = bVar2.q;
            bVar.m = bVar2.r;
            bVar.n = bVar2.s;
            bVar.o = bVar2.t;
            bVar.s = bVar2.u;
            bVar.t = bVar2.v;
            bVar.u = bVar2.w;
            bVar.v = bVar2.x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.K;
            bVar.A = bVar2.T;
            bVar.B = bVar2.S;
            bVar.x = bVar2.P;
            bVar.z = bVar2.R;
            bVar.G = bVar2.y;
            bVar.H = bVar2.z;
            bVar.p = bVar2.B;
            bVar.q = bVar2.C;
            bVar.r = bVar2.D;
            bVar.I = bVar2.A;
            bVar.X = bVar2.E;
            bVar.Y = bVar2.F;
            bVar.M = bVar2.V;
            bVar.L = bVar2.W;
            bVar.O = bVar2.Y;
            bVar.N = bVar2.X;
            bVar.a0 = bVar2.n0;
            bVar.b0 = bVar2.o0;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.a0;
            bVar.T = bVar2.b0;
            bVar.U = bVar2.c0;
            bVar.R = bVar2.d0;
            bVar.S = bVar2.e0;
            bVar.V = bVar2.f0;
            bVar.W = bVar2.g0;
            bVar.Z = bVar2.G;
            bVar.c = bVar2.h;
            bVar.a = bVar2.f;
            bVar.b = bVar2.g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.e;
            String str = bVar2.m0;
            if (str != null) {
                bVar.c0 = str;
            }
            bVar.d0 = bVar2.q0;
            bVar.setMarginStart(bVar2.M);
            bVar.setMarginEnd(this.e.L);
            bVar.a();
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.e.a(this.e);
            aVar.d.a(this.d);
            aVar.c.a(this.c);
            aVar.f.a(this.f);
            aVar.a = this.a;
            aVar.h = this.h;
            return aVar;
        }
    }

    public static class b {
        private static SparseIntArray r0;
        public int d;
        public int e;
        public int[] k0;
        public String l0;
        public String m0;
        public boolean a = false;
        public boolean b = false;
        public boolean c = false;
        public int f = -1;
        public int g = -1;
        public float h = -1.0f;
        public boolean i = true;
        public int j = -1;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public int x = -1;
        public float y = 0.5f;
        public float z = 0.5f;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = RecyclerView.UNDEFINED_DURATION;
        public int P = RecyclerView.UNDEFINED_DURATION;
        public int Q = RecyclerView.UNDEFINED_DURATION;
        public int R = RecyclerView.UNDEFINED_DURATION;
        public int S = RecyclerView.UNDEFINED_DURATION;
        public int T = RecyclerView.UNDEFINED_DURATION;
        public int U = RecyclerView.UNDEFINED_DURATION;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;
        public int a0 = 0;
        public int b0 = 0;
        public int c0 = 0;
        public int d0 = 0;
        public int e0 = 0;
        public float f0 = 1.0f;
        public float g0 = 1.0f;
        public int h0 = -1;
        public int i0 = 0;
        public int j0 = -1;
        public boolean n0 = false;
        public boolean o0 = false;
        public boolean p0 = true;
        public int q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            r0 = sparseIntArray;
            sparseIntArray.append(xn6.Layout_layout_constraintLeft_toLeftOf, 24);
            r0.append(xn6.Layout_layout_constraintLeft_toRightOf, 25);
            r0.append(xn6.Layout_layout_constraintRight_toLeftOf, 28);
            r0.append(xn6.Layout_layout_constraintRight_toRightOf, 29);
            r0.append(xn6.Layout_layout_constraintTop_toTopOf, 35);
            r0.append(xn6.Layout_layout_constraintTop_toBottomOf, 34);
            r0.append(xn6.Layout_layout_constraintBottom_toTopOf, 4);
            r0.append(xn6.Layout_layout_constraintBottom_toBottomOf, 3);
            r0.append(xn6.Layout_layout_constraintBaseline_toBaselineOf, 1);
            r0.append(xn6.Layout_layout_editor_absoluteX, 6);
            r0.append(xn6.Layout_layout_editor_absoluteY, 7);
            r0.append(xn6.Layout_layout_constraintGuide_begin, 17);
            r0.append(xn6.Layout_layout_constraintGuide_end, 18);
            r0.append(xn6.Layout_layout_constraintGuide_percent, 19);
            r0.append(xn6.Layout_guidelineUseRtl, 90);
            r0.append(xn6.Layout_android_orientation, 26);
            r0.append(xn6.Layout_layout_constraintStart_toEndOf, 31);
            r0.append(xn6.Layout_layout_constraintStart_toStartOf, 32);
            r0.append(xn6.Layout_layout_constraintEnd_toStartOf, 10);
            r0.append(xn6.Layout_layout_constraintEnd_toEndOf, 9);
            r0.append(xn6.Layout_layout_goneMarginLeft, 13);
            r0.append(xn6.Layout_layout_goneMarginTop, 16);
            r0.append(xn6.Layout_layout_goneMarginRight, 14);
            r0.append(xn6.Layout_layout_goneMarginBottom, 11);
            r0.append(xn6.Layout_layout_goneMarginStart, 15);
            r0.append(xn6.Layout_layout_goneMarginEnd, 12);
            r0.append(xn6.Layout_layout_constraintVertical_weight, 38);
            r0.append(xn6.Layout_layout_constraintHorizontal_weight, 37);
            r0.append(xn6.Layout_layout_constraintHorizontal_chainStyle, 39);
            r0.append(xn6.Layout_layout_constraintVertical_chainStyle, 40);
            r0.append(xn6.Layout_layout_constraintHorizontal_bias, 20);
            r0.append(xn6.Layout_layout_constraintVertical_bias, 36);
            r0.append(xn6.Layout_layout_constraintDimensionRatio, 5);
            r0.append(xn6.Layout_layout_constraintLeft_creator, 91);
            r0.append(xn6.Layout_layout_constraintTop_creator, 91);
            r0.append(xn6.Layout_layout_constraintRight_creator, 91);
            r0.append(xn6.Layout_layout_constraintBottom_creator, 91);
            r0.append(xn6.Layout_layout_constraintBaseline_creator, 91);
            r0.append(xn6.Layout_android_layout_marginLeft, 23);
            r0.append(xn6.Layout_android_layout_marginRight, 27);
            r0.append(xn6.Layout_android_layout_marginStart, 30);
            r0.append(xn6.Layout_android_layout_marginEnd, 8);
            r0.append(xn6.Layout_android_layout_marginTop, 33);
            r0.append(xn6.Layout_android_layout_marginBottom, 2);
            r0.append(xn6.Layout_android_layout_width, 22);
            r0.append(xn6.Layout_android_layout_height, 21);
            r0.append(xn6.Layout_layout_constraintWidth, 41);
            r0.append(xn6.Layout_layout_constraintHeight, 42);
            r0.append(xn6.Layout_layout_constrainedWidth, 41);
            r0.append(xn6.Layout_layout_constrainedHeight, 42);
            r0.append(xn6.Layout_layout_wrapBehaviorInParent, 76);
            r0.append(xn6.Layout_layout_constraintCircle, 61);
            r0.append(xn6.Layout_layout_constraintCircleRadius, 62);
            r0.append(xn6.Layout_layout_constraintCircleAngle, 63);
            r0.append(xn6.Layout_layout_constraintWidth_percent, 69);
            r0.append(xn6.Layout_layout_constraintHeight_percent, 70);
            r0.append(xn6.Layout_chainUseRtl, 71);
            r0.append(xn6.Layout_barrierDirection, 72);
            r0.append(xn6.Layout_barrierMargin, 73);
            r0.append(xn6.Layout_constraint_referenced_ids, 74);
            r0.append(xn6.Layout_barrierAllowsGoneWidgets, 75);
        }

        public void a(b bVar) {
            this.a = bVar.a;
            this.d = bVar.d;
            this.b = bVar.b;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
            this.t = bVar.t;
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.a0 = bVar.a0;
            this.b0 = bVar.b0;
            this.c0 = bVar.c0;
            this.d0 = bVar.d0;
            this.e0 = bVar.e0;
            this.f0 = bVar.f0;
            this.g0 = bVar.g0;
            this.h0 = bVar.h0;
            this.i0 = bVar.i0;
            this.j0 = bVar.j0;
            this.m0 = bVar.m0;
            int[] iArr = bVar.k0;
            if (iArr == null || bVar.l0 != null) {
                this.k0 = null;
            } else {
                this.k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.l0 = bVar.l0;
            this.n0 = bVar.n0;
            this.o0 = bVar.o0;
            this.p0 = bVar.p0;
            this.q0 = bVar.q0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xn6.Layout);
            this.b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = r0.get(index);
                switch (i2) {
                    case 1:
                        this.r = c.m(obtainStyledAttributes, index, this.r);
                        break;
                    case 2:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.q = c.m(obtainStyledAttributes, index, this.q);
                        break;
                    case 4:
                        this.p = c.m(obtainStyledAttributes, index, this.p);
                        break;
                    case 5:
                        this.A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = obtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 9:
                        this.x = c.m(obtainStyledAttributes, index, this.x);
                        break;
                    case 10:
                        this.w = c.m(obtainStyledAttributes, index, this.w);
                        break;
                    case 11:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                        break;
                    case 18:
                        this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                        break;
                    case 19:
                        this.h = obtainStyledAttributes.getFloat(index, this.h);
                        break;
                    case 20:
                        this.y = obtainStyledAttributes.getFloat(index, this.y);
                        break;
                    case 21:
                        this.e = obtainStyledAttributes.getLayoutDimension(index, this.e);
                        break;
                    case 22:
                        this.d = obtainStyledAttributes.getLayoutDimension(index, this.d);
                        break;
                    case 23:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.j = c.m(obtainStyledAttributes, index, this.j);
                        break;
                    case EventType.SUBS /* 25 */:
                        this.k = c.m(obtainStyledAttributes, index, this.k);
                        break;
                    case EventType.CDN /* 26 */:
                        this.G = obtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.l = c.m(obtainStyledAttributes, index, this.l);
                        break;
                    case BuildConfig.VERSION_CODE /* 29 */:
                        this.m = c.m(obtainStyledAttributes, index, this.m);
                        break;
                    case 30:
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        this.u = c.m(obtainStyledAttributes, index, this.u);
                        break;
                    case 32:
                        this.v = c.m(obtainStyledAttributes, index, this.v);
                        break;
                    case 33:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.o = c.m(obtainStyledAttributes, index, this.o);
                        break;
                    case 35:
                        this.n = c.m(obtainStyledAttributes, index, this.n);
                        break;
                    case 36:
                        this.z = obtainStyledAttributes.getFloat(index, this.z);
                        break;
                    case 37:
                        this.W = obtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 38:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 39:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 41:
                        c.n(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        c.n(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                this.B = c.m(obtainStyledAttributes, index, this.B);
                                break;
                            case 62:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case 63:
                                this.D = obtainStyledAttributes.getFloat(index, this.D);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.h0 = obtainStyledAttributes.getInt(index, this.h0);
                                        break;
                                    case ModuleDescriptor.MODULE_VERSION /* 73 */:
                                        this.i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.i0);
                                        break;
                                    case 74:
                                        this.l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.p0 = obtainStyledAttributes.getBoolean(index, this.p0);
                                        break;
                                    case 76:
                                        this.q0 = obtainStyledAttributes.getInt(index, this.q0);
                                        break;
                                    case AndroidTcfDataLoader.COMSCORE_VENDOR_INDEX /* 77 */:
                                        this.s = c.m(obtainStyledAttributes, index, this.s);
                                        break;
                                    case 78:
                                        this.t = c.m(obtainStyledAttributes, index, this.t);
                                        break;
                                    case 79:
                                        this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        break;
                                    case 80:
                                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        break;
                                    case 81:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 82:
                                        this.a0 = obtainStyledAttributes.getInt(index, this.a0);
                                        break;
                                    case 83:
                                        this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                        break;
                                    case 84:
                                        this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                        break;
                                    case 85:
                                        this.e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.e0);
                                        break;
                                    case 86:
                                        this.d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                        break;
                                    case 87:
                                        this.n0 = obtainStyledAttributes.getBoolean(index, this.n0);
                                        break;
                                    case 88:
                                        this.o0 = obtainStyledAttributes.getBoolean(index, this.o0);
                                        break;
                                    case 89:
                                        this.m0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.i = obtainStyledAttributes.getBoolean(index, this.i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + r0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + r0.get(index));
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$c, reason: collision with other inner class name */
    public static class C0074c {
        private static SparseIntArray o;
        public boolean a = false;
        public int b = -1;
        public int c = 0;
        public String d = null;
        public int e = -1;
        public int f = 0;
        public float g = Float.NaN;
        public int h = -1;
        public float i = Float.NaN;
        public float j = Float.NaN;
        public int k = -1;
        public String l = null;
        public int m = -3;
        public int n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(xn6.Motion_motionPathRotate, 1);
            o.append(xn6.Motion_pathMotionArc, 2);
            o.append(xn6.Motion_transitionEasing, 3);
            o.append(xn6.Motion_drawPath, 4);
            o.append(xn6.Motion_animateRelativeTo, 5);
            o.append(xn6.Motion_animateCircleAngleTo, 6);
            o.append(xn6.Motion_motionStagger, 7);
            o.append(xn6.Motion_quantizeMotionSteps, 8);
            o.append(xn6.Motion_quantizeMotionPhase, 9);
            o.append(xn6.Motion_quantizeMotionInterpolator, 10);
        }

        public void a(C0074c c0074c) {
            this.a = c0074c.a;
            this.b = c0074c.b;
            this.d = c0074c.d;
            this.e = c0074c.e;
            this.f = c0074c.f;
            this.i = c0074c.i;
            this.g = c0074c.g;
            this.h = c0074c.h;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xn6.Motion);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (o.get(index)) {
                    case 1:
                        this.i = obtainStyledAttributes.getFloat(index, this.i);
                        break;
                    case 2:
                        this.e = obtainStyledAttributes.getInt(index, this.e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.d = ux1.c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.b = c.m(obtainStyledAttributes, index, this.b);
                        break;
                    case 6:
                        this.c = obtainStyledAttributes.getInteger(index, this.c);
                        break;
                    case 7:
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 8:
                        this.k = obtainStyledAttributes.getInteger(index, this.k);
                        break;
                    case 9:
                        this.j = obtainStyledAttributes.getFloat(index, this.j);
                        break;
                    case 10:
                        int i2 = obtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.n = resourceId;
                            if (resourceId != -1) {
                                this.m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i2 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.l = string;
                            if (string.indexOf("/") > 0) {
                                this.n = obtainStyledAttributes.getResourceId(index, -1);
                                this.m = -2;
                                break;
                            } else {
                                this.m = -1;
                                break;
                            }
                        } else {
                            this.m = obtainStyledAttributes.getInteger(index, this.n);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class d {
        public boolean a = false;
        public int b = 0;
        public int c = 0;
        public float d = 1.0f;
        public float e = Float.NaN;

        public void a(d dVar) {
            this.a = dVar.a;
            this.b = dVar.b;
            this.d = dVar.d;
            this.e = dVar.e;
            this.c = dVar.c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xn6.PropertySet);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == xn6.PropertySet_android_alpha) {
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                } else if (index == xn6.PropertySet_android_visibility) {
                    this.b = obtainStyledAttributes.getInt(index, this.b);
                    this.b = c.f[this.b];
                } else if (index == xn6.PropertySet_visibilityMode) {
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                } else if (index == xn6.PropertySet_motionProgress) {
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class e {
        private static SparseIntArray o;
        public boolean a = false;
        public float b = 0.0f;
        public float c = 0.0f;
        public float d = 0.0f;
        public float e = 1.0f;
        public float f = 1.0f;
        public float g = Float.NaN;
        public float h = Float.NaN;
        public int i = -1;
        public float j = 0.0f;
        public float k = 0.0f;
        public float l = 0.0f;
        public boolean m = false;
        public float n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(xn6.Transform_android_rotation, 1);
            o.append(xn6.Transform_android_rotationX, 2);
            o.append(xn6.Transform_android_rotationY, 3);
            o.append(xn6.Transform_android_scaleX, 4);
            o.append(xn6.Transform_android_scaleY, 5);
            o.append(xn6.Transform_android_transformPivotX, 6);
            o.append(xn6.Transform_android_transformPivotY, 7);
            o.append(xn6.Transform_android_translationX, 8);
            o.append(xn6.Transform_android_translationY, 9);
            o.append(xn6.Transform_android_translationZ, 10);
            o.append(xn6.Transform_android_elevation, 11);
            o.append(xn6.Transform_transformPivotTarget, 12);
        }

        public void a(e eVar) {
            this.a = eVar.a;
            this.b = eVar.b;
            this.c = eVar.c;
            this.d = eVar.d;
            this.e = eVar.e;
            this.f = eVar.f;
            this.g = eVar.g;
            this.h = eVar.h;
            this.i = eVar.i;
            this.j = eVar.j;
            this.k = eVar.k;
            this.l = eVar.l;
            this.m = eVar.m;
            this.n = eVar.n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xn6.Transform);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (o.get(index)) {
                    case 1:
                        this.b = obtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 2:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 3:
                        this.d = obtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.e = obtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 5:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.g = obtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 7:
                        this.h = obtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 8:
                        this.j = obtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 9:
                        this.k = obtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 10:
                        this.l = obtainStyledAttributes.getDimension(index, this.l);
                        break;
                    case 11:
                        this.m = true;
                        this.n = obtainStyledAttributes.getDimension(index, this.n);
                        break;
                    case 12:
                        this.i = c.m(obtainStyledAttributes, index, this.i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        g.append(xn6.Constraint_layout_constraintLeft_toLeftOf, 25);
        g.append(xn6.Constraint_layout_constraintLeft_toRightOf, 26);
        g.append(xn6.Constraint_layout_constraintRight_toLeftOf, 29);
        g.append(xn6.Constraint_layout_constraintRight_toRightOf, 30);
        g.append(xn6.Constraint_layout_constraintTop_toTopOf, 36);
        g.append(xn6.Constraint_layout_constraintTop_toBottomOf, 35);
        g.append(xn6.Constraint_layout_constraintBottom_toTopOf, 4);
        g.append(xn6.Constraint_layout_constraintBottom_toBottomOf, 3);
        g.append(xn6.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        g.append(xn6.Constraint_layout_constraintBaseline_toTopOf, 91);
        g.append(xn6.Constraint_layout_constraintBaseline_toBottomOf, 92);
        g.append(xn6.Constraint_layout_editor_absoluteX, 6);
        g.append(xn6.Constraint_layout_editor_absoluteY, 7);
        g.append(xn6.Constraint_layout_constraintGuide_begin, 17);
        g.append(xn6.Constraint_layout_constraintGuide_end, 18);
        g.append(xn6.Constraint_layout_constraintGuide_percent, 19);
        g.append(xn6.Constraint_guidelineUseRtl, 99);
        g.append(xn6.Constraint_android_orientation, 27);
        g.append(xn6.Constraint_layout_constraintStart_toEndOf, 32);
        g.append(xn6.Constraint_layout_constraintStart_toStartOf, 33);
        g.append(xn6.Constraint_layout_constraintEnd_toStartOf, 10);
        g.append(xn6.Constraint_layout_constraintEnd_toEndOf, 9);
        g.append(xn6.Constraint_layout_goneMarginLeft, 13);
        g.append(xn6.Constraint_layout_goneMarginTop, 16);
        g.append(xn6.Constraint_layout_goneMarginRight, 14);
        g.append(xn6.Constraint_layout_goneMarginBottom, 11);
        g.append(xn6.Constraint_layout_goneMarginStart, 15);
        g.append(xn6.Constraint_layout_goneMarginEnd, 12);
        g.append(xn6.Constraint_layout_constraintVertical_weight, 40);
        g.append(xn6.Constraint_layout_constraintHorizontal_weight, 39);
        g.append(xn6.Constraint_layout_constraintHorizontal_chainStyle, 41);
        g.append(xn6.Constraint_layout_constraintVertical_chainStyle, 42);
        g.append(xn6.Constraint_layout_constraintHorizontal_bias, 20);
        g.append(xn6.Constraint_layout_constraintVertical_bias, 37);
        g.append(xn6.Constraint_layout_constraintDimensionRatio, 5);
        g.append(xn6.Constraint_layout_constraintLeft_creator, 87);
        g.append(xn6.Constraint_layout_constraintTop_creator, 87);
        g.append(xn6.Constraint_layout_constraintRight_creator, 87);
        g.append(xn6.Constraint_layout_constraintBottom_creator, 87);
        g.append(xn6.Constraint_layout_constraintBaseline_creator, 87);
        g.append(xn6.Constraint_android_layout_marginLeft, 24);
        g.append(xn6.Constraint_android_layout_marginRight, 28);
        g.append(xn6.Constraint_android_layout_marginStart, 31);
        g.append(xn6.Constraint_android_layout_marginEnd, 8);
        g.append(xn6.Constraint_android_layout_marginTop, 34);
        g.append(xn6.Constraint_android_layout_marginBottom, 2);
        g.append(xn6.Constraint_android_layout_width, 23);
        g.append(xn6.Constraint_android_layout_height, 21);
        g.append(xn6.Constraint_layout_constraintWidth, 95);
        g.append(xn6.Constraint_layout_constraintHeight, 96);
        g.append(xn6.Constraint_android_visibility, 22);
        g.append(xn6.Constraint_android_alpha, 43);
        g.append(xn6.Constraint_android_elevation, 44);
        g.append(xn6.Constraint_android_rotationX, 45);
        g.append(xn6.Constraint_android_rotationY, 46);
        g.append(xn6.Constraint_android_rotation, 60);
        g.append(xn6.Constraint_android_scaleX, 47);
        g.append(xn6.Constraint_android_scaleY, 48);
        g.append(xn6.Constraint_android_transformPivotX, 49);
        g.append(xn6.Constraint_android_transformPivotY, 50);
        g.append(xn6.Constraint_android_translationX, 51);
        g.append(xn6.Constraint_android_translationY, 52);
        g.append(xn6.Constraint_android_translationZ, 53);
        g.append(xn6.Constraint_layout_constraintWidth_default, 54);
        g.append(xn6.Constraint_layout_constraintHeight_default, 55);
        g.append(xn6.Constraint_layout_constraintWidth_max, 56);
        g.append(xn6.Constraint_layout_constraintHeight_max, 57);
        g.append(xn6.Constraint_layout_constraintWidth_min, 58);
        g.append(xn6.Constraint_layout_constraintHeight_min, 59);
        g.append(xn6.Constraint_layout_constraintCircle, 61);
        g.append(xn6.Constraint_layout_constraintCircleRadius, 62);
        g.append(xn6.Constraint_layout_constraintCircleAngle, 63);
        g.append(xn6.Constraint_animateRelativeTo, 64);
        g.append(xn6.Constraint_transitionEasing, 65);
        g.append(xn6.Constraint_drawPath, 66);
        g.append(xn6.Constraint_transitionPathRotate, 67);
        g.append(xn6.Constraint_motionStagger, 79);
        g.append(xn6.Constraint_android_id, 38);
        g.append(xn6.Constraint_motionProgress, 68);
        g.append(xn6.Constraint_layout_constraintWidth_percent, 69);
        g.append(xn6.Constraint_layout_constraintHeight_percent, 70);
        g.append(xn6.Constraint_layout_wrapBehaviorInParent, 97);
        g.append(xn6.Constraint_chainUseRtl, 71);
        g.append(xn6.Constraint_barrierDirection, 72);
        g.append(xn6.Constraint_barrierMargin, 73);
        g.append(xn6.Constraint_constraint_referenced_ids, 74);
        g.append(xn6.Constraint_barrierAllowsGoneWidgets, 75);
        g.append(xn6.Constraint_pathMotionArc, 76);
        g.append(xn6.Constraint_layout_constraintTag, 77);
        g.append(xn6.Constraint_visibilityMode, 78);
        g.append(xn6.Constraint_layout_constrainedWidth, 80);
        g.append(xn6.Constraint_layout_constrainedHeight, 81);
        g.append(xn6.Constraint_polarRelativeTo, 82);
        g.append(xn6.Constraint_transformPivotTarget, 83);
        g.append(xn6.Constraint_quantizeMotionSteps, 84);
        g.append(xn6.Constraint_quantizeMotionPhase, 85);
        g.append(xn6.Constraint_quantizeMotionInterpolator, 86);
        h.append(xn6.ConstraintOverride_layout_editor_absoluteY, 6);
        h.append(xn6.ConstraintOverride_layout_editor_absoluteY, 7);
        h.append(xn6.ConstraintOverride_android_orientation, 27);
        h.append(xn6.ConstraintOverride_layout_goneMarginLeft, 13);
        h.append(xn6.ConstraintOverride_layout_goneMarginTop, 16);
        h.append(xn6.ConstraintOverride_layout_goneMarginRight, 14);
        h.append(xn6.ConstraintOverride_layout_goneMarginBottom, 11);
        h.append(xn6.ConstraintOverride_layout_goneMarginStart, 15);
        h.append(xn6.ConstraintOverride_layout_goneMarginEnd, 12);
        h.append(xn6.ConstraintOverride_layout_constraintVertical_weight, 40);
        h.append(xn6.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        h.append(xn6.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        h.append(xn6.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        h.append(xn6.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        h.append(xn6.ConstraintOverride_layout_constraintVertical_bias, 37);
        h.append(xn6.ConstraintOverride_layout_constraintDimensionRatio, 5);
        h.append(xn6.ConstraintOverride_layout_constraintLeft_creator, 87);
        h.append(xn6.ConstraintOverride_layout_constraintTop_creator, 87);
        h.append(xn6.ConstraintOverride_layout_constraintRight_creator, 87);
        h.append(xn6.ConstraintOverride_layout_constraintBottom_creator, 87);
        h.append(xn6.ConstraintOverride_layout_constraintBaseline_creator, 87);
        h.append(xn6.ConstraintOverride_android_layout_marginLeft, 24);
        h.append(xn6.ConstraintOverride_android_layout_marginRight, 28);
        h.append(xn6.ConstraintOverride_android_layout_marginStart, 31);
        h.append(xn6.ConstraintOverride_android_layout_marginEnd, 8);
        h.append(xn6.ConstraintOverride_android_layout_marginTop, 34);
        h.append(xn6.ConstraintOverride_android_layout_marginBottom, 2);
        h.append(xn6.ConstraintOverride_android_layout_width, 23);
        h.append(xn6.ConstraintOverride_android_layout_height, 21);
        h.append(xn6.ConstraintOverride_layout_constraintWidth, 95);
        h.append(xn6.ConstraintOverride_layout_constraintHeight, 96);
        h.append(xn6.ConstraintOverride_android_visibility, 22);
        h.append(xn6.ConstraintOverride_android_alpha, 43);
        h.append(xn6.ConstraintOverride_android_elevation, 44);
        h.append(xn6.ConstraintOverride_android_rotationX, 45);
        h.append(xn6.ConstraintOverride_android_rotationY, 46);
        h.append(xn6.ConstraintOverride_android_rotation, 60);
        h.append(xn6.ConstraintOverride_android_scaleX, 47);
        h.append(xn6.ConstraintOverride_android_scaleY, 48);
        h.append(xn6.ConstraintOverride_android_transformPivotX, 49);
        h.append(xn6.ConstraintOverride_android_transformPivotY, 50);
        h.append(xn6.ConstraintOverride_android_translationX, 51);
        h.append(xn6.ConstraintOverride_android_translationY, 52);
        h.append(xn6.ConstraintOverride_android_translationZ, 53);
        h.append(xn6.ConstraintOverride_layout_constraintWidth_default, 54);
        h.append(xn6.ConstraintOverride_layout_constraintHeight_default, 55);
        h.append(xn6.ConstraintOverride_layout_constraintWidth_max, 56);
        h.append(xn6.ConstraintOverride_layout_constraintHeight_max, 57);
        h.append(xn6.ConstraintOverride_layout_constraintWidth_min, 58);
        h.append(xn6.ConstraintOverride_layout_constraintHeight_min, 59);
        h.append(xn6.ConstraintOverride_layout_constraintCircleRadius, 62);
        h.append(xn6.ConstraintOverride_layout_constraintCircleAngle, 63);
        h.append(xn6.ConstraintOverride_animateRelativeTo, 64);
        h.append(xn6.ConstraintOverride_transitionEasing, 65);
        h.append(xn6.ConstraintOverride_drawPath, 66);
        h.append(xn6.ConstraintOverride_transitionPathRotate, 67);
        h.append(xn6.ConstraintOverride_motionStagger, 79);
        h.append(xn6.ConstraintOverride_android_id, 38);
        h.append(xn6.ConstraintOverride_motionTarget, 98);
        h.append(xn6.ConstraintOverride_motionProgress, 68);
        h.append(xn6.ConstraintOverride_layout_constraintWidth_percent, 69);
        h.append(xn6.ConstraintOverride_layout_constraintHeight_percent, 70);
        h.append(xn6.ConstraintOverride_chainUseRtl, 71);
        h.append(xn6.ConstraintOverride_barrierDirection, 72);
        h.append(xn6.ConstraintOverride_barrierMargin, 73);
        h.append(xn6.ConstraintOverride_constraint_referenced_ids, 74);
        h.append(xn6.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        h.append(xn6.ConstraintOverride_pathMotionArc, 76);
        h.append(xn6.ConstraintOverride_layout_constraintTag, 77);
        h.append(xn6.ConstraintOverride_visibilityMode, 78);
        h.append(xn6.ConstraintOverride_layout_constrainedWidth, 80);
        h.append(xn6.ConstraintOverride_layout_constrainedHeight, 81);
        h.append(xn6.ConstraintOverride_polarRelativeTo, 82);
        h.append(xn6.ConstraintOverride_transformPivotTarget, 83);
        h.append(xn6.ConstraintOverride_quantizeMotionSteps, 84);
        h.append(xn6.ConstraintOverride_quantizeMotionPhase, 85);
        h.append(xn6.ConstraintOverride_quantizeMotionInterpolator, 86);
        h.append(xn6.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    private int[] h(View view, String str) {
        int i;
        Object designInformation;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = dh6.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i = ((Integer) designInformation).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    private a i(Context context, AttributeSet attributeSet, boolean z) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? xn6.ConstraintOverride : xn6.Constraint);
        q(context, aVar, obtainStyledAttributes, z);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private a j(int i) {
        if (!this.e.containsKey(Integer.valueOf(i))) {
            this.e.put(Integer.valueOf(i), new a());
        }
        return (a) this.e.get(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void n(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) {
        /*
            if (r4 != 0) goto L3
            return
        L3:
            android.util.TypedValue r0 = r5.peekValue(r6)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L71
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L2a
            int r5 = r5.getInt(r6, r2)
            r6 = -4
            r0 = -2
            if (r5 == r6) goto L26
            r6 = -3
            if (r5 == r6) goto L20
            if (r5 == r0) goto L22
            r6 = -1
            if (r5 == r6) goto L22
        L20:
            r5 = r2
            goto L2f
        L22:
            r3 = r2
            r2 = r5
            r5 = r3
            goto L2f
        L26:
            r2 = 1
            r5 = r2
            r2 = r0
            goto L2f
        L2a:
            int r5 = r5.getDimensionPixelSize(r6, r2)
            goto L22
        L2f:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r6 == 0) goto L41
            androidx.constraintlayout.widget.ConstraintLayout$b r4 = (androidx.constraintlayout.widget.ConstraintLayout.b) r4
            if (r7 != 0) goto L3c
            r4.width = r2
            r4.a0 = r5
            goto L70
        L3c:
            r4.height = r2
            r4.b0 = r5
            goto L70
        L41:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.c.b
            if (r6 == 0) goto L53
            androidx.constraintlayout.widget.c$b r4 = (androidx.constraintlayout.widget.c.b) r4
            if (r7 != 0) goto L4e
            r4.d = r2
            r4.n0 = r5
            goto L70
        L4e:
            r4.e = r2
            r4.o0 = r5
            goto L70
        L53:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.c.a.C0073a
            if (r6 == 0) goto L70
            androidx.constraintlayout.widget.c$a$a r4 = (androidx.constraintlayout.widget.c.a.C0073a) r4
            if (r7 != 0) goto L66
            r6 = 23
            r4.b(r6, r2)
            r6 = 80
            r4.d(r6, r5)
            goto L70
        L66:
            r6 = 21
            r4.b(r6, r2)
            r6 = 81
            r4.d(r6, r5)
        L70:
            return
        L71:
            java.lang.String r5 = r5.getString(r6)
            o(r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.n(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    static void o(Object obj, String str, int i) {
        if (str == null) {
            return;
        }
        int indexOf = str.indexOf(61);
        int length = str.length();
        if (indexOf <= 0 || indexOf >= length - 1) {
            return;
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        if (substring2.length() > 0) {
            String trim = substring.trim();
            String trim2 = substring2.trim();
            if ("ratio".equalsIgnoreCase(trim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    p(bVar, trim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).A = trim2;
                    return;
                } else {
                    if (obj instanceof a.C0073a) {
                        ((a.C0073a) obj).c(5, trim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(trim)) {
                    float parseFloat = Float.parseFloat(trim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.L = parseFloat;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.M = parseFloat;
                        }
                    } else if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i == 0) {
                            bVar3.d = 0;
                            bVar3.W = parseFloat;
                        } else {
                            bVar3.e = 0;
                            bVar3.V = parseFloat;
                        }
                    } else if (obj instanceof a.C0073a) {
                        a.C0073a c0073a = (a.C0073a) obj;
                        if (i == 0) {
                            c0073a.b(23, 0);
                            c0073a.a(39, parseFloat);
                        } else {
                            c0073a.b(21, 0);
                            c0073a.a(40, parseFloat);
                        }
                    }
                } else {
                    if (!"parent".equalsIgnoreCase(trim)) {
                        return;
                    }
                    float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.V = max;
                            bVar4.P = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.W = max;
                            bVar4.Q = 2;
                        }
                    } else if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i == 0) {
                            bVar5.d = 0;
                            bVar5.f0 = max;
                            bVar5.Z = 2;
                        } else {
                            bVar5.e = 0;
                            bVar5.g0 = max;
                            bVar5.a0 = 2;
                        }
                    } else if (obj instanceof a.C0073a) {
                        a.C0073a c0073a2 = (a.C0073a) obj;
                        if (i == 0) {
                            c0073a2.b(23, 0);
                            c0073a2.b(54, 2);
                        } else {
                            c0073a2.b(21, 0);
                            c0073a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    static void p(ConstraintLayout.b bVar, String str) {
        float f2 = Float.NaN;
        int i = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase(QueryKeys.WRITING)) {
                    i = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i = 1;
                }
                i2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i2);
                    if (substring2.length() > 0) {
                        f2 = Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f2 = i == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.I = str;
        bVar.J = f2;
        bVar.K = i;
    }

    private void q(Context context, a aVar, TypedArray typedArray, boolean z) {
        if (z) {
            r(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != xn6.Constraint_android_id && xn6.Constraint_android_layout_marginStart != index && xn6.Constraint_android_layout_marginEnd != index) {
                aVar.d.a = true;
                aVar.e.b = true;
                aVar.c.a = true;
                aVar.f.a = true;
            }
            switch (g.get(index)) {
                case 1:
                    b bVar = aVar.e;
                    bVar.r = m(typedArray, index, bVar.r);
                    break;
                case 2:
                    b bVar2 = aVar.e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    break;
                case 3:
                    b bVar3 = aVar.e;
                    bVar3.q = m(typedArray, index, bVar3.q);
                    break;
                case 4:
                    b bVar4 = aVar.e;
                    bVar4.p = m(typedArray, index, bVar4.p);
                    break;
                case 5:
                    aVar.e.A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    break;
                case 7:
                    b bVar6 = aVar.e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    break;
                case 8:
                    b bVar7 = aVar.e;
                    bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                    break;
                case 9:
                    b bVar8 = aVar.e;
                    bVar8.x = m(typedArray, index, bVar8.x);
                    break;
                case 10:
                    b bVar9 = aVar.e;
                    bVar9.w = m(typedArray, index, bVar9.w);
                    break;
                case 11:
                    b bVar10 = aVar.e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    break;
                case 12:
                    b bVar11 = aVar.e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    break;
                case 13:
                    b bVar12 = aVar.e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    break;
                case 14:
                    b bVar13 = aVar.e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    break;
                case 15:
                    b bVar14 = aVar.e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    break;
                case 16:
                    b bVar15 = aVar.e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    break;
                case 17:
                    b bVar16 = aVar.e;
                    bVar16.f = typedArray.getDimensionPixelOffset(index, bVar16.f);
                    break;
                case 18:
                    b bVar17 = aVar.e;
                    bVar17.g = typedArray.getDimensionPixelOffset(index, bVar17.g);
                    break;
                case 19:
                    b bVar18 = aVar.e;
                    bVar18.h = typedArray.getFloat(index, bVar18.h);
                    break;
                case 20:
                    b bVar19 = aVar.e;
                    bVar19.y = typedArray.getFloat(index, bVar19.y);
                    break;
                case 21:
                    b bVar20 = aVar.e;
                    bVar20.e = typedArray.getLayoutDimension(index, bVar20.e);
                    break;
                case 22:
                    d dVar = aVar.c;
                    dVar.b = typedArray.getInt(index, dVar.b);
                    d dVar2 = aVar.c;
                    dVar2.b = f[dVar2.b];
                    break;
                case 23:
                    b bVar21 = aVar.e;
                    bVar21.d = typedArray.getLayoutDimension(index, bVar21.d);
                    break;
                case 24:
                    b bVar22 = aVar.e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    break;
                case EventType.SUBS /* 25 */:
                    b bVar23 = aVar.e;
                    bVar23.j = m(typedArray, index, bVar23.j);
                    break;
                case EventType.CDN /* 26 */:
                    b bVar24 = aVar.e;
                    bVar24.k = m(typedArray, index, bVar24.k);
                    break;
                case 27:
                    b bVar25 = aVar.e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    break;
                case 28:
                    b bVar26 = aVar.e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    break;
                case BuildConfig.VERSION_CODE /* 29 */:
                    b bVar27 = aVar.e;
                    bVar27.l = m(typedArray, index, bVar27.l);
                    break;
                case 30:
                    b bVar28 = aVar.e;
                    bVar28.m = m(typedArray, index, bVar28.m);
                    break;
                case 31:
                    b bVar29 = aVar.e;
                    bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                    break;
                case 32:
                    b bVar30 = aVar.e;
                    bVar30.u = m(typedArray, index, bVar30.u);
                    break;
                case 33:
                    b bVar31 = aVar.e;
                    bVar31.v = m(typedArray, index, bVar31.v);
                    break;
                case 34:
                    b bVar32 = aVar.e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    break;
                case 35:
                    b bVar33 = aVar.e;
                    bVar33.o = m(typedArray, index, bVar33.o);
                    break;
                case 36:
                    b bVar34 = aVar.e;
                    bVar34.n = m(typedArray, index, bVar34.n);
                    break;
                case 37:
                    b bVar35 = aVar.e;
                    bVar35.z = typedArray.getFloat(index, bVar35.z);
                    break;
                case 38:
                    aVar.a = typedArray.getResourceId(index, aVar.a);
                    break;
                case 39:
                    b bVar36 = aVar.e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    break;
                case 40:
                    b bVar37 = aVar.e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    break;
                case 41:
                    b bVar38 = aVar.e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    break;
                case 42:
                    b bVar39 = aVar.e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    break;
                case 43:
                    d dVar3 = aVar.c;
                    dVar3.d = typedArray.getFloat(index, dVar3.d);
                    break;
                case 44:
                    e eVar = aVar.f;
                    eVar.m = true;
                    eVar.n = typedArray.getDimension(index, eVar.n);
                    break;
                case 45:
                    e eVar2 = aVar.f;
                    eVar2.c = typedArray.getFloat(index, eVar2.c);
                    break;
                case 46:
                    e eVar3 = aVar.f;
                    eVar3.d = typedArray.getFloat(index, eVar3.d);
                    break;
                case 47:
                    e eVar4 = aVar.f;
                    eVar4.e = typedArray.getFloat(index, eVar4.e);
                    break;
                case 48:
                    e eVar5 = aVar.f;
                    eVar5.f = typedArray.getFloat(index, eVar5.f);
                    break;
                case 49:
                    e eVar6 = aVar.f;
                    eVar6.g = typedArray.getDimension(index, eVar6.g);
                    break;
                case 50:
                    e eVar7 = aVar.f;
                    eVar7.h = typedArray.getDimension(index, eVar7.h);
                    break;
                case 51:
                    e eVar8 = aVar.f;
                    eVar8.j = typedArray.getDimension(index, eVar8.j);
                    break;
                case 52:
                    e eVar9 = aVar.f;
                    eVar9.k = typedArray.getDimension(index, eVar9.k);
                    break;
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    e eVar10 = aVar.f;
                    eVar10.l = typedArray.getDimension(index, eVar10.l);
                    break;
                case 54:
                    b bVar40 = aVar.e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    break;
                case 55:
                    b bVar41 = aVar.e;
                    bVar41.a0 = typedArray.getInt(index, bVar41.a0);
                    break;
                case 56:
                    b bVar42 = aVar.e;
                    bVar42.b0 = typedArray.getDimensionPixelSize(index, bVar42.b0);
                    break;
                case 57:
                    b bVar43 = aVar.e;
                    bVar43.c0 = typedArray.getDimensionPixelSize(index, bVar43.c0);
                    break;
                case 58:
                    b bVar44 = aVar.e;
                    bVar44.d0 = typedArray.getDimensionPixelSize(index, bVar44.d0);
                    break;
                case 59:
                    b bVar45 = aVar.e;
                    bVar45.e0 = typedArray.getDimensionPixelSize(index, bVar45.e0);
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    e eVar11 = aVar.f;
                    eVar11.b = typedArray.getFloat(index, eVar11.b);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    b bVar46 = aVar.e;
                    bVar46.B = m(typedArray, index, bVar46.B);
                    break;
                case 62:
                    b bVar47 = aVar.e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    break;
                case 63:
                    b bVar48 = aVar.e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    break;
                case 64:
                    C0074c c0074c = aVar.d;
                    c0074c.b = m(typedArray, index, c0074c.b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.d.d = typedArray.getString(index);
                        break;
                    } else {
                        aVar.d.d = ux1.c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.d.f = typedArray.getInt(index, 0);
                    break;
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    C0074c c0074c2 = aVar.d;
                    c0074c2.i = typedArray.getFloat(index, c0074c2.i);
                    break;
                case 68:
                    d dVar4 = aVar.c;
                    dVar4.e = typedArray.getFloat(index, dVar4.e);
                    break;
                case 69:
                    aVar.e.f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.e.g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.e;
                    bVar49.h0 = typedArray.getInt(index, bVar49.h0);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 73 */:
                    b bVar50 = aVar.e;
                    bVar50.i0 = typedArray.getDimensionPixelSize(index, bVar50.i0);
                    break;
                case 74:
                    aVar.e.l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.e;
                    bVar51.p0 = typedArray.getBoolean(index, bVar51.p0);
                    break;
                case 76:
                    C0074c c0074c3 = aVar.d;
                    c0074c3.e = typedArray.getInt(index, c0074c3.e);
                    break;
                case AndroidTcfDataLoader.COMSCORE_VENDOR_INDEX /* 77 */:
                    aVar.e.m0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.c;
                    dVar5.c = typedArray.getInt(index, dVar5.c);
                    break;
                case 79:
                    C0074c c0074c4 = aVar.d;
                    c0074c4.g = typedArray.getFloat(index, c0074c4.g);
                    break;
                case 80:
                    b bVar52 = aVar.e;
                    bVar52.n0 = typedArray.getBoolean(index, bVar52.n0);
                    break;
                case 81:
                    b bVar53 = aVar.e;
                    bVar53.o0 = typedArray.getBoolean(index, bVar53.o0);
                    break;
                case 82:
                    C0074c c0074c5 = aVar.d;
                    c0074c5.c = typedArray.getInteger(index, c0074c5.c);
                    break;
                case 83:
                    e eVar12 = aVar.f;
                    eVar12.i = m(typedArray, index, eVar12.i);
                    break;
                case 84:
                    C0074c c0074c6 = aVar.d;
                    c0074c6.k = typedArray.getInteger(index, c0074c6.k);
                    break;
                case 85:
                    C0074c c0074c7 = aVar.d;
                    c0074c7.j = typedArray.getFloat(index, c0074c7.j);
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        aVar.d.n = typedArray.getResourceId(index, -1);
                        C0074c c0074c8 = aVar.d;
                        if (c0074c8.n != -1) {
                            c0074c8.m = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i2 == 3) {
                        aVar.d.l = typedArray.getString(index);
                        if (aVar.d.l.indexOf("/") > 0) {
                            aVar.d.n = typedArray.getResourceId(index, -1);
                            aVar.d.m = -2;
                            break;
                        } else {
                            aVar.d.m = -1;
                            break;
                        }
                    } else {
                        C0074c c0074c9 = aVar.d;
                        c0074c9.m = typedArray.getInteger(index, c0074c9.n);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + g.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + g.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.e;
                    bVar54.s = m(typedArray, index, bVar54.s);
                    break;
                case 92:
                    b bVar55 = aVar.e;
                    bVar55.t = m(typedArray, index, bVar55.t);
                    break;
                case 93:
                    b bVar56 = aVar.e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    break;
                case 94:
                    b bVar57 = aVar.e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    break;
                case 95:
                    n(aVar.e, typedArray, index, 0);
                    break;
                case 96:
                    n(aVar.e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.e;
                    bVar58.q0 = typedArray.getInt(index, bVar58.q0);
                    break;
            }
        }
        b bVar59 = aVar.e;
        if (bVar59.l0 != null) {
            bVar59.k0 = null;
        }
    }

    private static void r(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0073a c0073a = new a.C0073a();
        aVar.h = c0073a;
        aVar.d.a = false;
        aVar.e.b = false;
        aVar.c.a = false;
        aVar.f.a = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (h.get(index)) {
                case 2:
                    c0073a.b(2, typedArray.getDimensionPixelSize(index, aVar.e.K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case EventType.SUBS /* 25 */:
                case EventType.CDN /* 26 */:
                case BuildConfig.VERSION_CODE /* 29 */:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + g.get(index));
                    break;
                case 5:
                    c0073a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0073a.b(6, typedArray.getDimensionPixelOffset(index, aVar.e.E));
                    break;
                case 7:
                    c0073a.b(7, typedArray.getDimensionPixelOffset(index, aVar.e.F));
                    break;
                case 8:
                    c0073a.b(8, typedArray.getDimensionPixelSize(index, aVar.e.L));
                    break;
                case 11:
                    c0073a.b(11, typedArray.getDimensionPixelSize(index, aVar.e.R));
                    break;
                case 12:
                    c0073a.b(12, typedArray.getDimensionPixelSize(index, aVar.e.S));
                    break;
                case 13:
                    c0073a.b(13, typedArray.getDimensionPixelSize(index, aVar.e.O));
                    break;
                case 14:
                    c0073a.b(14, typedArray.getDimensionPixelSize(index, aVar.e.Q));
                    break;
                case 15:
                    c0073a.b(15, typedArray.getDimensionPixelSize(index, aVar.e.T));
                    break;
                case 16:
                    c0073a.b(16, typedArray.getDimensionPixelSize(index, aVar.e.P));
                    break;
                case 17:
                    c0073a.b(17, typedArray.getDimensionPixelOffset(index, aVar.e.f));
                    break;
                case 18:
                    c0073a.b(18, typedArray.getDimensionPixelOffset(index, aVar.e.g));
                    break;
                case 19:
                    c0073a.a(19, typedArray.getFloat(index, aVar.e.h));
                    break;
                case 20:
                    c0073a.a(20, typedArray.getFloat(index, aVar.e.y));
                    break;
                case 21:
                    c0073a.b(21, typedArray.getLayoutDimension(index, aVar.e.e));
                    break;
                case 22:
                    c0073a.b(22, f[typedArray.getInt(index, aVar.c.b)]);
                    break;
                case 23:
                    c0073a.b(23, typedArray.getLayoutDimension(index, aVar.e.d));
                    break;
                case 24:
                    c0073a.b(24, typedArray.getDimensionPixelSize(index, aVar.e.H));
                    break;
                case 27:
                    c0073a.b(27, typedArray.getInt(index, aVar.e.G));
                    break;
                case 28:
                    c0073a.b(28, typedArray.getDimensionPixelSize(index, aVar.e.I));
                    break;
                case 31:
                    c0073a.b(31, typedArray.getDimensionPixelSize(index, aVar.e.M));
                    break;
                case 34:
                    c0073a.b(34, typedArray.getDimensionPixelSize(index, aVar.e.J));
                    break;
                case 37:
                    c0073a.a(37, typedArray.getFloat(index, aVar.e.z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.a);
                    aVar.a = resourceId;
                    c0073a.b(38, resourceId);
                    break;
                case 39:
                    c0073a.a(39, typedArray.getFloat(index, aVar.e.W));
                    break;
                case 40:
                    c0073a.a(40, typedArray.getFloat(index, aVar.e.V));
                    break;
                case 41:
                    c0073a.b(41, typedArray.getInt(index, aVar.e.X));
                    break;
                case 42:
                    c0073a.b(42, typedArray.getInt(index, aVar.e.Y));
                    break;
                case 43:
                    c0073a.a(43, typedArray.getFloat(index, aVar.c.d));
                    break;
                case 44:
                    c0073a.d(44, true);
                    c0073a.a(44, typedArray.getDimension(index, aVar.f.n));
                    break;
                case 45:
                    c0073a.a(45, typedArray.getFloat(index, aVar.f.c));
                    break;
                case 46:
                    c0073a.a(46, typedArray.getFloat(index, aVar.f.d));
                    break;
                case 47:
                    c0073a.a(47, typedArray.getFloat(index, aVar.f.e));
                    break;
                case 48:
                    c0073a.a(48, typedArray.getFloat(index, aVar.f.f));
                    break;
                case 49:
                    c0073a.a(49, typedArray.getDimension(index, aVar.f.g));
                    break;
                case 50:
                    c0073a.a(50, typedArray.getDimension(index, aVar.f.h));
                    break;
                case 51:
                    c0073a.a(51, typedArray.getDimension(index, aVar.f.j));
                    break;
                case 52:
                    c0073a.a(52, typedArray.getDimension(index, aVar.f.k));
                    break;
                case zendesk.core.BuildConfig.VERSION_CODE /* 53 */:
                    c0073a.a(53, typedArray.getDimension(index, aVar.f.l));
                    break;
                case 54:
                    c0073a.b(54, typedArray.getInt(index, aVar.e.Z));
                    break;
                case 55:
                    c0073a.b(55, typedArray.getInt(index, aVar.e.a0));
                    break;
                case 56:
                    c0073a.b(56, typedArray.getDimensionPixelSize(index, aVar.e.b0));
                    break;
                case 57:
                    c0073a.b(57, typedArray.getDimensionPixelSize(index, aVar.e.c0));
                    break;
                case 58:
                    c0073a.b(58, typedArray.getDimensionPixelSize(index, aVar.e.d0));
                    break;
                case 59:
                    c0073a.b(59, typedArray.getDimensionPixelSize(index, aVar.e.e0));
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    c0073a.a(60, typedArray.getFloat(index, aVar.f.b));
                    break;
                case 62:
                    c0073a.b(62, typedArray.getDimensionPixelSize(index, aVar.e.C));
                    break;
                case 63:
                    c0073a.a(63, typedArray.getFloat(index, aVar.e.D));
                    break;
                case 64:
                    c0073a.b(64, m(typedArray, index, aVar.d.b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0073a.c(65, typedArray.getString(index));
                        break;
                    } else {
                        c0073a.c(65, ux1.c[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    c0073a.b(66, typedArray.getInt(index, 0));
                    break;
                case MdtaMetadataEntry.TYPE_INDICATOR_INT32 /* 67 */:
                    c0073a.a(67, typedArray.getFloat(index, aVar.d.i));
                    break;
                case 68:
                    c0073a.a(68, typedArray.getFloat(index, aVar.c.e));
                    break;
                case 69:
                    c0073a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0073a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0073a.b(72, typedArray.getInt(index, aVar.e.h0));
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 73 */:
                    c0073a.b(73, typedArray.getDimensionPixelSize(index, aVar.e.i0));
                    break;
                case 74:
                    c0073a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0073a.d(75, typedArray.getBoolean(index, aVar.e.p0));
                    break;
                case 76:
                    c0073a.b(76, typedArray.getInt(index, aVar.d.e));
                    break;
                case AndroidTcfDataLoader.COMSCORE_VENDOR_INDEX /* 77 */:
                    c0073a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0073a.b(78, typedArray.getInt(index, aVar.c.c));
                    break;
                case 79:
                    c0073a.a(79, typedArray.getFloat(index, aVar.d.g));
                    break;
                case 80:
                    c0073a.d(80, typedArray.getBoolean(index, aVar.e.n0));
                    break;
                case 81:
                    c0073a.d(81, typedArray.getBoolean(index, aVar.e.o0));
                    break;
                case 82:
                    c0073a.b(82, typedArray.getInteger(index, aVar.d.c));
                    break;
                case 83:
                    c0073a.b(83, m(typedArray, index, aVar.f.i));
                    break;
                case 84:
                    c0073a.b(84, typedArray.getInteger(index, aVar.d.k));
                    break;
                case 85:
                    c0073a.a(85, typedArray.getFloat(index, aVar.d.j));
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        aVar.d.n = typedArray.getResourceId(index, -1);
                        c0073a.b(89, aVar.d.n);
                        C0074c c0074c = aVar.d;
                        if (c0074c.n != -1) {
                            c0074c.m = -2;
                            c0073a.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i2 == 3) {
                        aVar.d.l = typedArray.getString(index);
                        c0073a.c(90, aVar.d.l);
                        if (aVar.d.l.indexOf("/") > 0) {
                            aVar.d.n = typedArray.getResourceId(index, -1);
                            c0073a.b(89, aVar.d.n);
                            aVar.d.m = -2;
                            c0073a.b(88, -2);
                            break;
                        } else {
                            aVar.d.m = -1;
                            c0073a.b(88, -1);
                            break;
                        }
                    } else {
                        C0074c c0074c2 = aVar.d;
                        c0074c2.m = typedArray.getInteger(index, c0074c2.n);
                        c0073a.b(88, aVar.d.m);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + g.get(index));
                    break;
                case 93:
                    c0073a.b(93, typedArray.getDimensionPixelSize(index, aVar.e.N));
                    break;
                case 94:
                    c0073a.b(94, typedArray.getDimensionPixelSize(index, aVar.e.U));
                    break;
                case 95:
                    n(c0073a, typedArray, index, 0);
                    break;
                case 96:
                    n(c0073a, typedArray, index, 1);
                    break;
                case 97:
                    c0073a.b(97, typedArray.getInt(index, aVar.e.q0));
                    break;
                case 98:
                    if (dw4.a) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.a);
                        aVar.a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.b = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.b = typedArray.getString(index);
                        break;
                    } else {
                        aVar.a = typedArray.getResourceId(index, aVar.a);
                        break;
                    }
                case 99:
                    c0073a.d(99, typedArray.getBoolean(index, aVar.e.i));
                    break;
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    void d(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.e.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.e.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + zb1.a(childAt));
            } else {
                if (this.d && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.e.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = (a) this.e.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.e.j0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(aVar.e.h0);
                                barrier.setMargin(aVar.e.i0);
                                barrier.setAllowsGoneWidget(aVar.e.p0);
                                b bVar = aVar.e;
                                int[] iArr = bVar.k0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.l0;
                                    if (str != null) {
                                        bVar.k0 = h(barrier, str);
                                        barrier.setReferencedIds(aVar.e.k0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.a();
                            aVar.b(bVar2);
                            if (z) {
                                ConstraintAttribute.c(childAt, aVar.g);
                            }
                            childAt.setLayoutParams(bVar2);
                            d dVar = aVar.c;
                            if (dVar.c == 0) {
                                childAt.setVisibility(dVar.b);
                            }
                            childAt.setAlpha(aVar.c.d);
                            childAt.setRotation(aVar.f.b);
                            childAt.setRotationX(aVar.f.c);
                            childAt.setRotationY(aVar.f.d);
                            childAt.setScaleX(aVar.f.e);
                            childAt.setScaleY(aVar.f.f);
                            e eVar = aVar.f;
                            if (eVar.i != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.f.i) != null) {
                                    float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                    float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.g)) {
                                    childAt.setPivotX(aVar.f.g);
                                }
                                if (!Float.isNaN(aVar.f.h)) {
                                    childAt.setPivotY(aVar.f.h);
                                }
                            }
                            childAt.setTranslationX(aVar.f.j);
                            childAt.setTranslationY(aVar.f.k);
                            childAt.setTranslationZ(aVar.f.l);
                            e eVar2 = aVar.f;
                            if (eVar2.m) {
                                childAt.setElevation(eVar2.n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            Integer num = (Integer) it2.next();
            a aVar2 = (a) this.e.get(num);
            if (aVar2 != null) {
                if (aVar2.e.j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.e;
                    int[] iArr2 = bVar3.k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.l0;
                        if (str2 != null) {
                            bVar3.k0 = h(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.e.k0);
                        }
                    }
                    barrier2.setType(aVar2.e.h0);
                    barrier2.setMargin(aVar2.e.i0);
                    ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.o();
                    aVar2.b(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (aVar2.e.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.b(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof androidx.constraintlayout.widget.a) {
                ((androidx.constraintlayout.widget.a) childAt2).f(constraintLayout);
            }
        }
    }

    public void e(Context context, int i) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.e.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.e.containsKey(Integer.valueOf(id))) {
                this.e.put(Integer.valueOf(id), new a());
            }
            a aVar = (a) this.e.get(Integer.valueOf(id));
            if (aVar != null) {
                aVar.g = ConstraintAttribute.a(this.c, childAt);
                aVar.d(id, bVar);
                aVar.c.b = childAt.getVisibility();
                aVar.c.d = childAt.getAlpha();
                aVar.f.b = childAt.getRotation();
                aVar.f.c = childAt.getRotationX();
                aVar.f.d = childAt.getRotationY();
                aVar.f.e = childAt.getScaleX();
                aVar.f.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f;
                    eVar.g = pivotX;
                    eVar.h = pivotY;
                }
                aVar.f.j = childAt.getTranslationX();
                aVar.f.k = childAt.getTranslationY();
                aVar.f.l = childAt.getTranslationZ();
                e eVar2 = aVar.f;
                if (eVar2.m) {
                    eVar2.n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.e.p0 = barrier.getAllowsGoneWidget();
                    aVar.e.k0 = barrier.getReferencedIds();
                    aVar.e.h0 = barrier.getType();
                    aVar.e.i0 = barrier.getMargin();
                }
            }
        }
    }

    public void g(int i, int i2, int i3, float f2) {
        b bVar = j(i).e;
        bVar.B = i2;
        bVar.C = i3;
        bVar.D = f2;
    }

    public void k(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a i2 = i(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        i2.e.a = true;
                    }
                    this.e.put(Integer.valueOf(i2.a), i2);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01cf, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.l(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
