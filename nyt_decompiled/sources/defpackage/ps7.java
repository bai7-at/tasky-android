package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ps7 implements vc8 {
    public static final a c = new a(null);
    private final String a;
    private final Object[] b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(uc8 uc8Var, int i, Object obj) {
            if (obj == null) {
                uc8Var.c1(i);
                return;
            }
            if (obj instanceof byte[]) {
                uc8Var.Q0(i, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                uc8Var.H(i, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Double) {
                uc8Var.H(i, ((Number) obj).doubleValue());
                return;
            }
            if (obj instanceof Long) {
                uc8Var.L0(i, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Integer) {
                uc8Var.L0(i, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                uc8Var.L0(i, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Byte) {
                uc8Var.L0(i, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof String) {
                uc8Var.v0(i, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                uc8Var.L0(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        public final void b(uc8 uc8Var, Object[] objArr) {
            zq3.h(uc8Var, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                a(uc8Var, i, obj);
            }
        }

        private a() {
        }
    }

    public ps7(String str, Object[] objArr) {
        zq3.h(str, "query");
        this.a = str;
        this.b = objArr;
    }

    @Override // defpackage.vc8
    public String a() {
        return this.a;
    }

    @Override // defpackage.vc8
    public void b(uc8 uc8Var) {
        zq3.h(uc8Var, "statement");
        c.b(uc8Var, this.b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ps7(String str) {
        this(str, null);
        zq3.h(str, "query");
    }
}
