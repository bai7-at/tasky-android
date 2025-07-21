package defpackage;

import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes.dex */
public class qa7 {
    private float a;
    private float b;

    public qa7(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public boolean a(float f, float f2) {
        return this.a == f && this.b == f2;
    }

    public float b() {
        return this.a;
    }

    public float c() {
        return this.b;
    }

    public void d(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public String toString() {
        return b() + QueryKeys.SCROLL_POSITION_TOP + c();
    }

    public qa7() {
        this(1.0f, 1.0f);
    }
}
