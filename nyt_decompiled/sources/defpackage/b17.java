package defpackage;

import retrofit2.Response;

/* loaded from: classes4.dex */
public class b17 implements y22 {
    private Throwable a;
    private Response b;

    private b17(Throwable th) {
        this.a = th;
    }

    public static b17 b(Response response) {
        return new b17(response);
    }

    public static b17 c(Throwable th) {
        return new b17(th);
    }

    @Override // defpackage.y22
    public String a() {
        Throwable th = this.a;
        if (th != null) {
            return th.getMessage();
        }
        StringBuilder sb = new StringBuilder();
        Response response = this.b;
        if (response != null) {
            if (r48.b(response.message())) {
                sb.append(this.b.message());
            } else {
                sb.append(this.b.code());
            }
        }
        return sb.toString();
    }

    private b17(Response response) {
        this.b = response;
    }
}
