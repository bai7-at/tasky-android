package defpackage;

import com.google.android.gms.internal.ads.zzaft;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class yz9 {
    private final ByteArrayOutputStream a;
    private final DataOutputStream b;

    public yz9() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] a(zzaft zzaftVar) {
        this.a.reset();
        try {
            b(this.b, zzaftVar.zza);
            String str = zzaftVar.zzb;
            if (str == null) {
                str = "";
            }
            b(this.b, str);
            this.b.writeLong(zzaftVar.zzc);
            this.b.writeLong(zzaftVar.zzd);
            this.b.write(zzaftVar.zze);
            this.b.flush();
            return this.a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
