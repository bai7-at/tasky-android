package defpackage;

import com.google.android.datatransport.Priority;

/* loaded from: classes2.dex */
final class m10 extends b32 {
    private final Integer a;
    private final Object b;
    private final Priority c;

    m10(Integer num, Object obj, Priority priority) {
        this.a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.b = obj;
        if (priority == null) {
            throw new NullPointerException("Null priority");
        }
        this.c = priority;
    }

    @Override // defpackage.b32
    public Integer a() {
        return this.a;
    }

    @Override // defpackage.b32
    public Object b() {
        return this.b;
    }

    @Override // defpackage.b32
    public Priority c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b32)) {
            return false;
        }
        b32 b32Var = (b32) obj;
        Integer num = this.a;
        if (num != null ? num.equals(b32Var.a()) : b32Var.a() == null) {
            if (this.b.equals(b32Var.b()) && this.c.equals(b32Var.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.a;
        return this.c.hashCode() ^ (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + "}";
    }
}
