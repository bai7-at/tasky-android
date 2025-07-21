package defpackage;

import com.nytimes.android.designsystem.uicompose.ui.NytColor;

/* loaded from: classes4.dex */
public final class ts1 {
    public static final int c = 0;
    private final NytColor a;
    private final float b;

    public ts1(NytColor nytColor, float f) {
        zq3.h(nytColor, "color");
        this.a = nytColor;
        this.b = f;
    }

    public final NytColor a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    public final boolean c() {
        return this.b == 0.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts1)) {
            return false;
        }
        ts1 ts1Var = (ts1) obj;
        return this.a == ts1Var.a && Float.compare(this.b, ts1Var.b) == 0;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Float.hashCode(this.b);
    }

    public String toString() {
        return "DividerConfig(color=" + this.a + ", thickness=" + this.b + ")";
    }
}
