package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.crypto.tink.proto.a;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class oq7 implements bx3 {
    private final SharedPreferences.Editor a;
    private final String b;

    public oq7(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    @Override // defpackage.bx3
    public void a(a aVar) {
        if (!this.a.putString(this.b, a83.b(aVar.f())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // defpackage.bx3
    public void b(i12 i12Var) {
        if (!this.a.putString(this.b, a83.b(i12Var.f())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
