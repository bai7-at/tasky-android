package defpackage;

import android.os.IBinder;

/* loaded from: classes3.dex */
final class dee extends zee {
    private IBinder a;
    private String b;
    private int c;
    private float d;
    private int e;
    private String f;
    private byte g;

    dee() {
    }

    @Override // defpackage.zee
    public final zee a(String str) {
        this.f = str;
        return this;
    }

    @Override // defpackage.zee
    public final zee b(String str) {
        this.b = str;
        return this;
    }

    @Override // defpackage.zee
    public final zee c(int i) {
        this.g = (byte) (this.g | 8);
        return this;
    }

    @Override // defpackage.zee
    public final zee d(int i) {
        this.c = i;
        this.g = (byte) (this.g | 2);
        return this;
    }

    @Override // defpackage.zee
    public final zee e(float f) {
        this.d = f;
        this.g = (byte) (this.g | 4);
        return this;
    }

    @Override // defpackage.zee
    public final zee f(boolean z) {
        this.g = (byte) (this.g | 1);
        return this;
    }

    @Override // defpackage.zee
    public final zee g(IBinder iBinder) {
        if (iBinder == null) {
            throw new NullPointerException("Null windowToken");
        }
        this.a = iBinder;
        return this;
    }

    @Override // defpackage.zee
    public final zee h(int i) {
        this.e = i;
        this.g = (byte) (this.g | 16);
        return this;
    }

    @Override // defpackage.zee
    public final afe i() {
        IBinder iBinder;
        if (this.g == 31 && (iBinder = this.a) != null) {
            return new fee(iBinder, false, this.b, this.c, this.d, 0, null, this.e, null, this.f, null, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" windowToken");
        }
        if ((this.g & 1) == 0) {
            sb.append(" stableSessionToken");
        }
        if ((this.g & 2) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.g & 4) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.g & 8) == 0) {
            sb.append(" displayMode");
        }
        if ((this.g & 16) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
