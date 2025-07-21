package defpackage;

import android.util.Base64OutputStream;
import com.amazonaws.event.ProgressEvent;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
final class fka {
    ByteArrayOutputStream a = new ByteArrayOutputStream(ProgressEvent.PART_FAILED_EVENT_CODE);
    Base64OutputStream b = new Base64OutputStream(this.a, 10);

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        try {
            this.b.close();
        } catch (IOException e) {
            fgb.e("HashManager: Unable to convert to Base64.", e);
        }
        try {
            try {
                this.a.close();
                str = this.a.toString();
            } catch (IOException e2) {
                fgb.e("HashManager: Unable to convert to Base64.", e2);
                str = "";
            }
            return str;
        } finally {
            this.a = null;
            this.b = null;
        }
    }
}
