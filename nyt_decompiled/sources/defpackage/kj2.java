package defpackage;

/* loaded from: classes3.dex */
public class kj2 implements jj2 {
    private final String a;
    private final int b;

    kj2(String str, int i) {
        this.a = str;
        this.b = i;
    }

    private String d() {
        return asString().trim();
    }

    private void e() {
        if (this.a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    @Override // defpackage.jj2
    public int a() {
        return this.b;
    }

    @Override // defpackage.jj2
    public String asString() {
        if (this.b == 0) {
            return "";
        }
        e();
        return this.a;
    }

    @Override // defpackage.jj2
    public long b() {
        if (this.b == 0) {
            return 0L;
        }
        String d = d();
        try {
            return Long.valueOf(d).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", d, "long"), e);
        }
    }

    @Override // defpackage.jj2
    public boolean c() {
        if (this.b == 0) {
            return false;
        }
        String d = d();
        if (au0.f.matcher(d).matches()) {
            return true;
        }
        if (au0.g.matcher(d).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", d, "boolean"));
    }
}
