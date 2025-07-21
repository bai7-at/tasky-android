package com.caverock.androidsvg;

/* loaded from: classes2.dex */
public class PreserveAspectRatio {
    public static final PreserveAspectRatio c = new PreserveAspectRatio(null, null);
    public static final PreserveAspectRatio d = new PreserveAspectRatio(Alignment.none, null);
    public static final PreserveAspectRatio e;
    public static final PreserveAspectRatio f;
    public static final PreserveAspectRatio g;
    public static final PreserveAspectRatio h;
    public static final PreserveAspectRatio i;
    public static final PreserveAspectRatio j;
    public static final PreserveAspectRatio k;
    private Alignment a;
    private Scale b;

    public enum Alignment {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    public enum Scale {
        meet,
        slice
    }

    static {
        Alignment alignment = Alignment.xMidYMid;
        Scale scale = Scale.meet;
        e = new PreserveAspectRatio(alignment, scale);
        Alignment alignment2 = Alignment.xMinYMin;
        f = new PreserveAspectRatio(alignment2, scale);
        g = new PreserveAspectRatio(Alignment.xMaxYMax, scale);
        h = new PreserveAspectRatio(Alignment.xMidYMin, scale);
        i = new PreserveAspectRatio(Alignment.xMidYMax, scale);
        Scale scale2 = Scale.slice;
        j = new PreserveAspectRatio(alignment, scale2);
        k = new PreserveAspectRatio(alignment2, scale2);
    }

    PreserveAspectRatio(Alignment alignment, Scale scale) {
        this.a = alignment;
        this.b = scale;
    }

    public Alignment a() {
        return this.a;
    }

    public Scale b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreserveAspectRatio preserveAspectRatio = (PreserveAspectRatio) obj;
        return this.a == preserveAspectRatio.a && this.b == preserveAspectRatio.b;
    }

    public String toString() {
        return this.a + " " + this.b;
    }
}
