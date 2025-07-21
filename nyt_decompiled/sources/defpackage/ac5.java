package defpackage;

import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class ac5 implements ov3 {
    private final Object b;

    public ac5(Object obj) {
        this.b = z06.d(obj);
    }

    @Override // defpackage.ov3
    public void b(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(ov3.a));
    }

    @Override // defpackage.ov3
    public boolean equals(Object obj) {
        if (obj instanceof ac5) {
            return this.b.equals(((ac5) obj).b);
        }
        return false;
    }

    @Override // defpackage.ov3
    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.b + '}';
    }
}
