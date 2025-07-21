package defpackage;

import defpackage.aw8;
import defpackage.hv8;
import defpackage.lv8;
import defpackage.pv8;
import kotlin.time.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.MapEntrySerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.TripleSerializer;
import kotlinx.serialization.internal.a;
import kotlinx.serialization.internal.c;
import kotlinx.serialization.internal.d;
import kotlinx.serialization.internal.e;
import kotlinx.serialization.internal.f;
import kotlinx.serialization.internal.g;
import kotlinx.serialization.internal.h;
import kotlinx.serialization.internal.i;
import kotlinx.serialization.internal.j;
import kotlinx.serialization.internal.k;
import kotlinx.serialization.internal.l;

/* loaded from: classes5.dex */
public abstract class he0 {
    public static final KSerializer A(om3 om3Var) {
        zq3.h(om3Var, "<this>");
        return en3.a;
    }

    public static final KSerializer B(xa4 xa4Var) {
        zq3.h(xa4Var, "<this>");
        return ib4.a;
    }

    public static final KSerializer C(xq7 xq7Var) {
        zq3.h(xq7Var, "<this>");
        return zq7.a;
    }

    public static final KSerializer D(z38 z38Var) {
        zq3.h(z38Var, "<this>");
        return l48.a;
    }

    public static final KSerializer E(hv8.a aVar) {
        zq3.h(aVar, "<this>");
        return kv8.a;
    }

    public static final KSerializer F(lv8.a aVar) {
        zq3.h(aVar, "<this>");
        return ov8.a;
    }

    public static final KSerializer G(pv8.a aVar) {
        zq3.h(aVar, "<this>");
        return sv8.a;
    }

    public static final KSerializer H(aw8.a aVar) {
        zq3.h(aVar, "<this>");
        return dw8.a;
    }

    public static final KSerializer I(ww8 ww8Var) {
        zq3.h(ww8Var, "<this>");
        return ax8.b;
    }

    public static final KSerializer J(b.a aVar) {
        zq3.h(aVar, "<this>");
        return uw1.a;
    }

    public static final KSerializer a(vu3 vu3Var, KSerializer kSerializer) {
        zq3.h(vu3Var, "kClass");
        zq3.h(kSerializer, "elementSerializer");
        return new vt6(vu3Var, kSerializer);
    }

    public static final KSerializer b() {
        return a.c;
    }

    public static final KSerializer c() {
        return kotlinx.serialization.internal.b.c;
    }

    public static final KSerializer d() {
        return c.c;
    }

    public static final KSerializer e() {
        return d.c;
    }

    public static final KSerializer f() {
        return e.c;
    }

    public static final KSerializer g() {
        return f.c;
    }

    public static final KSerializer h(KSerializer kSerializer) {
        zq3.h(kSerializer, "elementSerializer");
        return new qo(kSerializer);
    }

    public static final KSerializer i() {
        return g.c;
    }

    public static final KSerializer j(KSerializer kSerializer, KSerializer kSerializer2) {
        zq3.h(kSerializer, "keySerializer");
        zq3.h(kSerializer2, "valueSerializer");
        return new MapEntrySerializer(kSerializer, kSerializer2);
    }

    public static final KSerializer k(KSerializer kSerializer, KSerializer kSerializer2) {
        zq3.h(kSerializer, "keySerializer");
        zq3.h(kSerializer2, "valueSerializer");
        return new i54(kSerializer, kSerializer2);
    }

    public static final KSerializer l() {
        return e95.a;
    }

    public static final KSerializer m(KSerializer kSerializer, KSerializer kSerializer2) {
        zq3.h(kSerializer, "keySerializer");
        zq3.h(kSerializer2, "valueSerializer");
        return new PairSerializer(kSerializer, kSerializer2);
    }

    public static final KSerializer n(KSerializer kSerializer) {
        zq3.h(kSerializer, "elementSerializer");
        return new k54(kSerializer);
    }

    public static final KSerializer o() {
        return h.c;
    }

    public static final KSerializer p(KSerializer kSerializer, KSerializer kSerializer2, KSerializer kSerializer3) {
        zq3.h(kSerializer, "aSerializer");
        zq3.h(kSerializer2, "bSerializer");
        zq3.h(kSerializer3, "cSerializer");
        return new TripleSerializer(kSerializer, kSerializer2, kSerializer3);
    }

    public static final KSerializer q() {
        return i.c;
    }

    public static final KSerializer r() {
        return j.c;
    }

    public static final KSerializer s() {
        return k.c;
    }

    public static final KSerializer t() {
        return l.c;
    }

    public static final KSerializer u(KSerializer kSerializer) {
        zq3.h(kSerializer, "<this>");
        return kSerializer.getDescriptor().b() ? kSerializer : new za5(kSerializer);
    }

    public static final KSerializer v(ua0 ua0Var) {
        zq3.h(ua0Var, "<this>");
        return za0.a;
    }

    public static final KSerializer w(mf0 mf0Var) {
        zq3.h(mf0Var, "<this>");
        return rf0.a;
    }

    public static final KSerializer x(nj0 nj0Var) {
        zq3.h(nj0Var, "<this>");
        return vj0.a;
    }

    public static final KSerializer y(pt1 pt1Var) {
        zq3.h(pt1Var, "<this>");
        return xt1.a;
    }

    public static final KSerializer z(wk2 wk2Var) {
        zq3.h(wk2Var, "<this>");
        return bl2.a;
    }
}
