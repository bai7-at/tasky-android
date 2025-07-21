package com.google.android.gms.measurement.internal;

import com.amazonaws.services.s3.internal.Constants;
import defpackage.kmf;

/* loaded from: classes3.dex */
final class ia extends ha {
    private final com.google.android.gms.internal.measurement.l g;
    final /* synthetic */ b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ia(b bVar, String str, int i, com.google.android.gms.internal.measurement.l lVar) {
        super(str, i);
        this.h = bVar;
        this.g = lVar;
    }

    @Override // com.google.android.gms.measurement.internal.ha
    final int a() {
        return this.g.r();
    }

    @Override // com.google.android.gms.measurement.internal.ha
    final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.ha
    final boolean c() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean k(Long l, Long l2, com.google.android.gms.internal.measurement.c1 c1Var, boolean z) {
        kmf.b();
        boolean A = this.h.a.y().A(this.a, m3.X);
        boolean x = this.g.x();
        boolean y = this.g.y();
        boolean z2 = this.g.z();
        Object[] objArr = x || y || z2;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z && objArr != true) {
            this.h.a.o().u().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.b), this.g.A() ? Integer.valueOf(this.g.r()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.g s = this.g.s();
        boolean x2 = s.x();
        if (c1Var.H()) {
            if (s.z()) {
                bool = ha.j(ha.h(c1Var.s(), s.t()), x2);
            } else {
                this.h.a.o().v().b("No number filter for long property. property", this.h.a.C().f(c1Var.w()));
            }
        } else if (c1Var.G()) {
            if (s.z()) {
                bool = ha.j(ha.g(c1Var.r(), s.t()), x2);
            } else {
                this.h.a.o().v().b("No number filter for double property. property", this.h.a.C().f(c1Var.w()));
            }
        } else if (!c1Var.J()) {
            this.h.a.o().v().b("User property has no value, property", this.h.a.C().f(c1Var.w()));
        } else if (s.B()) {
            bool = ha.j(ha.f(c1Var.x(), s.u(), this.h.a.o()), x2);
        } else if (!s.z()) {
            this.h.a.o().v().b("No string or number filter defined. property", this.h.a.C().f(c1Var.w()));
        } else if (t9.M(c1Var.x())) {
            bool = ha.j(ha.i(c1Var.x(), s.t()), x2);
        } else {
            this.h.a.o().v().c("Invalid user property value for Numeric number filter. property, value", this.h.a.C().f(c1Var.w()), c1Var.x());
        }
        this.h.a.o().u().b("Property filter result", bool == null ? Constants.NULL_VERSION_ID : bool);
        if (bool == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (z2 && !bool.booleanValue()) {
            return true;
        }
        if (!z || this.g.x()) {
            this.d = bool;
        }
        if (bool.booleanValue() && objArr != false && c1Var.I()) {
            long t = c1Var.t();
            if (l != null) {
                t = l.longValue();
            }
            if (A && this.g.x() && !this.g.y() && l2 != null) {
                t = l2.longValue();
            }
            if (this.g.y()) {
                this.f = Long.valueOf(t);
            } else {
                this.e = Long.valueOf(t);
            }
        }
        return true;
    }
}
