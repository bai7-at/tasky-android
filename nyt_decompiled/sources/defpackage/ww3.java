package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ww3 implements sw1 {
    private final b a;

    public static final class b extends xw3 {
        public b() {
            super(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a f(Object obj, int i) {
            a aVar = new a(obj, null, 2, 0 == true ? 1 : 0);
            c().m(i, aVar);
            return aVar;
        }
    }

    public ww3(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.sw1, defpackage.ci
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public q49 a(hu8 hu8Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ay4 c = this.a.c();
        int[] iArr = c.b;
        Object[] objArr = c.c;
        long[] jArr = c.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            linkedHashMap.put(Integer.valueOf(iArr[i4]), ((a) objArr[i4]).d(hu8Var.a()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return new q49(linkedHashMap, this.a.b(), this.a.a());
    }

    public static final class a extends tw3 {
        public /* synthetic */ a(Object obj, vx1 vx1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? xx1.d() : vx1Var);
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (zq3.c(aVar.b(), b()) && zq3.c(aVar.a(), a())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Object b = b();
            return ((b != null ? b.hashCode() : 0) * 31) + a().hashCode();
        }

        public a(Object obj, vx1 vx1Var) {
            super(obj, vx1Var, null);
        }
    }
}
