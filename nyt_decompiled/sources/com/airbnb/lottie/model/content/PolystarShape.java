package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import defpackage.dh;
import defpackage.lz5;
import defpackage.pw0;
import defpackage.sh;
import defpackage.tv0;

/* loaded from: classes.dex */
public class PolystarShape implements pw0 {
    private final String a;
    private final Type b;
    private final dh c;
    private final sh d;
    private final dh e;
    private final dh f;
    private final dh g;
    private final dh h;
    private final dh i;
    private final boolean j;
    private final boolean k;

    public enum Type {
        STAR(1),
        POLYGON(2);

        private final int value;

        Type(int i) {
            this.value = i;
        }

        public static Type forValue(int i) {
            for (Type type2 : values()) {
                if (type2.value == i) {
                    return type2;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type2, dh dhVar, sh shVar, dh dhVar2, dh dhVar3, dh dhVar4, dh dhVar5, dh dhVar6, boolean z, boolean z2) {
        this.a = str;
        this.b = type2;
        this.c = dhVar;
        this.d = shVar;
        this.e = dhVar2;
        this.f = dhVar3;
        this.g = dhVar4;
        this.h = dhVar5;
        this.i = dhVar6;
        this.j = z;
        this.k = z2;
    }

    @Override // defpackage.pw0
    public tv0 a(LottieDrawable lottieDrawable, LottieComposition lottieComposition, com.airbnb.lottie.model.layer.a aVar) {
        return new lz5(lottieDrawable, aVar, this);
    }

    public dh b() {
        return this.f;
    }

    public dh c() {
        return this.h;
    }

    public String d() {
        return this.a;
    }

    public dh e() {
        return this.g;
    }

    public dh f() {
        return this.i;
    }

    public dh g() {
        return this.c;
    }

    public sh h() {
        return this.d;
    }

    public dh i() {
        return this.e;
    }

    public Type j() {
        return this.b;
    }

    public boolean k() {
        return this.j;
    }

    public boolean l() {
        return this.k;
    }
}
