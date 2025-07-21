package defpackage;

import android.os.Bundle;
import androidx.loader.content.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class y64 {

    public interface a {
        void a(b bVar, Object obj);

        b b(int i, Bundle bundle);

        void c(b bVar);
    }

    public static y64 b(d44 d44Var) {
        return new z64(d44Var, ((sa9) d44Var).getViewModelStore());
    }

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract b c(int i, Bundle bundle, a aVar);

    public abstract void d();
}
