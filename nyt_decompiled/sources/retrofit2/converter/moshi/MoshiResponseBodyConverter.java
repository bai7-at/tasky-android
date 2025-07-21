package retrofit2.converter.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import defpackage.sd0;
import java.io.IOException;
import okhttp3.ResponseBody;
import okio.ByteString;
import retrofit2.Converter;

/* loaded from: classes5.dex */
final class MoshiResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private static final ByteString UTF8_BOM = ByteString.c("EFBBBF");
    private final JsonAdapter<T> adapter;

    MoshiResponseBodyConverter(JsonAdapter<T> jsonAdapter) {
        this.adapter = jsonAdapter;
    }

    @Override // retrofit2.Converter
    public T convert(ResponseBody responseBody) throws IOException {
        sd0 source = responseBody.source();
        try {
            if (source.W(0L, UTF8_BOM)) {
                source.skip(r1.E());
            }
            JsonReader m = JsonReader.m(source);
            T t = (T) this.adapter.fromJson(m);
            if (m.r() != JsonReader.Token.END_DOCUMENT) {
                throw new JsonDataException("JSON document was not fully consumed.");
            }
            responseBody.close();
            return t;
        } catch (Throwable th) {
            responseBody.close();
            throw th;
        }
    }
}
