package defpackage;

import android.os.IBinder;

/* loaded from: classes3.dex */
final class fee extends afe {
    private final IBinder a;
    private final String b;
    private final int c;
    private final float d;
    private final int e;
    private final String f;

    /* synthetic */ fee(IBinder iBinder, boolean z, String str, int i, float f, int i2, String str2, int i3, String str3, String str4, String str5, eee eeeVar) {
        this.a = iBinder;
        this.b = str;
        this.c = i;
        this.d = f;
        this.e = i3;
        this.f = str4;
    }

    @Override // defpackage.afe
    public final float a() {
        return this.d;
    }

    @Override // defpackage.afe
    public final int b() {
        return 0;
    }

    @Override // defpackage.afe
    public final int c() {
        return this.c;
    }

    @Override // defpackage.afe
    public final int d() {
        return this.e;
    }

    @Override // defpackage.afe
    public final IBinder e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afe) {
            afe afeVar = (afe) obj;
            if (this.a.equals(afeVar.e())) {
                afeVar.k();
                String str = this.b;
                if (str != null ? str.equals(afeVar.g()) : afeVar.g() == null) {
                    if (this.c == afeVar.c() && Float.floatToIntBits(this.d) == Float.floatToIntBits(afeVar.a())) {
                        afeVar.b();
                        afeVar.i();
                        if (this.e == afeVar.d()) {
                            afeVar.h();
                            String str2 = this.f;
                            if (str2 != null ? str2.equals(afeVar.f()) : afeVar.f() == null) {
                                afeVar.j();
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.afe
    public final String f() {
        return this.f;
    }

    @Override // defpackage.afe
    public final String g() {
        return this.b;
    }

    @Override // defpackage.afe
    public final String h() {
        return null;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int hashCode2 = (((((((hashCode * 1000003) ^ 1237) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c) * 1000003) ^ Float.floatToIntBits(this.d);
        int i = this.e;
        String str2 = this.f;
        return ((((hashCode2 * 583896283) ^ i) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    @Override // defpackage.afe
    public final String i() {
        return null;
    }

    @Override // defpackage.afe
    public final String j() {
        return null;
    }

    @Override // defpackage.afe
    public final boolean k() {
        return false;
    }

    public final String toString() {
        return "OverlayDisplayShowRequest{windowToken=" + this.a.toString() + ", stableSessionToken=false, appId=" + this.b + ", layoutGravity=" + this.c + ", layoutVerticalMargin=" + this.d + ", displayMode=0, sessionToken=null, windowWidthPx=" + this.e + ", deeplinkUrl=null, adFieldEnifd=" + this.f + ", thirdPartyAuthCallerId=null}";
    }
}
