package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* loaded from: classes.dex */
public class b {
    public static final Object i = new Object();
    public static final Object j = new Object();
    public static final Object k = new Object();
    public static final Object l = new Object();
    public static final Object m = new Object();
    public static final Object n = new Object();
    Object g;
    private final int a = -2;
    int b = 0;
    int c = Integer.MAX_VALUE;
    float d = 1.0f;
    int e = 0;
    String f = null;
    boolean h = false;

    private b(Object obj) {
        this.g = obj;
    }

    public static b a(int i2) {
        b bVar = new b(i);
        bVar.e(i2);
        return bVar;
    }

    public static b b(Object obj) {
        b bVar = new b(i);
        bVar.f(obj);
        return bVar;
    }

    public static b c() {
        return new b(j);
    }

    public void d(State state, ConstraintWidget constraintWidget, int i2) {
        String str = this.f;
        if (str != null) {
            constraintWidget.F0(str);
        }
        int i3 = 2;
        if (i2 == 0) {
            if (this.h) {
                constraintWidget.R0(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                Object obj = this.g;
                if (obj == j) {
                    i3 = 1;
                } else if (obj != m) {
                    i3 = 0;
                }
                constraintWidget.S0(i3, this.b, this.c, this.d);
                return;
            }
            int i4 = this.b;
            if (i4 > 0) {
                constraintWidget.c1(i4);
            }
            int i5 = this.c;
            if (i5 < Integer.MAX_VALUE) {
                constraintWidget.Z0(i5);
            }
            Object obj2 = this.g;
            if (obj2 == j) {
                constraintWidget.R0(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                return;
            }
            if (obj2 == l) {
                constraintWidget.R0(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                return;
            } else {
                if (obj2 == null) {
                    constraintWidget.R0(ConstraintWidget.DimensionBehaviour.FIXED);
                    constraintWidget.m1(this.e);
                    return;
                }
                return;
            }
        }
        if (this.h) {
            constraintWidget.i1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            Object obj3 = this.g;
            if (obj3 == j) {
                i3 = 1;
            } else if (obj3 != m) {
                i3 = 0;
            }
            constraintWidget.j1(i3, this.b, this.c, this.d);
            return;
        }
        int i6 = this.b;
        if (i6 > 0) {
            constraintWidget.b1(i6);
        }
        int i7 = this.c;
        if (i7 < Integer.MAX_VALUE) {
            constraintWidget.Y0(i7);
        }
        Object obj4 = this.g;
        if (obj4 == j) {
            constraintWidget.i1(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            return;
        }
        if (obj4 == l) {
            constraintWidget.i1(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
        } else if (obj4 == null) {
            constraintWidget.i1(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.N0(this.e);
        }
    }

    public b e(int i2) {
        this.g = null;
        this.e = i2;
        return this;
    }

    public b f(Object obj) {
        this.g = obj;
        if (obj instanceof Integer) {
            this.e = ((Integer) obj).intValue();
            this.g = null;
        }
        return this;
    }

    int g() {
        return this.e;
    }

    public b h(int i2) {
        if (i2 >= 0) {
            this.b = i2;
        }
        return this;
    }
}
