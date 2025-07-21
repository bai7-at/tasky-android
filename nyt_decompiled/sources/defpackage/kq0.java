package defpackage;

/* loaded from: classes.dex */
public abstract class kq0 {
    public static final jq0 a(double d) {
        return d < 0.0d ? new jq0(0.0d, Math.sqrt(Math.abs(d))) : new jq0(Math.sqrt(d), 0.0d);
    }
}
