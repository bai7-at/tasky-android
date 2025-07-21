package defpackage;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;

/* loaded from: classes2.dex */
public final class de2 extends AsyncTask {
    private final String a;
    private final File b;
    private final a c;

    public interface a {
        void a(File file);
    }

    public de2(String str, File file, a aVar) {
        zq3.h(str, "uriStr");
        zq3.h(file, "destFile");
        zq3.h(aVar, "onSuccess");
        this.a = str;
        this.b = file;
        this.c = aVar;
    }

    public Boolean a(String... strArr) {
        if (c11.d(this)) {
            return null;
        }
        try {
            zq3.h(strArr, "args");
            try {
                URL url = new URL(this.a);
                int contentLength = url.openConnection().getContentLength();
                DataInputStream dataInputStream = new DataInputStream(url.openStream());
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.b));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    protected void b(boolean z) {
        if (!c11.d(this) && z) {
            try {
                this.c.a(this.b);
            } catch (Throwable th) {
                c11.b(th, this);
            }
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (c11.d(this)) {
            return null;
        }
        try {
            return a((String[]) objArr);
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (c11.d(this)) {
            return;
        }
        try {
            b(((Boolean) obj).booleanValue());
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }
}
