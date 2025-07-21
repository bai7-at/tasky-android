package defpackage;

import com.amazonaws.util.DateUtils;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public final class kt3 implements c12 {
    private static final wb5 e = new wb5() { // from class: ht3
        @Override // defpackage.wb5
        public final void a(Object obj, Object obj2) {
            kt3.l(obj, (xb5) obj2);
        }
    };
    private static final s39 f = new s39() { // from class: it3
        @Override // defpackage.s39
        public final void a(Object obj, Object obj2) {
            ((t39) obj2).b((String) obj);
        }
    };
    private static final s39 g = new s39() { // from class: jt3
        @Override // defpackage.s39
        public final void a(Object obj, Object obj2) {
            kt3.n((Boolean) obj, (t39) obj2);
        }
    };
    private static final b h = new b(null);
    private final Map a = new HashMap();
    private final Map b = new HashMap();
    private wb5 c = e;
    private boolean d = false;

    class a implements i91 {
        a() {
        }

        @Override // defpackage.i91
        public void a(Object obj, Writer writer) {
            ju3 ju3Var = new ju3(writer, kt3.this.a, kt3.this.b, kt3.this.c, kt3.this.d);
            ju3Var.i(obj, false);
            ju3Var.r();
        }

        @Override // defpackage.i91
        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    private static final class b implements s39 {
        private static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtils.ISO8601_DATE_PATTERN, Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // defpackage.s39
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, t39 t39Var) {
            t39Var.b(a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public kt3() {
        p(String.class, f);
        p(Boolean.class, g);
        p(Date.class, h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Object obj, xb5 xb5Var) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Boolean bool, t39 t39Var) {
        t39Var.c(bool.booleanValue());
    }

    public i91 i() {
        return new a();
    }

    public kt3 j(ku0 ku0Var) {
        ku0Var.a(this);
        return this;
    }

    public kt3 k(boolean z) {
        this.d = z;
        return this;
    }

    @Override // defpackage.c12
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public kt3 a(Class cls, wb5 wb5Var) {
        this.a.put(cls, wb5Var);
        this.b.remove(cls);
        return this;
    }

    public kt3 p(Class cls, s39 s39Var) {
        this.b.put(cls, s39Var);
        this.a.remove(cls);
        return this;
    }
}
