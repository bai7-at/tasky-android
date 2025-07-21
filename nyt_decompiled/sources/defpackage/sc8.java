package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes.dex */
public interface sc8 extends Closeable {
    wc8 A0(String str);

    void B(String str);

    Cursor O0(vc8 vc8Var, CancellationSignal cancellationSignal);

    int P0(String str, int i, ContentValues contentValues, String str2, Object[] objArr);

    void R();

    void S(String str, Object[] objArr);

    void T();

    Cursor T0(String str);

    void Z();

    boolean g1();

    String getPath();

    boolean isOpen();

    boolean o1();

    void t();

    Cursor v(vc8 vc8Var);

    List x();
}
