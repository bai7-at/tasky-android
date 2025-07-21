package defpackage;

/* loaded from: classes3.dex */
final class xae extends uae {
    private String a;
    private boolean b;
    private boolean c;
    private byte d;

    xae() {
    }

    @Override // defpackage.uae
    public final uae a(String str) {
        if (str == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.a = str;
        return this;
    }

    @Override // defpackage.uae
    public final uae b(boolean z) {
        this.c = true;
        this.d = (byte) (this.d | 2);
        return this;
    }

    @Override // defpackage.uae
    public final uae c(boolean z) {
        this.b = z;
        this.d = (byte) (this.d | 1);
        return this;
    }

    @Override // defpackage.uae
    public final vae d() {
        String str;
        if (this.d == 3 && (str = this.a) != null) {
            return new zae(str, this.b, this.c, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" clientVersion");
        }
        if ((this.d & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.d & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
