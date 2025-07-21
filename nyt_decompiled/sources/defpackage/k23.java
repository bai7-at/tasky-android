package defpackage;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.GraphRequest;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public class k23 extends AsyncTask {
    public static final a d = new a(null);
    private static final String e = k23.class.getCanonicalName();
    private final HttpURLConnection a;
    private final l23 b;
    private Exception c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public k23(HttpURLConnection httpURLConnection, l23 l23Var) {
        zq3.h(l23Var, "requests");
        this.a = httpURLConnection;
        this.b = l23Var;
    }

    public List a(Void... voidArr) {
        if (c11.d(this)) {
            return null;
        }
        try {
            zq3.h(voidArr, "params");
            try {
                HttpURLConnection httpURLConnection = this.a;
                return httpURLConnection == null ? this.b.g() : GraphRequest.n.o(httpURLConnection, this.b);
            } catch (Exception e2) {
                this.c = e2;
                return null;
            }
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    protected void b(List list) {
        if (c11.d(this)) {
            return;
        }
        try {
            zq3.h(list, "result");
            super.onPostExecute(list);
            Exception exc = this.c;
            if (exc != null) {
                g29 g29Var = g29.a;
                String str = e;
                z38 z38Var = z38.a;
                String format = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                zq3.g(format, "java.lang.String.format(format, *args)");
                g29.f0(str, format);
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (c11.d(this)) {
            return null;
        }
        try {
            return a((Void[]) objArr);
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
            b((List) obj);
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        if (c11.d(this)) {
            return;
        }
        try {
            super.onPreExecute();
            if (w92.C()) {
                g29 g29Var = g29.a;
                String str = e;
                z38 z38Var = z38.a;
                String format = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
                zq3.g(format, "java.lang.String.format(format, *args)");
                g29.f0(str, format);
            }
            if (this.b.q() == null) {
                this.b.E(Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper()));
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    public String toString() {
        String str = "{RequestAsyncTask:  connection: " + this.a + ", requests: " + this.b + "}";
        zq3.g(str, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k23(l23 l23Var) {
        this(null, l23Var);
        zq3.h(l23Var, "requests");
    }
}
