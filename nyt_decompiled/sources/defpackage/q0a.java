package defpackage;

import com.chartbeat.androidsdk.QueryKeys;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class q0a implements caa {
    private final Double a;

    public q0a(Double d) {
        if (d == null) {
            this.a = Double.valueOf(Double.NaN);
        } else {
            this.a = d;
        }
    }

    @Override // defpackage.caa
    public final caa a(String str, xhe xheVar, List list) {
        if ("toString".equals(str)) {
            return new eda(zzi());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", zzi(), str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q0a) {
            return this.a.equals(((q0a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zzi();
    }

    @Override // defpackage.caa
    public final caa zzd() {
        return new q0a(this.a);
    }

    @Override // defpackage.caa
    public final Boolean zzg() {
        boolean z = false;
        if (!Double.isNaN(this.a.doubleValue()) && this.a.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.caa
    public final Double zzh() {
        return this.a;
    }

    @Override // defpackage.caa
    public final String zzi() {
        if (Double.isNaN(this.a.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.a.doubleValue())) {
            return this.a.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.a.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((stripTrailingZeros.scale() > 0 ? stripTrailingZeros.precision() : stripTrailingZeros.scale()) - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf(QueryKeys.ENGAGED_SECONDS);
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace(QueryKeys.ENGAGED_SECONDS, "e+") : stripTrailingZeros.toPlainString();
    }

    @Override // defpackage.caa
    public final Iterator zzl() {
        return null;
    }
}
