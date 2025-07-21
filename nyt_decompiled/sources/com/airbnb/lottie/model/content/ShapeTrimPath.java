package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import defpackage.bt8;
import defpackage.dh;
import defpackage.pw0;
import defpackage.tv0;

/* loaded from: classes.dex */
public class ShapeTrimPath implements pw0 {
    private final String a;
    private final Type b;
    private final dh c;
    private final dh d;
    private final dh e;
    private final boolean f;

    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type forId(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i);
        }
    }

    public ShapeTrimPath(String str, Type type2, dh dhVar, dh dhVar2, dh dhVar3, boolean z) {
        this.a = str;
        this.b = type2;
        this.c = dhVar;
        this.d = dhVar2;
        this.e = dhVar3;
        this.f = z;
    }

    @Override // defpackage.pw0
    public tv0 a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, com.airbnb.lottie.model.layer.a aVar) {
        return new bt8(aVar, this);
    }

    public dh b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public dh d() {
        return this.e;
    }

    public dh e() {
        return this.c;
    }

    public Type f() {
        return this.b;
    }

    public boolean g() {
        return this.f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.c + ", end: " + this.d + ", offset: " + this.e + "}";
    }
}
