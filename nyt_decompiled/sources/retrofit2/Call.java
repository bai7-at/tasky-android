package retrofit2;

import defpackage.pm8;
import java.io.IOException;
import okhttp3.Request;

/* loaded from: classes5.dex */
public interface Call<T> extends Cloneable {
    void cancel();

    /* renamed from: clone */
    Call<T> mo777clone();

    void enqueue(Callback<T> callback);

    Response<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    pm8 timeout();
}
