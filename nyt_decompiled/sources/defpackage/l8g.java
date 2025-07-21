package defpackage;

import com.google.android.gms.internal.pal.zzzj;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public final class l8g extends t7g {
    private final Object a;

    public l8g(Boolean bool) {
        this.a = bool;
    }

    private static boolean k(l8g l8gVar) {
        Object obj = l8gVar.a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // defpackage.t7g
    public final int a() {
        return this.a instanceof Number ? f().intValue() : Integer.parseInt(c());
    }

    @Override // defpackage.t7g
    public final String c() {
        Object obj = this.a;
        return !(obj instanceof Number) ? obj instanceof Boolean ? ((Boolean) obj).toString() : (String) obj : f().toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l8g.class != obj.getClass()) {
            return false;
        }
        l8g l8gVar = (l8g) obj;
        if (k(this) && k(l8gVar)) {
            return f().longValue() == l8gVar.f().longValue();
        }
        Object obj2 = this.a;
        if (!(obj2 instanceof Number) || !(l8gVar.a instanceof Number)) {
            return obj2.equals(l8gVar.a);
        }
        double doubleValue = f().doubleValue();
        double doubleValue2 = l8gVar.f().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public final Number f() {
        Object obj = this.a;
        return obj instanceof String ? new zzzj((String) obj) : (Number) obj;
    }

    public final boolean g() {
        return this.a instanceof Boolean;
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (k(this)) {
            doubleToLongBits = f().longValue();
        } else {
            Object obj = this.a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(f().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public final boolean j() {
        return this.a instanceof Number;
    }

    public final boolean zzc() {
        Object obj = this.a;
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(c());
    }

    public l8g(Number number) {
        this.a = number;
    }

    public l8g(String str) {
        str.getClass();
        this.a = str;
    }
}
