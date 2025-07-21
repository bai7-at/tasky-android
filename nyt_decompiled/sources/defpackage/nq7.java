package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.crypto.tink.proto.a;
import com.google.crypto.tink.shaded.protobuf.m;
import java.io.CharConversionException;
import java.io.FileNotFoundException;

/* loaded from: classes3.dex */
public final class nq7 implements ax3 {
    private final SharedPreferences a;
    private final String b;

    public nq7(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.a = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        } else {
            this.a = applicationContext.getSharedPreferences(str2, 0);
        }
    }

    private byte[] b() {
        try {
            String string = this.a.getString(this.b, null);
            if (string != null) {
                return a83.a(string);
            }
            throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", this.b));
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", this.b));
        }
    }

    @Override // defpackage.ax3
    public i12 a() {
        return i12.P(b(), m.b());
    }

    @Override // defpackage.ax3
    public a read() {
        return a.U(b(), m.b());
    }
}
