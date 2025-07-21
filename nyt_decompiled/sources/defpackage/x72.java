package defpackage;

import java.math.BigInteger;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class x72 extends uf8 {
    private final BigInteger c;
    private final BigInteger d;
    private final int e;
    private final Map f;
    private final AtomicBoolean g;

    public x72(BigInteger bigInteger, BigInteger bigInteger2, int i, String str, Map map, Map map2) {
        super(str, map2);
        this.g = new AtomicBoolean(false);
        this.c = bigInteger;
        this.d = bigInteger2;
        this.e = i;
        this.f = map;
    }

    public Map d() {
        return this.f;
    }

    public int e() {
        return this.e;
    }

    public BigInteger f() {
        return this.d;
    }

    public BigInteger g() {
        return this.c;
    }

    public void h() {
        this.g.set(true);
    }
}
