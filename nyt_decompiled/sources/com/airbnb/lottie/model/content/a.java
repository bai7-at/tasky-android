package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeStroke;
import defpackage.dh;
import defpackage.eh;
import defpackage.fh;
import defpackage.jh;
import defpackage.pw0;
import defpackage.tv0;
import defpackage.u13;
import java.util.List;

/* loaded from: classes.dex */
public class a implements pw0 {
    private final String a;
    private final GradientType b;
    private final eh c;
    private final fh d;
    private final jh e;
    private final jh f;
    private final dh g;
    private final ShapeStroke.LineCapType h;
    private final ShapeStroke.LineJoinType i;
    private final float j;
    private final List k;
    private final dh l;
    private final boolean m;

    public a(String str, GradientType gradientType, eh ehVar, fh fhVar, jh jhVar, jh jhVar2, dh dhVar, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f, List list, dh dhVar2, boolean z) {
        this.a = str;
        this.b = gradientType;
        this.c = ehVar;
        this.d = fhVar;
        this.e = jhVar;
        this.f = jhVar2;
        this.g = dhVar;
        this.h = lineCapType;
        this.i = lineJoinType;
        this.j = f;
        this.k = list;
        this.l = dhVar2;
        this.m = z;
    }

    @Override // defpackage.pw0
    public tv0 a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, com.airbnb.lottie.model.layer.a aVar) {
        return new u13(lottieDrawable, aVar, this);
    }

    public ShapeStroke.LineCapType b() {
        return this.h;
    }

    public dh c() {
        return this.l;
    }

    public jh d() {
        return this.f;
    }

    public eh e() {
        return this.c;
    }

    public GradientType f() {
        return this.b;
    }

    public ShapeStroke.LineJoinType g() {
        return this.i;
    }

    public List h() {
        return this.k;
    }

    public float i() {
        return this.j;
    }

    public String j() {
        return this.a;
    }

    public fh k() {
        return this.d;
    }

    public jh l() {
        return this.e;
    }

    public dh m() {
        return this.g;
    }

    public boolean n() {
        return this.m;
    }
}
