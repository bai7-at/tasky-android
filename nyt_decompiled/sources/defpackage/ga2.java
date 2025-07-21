package defpackage;

import java.util.Random;

/* loaded from: classes5.dex */
public final class ga2 extends s1 {
    private final a c = new a();

    public static final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // defpackage.s1
    public Random i() {
        Object obj = this.c.get();
        zq3.g(obj, "get(...)");
        return (Random) obj;
    }
}
