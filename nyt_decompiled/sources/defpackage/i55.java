package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.nytimes.android.logging.remote.stream.data.JsonObjectAdapter;
import com.nytimes.android.logging.remote.stream.networktracker.NetworkTrackerRemoteStreamMessage;
import com.nytimes.android.logging.remote.stream.networktracker.NetworkTrackerRemoteStreamMessageData;
import com.nytimes.android.logging.remote.stream.networktracker.NetworkTrackerRemoteStreamMessageKind;
import com.nytimes.android.logging.remote.stream.networktracker.NetworkTrackerRemoteStreamMessageResponse;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes4.dex */
public final class i55 {
    public static final a Companion = new a(null);
    public static final int f = 8;
    private final String a;
    private final String b;
    private final String c;
    private final i d;
    private JsonAdapter e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public i55(String str, String str2, String str3) {
        zq3.h(str3, "sessionId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        i d = new i.b().b(new JsonObjectAdapter()).d();
        this.d = d;
        this.e = d.c(NetworkTrackerRemoteStreamMessage.class);
    }

    private final NetworkTrackerRemoteStreamMessage b(Request request, Response response) {
        Map i;
        ResponseBody peekBody;
        String string;
        Headers headers;
        String obj;
        String str = this.c;
        String str2 = this.a;
        String str3 = this.b;
        String url = request.url().url().toString();
        zq3.g(url, "toString(...)");
        String method = request.method();
        Object tag = request.tag();
        String obj2 = tag != null ? tag.toString() : null;
        RequestBody body = request.body();
        String str4 = (body == null || (obj = body.toString()) == null) ? "" : obj;
        Map t = t.t(request.headers());
        if (response == null || (headers = response.headers()) == null || (i = t.t(headers)) == null) {
            i = t.i();
        }
        return new NetworkTrackerRemoteStreamMessage(str, str2, null, str3, new NetworkTrackerRemoteStreamMessageKind(new NetworkTrackerRemoteStreamMessageData(url, method, obj2, str4, t, new NetworkTrackerRemoteStreamMessageResponse(i, (response == null || (peekBody = response.peekBody(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) == null || (string = peekBody.string()) == null) ? "" : string, response != null ? Integer.valueOf(response.code()) : null, response != null ? response.message() : null)), null, 2, null), null, 36, null);
    }

    public final String a(Request request, Response response) {
        zq3.h(request, "request");
        return this.e.toJson(b(request, response));
    }
}
