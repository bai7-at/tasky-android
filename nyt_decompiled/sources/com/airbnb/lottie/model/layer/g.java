package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.DocumentData;
import defpackage.cd4;
import defpackage.ch;
import defpackage.dh;
import defpackage.hm2;
import defpackage.km2;
import defpackage.l29;
import defpackage.lb4;
import defpackage.oh;
import defpackage.p50;
import defpackage.r39;
import defpackage.wc4;
import defpackage.wi8;
import defpackage.xo7;
import defpackage.zv0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class g extends com.airbnb.lottie.model.layer.a {
    private final StringBuilder D;
    private final RectF E;
    private final Matrix F;
    private final Paint G;
    private final Paint H;
    private final Map I;
    private final lb4 J;
    private final List K;
    private final wi8 L;
    private final LottieDrawable M;
    private final LottieComposition N;
    private p50 O;
    private p50 P;
    private p50 Q;
    private p50 R;
    private p50 S;
    private p50 T;
    private p50 U;
    private p50 V;
    private p50 W;
    private p50 X;

    class a extends Paint {
        a(int i) {
            super(i);
            setStyle(Paint.Style.FILL);
        }
    }

    class b extends Paint {
        b(int i) {
            super(i);
            setStyle(Paint.Style.STROKE);
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            a = iArr;
            try {
                iArr[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    g(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        dh dhVar;
        dh dhVar2;
        ch chVar;
        ch chVar2;
        this.D = new StringBuilder(2);
        this.E = new RectF();
        this.F = new Matrix();
        this.G = new a(1);
        this.H = new b(1);
        this.I = new HashMap();
        this.J = new lb4();
        this.K = new ArrayList();
        this.M = lottieDrawable;
        this.N = layer.c();
        wi8 a2 = layer.t().a();
        this.L = a2;
        a2.a(this);
        i(a2);
        oh u = layer.u();
        if (u != null && (chVar2 = u.a) != null) {
            p50 a3 = chVar2.a();
            this.O = a3;
            a3.a(this);
            i(this.O);
        }
        if (u != null && (chVar = u.b) != null) {
            p50 a4 = chVar.a();
            this.Q = a4;
            a4.a(this);
            i(this.Q);
        }
        if (u != null && (dhVar2 = u.c) != null) {
            p50 a5 = dhVar2.a();
            this.S = a5;
            a5.a(this);
            i(this.S);
        }
        if (u == null || (dhVar = u.d) == null) {
            return;
        }
        p50 a6 = dhVar.a();
        this.U = a6;
        a6.a(this);
        i(this.U);
    }

    private String P(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!d0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = codePointAt;
        if (this.J.c(j)) {
            return (String) this.J.d(j);
        }
        this.D.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.D.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb = this.D.toString();
        this.J.h(j, sb);
        return sb;
    }

    private void Q(DocumentData documentData, int i) {
        p50 p50Var = this.P;
        if (p50Var != null) {
            this.G.setColor(((Integer) p50Var.h()).intValue());
        } else {
            p50 p50Var2 = this.O;
            if (p50Var2 != null) {
                this.G.setColor(((Integer) p50Var2.h()).intValue());
            } else {
                this.G.setColor(documentData.h);
            }
        }
        p50 p50Var3 = this.R;
        if (p50Var3 != null) {
            this.H.setColor(((Integer) p50Var3.h()).intValue());
        } else {
            p50 p50Var4 = this.Q;
            if (p50Var4 != null) {
                this.H.setColor(((Integer) p50Var4.h()).intValue());
            } else {
                this.H.setColor(documentData.i);
            }
        }
        int intValue = ((((this.x.h() == null ? 100 : ((Integer) this.x.h().h()).intValue()) * 255) / 100) * i) / 255;
        this.G.setAlpha(intValue);
        this.H.setAlpha(intValue);
        p50 p50Var5 = this.T;
        if (p50Var5 != null) {
            this.H.setStrokeWidth(((Float) p50Var5.h()).floatValue());
            return;
        }
        p50 p50Var6 = this.S;
        if (p50Var6 != null) {
            this.H.setStrokeWidth(((Float) p50Var6.h()).floatValue());
        } else {
            this.H.setStrokeWidth(documentData.j * l29.e());
        }
    }

    private void R(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void S(km2 km2Var, float f, DocumentData documentData, Canvas canvas) {
        List a0 = a0(km2Var);
        for (int i = 0; i < a0.size(); i++) {
            Path path = ((zv0) a0.get(i)).getPath();
            path.computeBounds(this.E, false);
            this.F.reset();
            this.F.preTranslate(0.0f, (-documentData.g) * l29.e());
            this.F.preScale(f, f);
            path.transform(this.F);
            if (documentData.k) {
                V(path, this.G, canvas);
                V(path, this.H, canvas);
            } else {
                V(path, this.H, canvas);
                V(path, this.G, canvas);
            }
        }
    }

    private void T(String str, DocumentData documentData, Canvas canvas) {
        if (documentData.k) {
            R(str, this.G, canvas);
            R(str, this.H, canvas);
        } else {
            R(str, this.H, canvas);
            R(str, this.G, canvas);
        }
    }

    private void U(String str, DocumentData documentData, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String P = P(str, i);
            i += P.length();
            T(P, documentData, canvas);
            canvas.translate(this.G.measureText(P) + f, 0.0f);
        }
    }

    private void V(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void W(String str, DocumentData documentData, hm2 hm2Var, Canvas canvas, float f, float f2, float f3) {
        for (int i = 0; i < str.length(); i++) {
            km2 km2Var = (km2) this.N.c().e(km2.c(str.charAt(i), hm2Var.a(), hm2Var.c()));
            if (km2Var != null) {
                S(km2Var, f2, documentData, canvas);
                canvas.translate((((float) km2Var.b()) * f2 * l29.e()) + f3, 0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void X(com.airbnb.lottie.model.DocumentData r19, defpackage.hm2 r20, android.graphics.Canvas r21) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            android.graphics.Typeface r0 = r7.c0(r9)
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r1 = r8.a
            com.airbnb.lottie.LottieDrawable r2 = r7.M
            r2.b0()
            android.graphics.Paint r2 = r7.G
            r2.setTypeface(r0)
            p50 r0 = r7.W
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r0.h()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L2c
        L2a:
            float r0 = r8.c
        L2c:
            android.graphics.Paint r2 = r7.G
            float r3 = defpackage.l29.e()
            float r3 = r3 * r0
            r2.setTextSize(r3)
            android.graphics.Paint r2 = r7.H
            android.graphics.Paint r3 = r7.G
            android.graphics.Typeface r3 = r3.getTypeface()
            r2.setTypeface(r3)
            android.graphics.Paint r2 = r7.H
            android.graphics.Paint r3 = r7.G
            float r3 = r3.getTextSize()
            r2.setTextSize(r3)
            int r2 = r8.e
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            p50 r3 = r7.V
            if (r3 == 0) goto L62
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L60:
            float r2 = r2 + r3
            goto L71
        L62:
            p50 r3 = r7.U
            if (r3 == 0) goto L71
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L60
        L71:
            float r3 = defpackage.l29.e()
            float r2 = r2 * r3
            float r2 = r2 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r11 = r2 / r0
            java.util.List r12 = r7.b0(r1)
            int r13 = r12.size()
            r14 = 0
            r0 = -1
            r15 = r0
            r6 = r14
        L87:
            if (r6 >= r13) goto Ld6
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r8.m
            if (r0 != 0) goto L97
            r0 = 0
        L95:
            r2 = r0
            goto L9a
        L97:
            float r0 = r0.x
            goto L95
        L9a:
            r4 = 0
            r16 = 0
            r0 = r18
            r3 = r20
            r5 = r11
            r17 = r6
            r6 = r16
            java.util.List r0 = r0.f0(r1, r2, r3, r4, r5, r6)
            r1 = r14
        Lab:
            int r2 = r0.size()
            if (r1 >= r2) goto Ld3
            java.lang.Object r2 = r0.get(r1)
            com.airbnb.lottie.model.layer.g$d r2 = (com.airbnb.lottie.model.layer.g.d) r2
            int r15 = r15 + 1
            r21.save()
            float r3 = com.airbnb.lottie.model.layer.g.d.a(r2)
            boolean r3 = r7.e0(r10, r8, r15, r3)
            if (r3 == 0) goto Lcd
            java.lang.String r2 = com.airbnb.lottie.model.layer.g.d.b(r2)
            r7.U(r2, r8, r10, r11)
        Lcd:
            r21.restore()
            int r1 = r1 + 1
            goto Lab
        Ld3:
            int r6 = r17 + 1
            goto L87
        Ld6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.g.X(com.airbnb.lottie.model.DocumentData, hm2, android.graphics.Canvas):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void Y(com.airbnb.lottie.model.DocumentData r21, android.graphics.Matrix r22, defpackage.hm2 r23, android.graphics.Canvas r24) {
        /*
            r20 = this;
            r8 = r20
            r9 = r21
            p50 r0 = r8.W
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.h()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L15
        L13:
            float r0 = r9.c
        L15:
            r1 = 1120403456(0x42c80000, float:100.0)
            float r10 = r0 / r1
            float r11 = defpackage.l29.g(r22)
            java.lang.String r0 = r9.a
            java.util.List r12 = r8.b0(r0)
            int r13 = r12.size()
            int r0 = r9.e
            float r0 = (float) r0
            r1 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 / r1
            p50 r1 = r8.V
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r1.h()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
        L3b:
            float r0 = r0 + r1
        L3c:
            r14 = r0
            goto L4d
        L3e:
            p50 r1 = r8.U
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r1.h()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L3b
        L4d:
            r15 = 0
            r0 = -1
            r7 = r0
            r6 = r15
        L51:
            if (r6 >= r13) goto Lbe
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r9.m
            if (r0 != 0) goto L61
            r0 = 0
        L5f:
            r2 = r0
            goto L64
        L61:
            float r0 = r0.x
            goto L5f
        L64:
            r16 = 1
            r0 = r20
            r3 = r23
            r4 = r10
            r5 = r14
            r17 = r6
            r6 = r16
            java.util.List r6 = r0.f0(r1, r2, r3, r4, r5, r6)
            r5 = r15
        L75:
            int r0 = r6.size()
            if (r5 >= r0) goto Lbb
            java.lang.Object r0 = r6.get(r5)
            com.airbnb.lottie.model.layer.g$d r0 = (com.airbnb.lottie.model.layer.g.d) r0
            int r7 = r7 + 1
            r24.save()
            float r1 = com.airbnb.lottie.model.layer.g.d.a(r0)
            r4 = r24
            boolean r1 = r8.e0(r4, r9, r7, r1)
            if (r1 == 0) goto Lab
            java.lang.String r1 = com.airbnb.lottie.model.layer.g.d.b(r0)
            r0 = r20
            r2 = r21
            r3 = r23
            r4 = r24
            r16 = r5
            r5 = r11
            r18 = r6
            r6 = r10
            r19 = r7
            r7 = r14
            r0.W(r1, r2, r3, r4, r5, r6, r7)
            goto Lb1
        Lab:
            r16 = r5
            r18 = r6
            r19 = r7
        Lb1:
            r24.restore()
            int r5 = r16 + 1
            r6 = r18
            r7 = r19
            goto L75
        Lbb:
            int r6 = r17 + 1
            goto L51
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.g.Y(com.airbnb.lottie.model.DocumentData, android.graphics.Matrix, hm2, android.graphics.Canvas):void");
    }

    private d Z(int i) {
        for (int size = this.K.size(); size < i; size++) {
            this.K.add(new d(null));
        }
        return (d) this.K.get(i - 1);
    }

    private List a0(km2 km2Var) {
        if (this.I.containsKey(km2Var)) {
            return (List) this.I.get(km2Var);
        }
        List a2 = km2Var.a();
        int size = a2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new zv0(this.M, this, (xo7) a2.get(i), this.N));
        }
        this.I.put(km2Var, arrayList);
        return arrayList;
    }

    private List b0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private Typeface c0(hm2 hm2Var) {
        Typeface typeface;
        p50 p50Var = this.X;
        if (p50Var != null && (typeface = (Typeface) p50Var.h()) != null) {
            return typeface;
        }
        Typeface c0 = this.M.c0(hm2Var);
        return c0 != null ? c0 : hm2Var.d();
    }

    private boolean d0(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 8 || Character.getType(i) == 19;
    }

    private boolean e0(Canvas canvas, DocumentData documentData, int i, float f) {
        PointF pointF = documentData.l;
        PointF pointF2 = documentData.m;
        float e = l29.e();
        float f2 = (i * documentData.f * e) + (pointF == null ? 0.0f : (documentData.f * e) + pointF.y);
        if (this.M.I() && pointF2 != null && pointF != null && f2 >= pointF.y + pointF2.y + documentData.c) {
            return false;
        }
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int i2 = c.a[documentData.d.ordinal()];
        if (i2 == 1) {
            canvas.translate(f3, f2);
        } else if (i2 == 2) {
            canvas.translate((f3 + f4) - f, f2);
        } else if (i2 == 3) {
            canvas.translate((f3 + (f4 / 2.0f)) - (f / 2.0f), f2);
        }
        return true;
    }

    private List f0(String str, float f, hm2 hm2Var, float f2, float f3, boolean z) {
        float measureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (z) {
                km2 km2Var = (km2) this.N.c().e(km2.c(charAt, hm2Var.a(), hm2Var.c()));
                if (km2Var != null) {
                    measureText = ((float) km2Var.b()) * f2 * l29.e();
                }
            } else {
                measureText = this.G.measureText(str.substring(i4, i4 + 1));
            }
            float f7 = measureText + f3;
            if (charAt == ' ') {
                z2 = true;
                f6 = f7;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = f7;
            } else {
                f5 += f7;
            }
            f4 += f7;
            if (f > 0.0f && f4 >= f && charAt != ' ') {
                i++;
                d Z = Z(i);
                if (i3 == i2) {
                    Z.c(str.substring(i2, i4).trim(), (f4 - f7) - ((r9.length() - r7.length()) * f6));
                    i2 = i4;
                    i3 = i2;
                    f4 = f7;
                    f5 = f4;
                } else {
                    Z.c(str.substring(i2, i3 - 1).trim(), ((f4 - f5) - ((r7.length() - r13.length()) * f6)) - f6);
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            Z(i).c(str.substring(i2), f4);
        }
        return this.K.subList(0, i);
    }

    @Override // com.airbnb.lottie.model.layer.a, defpackage.xv1
    public void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.N.b().width(), this.N.b().height());
    }

    @Override // com.airbnb.lottie.model.layer.a, defpackage.hw3
    public void f(Object obj, cd4 cd4Var) {
        super.f(obj, cd4Var);
        if (obj == wc4.a) {
            p50 p50Var = this.P;
            if (p50Var != null) {
                H(p50Var);
            }
            if (cd4Var == null) {
                this.P = null;
                return;
            }
            r39 r39Var = new r39(cd4Var);
            this.P = r39Var;
            r39Var.a(this);
            i(this.P);
            return;
        }
        if (obj == wc4.b) {
            p50 p50Var2 = this.R;
            if (p50Var2 != null) {
                H(p50Var2);
            }
            if (cd4Var == null) {
                this.R = null;
                return;
            }
            r39 r39Var2 = new r39(cd4Var);
            this.R = r39Var2;
            r39Var2.a(this);
            i(this.R);
            return;
        }
        if (obj == wc4.s) {
            p50 p50Var3 = this.T;
            if (p50Var3 != null) {
                H(p50Var3);
            }
            if (cd4Var == null) {
                this.T = null;
                return;
            }
            r39 r39Var3 = new r39(cd4Var);
            this.T = r39Var3;
            r39Var3.a(this);
            i(this.T);
            return;
        }
        if (obj == wc4.t) {
            p50 p50Var4 = this.V;
            if (p50Var4 != null) {
                H(p50Var4);
            }
            if (cd4Var == null) {
                this.V = null;
                return;
            }
            r39 r39Var4 = new r39(cd4Var);
            this.V = r39Var4;
            r39Var4.a(this);
            i(this.V);
            return;
        }
        if (obj == wc4.F) {
            p50 p50Var5 = this.W;
            if (p50Var5 != null) {
                H(p50Var5);
            }
            if (cd4Var == null) {
                this.W = null;
                return;
            }
            r39 r39Var5 = new r39(cd4Var);
            this.W = r39Var5;
            r39Var5.a(this);
            i(this.W);
            return;
        }
        if (obj != wc4.M) {
            if (obj == wc4.O) {
                this.L.r(cd4Var);
                return;
            }
            return;
        }
        p50 p50Var6 = this.X;
        if (p50Var6 != null) {
            H(p50Var6);
        }
        if (cd4Var == null) {
            this.X = null;
            return;
        }
        r39 r39Var6 = new r39(cd4Var);
        this.X = r39Var6;
        r39Var6.a(this);
        i(this.X);
    }

    @Override // com.airbnb.lottie.model.layer.a
    void t(Canvas canvas, Matrix matrix, int i) {
        DocumentData documentData = (DocumentData) this.L.h();
        hm2 hm2Var = (hm2) this.N.g().get(documentData.b);
        if (hm2Var == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        Q(documentData, i);
        if (this.M.k1()) {
            Y(documentData, matrix, hm2Var, canvas);
        } else {
            X(documentData, hm2Var, canvas);
        }
        canvas.restore();
    }

    private static class d {
        private String a;
        private float b;

        private d() {
            this.a = "";
            this.b = 0.0f;
        }

        void c(String str, float f) {
            this.a = str;
            this.b = f;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }
}
