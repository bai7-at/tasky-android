package defpackage;

import java.io.Closeable;

/* loaded from: classes2.dex */
public interface lu3 extends Closeable {
    lu3 A(ay8 ay8Var);

    lu3 D(int i);

    lu3 beginArray();

    lu3 beginObject();

    lu3 endArray();

    lu3 endObject();

    String getPath();

    lu3 name(String str);

    lu3 p1();

    lu3 value(double d);

    lu3 value(long j);

    lu3 value(String str);

    lu3 value(boolean z);

    lu3 z0(zt3 zt3Var);
}
