package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzacx implements Closeable, Flushable {
    private static final Pattern zza = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] zzb = new String[128];
    private static final String[] zzc;
    private final Writer zzd;
    private int[] zze = new int[32];
    private int zzf = 0;
    private String zzg;
    private boolean zzh;
    private boolean zzi;
    private String zzj;
    private boolean zzk;

    static {
        for (int i = 0; i <= 31; i++) {
            zzb[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = zzb;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        zzc = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public zzacx(Writer writer) {
        zzx(6);
        this.zzg = ":";
        this.zzk = true;
        this.zzd = writer;
    }

    private final void zzA() throws IOException {
        if (this.zzj != null) {
            int zzt = zzt();
            if (zzt == 5) {
                this.zzd.write(44);
            } else if (zzt != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            zzy(4);
            zzz(this.zzj);
            this.zzj = null;
        }
    }

    private final int zzt() {
        int i = this.zzf;
        if (i != 0) {
            return this.zze[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final zzacx zzu(int i, int i2, char c) throws IOException {
        int zzt = zzt();
        if (zzt != i2 && zzt != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.zzj;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.zzf--;
        this.zzd.write(c);
        return this;
    }

    private final zzacx zzv(int i, char c) throws IOException {
        zzw();
        zzx(i);
        this.zzd.write(c);
        return this;
    }

    private final void zzw() throws IOException {
        int zzt = zzt();
        if (zzt == 1) {
            zzy(2);
            return;
        }
        if (zzt == 2) {
            this.zzd.append(',');
            return;
        }
        if (zzt == 4) {
            this.zzd.append((CharSequence) this.zzg);
            zzy(5);
            return;
        }
        if (zzt != 6) {
            if (zzt != 7) {
                throw new IllegalStateException("Nesting problem.");
            }
            if (!this.zzh) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        }
        zzy(7);
    }

    private final void zzx(int i) {
        int i2 = this.zzf;
        int[] iArr = this.zze;
        if (i2 == iArr.length) {
            this.zze = Arrays.copyOf(iArr, i2 + i2);
        }
        int[] iArr2 = this.zze;
        int i3 = this.zzf;
        this.zzf = i3 + 1;
        iArr2[i3] = i;
    }

    private final void zzy(int i) {
        this.zze[this.zzf - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzz(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.zzi
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.google.ads.interactivemedia.v3.internal.zzacx.zzc
            goto L9
        L7:
            java.lang.String[] r0 = com.google.ads.interactivemedia.v3.internal.zzacx.zzb
        L9:
            java.io.Writer r1 = r8.zzd
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 == 0) goto L42
            goto L32
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.zzd
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.zzd
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.zzd
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r8 = r8.zzd
            r8.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzacx.zzz(java.lang.String):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zzd.close();
        int i = this.zzf;
        if (i > 1 || (i == 1 && this.zze[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.zzf = 0;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.zzf == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.zzd.flush();
    }

    public final zzacx zza() throws IOException {
        zzA();
        zzv(1, '[');
        return this;
    }

    public final zzacx zzb() throws IOException {
        zzA();
        zzv(3, '{');
        return this;
    }

    public final zzacx zzc() throws IOException {
        zzu(1, 2, ']');
        return this;
    }

    public final zzacx zzd() throws IOException {
        zzu(3, 5, '}');
        return this;
    }

    public final zzacx zze(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.zzj != null) {
            throw new IllegalStateException();
        }
        if (this.zzf == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.zzj = str;
        return this;
    }

    public final zzacx zzf() throws IOException {
        if (this.zzj != null) {
            if (!this.zzk) {
                this.zzj = null;
                return this;
            }
            zzA();
        }
        zzw();
        this.zzd.write(Constants.NULL_VERSION_ID);
        return this;
    }

    public final zzacx zzg(double d) throws IOException {
        zzA();
        if (this.zzh || !(Double.isNaN(d) || Double.isInfinite(d))) {
            zzw();
            this.zzd.append((CharSequence) Double.toString(d));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
    }

    public final zzacx zzh(long j) throws IOException {
        zzA();
        zzw();
        this.zzd.write(Long.toString(j));
        return this;
    }

    public final zzacx zzi(Boolean bool) throws IOException {
        if (bool == null) {
            zzf();
            return this;
        }
        zzA();
        zzw();
        this.zzd.write(true != bool.booleanValue() ? "false" : "true");
        return this;
    }

    public final zzacx zzj(Number number) throws IOException {
        if (number == null) {
            zzf();
            return this;
        }
        zzA();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !zza.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + String.valueOf(cls) + " is not a valid JSON number: " + obj);
            }
        } else if (!this.zzh) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        zzw();
        this.zzd.append((CharSequence) obj);
        return this;
    }

    public final zzacx zzk(String str) throws IOException {
        if (str == null) {
            zzf();
            return this;
        }
        zzA();
        zzw();
        zzz(str);
        return this;
    }

    public final zzacx zzl(boolean z) throws IOException {
        zzA();
        zzw();
        this.zzd.write(true != z ? "false" : "true");
        return this;
    }

    public final void zzm(zzwg zzwgVar) {
        this.zzg = ":";
    }

    public final void zzn(boolean z) {
        this.zzi = z;
    }

    public final void zzo(boolean z) {
        this.zzh = z;
    }

    public final void zzp(boolean z) {
        this.zzk = z;
    }

    public final boolean zzq() {
        return this.zzk;
    }

    public final boolean zzr() {
        return this.zzi;
    }

    public final boolean zzs() {
        return this.zzh;
    }
}
