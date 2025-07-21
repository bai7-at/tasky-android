package org.jsoup.nodes;

import defpackage.o48;
import defpackage.u29;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.jsoup.SerializationException;
import org.jsoup.nodes.Document;

/* loaded from: classes5.dex */
public class a implements Map.Entry, Cloneable {
    private static final String[] d = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    private String a;
    private String b;
    b c;

    public a(String str, String str2, b bVar) {
        u29.i(str);
        String trim = str.trim();
        u29.g(trim);
        this.a = trim;
        this.b = str2;
        this.c = bVar;
    }

    protected static void f(String str, String str2, Appendable appendable, Document.OutputSettings outputSettings) {
        appendable.append(str);
        if (i(str, str2, outputSettings)) {
            return;
        }
        appendable.append("=\"");
        Entities.e(appendable, b.o(str2), outputSettings, true, false, false);
        appendable.append('\"');
    }

    protected static boolean g(String str) {
        return Arrays.binarySearch(d, str) >= 0;
    }

    protected static boolean i(String str, String str2, Document.OutputSettings outputSettings) {
        return outputSettings.k() == Document.OutputSettings.Syntax.html && (str2 == null || (("".equals(str2) || str2.equalsIgnoreCase(str)) && g(str)));
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Map.Entry
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String getValue() {
        return b.o(this.b);
    }

    public String d() {
        StringBuilder b = o48.b();
        try {
            e(b, new Document("").N0());
            return o48.m(b);
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }

    protected void e(Appendable appendable, Document.OutputSettings outputSettings) {
        f(this.a, this.b, appendable, outputSettings);
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.a;
        if (str == null ? aVar.a != null : !str.equals(aVar.a)) {
            return false;
        }
        String str2 = this.b;
        return str2 != null ? str2.equals(aVar.b) : aVar.b == null;
    }

    @Override // java.util.Map.Entry
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public String setValue(String str) {
        String str2 = this.b;
        b bVar = this.c;
        if (bVar != null) {
            str2 = bVar.u(this.a);
            int A = this.c.A(this.a);
            if (A != -1) {
                this.c.c[A] = str;
            }
        }
        this.b = str;
        return b.o(str2);
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return d();
    }
}
