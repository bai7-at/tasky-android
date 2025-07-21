package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.xwords.hybrid.rest.Page;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.ResponseBody;
import org.jsoup.nodes.Document;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public final class bn5 implements Converter {
    public static final b a = new b(null);
    private static final Converter.Factory b = new a();

    public static final class a extends Converter.Factory {
        a() {
        }

        @Override // retrofit2.Converter.Factory
        public Converter responseBodyConverter(Type type2, Annotation[] annotationArr, Retrofit retrofit) {
            zq3.h(type2, TransferTable.COLUMN_TYPE);
            if (type2 == Page.class) {
                return new bn5();
            }
            return null;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Converter.Factory a() {
            return bn5.b;
        }

        private b() {
        }
    }

    @Override // retrofit2.Converter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Page convert(ResponseBody responseBody) {
        zq3.h(responseBody, "responseBody");
        Document a2 = mu3.a(responseBody.string());
        zq3.g(a2, "parse(...)");
        String o0 = a2.o0();
        zq3.g(o0, "html(...)");
        return new Page(o0);
    }
}
