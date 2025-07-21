package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class sw8 {
    private String a;
    private List b;
    private String c;
    private r15 d;
    private String e;
    private String f;
    private Double g;
    private String h;
    private String i;
    private a79 j;
    private boolean k;
    private View l;
    private View m;
    private Object n;
    private Bundle o = new Bundle();
    private boolean p;
    private boolean q;
    private float r;

    public final void A(boolean z) {
        this.p = z;
    }

    public final void B(String str) {
        this.i = str;
    }

    public final void C(Double d) {
        this.g = d;
    }

    public final void D(String str) {
        this.h = str;
    }

    public abstract void E(View view, Map map, Map map2);

    public void F(View view) {
    }

    public final View G() {
        return this.m;
    }

    public final a79 H() {
        return this.j;
    }

    public final Object I() {
        return this.n;
    }

    public final void J(Object obj) {
        this.n = obj;
    }

    public final void K(a79 a79Var) {
        this.j = a79Var;
    }

    public View a() {
        return this.l;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.e;
    }

    public float e() {
        return 0.0f;
    }

    public float f() {
        return 0.0f;
    }

    public final Bundle g() {
        return this.o;
    }

    public final String h() {
        return this.a;
    }

    public final r15 i() {
        return this.d;
    }

    public final List j() {
        return this.b;
    }

    public float k() {
        return this.r;
    }

    public final boolean l() {
        return this.q;
    }

    public final boolean m() {
        return this.p;
    }

    public final String n() {
        return this.i;
    }

    public final Double o() {
        return this.g;
    }

    public final String p() {
        return this.h;
    }

    public void q(View view) {
    }

    public boolean r() {
        return this.k;
    }

    public void s() {
    }

    public final void t(String str) {
        this.f = str;
    }

    public final void u(String str) {
        this.c = str;
    }

    public final void v(String str) {
        this.e = str;
    }

    public final void w(String str) {
        this.a = str;
    }

    public final void x(r15 r15Var) {
        this.d = r15Var;
    }

    public final void y(List list) {
        this.b = list;
    }

    public final void z(boolean z) {
        this.q = z;
    }
}
