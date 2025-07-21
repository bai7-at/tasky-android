package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import defpackage.ch;
import defpackage.dh;
import defpackage.fh;
import defpackage.pw0;
import defpackage.tv0;
import defpackage.w48;
import java.util.List;

/* loaded from: classes.dex */
public class ShapeStroke implements pw0 {
    private final String a;
    private final dh b;
    private final List c;
    private final ch d;
    private final fh e;
    private final dh f;
    private final LineCapType g;
    private final LineJoinType h;
    private final float i;
    private final boolean j;

    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i = a.a[ordinal()];
            return i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i = a.b[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[LineJoinType.values().length];
            b = iArr;
            try {
                iArr[LineJoinType.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[LineJoinType.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[LineJoinType.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LineCapType.values().length];
            a = iArr2;
            try {
                iArr2[LineCapType.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[LineCapType.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[LineCapType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ShapeStroke(String str, dh dhVar, List list, ch chVar, fh fhVar, dh dhVar2, LineCapType lineCapType, LineJoinType lineJoinType, float f, boolean z) {
        this.a = str;
        this.b = dhVar;
        this.c = list;
        this.d = chVar;
        this.e = fhVar;
        this.f = dhVar2;
        this.g = lineCapType;
        this.h = lineJoinType;
        this.i = f;
        this.j = z;
    }

    @Override // defpackage.pw0
    public tv0 a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, com.airbnb.lottie.model.layer.a aVar) {
        return new w48(lottieDrawable, aVar, this);
    }

    public LineCapType b() {
        return this.g;
    }

    public ch c() {
        return this.d;
    }

    public dh d() {
        return this.b;
    }

    public LineJoinType e() {
        return this.h;
    }

    public List f() {
        return this.c;
    }

    public float g() {
        return this.i;
    }

    public String h() {
        return this.a;
    }

    public fh i() {
        return this.e;
    }

    public dh j() {
        return this.f;
    }

    public boolean k() {
        return this.j;
    }
}
